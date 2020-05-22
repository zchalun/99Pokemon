package Reservations;

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
	/*public static void main(String args[])
	{
		getGuests("{    \"numGuests\" : 6,    \"password\" : \"password\",    \"name\" : \"Zhang\",    \"time\" : \"12:30 PM\"  }");
	}*/
}
