package model_pokemon;

public class Ghost extends Pokemon
{
    public Ghost(String n, int i)
	{
		name = n;
		ID = i;
		type = "ghost";
		weak = new String[]{"fire"};
		strength = new String[]{"poison","fairy"};
	}
}
