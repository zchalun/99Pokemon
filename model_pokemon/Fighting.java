package model_pokemon;

public class Fighting extends Pokemon
{
    public Fighting()//String n)//, int i)
	{
		//name = n;
    	super("fighting");
    	//ID = i;
		type = "fighting";
		flavors = new int[]{bitter,dry,spicy};
		weak = new String[]{"steel"};
		strength = new String[]{"ground"};
	}
}
