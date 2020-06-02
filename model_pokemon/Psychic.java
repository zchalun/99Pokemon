package model_pokemon;

public class Psychic extends Pokemon{
	
	public Psychic()//String n)//, int i)
	{
		//name = n;
		super("psychic");
		//ID = i;
		type = "psychic";
		flavors = new int[]{sweet,dry,spicy};
		weak = new String[]{"bug","ghost","dark"};
		strength = new String[] {"fighting","poison"};
		no_effect = new String[]{"dark"};
	}
}