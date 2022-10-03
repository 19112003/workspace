
public class Personne {
	private String nom = "";
	private String prenom = "";
	
	public void direBonjour() { 
		System.out.println("Bonjour, je m'appelle " + this.nom + " " + this.prenom);
	}
	
	public void direBonsoir() {
		System.out.println("\nBonsoir la classe");
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	/*public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}*/
	

}
