package model_pokemon;

public class Bug extends Pokemon
{
    public Bug()//String n, int i)
	{
		//name = n;
    	super("bug");
		//ID = i;
		type = "bug";
		flavors = new int[]{sweet,bitter};
		weak = new String[]{"fire","poison","water"};
		strength = new String[]{"grass"};
	}
    
}
