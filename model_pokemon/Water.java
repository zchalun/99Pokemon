package model_pokemon;

public class Water extends Pokemon
{
    public Water(String n, int i, int l)
	{
		name = n;
		ID = i;
		level = l;
		type = "water";
		weak = new String[]{"ice","grass"};
		strength = new String[]{"fire","ground"};
	}
}
