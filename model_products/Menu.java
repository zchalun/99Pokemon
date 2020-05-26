package model_products;

import java.util.*;
public class Menu {

	ArrayList<Food> MenuSelections = new ArrayList<Food>();
	public Menu()
	{
		//all gen 3 berries
		MenuSelections.add(new Berry("cheri","spicy",120,1,"cure paralysis"));
		MenuSelections.add(new Berry("chesto","dry",30,2,"cure sleep"));
		MenuSelections.add(new Berry("pecha","sweet",80,3,"cure poison"));
		MenuSelections.add(new Berry("rawst","bitter",150,4,"cure burn"));
		MenuSelections.add(new Berry("aspear","sour",20,5,"cure freeze"));
		MenuSelections.add(new Berry("leppa","spicy",20,6,"restore 10 PP"));
		MenuSelections.add(new Berry("oran","none",10,7,"restore 10 HP"));
		MenuSelections.add(new Berry("persim","none",100,8,"cure confusion"));
		MenuSelections.add(new Berry("lum","none",150,9,"cures status conditions and confusion"));
		MenuSelections.add(new Berry("sitrus","none",50,10,"restore 30 HP"));
		MenuSelections.add(new Berry("figy","spicy",80,11,"restores 50% HP"));
		MenuSelections.add(new Berry("wiki","dry",80,12,"restores 50% HP"));
		MenuSelections.add(new Berry("mago","sweet",80,13,"restores 50% HP"));
		MenuSelections.add(new Berry("aguav","bitter",80,14,"restores 50% HP"));
		MenuSelections.add(new Berry("lapapa","sour",80,15,"restores 50% HP"));
		MenuSelections.add(new Berry("razz","dry",40,16,"makes wild pokemon easier to capture"));
		MenuSelections.add(new Berry("bluk","sweet",10,17,"N/A"));
		MenuSelections.add(new Berry("nanab","bitter",60,18,"makes wild pokemon move less"));
		MenuSelections.add(new Berry("wepear","sour",10,19,"none"));
		MenuSelections.add(new Berry("pinap","spicy",70,20,"makes wild pokemon more likely to drop items"));
		MenuSelections.add(new Berry("pomeg","bitter",120,21,"lowers HP EVs"));
		MenuSelections.add(new Berry("kelpsy","sour",120,22,"lowers attack EVs"));
		MenuSelections.add(new Berry("qualot","sweet",120,23,"lowers defense EVs"));
		MenuSelections.add(new Berry("hondew","dry",120,24,"lowers special attack EVs"));
		MenuSelections.add(new Berry("grepa","sweet",120,25,"lowers special defense EVs"));
		MenuSelections.add(new Berry("tamato","dry",120,26,"lowers speed EVs"));
		MenuSelections.add(new Berry("cornn","sweet",10,27,"none"));
		MenuSelections.add(new Berry("magost","bitter",10,28,"none"));
		MenuSelections.add(new Berry("rabuta","sour",10,29,"none"));
		MenuSelections.add(new Berry("nomel","sour",10,30,"none"));
		MenuSelections.add(new Berry("spelon","spicy",10,31,"none"));
		MenuSelections.add(new Berry("pamtre","dry",10,32,"none"));
		MenuSelections.add(new Berry("watmel","sweet",10,33,"none"));
		MenuSelections.add(new Berry("durin","bitter",10,34,"none"));
		MenuSelections.add(new Berry("belue","sour",10,35,"none"));
		
		//all gen 3 berry poffins
		for (int i=0; i<35; i++)
		{
			MenuSelections.add(new Poffin(MenuSelections.get(i)));
		}
		
		//add drinks and maybe make up own
	}
	/*public static void main(String args[])
	{
		Menu a = new Menu();
		System.out.println(a.MenuSelections.get(69).getName() + " " + a.MenuSelections.get(69).getID());
	}*/
}
