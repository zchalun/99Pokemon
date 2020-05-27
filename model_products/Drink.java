package model_products;

public class Drink extends Food{
	public Drink(String n, String f, int p, int i, String d)
	{
		name = n;
		type = "drink";
		flavor = f;
		price = p;
		ID = i;
		desc = d;
	}
}