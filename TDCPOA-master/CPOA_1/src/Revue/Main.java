package Revue;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Connexion co = new Connexion("31810375");
		String scriptDel = "DELETE FROM Revue WHERE id_revue = ?";
		String scriptInser = "INSERT INTO Revue(id_revue,titre,description,tarif_numero,visuel,id_periodicite) VALUES(?,?,?,?,?,?)";
		String scriptModif = "UPDATE Revue SET titre = ?, description = ?, tarif_numero = ?, visuel = ?, id_periodicite = ? WHERE id_revue = ?";
		Scanner sc = new Scanner(System.in);
		
		int rep=0;
		while(rep!=4) {
		System.out.println("Voulez vous ajouter(1), modifier(2) ou supprimer(3) une revue ? Ou quitter(4) ? ");
		rep = sc.nextInt();
		if(rep==1) {
			System.out.println("Entrez l'ID, le titre, la description, le tarif du numéro, le fichier du visuel et l'id de la périodicité de la revue à créer :");
			System.out.println("ID : ");
			int a = sc.nextInt();
			sc.nextLine();
			
			System.out.println("titre : ");
			String b = sc.nextLine();
			
			System.out.println("description : ");
			String c = sc.nextLine();
			
			System.out.println("tarif du numéro : ");
			float d = sc.nextFloat();
			
			System.out.println("fichier du visuel : ");
			sc.nextLine();
			String e = sc.nextLine(); 
			
			System.out.println("id de la périodicité : ");
			int f = sc.nextInt();
			sc.nextLine();
			
			Requete req1 = new Requete(co, scriptInser);
			req1.execRequeteRevueCreate(a,b,c,d,e,f);
		}
		else if(rep==2) {
			System.out.println("ID : ");
			int a = sc.nextInt();
			sc.nextLine();
			
			System.out.println("titre : ");
			String b = sc.nextLine();
			
			System.out.println("description : ");
			String c = sc.nextLine();
			
			System.out.println("tarif du numéro : ");
			float d = sc.nextFloat();
			
			System.out.println("fichier du visuel : ");
			String e = sc.nextLine(); 
			
			System.out.println("id de la périodicité : ");
			int f = sc.nextInt();
			sc.nextLine(); 
			
			Requete req1 = new Requete(co, scriptModif);
			req1.execRequeteRevueModif(a,b,c,d,e,f);
		}
		else if(rep==3) {
			System.out.println("Entrez l'ID de la revue à supprimer");
			System.out.println("ID : ");
			int a = sc.nextInt();
			Requete req1 = new Requete(co, scriptDel);
			req1.execRequeteRevueDelete(a);
		}
		else if(rep>4) {
			System.out.println("merci d'entrer un chiffre compris entre 1 et 3.");
		}
		
	}
		sc.close();
	}
}
