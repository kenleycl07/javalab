// classe Etudiant avec un constructeur pour initialiser:
//matricule, nom, programme, section, n_des_notes, notes.
package OOP;

import java.util.Comparator;

public  class Etudiant implements Comparator<Etudiant>, Comparable<Etudiant>
{
	private String matricule; // matricule d'un étudiant
	private String nom; // nom d'un étudiant
	private String programme; // programme suivi par un étudiant
	private int section; // section d'un étudiant
	private int n_des_notes = 5; // nombre de notes
	private int [] notes; // chaque élément de ce tableau est un objet NoteCours
	
	int indexCounter = 0;//initialiser un compteur

	public Etudiant(String mtr, String n, String p, int s)
	{
		matricule = mtr; // initialisation du matricule
		nom = n; // initialisation du nom
		programme = p; // initialisation du programme
		section = s; // initialisation de la section
		notes = new int [n_des_notes];
	}
	
	// méthode pour définir le matricule
	public void setMatricule(String mtr) 
	{
		matricule = mtr; // stocker le matricule
	}
			
	// méthode pour définir le nom d' un étudiant
	public void setNom(String n) 
	{
		nom = n; // stocker le nom
	}
			
	// méthode pour définir le programme
	public void setProgramme(String p) 
	{
		programme = p; // stocker le programme
	}
			
	// méthode pour définir le nombre de notes
	public void setSection(int s) 
	{
	section = s; // stocker la section
	}
			
	// méthode pour récupérer le matricule
	public String getMatricule() 
	{
	return matricule;
	}
			
	// méthode pour récupérer le nom
	public String getNom() 
	{
	return nom;
	}
			
	// méthode pour récupérer le programme
	public String getProgramme() 
	{
	return programme;
	}
			
	// méthode pour récupérer la section
	public int getSection() 
	{
	return section;
	}
	//Cette méthode permet de calculer à la fois la somme
	//des notes et la moyenne de n'importe quel étudiant
	public void ajouterNote(String sigle, String titre, int note) {
		//définir le titre du cours et la note obtenue pour ce cours
		NoteCours.setTitre(titre);
		NoteCours.setNote(note);
		
		//ajouter la note dans le tableau notes
		notes[indexCounter] = note;
		
		//Sommes des notes
		int total = 0;//initialiser la somme des notes
		for ( int counter = 0; counter < notes.length; counter++ )
			total += notes[ counter ];
		
		//Note Moyenne
		//double average = 0.0;//initialiser la note moyenne
        //(double)total / notes.length;
		
        //incrémenter le compteur pour pouvoir ajouter une nouvelle note 
        indexCounter++;
        
		//Afficher les notes de chaque cours
        System.out.printf("%s: %s, %s: %d\n", "Cours", NoteCours.getTitre(), "Note obtenue", NoteCours.getNote());
        if(indexCounter == 5) {
		System.out.printf("%s: %d\n", "Sommes des notes", total); 
		//System.out.printf("%s: %.1f\n", "NoteMoyenne", average);
        }
		
		
	}

	
	public double NoteMoyenne(int notes_de_etudiant [], int nombre_de_notes) {
		
		//Sommes des notes du tableau
		int sum = 0;
		
		for (int indexCounter = 0; indexCounter < nombre_de_notes; indexCounter++)
			sum += notes_de_etudiant[indexCounter];
		
		return  (double)sum / nombre_de_notes;
		
	}

    //Afficher les informations personelles d'un étudiant
	public void afficherInfoEtudiant() {
		System.out.println("Informations personnelles de " + getNom());
		System.out.println("-----------------------------------------------");
		
        System.out.printf("Nom: %s\nMatricule: %s\nProgramme: %s\nSection: %s\n\n", 
				getNom(), getMatricule(), getProgramme(), getSection());
	}
	
	//Renvoyer une représentation sous forme de String du nom et de la section
	public String toString() {
		return  nom + " " + section;
	}

	//trier les étudiants par nom
	@Override
	public int compareTo(Etudiant o) {
		return this.nom.compareTo(o.nom);
	}
	//trier les étudiants par nom
	@Override
	public int compare(Etudiant o1, Etudiant o2) {
		// TODO Auto-generated method stub
		return o1.section - o2.section;
	}		
}
