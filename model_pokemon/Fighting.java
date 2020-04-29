package model_pokemon;

public class Fighting extends Pokemon
{
    public Fighting(String n, int i, int l)
	{
		name = n;
		ID = i;
		level = l;
		type = "fighting";
		weak = new String[]{"steel"};
		strength = new String[]{"ground"};
	}
}
