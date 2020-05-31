package model_products;

public class Poffin extends Food{
	
	public Poffin(Food b) //single flavor poffins
	{
		name = b.getName() + " poffin";
		type = "poffin";
		flavor = b.getFlavor();
		price = b.getPrice() + 100;
		ID = b.getID()+5;
		desc = "a delicious " + b.getName() + " flavored poffin!";
	}
}
