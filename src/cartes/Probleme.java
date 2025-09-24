package cartes;

public abstract class Probleme extends Carte {
	
	private Type type;

	protected Probleme(Type type) {
	}
	
	public Type getType() {
		return type;
	}

}
