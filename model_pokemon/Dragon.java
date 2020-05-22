package model_pokemon;

public class Dragon extends Pokemon{
	
	public Dragon(String n, int i)
	{
		name = n;
		ID = i;
		type = "dragon";
		weak = new String[]{"dragon","ice","steel"};
		strength = new String[] {"fire","water","electric","grass","dragon"};
	}
}
