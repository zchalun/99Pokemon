package model_pokemon;

public class Ghost extends Pokemon
{
    public Ghost(String n, int i, int l)
	{
		name = n;
		ID = i;
		level = l;
		type = "ghost";
		weak = new String[]{"fire"};
		strength = new String[]{"poison","fairy"};
	}
}
