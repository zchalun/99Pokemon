package model_pokemon;

public class Bug extends Pokemon
{
    public Bug(String n, int i, int l)
	{
		name = n;
		ID = i;
		level = l;
		type = "bug";
		weak = new String[]{"fire","poison","water"};
		strength = new String[]{"grass"};
	}
}
