package model_pokemon;

public class Electric extends Pokemon
{
    public Electric(String n, int i)
	{
		name = n;
		ID = i;
		type = "electric";
		weak = new String[]{"fire","grass","flying","poison","bug","dragon","steel"};
		strength = new String[]{"water","ground","rock"};
	}
}
