package model_pokemon;

public class Ghost extends Pokemon
{
    public Ghost()//String n)//, int i)
	{
		//name = n;
    	super("ghost");
		//ID = i;
		type = "ghost";
		flavors = new int[]{bitter};
		weak = new String[]{"fire"};
		strength = new String[]{"poison","fairy"};
	}
}
