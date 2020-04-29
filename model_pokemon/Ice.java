package model_pokemon;

public class Ice extends Pokemon
{
    public Ice(String n, int i, int l)
	{
		name = n;
		ID = i;
		level = l;
		type = "Ice";
		weak = new String[]{"steel"};
		strength = new String[]{"water"};
	}
}
