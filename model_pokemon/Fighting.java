package model_pokemon;

public class Fighting extends Pokemon
{
    public Fighting(String n, int i)
	{
		name = n;
		ID = i;
		type = "fighting";
		weak = new String[]{"steel"};
		strength = new String[]{"ground"};
	}
}
