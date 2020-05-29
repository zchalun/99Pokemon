package model_pokemon;

public class Poison extends Pokemon
{
    public Poison(String n, int i)
	{
		name = n;
		ID = i;
		type = "poison";
		flavors = new String[]{"bitter","sour"};
		weak = new String[]{"fire","bug","dragon","steel"};
		strength = new String[]{"grass","water"};
	}
}
