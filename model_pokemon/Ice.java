package model_pokemon;

public class Ice extends Pokemon
{
    public Ice()//String n)//(, int i)
	{
		//name = n;
    	super("ice");
		//ID = i;
		type = "Ice";
		flavors = new int[]{dry,sour};
		weak = new String[]{"steel"};
		strength = new String[]{"water"};
	}
}
