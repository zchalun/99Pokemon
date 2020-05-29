package model_pokemon;

public class Ground extends Pokemon
{
    public Ground(String n, int i)
	{
		name = n;
		ID = i;
		type = "ground";
		flavors = new String[]{"dry"};
		weak = new String[]{"grass"};
		strength = new String[]{"fire"};
	}
}
