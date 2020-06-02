package model_pokemon;

public class Electric extends Pokemon
{
    public Electric()//String n)//, int i)
	{
		//name = n;
    	super("electric");
		//ID = i;
		type = "electric";
		flavors = new int[]{dry,spicy};
		weak = new String[]{"fire","grass","flying","poison","bug","dragon","steel"};
		strength = new String[]{"water","ground","rock"};
	}
}
