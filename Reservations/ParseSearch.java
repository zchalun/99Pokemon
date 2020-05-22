package Reservations;
/**
 * support class for viewReservation
 * @author CynthiaZ
 *
 */
public class ParseSearch {
	public static int getGuests(String mess)
	{
		if (!mess.contentEquals("reservation not found"))
		{
			int i = mess.indexOf("\"numGuests\" : ");
			int j = mess.indexOf("\"password\"");
			String guestNum = mess.substring(i+14,j-5);
			return Integer.parseInt(guestNum);
		}
		return -1;
	}
	public static String getName(String mess)
	{
		int i = mess.indexOf("\"name\" : ");
		int j = mess.indexOf("\"time\"");
		String name = mess.substring(i+10,j-6);
		return name;
	}
	public static String getTime(String mess)
	{
		int i = mess.indexOf("\"time\"");
		int j = mess.indexOf("}");
		String time = mess.substring(i+10,j-3);
		return time;
	}
	public static int getGuestfromView(String mess) // to support the change time class
	{
		int i = mess.indexOf(" and ");
		int j = mess.indexOf(" others ");
		String g = mess.substring(i+5,j);
		return (Integer.parseInt(g)+1); //+1 because the return statement from view is -1
	}
}
