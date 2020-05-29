package model_pokemon;

public class Rock extends Pokemon{
	
	public Rock(String n, int i)
	{
		name = n;
		ID = i;
		type = "rock";
		flavors = new String[]{"dry","sour"};
		weak = new String[]{"water","grass","fighting","ground","steel"};
		strength = new String[] {"flying","bug","fire","ice"};
	}
}