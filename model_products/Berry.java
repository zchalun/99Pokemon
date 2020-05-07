package model_products;

public class Berry extends Food{

	public Berry()
	{
		name = "berry"; // product name
		flavor = "sweet"; //product flavor
		type = new String[]{"bug", "electric", "fighting", "fire", "ghost", "grass", "ground", "ice", "normal", "poison", "water"}; //array of pokemon types compatible
		price = 5.0; //product price
		ID = 1; // product ID
		desc = "restores 10 HP";
	}
}
