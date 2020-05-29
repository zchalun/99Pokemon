package model_pokemon;

public abstract class Pokemon {
		protected String name; // pokemon name
		protected int ID; // pokemon ID, ie bulbasaur 1, ivysaur 2, etc
		protected String type;
		protected String[] weak;
		protected String[] flavors;
		protected String[] strength; 
		protected String[] no_effect;
		
		public Pokemon() {
			name = "default pokemon"; //placeholder
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
		
		public String[] getFlavors() {
			return flavors;
		}
	}