package model_pokemon;

public class Normal extends Pokemon{
	
	public Normal(String n, int i)
	{
		name = n;
		ID = i;
		type = "normal";
		weak = new String[]{"rock","steel"};
		no_effect = new String[]{"ghost"};
	}
}
