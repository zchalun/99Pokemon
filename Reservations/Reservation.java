package Reservations;

public class Reservation {
	private String name;
	private int guests;
	private String time;
	private String accessPassword;
	public Reservation(String n, int g, String t, String a)
	{
		name = n;
		guests = g;
		time = t;
		accessPassword = a;
	}
	public String getName()
	{
		return name;
	}
	public int getGuests()
	{
		return guests;
	}
	public String getTime()
	{
		return time;
	}
	public String getAccessPassword()
	{
		return accessPassword;
	}
	public String toString()
	{
		return "Reservation for " + getName() + " and " + (getGuests()-1) + " others at " + getTime();
	}
}
