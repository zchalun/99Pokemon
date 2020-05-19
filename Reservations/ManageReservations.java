package Reservations;
import java.util.*;
public class ManageReservations
{
	ArrayList<Reservation> Reservations = new ArrayList<Reservation>();
	
	/**
	 * @param n name reservation is under
	 * @param a access password
	 * @return reservation information, if found
	 */
    public String viewReservations(String n, String a)
    {
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
    
    /**
     * @param n name reservation is under
     * @param a access password
     * @return whether reservation was successfully removed
     */
    public String deleteReservations(String n, String a)
    {
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
    /**
     * @param n name reservation is under
     * @param a access password
     * @return whether time was successfully changed
     */
    public String changeTime(String n, String a)
    {
    	for (int i = 0; i<Reservations.size(); i++)
    	{
    		Reservation x = Reservations.get(i);
    		if (x.getName().contentEquals(n) && x.getAccessPassword().contentEquals(a))
    		{
    			Reservations.add(i,addReservations(n,x.getGuests(),x.getTime(),a));
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
    

}
