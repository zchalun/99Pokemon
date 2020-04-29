package model_pokemon;

public class Poison extends Pokemon
{
    public Poison(String n, int i, int l)
	{
		name = n;
		ID = i;
		level = l;
		type = "poison";
		weak = new String[]{"fire","bug","dragon","steel"};
		strength = new String[]{"grass","water"};
	}
}
