package model_pokemon;

public class Ground extends Pokemon
{
    public Ground()//String n)//, int i)
	{
		super("ground");
		//ID = i;
		type = "ground";
		flavors = new int[]{dry};
		weak = new String[]{"grass"};
		strength = new String[]{"fire"};
	}
}
