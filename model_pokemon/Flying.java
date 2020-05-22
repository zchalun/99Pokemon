package model_pokemon;

public class Flying extends Pokemon
{
    public Flying(String n, int i)
	{
		name = n;
		ID = i;
		type = "flying";
		weak = new String[]{"electric","ice","rock"};
		strength = new String[]{"bug","fighting","grass"};
		no_effect = new String[] {"ground"};
	}
}