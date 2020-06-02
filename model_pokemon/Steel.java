package model_pokemon;

public class Steel extends Pokemon{
	
	public Steel()//String n)//, int i)
	{
		//name = n;
		super("steel");
		//ID = i;
		type = "steel";
		flavors = new int[]{sweet,bitter,dry,sour, spicy};
		weak = new String[]{"fire","fighting","ground"};
		strength = new String[] {"ice","rock","normal","grass","flying","psychic","bug","rock","dragon","steel"};
	}
}