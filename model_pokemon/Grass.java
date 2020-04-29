package model_pokemon;

public class Grass extends Pokemon{
	
	public Grass(String n, int i, int l)
	{
		name = n;
		ID = i;
		level = l;
		type = "grass";
		weak = new String[]{"fire","grass","flying","poison","bug","dragon","steel"};
		strength = new String[]{"water","ground","rock"};
	}
}
