package Databases;

import java.sql.SQLException;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;

public class DatabaseActions {

    /*public static void main(String[] args) throws Exception {
    	//connect();
    	//displayAll();
    	create();
    }
    public static Connection connect() {
		String url = "jdbc:sqlite:amazon2.db"; //url tells the driver manager where to locate the Database.db file
		Connection conn = null;
		
		//Attempts to connect to the database file
		try {
			conn = DriverManager.getConnection(url);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return conn; //returns a connection object
	}*/
	
	
	public static void createReservation(String n, int g, String t, String a) throws InterruptedException, SQLException //used to add reservations
	{
		AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().withRegion("us-west-2").build();
		DynamoDB dynamoDB = new DynamoDB(client);

		Table table = dynamoDB.getTable("Reservations");
		
		// Build the item
		Item item = new Item()
		    .withPrimaryKey("name", n,"password",a)
		    .withNumber("numGuests", g)
		    .withString("time", t);

		// Write the item to the table
		PutItemOutcome outcome = table.putItem(item);
	}
	public static void createAccount(String n, String p) throws InterruptedException, SQLException //used to create account
	{
		AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().withRegion("us-west-2").build();
		DynamoDB dynamoDB = new DynamoDB(client);

		Table table = dynamoDB.getTable("99PokemonAccounts");
		
		// Build the item
		Item item = new Item()
		    .withPrimaryKey("username", n,"password",p);

		// Write the item to the table
		PutItemOutcome outcome = table.putItem(item);
	}
	
	
}
