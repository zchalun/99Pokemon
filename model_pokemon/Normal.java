package model_pokemon;

public class Normal extends Pokemon{
	
	public Normal(String n, int i)
	{
		name = n;
		ID = i;
		type = "normal";
		flavors = new String[]{"sweet","bitter","dry","sour","spicy"};
		weak = new String[]{"rock","steel"};
		no_effect = new String[]{"ghost"};
	}
}
