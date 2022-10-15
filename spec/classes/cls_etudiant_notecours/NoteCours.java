package OOP;

public class NoteCours{
	public static String sigle;
	public static String titre;
	public static int note;
	
	public NoteCours(String sl, String tr, int nt){
		sigle = sl;
		note = nt;
	}
	
	// méthode pour définir le sigle
	public static void setSigle(String sl) {
		sigle = sl;  // stocker le sigle
	}
	// méthode pour définir le titre
	public static void setTitre(String tr) {
		titre = tr;  // stocker le titre
	}
	// méthode pour définir la note
	public static void setNote(int nt) {
		note = nt;  // stocker la note
	}
	// méthode pour récupérer le sigle
	public static String getSigle() {
		return sigle;
	}
	// méthode pour récupérer le titre
	public static String getTitre() {
		return titre;
	}
	// méthode pour récupérer la note
	public static int getNote() {
		return note;
	}
	

}
