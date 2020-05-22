package model_pokemon;

public class Ice extends Pokemon
{
    public Ice(String n, int i)
	{
		name = n;
		ID = i;
		type = "Ice";
		weak = new String[]{"steel"};
		strength = new String[]{"water"};
	}
}
