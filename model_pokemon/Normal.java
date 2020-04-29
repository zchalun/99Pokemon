package model_pokemon;

public class Normal extends Pokemon{
	
	public Normal(String n, int i, int l)
	{
		name = n;
		ID = i;
		level = l;
		type = "normal";
		weak = new String[]{"rock","steel"};
		no_effect = new String[]{"ghost"};
	}
}
