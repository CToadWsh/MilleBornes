package cartes;

public enum Type {
	FEU("Feu Rouge", "Feu vert", "Prioritaire"), 
	ESSENCE("Panne d'essence", "Essence", "Citerne"), 
	CREVAISON("Crevaison", "Roue de secours", "Increvable"), 
	ACCIDENT("Accident", "Reparation", "As du volant");
	
	private final String attaque;
	private final String parade;
	private final String botte;
	
	Type (String attaque, String parade, String botte){	
		this.attaque = attaque;
		this.parade = parade;
		this.botte = botte;
	}
	
	public String getAttaque(){
		return this.attaque;
	}
	
	public String getParade(){
		return this.parade;
	}
	
	public String getBotte(){
		return this.botte;
	}
}
