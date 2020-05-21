package Reservations;
import java.util.*;
public class ManageReservations
{
	public ArrayList<Reservation> Reservations = new ArrayList<Reservation>();
    
    /**
     * @param n name reservation is to be made under
     * @param g number of guests
     * @param t time of reservation
     * @param a access password for reservation security
     * @return new reservation
     */
    public Reservation addReservations(String n, int g, String t, String a)
    {
    	Reservation newRes = new Reservation(n,g,t,a);
    	Reservations.add(newRes);
    	return newRes;
    }
   
    public static String driverAdd(String n, int g, String t, String a)
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
    	//Reservations.add(addReservations("Zhang",3,"12:30 PM","password")); //sample Reservation entry for testing
    	/*for (Reservation x : Reservations)
    	{
    		System.out.println(x.toString());
    	}*/
    	for (Reservation x : Reservations)
    	{
    		if (x.getName().contentEquals(n) && x.getAccessPassword().contentEquals(a))
    		{
    			return x.toString();
    		}
    		else if (x.getName().contentEquals(n) && !x.getAccessPassword().contentEquals(a))
    		{
    			return "incorrect access password";
    		}
    	}
    	return "no reservation found. make one?";
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
    	//Reservations.add(addReservations("Zhang",3,"12:30 PM","password")); //sample Reservation entry for testing

    	for (int i = 0; i<Reservations.size(); i++)
    	{
    		Reservation x = Reservations.get(i);
    		if (x.getName().contentEquals(n) && x.getAccessPassword().contentEquals(a))
    		{
    			Reservations.remove(i);
    			return "reservation removed";
    		}
    		else if (x.getName().contentEquals(n) && !x.getAccessPassword().contentEquals(a))
    		{
    			return "incorrect access password";
    		}
    	}
    	return "no reservation found.";
    }
    public static String driverDelete(String n, String a)
    {
    	ManageReservations temp = new ManageReservations();
    	return temp.deleteReservation(n,a);
    }
    
    /**
     * @param n name reservation is under
     * @param a access password
     * @return whether time was successfully changed
     */
    public String changeTime(String n, String a, String t)
    {
    	//Reservations.add(addReservations("Zhang",3,"12:30 PM","password")); //sample Reservation entry for testing
    	for (int i = 0; i<Reservations.size(); i++)
    	{
    		Reservation x = Reservations.get(i);
    		if (x.getName().contentEquals(n) && x.getAccessPassword().contentEquals(a))
    		{
    			Reservations.add(i,addReservations(n,x.getGuests(),t,a));
    			Reservations.remove(i+1);
    			return "time changed";
    		}
    		else if (x.getName().contentEquals(n) && !x.getAccessPassword().contentEquals(a))
    		{
    			return "incorrect access password";
    		}
    	}
    	
    	return "no reservation found.";
	
    }    
    public static String driverChange(String n, String a, String t)
    {
    	ManageReservations temp = new ManageReservations();
    	return temp.changeTime(n,a,t);
    }

}
