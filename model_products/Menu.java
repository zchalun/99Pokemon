package model_products;

import java.util.*;
public class Menu {

	public ArrayList<Food> MenuSelections = new ArrayList<Food>();
	public Menu()
	{
		//all gen 3 berries
		MenuSelections.add(new Berry("cheri","spicy",120,1,"cure paralysis"));
		MenuSelections.add(new Berry("chesto","dry",30,2,"cure sleep"));
		MenuSelections.add(new Berry("pecha","sweet",80,3,"cure poison"));
		MenuSelections.add(new Berry("rawst","bitter",150,4,"cure burn"));
		MenuSelections.add(new Berry("aspear","sour",20,5,"cure freeze"));
		/*MenuSelections.add(new Berry("leppa","spicy",20,6,"restore 10 PP"));
		MenuSelections.add(new Berry("oran","none",10,7,"restore 10 HP"));
		MenuSelections.add(new Berry("persim","none",100,8,"cure confusion"));
		MenuSelections.add(new Berry("lum","none",150,9,"cures status conditions and confusion"));
		MenuSelections.add(new Berry("sitrus","none",50,10,"restore 30 HP"));
		MenuSelections.add(new Berry("figy","spicy",80,11,"restores 50% HP"));
		MenuSelections.add(new Berry("wiki","dry",80,7,"restores 50% HP"));
		MenuSelections.add(new Berry("mago","sweet",80,8,"restores 50% HP"));
		MenuSelections.add(new Berry("aguav","bitter",80,9,"restores 50% HP"));
		MenuSelections.add(new Berry("lapapa","sour",80,10,"restores 50% HP"));*/
		/*MenuSelections.add(new Berry("razz","dry",40,16,"makes wild pokemon easier to capture"));
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
		MenuSelections.add(new Berry("belue","sour",10,35,"none"));*/
		
		//all gen 3 berry poffins
		for (int i=0; i<5; i++)
		{
			MenuSelections.add(new Poffin(MenuSelections.get(i)));
		}
		
		//drinks
		//MenuSelections.add(new Drink("fresh water", "none", 200,71,"Heals 30 HP"));
		MenuSelections.add(new Drink("soda pop", "spicy", 300,11,"Heals 50 HP"));
		MenuSelections.add(new Drink("lemonade", "sour", 350,12,"Heals 70 HP"));
		MenuSelections.add(new Drink("moomoo milk", "dry", 500,13,"Heals 100 HP"));
		MenuSelections.add(new Drink("berry juice", "sweet", 400,14,"Heals 20 HP"));
		MenuSelections.add(new Drink("tea", "bitter", 250,15,"tastes good"));

		//pokeblocks
		//MenuSelections.add(new Pokeblock("black", "none", 50,77,"yum"));
		/*MenuSelections.add(new Pokeblock("red", "spicy", 70,78,"yum"));
		MenuSelections.add(new Pokeblock("blue", "dry", 70,79,"yum"));
		MenuSelections.add(new Pokeblock("pink", "sweet", 70,80,"yum"));
		MenuSelections.add(new Pokeblock("green", "bitter", 70,81,"yum"));
		MenuSelections.add(new Pokeblock("yellow", "sour", 70,82,"yum"));
		MenuSelections.add(new Pokeblock("gold", "none", 100,83,"yum"));*/
		MenuSelections.add(new Pokeblock("purple", "spicy", 120,16,"yum"));
		MenuSelections.add(new Pokeblock("indigo", "dry", 120,17,"yum"));
		MenuSelections.add(new Pokeblock("brown", "sweet", 120,18,"yum"));
		MenuSelections.add(new Pokeblock("liteblue", "bitter", 120,19,"yum"));
		MenuSelections.add(new Pokeblock("olive", "sour", 120,20,"yum"));
		/*MenuSelections.add(new Pokeblock("grey", "none", 150,89,"yum"));
		MenuSelections.add(new Pokeblock("white", "none", 150,90,"yum"));*/
		
		//poke puffs
		MenuSelections.add(new PokePuff("basic sweet", "sweet", 150,21,"cute little cupcakes"));
		MenuSelections.add(new PokePuff("basic mint", "dry", 150,22,"cute little cupcakes"));
		MenuSelections.add(new PokePuff("basic citrus", "sour", 150,23,"cute little cupcakes"));
		MenuSelections.add(new PokePuff("basic mocha", "bitter", 150,24,"cute little cupcakes"));
		MenuSelections.add(new PokePuff("basic spice", "spicy", 150,25,"cute little cupcakes"));
		MenuSelections.add(new PokePuff("deluxe sweet", "sweet", 300,26,"fancy little cupcakes"));
		MenuSelections.add(new PokePuff("deluxe mint", "dry", 300,27,"fancy little cupcakes"));
		MenuSelections.add(new PokePuff("deluxe citrus", "sour", 300,28,"fancy little cupcakes"));
		MenuSelections.add(new PokePuff("deluxe mocha", "bitter", 300,29,"fancy little cupcakes"));
		MenuSelections.add(new PokePuff("deluxe spice", "spicy", 300,30,"fancy little cupcakes"));

	
	}
	/*public static void main(String args[])
	{
		Menu a = new Menu();
		System.out.println(a.MenuSelections.get(69).getName() + " " + a.MenuSelections.get(69).getID());
	}*/
}
