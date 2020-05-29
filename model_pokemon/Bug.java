package model_pokemon;

public class Bug extends Pokemon
{
    public Bug(String n, int i)
	{
		name = n;
		ID = i;
		type = "bug";
		flavors = new String[]{"sweet","bitter"};
		weak = new String[]{"fire","poison","water"};
		strength = new String[]{"grass"};
	}
}
