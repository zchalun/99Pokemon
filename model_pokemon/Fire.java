package model_pokemon;

public class Fire extends Pokemon
{
    public Fire()//String n)//, int i)
	{
		//name = n;
    	super("fire");
		//ID = i;
		type = "fire";
		flavors = new int[]{sweet,dry,sour,spicy};
		weak = new String[]{"water","steel"};
		strength = new String[]{"grass"};
	}
}
