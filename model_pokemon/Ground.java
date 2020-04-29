package model_pokemon;

public class Ground extends Pokemon
{
    public Ground(String n, int i, int l)
	{
		name = n;
		ID = i;
		level = l;
		type = "ground";
		weak = new String[]{"grass"};
		strength = new String[]{"fire"};
	}
}
