package model_pokemon;

public class Pokemon {
		protected String name; // product name
		protected int level;
		protected int ID; // pokemon ID, ie bulbasaur 1, ivysaur 2, etc
		
		public Pokemon() {
			name = "default pokemon"; //placeholder
			level = 10000; //placeholder
			ID = 10000; //placeholder
		}
		
		
		public String getName() {
			return name;
		}
		
		public int getID() {
			return ID;
		}
		
	    public void setID(int id)
	    {
	    	this.ID = id;
	    }
			
		public int getLevel() {
			return level;
		}
	}