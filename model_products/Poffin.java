package model_products;

public class Poffin extends Food{
	
	public Poffin(String n, Berry b, double p, int i, String d) //single flavor poffins
	{
		name = n;
		type = "poffin";
		flavor = b.getFlavor();
		price = p;
		ID = i;
		desc = d;
	}
}
