package model_pokemon;

public class Water extends Pokemon
{
    public Water()//String n)//, int i)
	{
		//name = n;
    	super("water");
		//ID = i;
		type = "water";
		flavors = new int[]{sweet,bitter,sour};
		weak = new String[]{"ice","grass"};
		strength = new String[]{"fire","ground"};
	}
}
