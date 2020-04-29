package model_pokemon;

public class Fire extends Pokemon
{
    public Fire(String n, int i, int l)
	{
		name = n;
		ID = i;
		level = l;
		type = "fire";
		weak = new String[]{"water","steel"};
		strength = new String[]{"grass"};
	}
}
