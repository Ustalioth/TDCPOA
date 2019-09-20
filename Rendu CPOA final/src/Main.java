import java.util.*;

import Invite.Connexion;
import Periodicite.Requete;

public class Main {

	public static void main(String[] args) {
		Connexion co = new Connexion("31713558");
		String scriptDel = "DELETE FROM Periodicite WHERE id_periodicite = ?";
		String scriptInser = "INSERT INTO Periodicite(id_periodicite,libelle) VALUES(?,?)";
		String scriptModif = "UPDATE Periodicite SET libelle = ? WHERE id_periodicite = ?";
		Scanner sc = new Scanner(System.in);
		int rep=0;
		while(rep!=4) {
		System.out.println("Voulez vous ajouter(1), modifier(2) ou supprimer(3) une pÃ©riodicitÃ© ? Ou quitter(4) ? ");
		rep = sc.nextInt();
		if(rep==1) {
			System.out.println("Entrez l'ID et le libellé de la périodicité à  créer");
			System.out.println("ID : ");
			int a = sc.nextInt();
			sc.nextLine();
			System.out.println("Libellé : ");
			String b = sc.nextLine();
			Requete req1 = new Requete(co, scriptInser);
			req1.execRequetePeriodiciteCreate(a,b);
		}
		else if(rep==2) {
			System.out.println("Entrez l'ID de la périodicité à  modifier et le nouveau libellé");
			System.out.println("ID : ");
			int a = sc.nextInt();
			sc.nextLine();
			System.out.println("Libellé : ");
			String b = sc.nextLine();
			Requete req1 = new Requete(co, scriptModif);
			req1.execRequetePeriodiciteModif(a,b);
		}
		else if(rep==3) {
			System.out.println("Entrez l'ID de la pÃ©riodicitÃ© Ã  supprimer");
			System.out.println("ID : ");
			int a = sc.nextInt();
			Requete req1 = new Requete(co, scriptDel);
			req1.execRequetePeriodiciteDelete(a);
		}
		else if(rep>4) {
			System.out.println("merci d'entrer un chiffre compris entre 1 et 3.");
		}
		
	}
		sc.close();
	}
	

}
