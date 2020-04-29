package model_pokemon;

public abstract class Pokemon {
		protected String name; // pokemon name
		protected int level;
		protected int ID; // pokemon ID, ie bulbasaur 1, ivysaur 2, etc
		protected String type;
		protected String[] weak;
		protected String[] strength; 
		protected String[] no_effect;
		
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
		
		public String getType() {
			return type;
		}
		
		public String[] getWeak() {
			return weak;
		}
		
		public String[] getStrength() {
			return strength;
		}
		
		public String[] getNoEffect() {
			return no_effect;
		}
	}