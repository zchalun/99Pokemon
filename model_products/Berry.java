package model_products;

public class Berry extends Food{

	public Berry()
	{
		name = "berry"; // product name
		flavor = "sweet"; //product flavor
		//type = new String[]{"bug","dragon","electric", "fighting", "fire", "flying", "ghost", "grass", "ground", "ice", "normal", "poison", "psychic", "rock", "steel","water"}; //array of pokemon types compatible
		price = 5.0; //product price
		ID = 0; // product ID
		desc = "restores 10 HP";
	}
	public Berry(String n, String f, double p, int i, String d)
	{
		name = n; // product name
		flavor = f; //product flavor
		type = "berry"; //product type
		//type = new String[]{"bug","dragon","electric", "fighting", "fire", "flying", "ghost", "grass", "ground", "ice", "normal", "poison", "psychic", "rock", "steel","water"}; //array of pokemon types compatible
		price = p; //product price
		ID = i; // product ID
		desc = d;
	}
}
