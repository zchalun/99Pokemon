package model_pokemon;
import java.util.*;

public class PokeDex
{
	ArrayList<Pokemon> allPokemon = new ArrayList<Pokemon>();
	public PokeDex()
	{
		allPokemon.add(new Grass("Bulbasaur",1));
		allPokemon.add(new Grass("Ivysaur",2));
		allPokemon.add(new Grass("Venusaur",3));
		allPokemon.add(new Fire("Charmander",4));
		allPokemon.add(new Fire("Charmeloen",5));
		allPokemon.add(new Fire("Charizard",6));
		allPokemon.add(new Flying("Charizard",6)); //double type
		allPokemon.add(new Water("Squirtle",7));
		allPokemon.add(new Water("Wartortle",8));
		allPokemon.add(new Water("Blastoise",9));
		allPokemon.add(new Bug("Caterpie",10));
		allPokemon.add(new Bug("Metapod",11));
		allPokemon.add(new Bug("Butterfree",12));	
		allPokemon.add(new Bug("Weedle",13));
		allPokemon.add(new Bug("Kakuna",14));
		allPokemon.add(new Bug("Beedrill",15));
		allPokemon.add(new Poison("Weedle",13)); //double
		allPokemon.add(new Poison("Kakuna",14)); //double
		allPokemon.add(new Poison("Beedrill",15)); //double
		allPokemon.add(new Flying("Pidgey",16));
		allPokemon.add(new Flying("Pidgeotto",17));
		allPokemon.add(new Flying("Pidgeot",18));
		allPokemon.add(new Normal("Pidgey",16)); //double
		allPokemon.add(new Normal("Pidgeotto",17)); //double
		allPokemon.add(new Normal ("Pidgeot",18)); //double
		allPokemon.add(new Normal("Rattata",19));
		allPokemon.add(new Normal("Raticate",20));
		allPokemon.add(new Flying("Spearow",21));
		allPokemon.add(new Flying("Fearow",22));
		allPokemon.add(new Normal("Spearow",21)); //double
		allPokemon.add(new Normal("Fearow",22)); //double
		allPokemon.add(new Poison("Ekans",23));
		allPokemon.add(new Poison("Arbok",24));
		allPokemon.add(new Electric("Pikachu",25));
		allPokemon.add(new Electric("Raichu",26));
		allPokemon.add(new Ground("Sandshrew",27));
		allPokemon.add(new Ground("Sandslash",28));
		allPokemon.add(new Poison("Nidoran (F)",29));
		allPokemon.add(new Poison("Nidorina",30));
		allPokemon.add(new Poison("Nidoqueen",31));
		allPokemon.add(new Ground("Nidoqueen",31)); //double
		allPokemon.add(new Poison("Nidoran (M)",32));
		allPokemon.add(new Poison("Nidorino",33));
		allPokemon.add(new Poison("Nidoking",34));
		allPokemon.add(new Poison("Nidoking",34)); //double
		allPokemon.add(new Normal("Clefairy",35));
		allPokemon.add(new Normal("Clefable",36));
		allPokemon.add(new Fire("Vulpix",37));
		allPokemon.add(new Fire("Ninetales",38));
		allPokemon.add(new Normal("Jigglypuff",39));
		allPokemon.add(new Normal("Wigglytuff",40));
		allPokemon.add(new Poison("Zubat",41));
		allPokemon.add(new Flying("Zubat",41)); //double
		allPokemon.add(new Poison("Golbat",42));
		allPokemon.add(new Flying("Golbat",42)); //double
		allPokemon.add(new Poison("Oddish",43));
		allPokemon.add(new Grass("Oddish",43)); //double
		allPokemon.add(new Poison("Gloom",44));
		allPokemon.add(new Grass("Gloom",44)); //double
		allPokemon.add(new Poison("Vileplume",45));
		allPokemon.add(new Grass("Vileplume",45)); //double
		allPokemon.add(new Grass("Paras",46));
		allPokemon.add(new Bug("Paras",46)); //double
		allPokemon.add(new Bug("Parasect",47));
		allPokemon.add(new Grass("Parasect",47)); //double
		allPokemon.add(new Poison("Venonat",48));
		allPokemon.add(new Bug("Venonat",48)); //double
		allPokemon.add(new Poison("Venomoth",49));
		allPokemon.add(new Bug("Venomoth",49)); //double
		allPokemon.add(new Ground("Diglett",50));
		allPokemon.add(new Ground("Dugtrio",51));
		allPokemon.add(new Normal("Meowth",52));
		allPokemon.add(new Normal("Persian",53));
		allPokemon.add(new Water("Psyduck",54));
		allPokemon.add(new Water("Golduck",55));
		allPokemon.add(new Fighting("Mankey",56));
		allPokemon.add(new Fighting("Primeape",57));
		allPokemon.add(new Fire("Growlithe",58));
		allPokemon.add(new Fire("Arcanine",59));
		allPokemon.add(new Water("Poliwag",60));
		allPokemon.add(new Water("Poliwhirl",61));
		allPokemon.add(new Water("Poliwrath",62));
		allPokemon.add(new Fighting("Poliwrath",62)); //double
		allPokemon.add(new Psychic("Abra",63));
		allPokemon.add(new Psychic("Kadabra",64));
		allPokemon.add(new Psychic("Alakazam",65));
		allPokemon.add(new Fighting("Machop",66));
		allPokemon.add(new Fighting("Machoke",67));
		allPokemon.add(new Fighting("Machamp",68));
		allPokemon.add(new Grass("Bellsprout",69));
		allPokemon.add(new Poison("Bellsprout",69)); //double
		allPokemon.add(new Grass("Weepinbell",70));
		allPokemon.add(new Poison("Weepinbell",70)); //double
		allPokemon.add(new Grass("Victreebel",71));
		allPokemon.add(new Poison("Victreebel",71)); //double
		allPokemon.add(new Water("Tentacool",72));
		allPokemon.add(new Poison("Tentacool",72)); //double
		allPokemon.add(new Water("Tentacruel",73));
		allPokemon.add(new Poison("Tentacruel",73)); //double
		allPokemon.add(new Rock("Geodude",74));
		allPokemon.add(new Ground("Geodude",74)); //double
		allPokemon.add(new Rock("Graveler",75));
		allPokemon.add(new Ground("Graveler",75)); //double
		allPokemon.add(new Rock("Golem",76));
		allPokemon.add(new Ground("Golem",76)); //double
		allPokemon.add(new Fire("Ponyta",77));
		allPokemon.add(new Fire("Rapidash",78));
		allPokemon.add(new Water("Slowpoke",79));
		allPokemon.add(new Psychic("Slowpoke",79)); //double
		allPokemon.add(new Water("Slowbro",80));
		allPokemon.add(new Psychic("Slowbro",80)); //double
		allPokemon.add(new Electric("Magnemite",81));
		allPokemon.add(new Steel("Magnemite",81)); //double
		allPokemon.add(new Electric("Magneton",82));
		allPokemon.add(new Steel("Magneton",82)); //double
		allPokemon.add(new Normal("Farfetch'd",83));
		allPokemon.add(new Flying("Farfetch'd",83)); //double
		allPokemon.add(new Normal("Doduo",84));
		allPokemon.add(new Flying("Doduo",84)); //double
		allPokemon.add(new Normal("Dodrio",85));
		allPokemon.add(new Flying("Dodrio",85)); //double
		allPokemon.add(new Water("Seel",86));
		allPokemon.add(new Water("Dewgong",87));
		allPokemon.add(new Ice("Dewgong",87)); //double
		allPokemon.add(new Poison("Grimer",88));
		allPokemon.add(new Poison("Muk",89));
		allPokemon.add(new Water("Shellder",90));
		allPokemon.add(new Water("Cloyster",91));
		allPokemon.add(new Ice("Cloyster",91)); //double
		allPokemon.add(new Ghost("Gastly",92));
		allPokemon.add(new Poison("Gastly",92)); //double
		allPokemon.add(new Ghost("Haunter",93));
		allPokemon.add(new Poison("Haunter",93)); //double
		allPokemon.add(new Ghost("Gengar",94));
		allPokemon.add(new Poison("Gengar",94)); //double
		allPokemon.add(new Rock("Onix",95));
		allPokemon.add(new Ground("Onix",95)); //double
		allPokemon.add(new Psychic("Drowzee",96));
		allPokemon.add(new Psychic("Hypno",97));
		allPokemon.add(new Water("Krabby",98));
		allPokemon.add(new Water("Kingler",99));
		allPokemon.add(new Electric("Voltorb",100));
		allPokemon.add(new Electric("Electrode",101));
		allPokemon.add(new Grass("Exeggcute",102));
		allPokemon.add(new Psychic("Exeggcute",102)); //double
		allPokemon.add(new Grass("Exeggutor",103));
		allPokemon.add(new Psychic("Exeggutor",103)); //double
		allPokemon.add(new Ground("Cubone",104));
		allPokemon.add(new Ground("Marowak",105));
		allPokemon.add(new Fighting("Hitmonlee",106));
		allPokemon.add(new Fighting("Hitmonchan",107));
		allPokemon.add(new Normal("Lickitung",108));
		allPokemon.add(new Poison("Koffing",109));
		allPokemon.add(new Poison("Weezing",110));
		allPokemon.add(new Ground("Rhyhorn",111));
		allPokemon.add(new Rock("Rhyhorn",111)); //double
		allPokemon.add(new Ground("Rhydon",112));
		allPokemon.add(new Rock("Rhydon",112)); //double
		allPokemon.add(new Normal("Chansey",113));
		allPokemon.add(new Grass("Tangela",114));
		allPokemon.add(new Normal("Kangaskhan",115));
		allPokemon.add(new Water("Horsea",116));
		allPokemon.add(new Water("Seadra",117));
		allPokemon.add(new Psychic("Goldeen",118));
		allPokemon.add(new Water("Seaking",119));
		allPokemon.add(new Water("Staryu",120));
		allPokemon.add(new Water("Starmie",121));
		allPokemon.add(new Psychic("Starmie",121)); //double
		allPokemon.add(new Psychic("Mr. Mime",122));
		allPokemon.add(new Bug("Scyther",122));
		allPokemon.add(new Flying("Scyther",123)); //double
		allPokemon.add(new Ice("Jynx",124));
		allPokemon.add(new Psychic("Jynx",124)); //double
		allPokemon.add(new Electric("Electabuzz",125));
		allPokemon.add(new Fire("Magmar",126));
		allPokemon.add(new Bug("Pinsir",127));
		allPokemon.add(new Normal("Tauros",128));
		allPokemon.add(new Water("Magikarp",129));
		allPokemon.add(new Water("Gyarados",130));
		allPokemon.add(new Flying("Gyarados",130)); //double
		allPokemon.add(new Water("Lapras",131));
		allPokemon.add(new Ice("Lapras",131)); //double
		allPokemon.add(new Normal("Ditto",132));
		allPokemon.add(new Normal("Eevee",133));
		allPokemon.add(new Water("Vaporeon",134));
		allPokemon.add(new Electric("Jolteon",135));
		allPokemon.add(new Fire("Flareon",136));
		allPokemon.add(new Normal("Porygon",137));
		allPokemon.add(new Rock("Omanyte",138));
		allPokemon.add(new Water("Omanyte",138)); //double
		allPokemon.add(new Rock("Omastar",139));
		allPokemon.add(new Water("Omastar",139)); //double
		allPokemon.add(new Rock("Kabuto",140));
		allPokemon.add(new Water("Kabuto",140)); //double
		allPokemon.add(new Rock("Kabutops",141));
		allPokemon.add(new Water("Kabutops",141)); //double
		allPokemon.add(new Rock("Aerodactyl",142));
		allPokemon.add(new Flying("Aerodactyl",142)); //double
		allPokemon.add(new Normal("Snorlax",143));
		allPokemon.add(new Rock("Articuno",144));
		allPokemon.add(new Ice("Articuno",144)); //double
		allPokemon.add(new Rock("Zapdos",145));
		allPokemon.add(new Electric("Zapdos",145)); //double
		allPokemon.add(new Fire("Moltres",145));
		allPokemon.add(new Flying("Moltres",145)); //double
		allPokemon.add(new Dragon("Dratini",147));
		allPokemon.add(new Dragon("Dragonair",148));
		allPokemon.add(new Dragon("Dragonite",149));
		allPokemon.add(new Flying("Dragonite",149)); //double
		allPokemon.add(new Psychic("Mewtwo",150));
		allPokemon.add(new Psychic("Mew",151));		
	}
	
	public ArrayList<Pokemon> getList()
	{
		return allPokemon;
	}

	/*public static void main(String args[])
	{
		PokeDex a = new PokeDex();
		System.out.println(a.getList().get(0).getName());
	}*/

}
