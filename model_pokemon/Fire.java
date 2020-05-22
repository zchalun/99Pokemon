package model_pokemon;

public class Fire extends Pokemon
{
    public Fire(String n, int i)
	{
		name = n;
		ID = i;
		type = "fire";
		weak = new String[]{"water","steel"};
		strength = new String[]{"grass"};
	}
}
