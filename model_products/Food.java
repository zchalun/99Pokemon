package model_products;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Food {
	protected String name; // product name
	protected String flavor; //product flavor
	protected String type; //type of food, eg berry
	//protected String[] type; //array of pokemon types compatible
	protected double price; //product price
	protected int ID; // product ID
	protected String desc; //product description
	
	
	public Food() {
		name = "default item"; //placeholder
		price = 1000000.00; //placeholder
	}
	
	public Food (String name, double price)
	{
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getID() {
		return ID;
	}
	
    public void setID(int id)
    {
    	this.ID = id;
    }
		
	public String getFlavor() {
		return flavor;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public String getType() {
		return type;
	}
	
}