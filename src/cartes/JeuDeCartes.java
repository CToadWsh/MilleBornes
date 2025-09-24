package cartes;

public class JeuDeCartes {
	
	private Configuration[] typesDeCartes;
	
	public String affichageJeuDeCartes() {
		return "yes";
	}
	
	public static class Configuration{
		private Carte carte;
		private int nbExemplaires;
		
		private Configuration(Carte carte, int nbExemplaire) {
			this.carte = carte;
			this.nbExemplaires = nbExemplaire;
		}
		
		public Carte getCarte() {
			return carte;
		}
		
		public int getNbExemplaires() {
			return 	nbExemplaires;
		}
	}

}
