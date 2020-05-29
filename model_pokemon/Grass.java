package model_pokemon;

public class Grass extends Pokemon{
	
	public Grass(String n, int i)
	{
		name = n;
		ID = i;
		type = "grass";
		flavors = new String[]{"sweet","sour"};
		flavors = new String[]{"sweet","sour"};
		weak = new String[]{"fire","grass","flying","poison","bug","dragon","steel"};
		strength = new String[]{"water","ground","rock"};
	}
}
