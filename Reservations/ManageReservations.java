package Reservations;
import java.sql.SQLException;
import java.util.*;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PrimaryKey;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.UpdateItemOutcome;
import com.amazonaws.services.dynamodbv2.document.spec.DeleteItemSpec;
import com.amazonaws.services.dynamodbv2.document.spec.UpdateItemSpec;
import com.amazonaws.services.dynamodbv2.document.utils.ValueMap;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ReturnValue;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;
import com.amazonaws.services.dynamodbv2.model.ScanResult;
import com.amazonaws.services.dynamodbv2.model.UpdateItemRequest;
public class ManageReservations
{
	public ArrayList<Reservation> Reservations = new ArrayList<Reservation>();
    
    /**
     * @param n name reservation is to be made under
     * @param g number of guests
     * @param t time of reservation
     * @param a access password for reservation security
     * @return new reservation
     * @throws SQLException 
     * @throws InterruptedException 
     */
    public Reservation addReservations(String n, int g, String t, String a) throws InterruptedException, SQLException
    {
    	Reservation newRes = new Reservation(n,g,t,a);
    	Reservations.add(newRes);
    	Databases.DatabaseActions.create(n, g, t, a);
    	return newRes;
    }
   
    public static String driverAdd(String n, int g, String t, String a) throws InterruptedException, SQLException
    {
    	ManageReservations temp = new ManageReservations();
    	return temp.addReservations(n,g,t,a).toString();
    }
    
	/**
	 * @param n name reservation is under
	 * @param a access password
	 * @return reservation information, if found
	 */
    public String viewReservations(String n, String a)
    {
		ProfileCredentialsProvider credentialsProvider = new ProfileCredentialsProvider();
        try {
            credentialsProvider.getCredentials();
        } catch (Exception e) {
            throw new AmazonClientException(
                    "Cannot load the credentials from the credential profiles file. " +
                    "Please make sure that your credentials file is at the correct " +
                    "location (/Users/johnmortensen/.aws/credentials), and is in valid format.",
                    e);
        }
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
        	.withCredentials(credentialsProvider)
            .withRegion("us-west-2")
            .build();

		DynamoDB dynamoDB = new DynamoDB(client);
	    Table table = dynamoDB.getTable("Reservations");
	    ScanRequest scanRequest = new ScanRequest()
	    	    .withTableName("Reservations");


	    ScanResult result = client.scan(scanRequest);
	    Item item = null;

	    for(int x = 1; x <= result.getCount(); x++)
	    {
	    	item = table.getItem("name", n, "password", a);
	    }
	    if (item == null)
	    {
	    	return "reservation not found";
	    }
	    String x = item.toJSONPretty();

		return "reservation found for " + ParseSearch.getName(x) + 
				" and " + (ParseSearch.getGuests(x)-1) + 
				" others at " + ParseSearch.getTime(x);
	}
    
    public static String driverView(String n, String a)
    {
    	ManageReservations temp = new ManageReservations();
    	return temp.viewReservations(n,a);
    }
    
    /**
     * @param n name reservation is under
     * @param a access password
     * @return whether reservation was successfully removed
     */
    public String deleteReservation(String n, String a)
    {
    	ProfileCredentialsProvider credentialsProvider = new ProfileCredentialsProvider();
        try {
            credentialsProvider.getCredentials();
        } catch (Exception e) {
            throw new AmazonClientException(
                    "Cannot load the credentials from the credential profiles file. " +
                    "Please make sure that your credentials file is at the correct " +
                    "location (/Users/johnmortensen/.aws/credentials), and is in valid format.",
                    e);
        }
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
        	.withCredentials(credentialsProvider)
            .withRegion("us-west-2")
            .build();

        DynamoDB dynamoDB = new DynamoDB(client);

        Table table = dynamoDB.getTable("Reservations");


        DeleteItemSpec deleteItemSpec = new DeleteItemSpec()
            .withPrimaryKey(new PrimaryKey("name", n, "password", a));
        
        if (driverView(n,a).contentEquals("reservation not found"))
        {
        	return "reservation not found. check password?";
        }
        else {
            table.deleteItem(deleteItemSpec);
            return "Reservation Deleted";
        }
    }
    public static String driverDelete(String n, String a)
    {
    	ManageReservations temp = new ManageReservations();
    	return temp.deleteReservation(n,a);
    }
    
    /**
     * I couldn't figure out how to update the table entry so this is what I got... it works though
     * @param n name reservation is under
     * @param a access password
     * @return whether time was successfully changed
     * @throws SQLException 
     * @throws InterruptedException 
     */
    public String changeTime(String n, String a, String t) throws InterruptedException, SQLException
    {
    	if (!driverView(n,a).contentEquals("reservation not found"))
    	{
    		int numG = ParseSearch.getGuestfromView(driverView(n,a));
    		driverDelete(n,a);
    		driverAdd(n,numG,t,a);
    		return "Reservation updated";
    	}
    	else
    	{
    		return "Reservation not found";
    	}
	
    }    
    public static String driverChange(String n, String a, String t) throws InterruptedException, SQLException
    {
    	ManageReservations temp = new ManageReservations();
    	return temp.changeTime(n,a,t);
    }

}
