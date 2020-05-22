package model_pokemon;

public class Water extends Pokemon
{
    public Water(String n, int i)
	{
		name = n;
		ID = i;
		type = "water";
		weak = new String[]{"ice","grass"};
		strength = new String[]{"fire","ground"};
	}
}
