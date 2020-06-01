package model_pokemon;

public class Dragon extends Pokemon{
	
	public Dragon()//String n)//, int i)
	{
		//name = n;
		super("dragon");
		//ID = i;
		type = "dragon";
		flavors = new int[]{dry,sour,spicy};
		weak = new String[]{"dragon","ice","steel"};
		strength = new String[] {"fire","water","electric","grass","dragon"};
	}
}
