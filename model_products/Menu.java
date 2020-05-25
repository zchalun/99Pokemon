package model_products;

import java.util.*;
public class Menu {

	ArrayList<Food> MenuSelections = new ArrayList<Food>();
	public Menu()
	{
		MenuSelections.add(new Berry("cheri","spicy",120,1,"cure paralysis"));
		MenuSelections.add(new Berry("chesto","dry",120,1,"cure sleep"));
		MenuSelections.add(new Berry("pecha","sweet",120,1,"cure poison"));
		MenuSelections.add(new Berry("rawst","bitter",120,1,"cure burn"));
		MenuSelections.add(new Berry("aspear","sour",120,1,"cure freeze"));
		MenuSelections.add(new Berry("leppa","spicy",120,1,"restore 10 PP"));
		MenuSelections.add(new Berry("oran","none",120,1,"restore 10 HP"));
		MenuSelections.add(new Berry("persim","none",120,1,"cure confusion"));
		MenuSelections.add(new Berry("lum","none",120,1,"cures status conditions and confusion"));
		MenuSelections.add(new Berry("sitrus","none",120,1,"restore 30 HP"));
		MenuSelections.add(new Berry("figy","spicy",120,1,"restores 50% HP"));
		MenuSelections.add(new Berry("wiki","dry",120,1,"restores 50% HP"));
		MenuSelections.add(new Berry("mago","sweet",120,1,"restores 50% HP"));
		MenuSelections.add(new Berry("aguav","bitter",120,1,"restores 50% HP"));
		MenuSelections.add(new Berry("lapapa","sour",120,1,"restores 50% HP"));
		MenuSelections.add(new Berry("razz","dry",120,1,"makes wild pokemon easier to capture"));
		MenuSelections.add(new Berry("bluk","sweet",120,1,"N/A"));
		MenuSelections.add(new Berry("nanab","bitter",120,1,"makes wild pokemon move less"));
		MenuSelections.add(new Berry("wepear","bitter",120,1,"none"));
		MenuSelections.add(new Berry("pinap","bitter",120,1,"makes wild pokemon more likely to drop items"));
		MenuSelections.add(new Berry("pomeg","bitter",120,1,"lowers HP EVs"));
		MenuSelections.add(new Berry("kelpsy","bitter",120,1,"lowers attack EVs"));
		MenuSelections.add(new Berry("qualot","bitter",120,1,"lowers defense EVs"));
		MenuSelections.add(new Berry("hondew","bitter",120,1,"lowers special attack EVs"));
		MenuSelections.add(new Berry("grepa","bitter",120,1,"lowers special defense EVs"));
		MenuSelections.add(new Berry("tamato","bitter",120,1,"lowers speed EVs"));
		MenuSelections.add(new Berry("cornn","bitter",120,1,"none"));
		MenuSelections.add(new Berry("magost","bitter",120,1,"none"));
		MenuSelections.add(new Berry("rabuta","bitter",120,1,"none"));
		MenuSelections.add(new Berry("nomel","bitter",120,1,"none"));
		MenuSelections.add(new Berry("spelon","bitter",120,1,"none"));
		MenuSelections.add(new Berry("pamtre","bitter",120,1,"none"));
		MenuSelections.add(new Berry("watmel","bitter",120,1,"none"));
		MenuSelections.add(new Berry("durin","bitter",120,1,"none"));
		MenuSelections.add(new Berry("belue","bitter",120,1,"none"));

	}
}
