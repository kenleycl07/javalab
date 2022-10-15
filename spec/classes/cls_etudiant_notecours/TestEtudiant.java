package OOP;

import java.util.Arrays;

public class TestEtudiant {

	public static void main(String[] args) {
		
		    //Créer des objets Etudiant. Chaque objet est un étudiant.
		    Etudiant John     = new Etudiant("1797453","John", "Computer Science",  2);
	        Etudiant Caroline = new Etudiant("1897053","Caroline", "Mathematics", 1);
	        Etudiant Antoine  = new Etudiant("1297453","Antoine", "Economics", 2);
	        Etudiant Karl     = new Etudiant("1797433","Karl", "Computer Science", 1);
	        Etudiant Ahmed    = new Etudiant("1897453","Ahmed", "Mathematics", 2);
	        Etudiant Sam      = new Etudiant("1977411","Sam","Computer Science",3);
	        
            //Liste des étudiants
	        Etudiant[] etudiants = {
	            John, Caroline, Karl, Ahmed, Sam
	        };
	        
	        // Trier la liste
	        Arrays.sort(etudiants);
	
	        //trier les étudiants par nom -section
	        //Par le nom
	        System.out.println("Trie par le nom ");
	        System.out.println("----------");
	        for(Etudiant etudiant : etudiants)
	        	System.out.printf("%s,\n", etudiant.getNom());
	        System.out.println("----------");
	        
	        //Trier la liste en utiisant Comparator
	        Arrays.sort(etudiants, new Etudiant(null, null, null, 0));
	        System.out.println(" ");
	        
	        //Par section
	        System.out.println("Trie par section");
	        System.out.println("----------");
	        for(Etudiant etudiant : etudiants)
	        	System.out.printf("%s: %s %d\n", etudiant.getNom(), "Section", 
	        			etudiant.getSection());
	        System.out.println("----------");
	        
	        //Utilisation de l'objet (Etudiant) John pour lancer des tests d'execution du programme
	        //Obtenir les informations sur John en utilisant la méthode afficherInfoEtudiant()
	        John.afficherInfoEtudiant();
	        System.out.println();//new line character
	        //Obtenir les informations sur chaque cours suivi par John
	        
			System.out.printf("%s%s\n",  "Notes de ", John.getNom());
			System.out.println("-----------------------------------------------");
			//A chaque fois qu'on fait appelle à la méthode ajouterNote()
			//le programme fait une mise jour, calcule la nouvelle somme et la nouvelle moyenne
			John.ajouterNote("18.01", "Single variable Calculus", 100);
			John.ajouterNote("1.00", "Introduction to Computers and Engineering Problem Solving", 98);
			John.ajouterNote("6.0001", "Inroduction to Computer Science and Programming in Python", 93);
			John.ajouterNote("6.045J", "Automata, Computability and Complexity", 100);
			John.ajouterNote("6.033", "Computer System Engineering", 96);
			
			//Stocker les notes de John dans un tableau
			int notes_de_John [] = {100, 98, 93, 100, 96};
			int nombre_notes_John = notes_de_John.length;
			System.out.println("Moyenne: " + John.NoteMoyenne(notes_de_John, nombre_notes_John) + "\n");

			//On peut comparer deux étudiant et dire par exemple s'ils ont des noms identiques,
			//s'ils sont dans la même section ou encore s'ils suivent le même programme
			//Comparer les noms de deux étudiants
			if(John.getNom().equals(Karl.getNom()))
			    System.out.printf("%s et %s %s\n", John.getNom(), Karl.getNom(), 
			    		"ont le même nom.");
			else
			    System.out.printf("%s et %s %s\n", John.getNom(), Karl.getNom(), 
			    		"n'ont pas le même nom.");
			
			//Comparer les sections de deux étudiants
			if(Antoine.getSection() == Ahmed.getSection())
			    System.out.printf("%s et %s %s\n", Antoine.getNom(), Ahmed.getNom(), 
			    		"sont dans la même section.");
			else
			    System.out.printf("%s et %s %s\n", Antoine.getNom(), Ahmed.getNom(), 
			    		"ne sont pas dans la même section.");
			
			//Comparer les programmes de deux étudiants
			if(Caroline.getProgramme().equals(Ahmed.getProgramme()))
			    System.out.printf("%s et %s %s: %s \n", Caroline.getNom(), Ahmed.getNom(), 
			    		"suivent le même programme qui est", Ahmed.getProgramme());
			else
			    System.out.printf("%s et %s %s\n", Caroline.getNom(), Ahmed.getNom(), 
			    		"ne suivent pas le même programme.");
			
	        System.out.println();//new line character

			Etudiant c = new Etudiant(null, null, null, 0);
			System.out.print("John.compareTo(Antoine):");
			System.out.println(John.compareTo(Antoine));
			
			System.out.print("John.compareTo(Ahmed):");
			System.out.println(John.compareTo(Ahmed));
			
			System.out.print("Caroline.compareTo(Karl):");
			System.out.println(Caroline.compareTo(Karl));
			
			System.out.print("c.compare(Ahmed, Antoine):");
			System.out.println(c.compare(Ahmed, Antoine));
			
}
	}
