package model_pokemon;

public class Flying extends Pokemon
{
    public Flying()//String n)//, int i)
	{
		//name = n;
    	super("flying");
		//ID = i;
		type = "flying";
		flavors = new int[]{sweet,bitter};
		weak = new String[]{"electric","ice","rock"};
		strength = new String[]{"bug","fighting","grass"};
		no_effect = new String[] {"ground"};
	}
}