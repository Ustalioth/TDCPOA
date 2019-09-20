package Invite;

import java.util.Scanner;


public class SelectionRequete {
	Connexion co;
	public SelectionRequete(Connexion co) {
		super();
		this.co = co;
	}

	public void add(String script, int n) {
		Scanner sc = new Scanner(System.in);
		
		switch(n) {
			case 1 : {
				script += "(id_client, id_revue, date_debut, date_fin) VALUES(?,?,?,?)";
				Abonnement.Requete req = new Abonnement.Requete(co,script);
				System.out.println("Entrez l'ID du client, l'ID de la revue, la date de début et la date de fin de l'abonnement :");
				System.out.println("ID client : ");
				int a = sc.nextInt();
				sc.nextLine();
				System.out.println("ID revue : ");
				int b = sc.nextInt();
				System.out.println("date de début : ");
				String c = sc.nextLine();
				System.out.println("date de fin : ");
				String d = sc.nextLine();
				
				req.execRequeteAbonnementCreate(a,b,c,d);
				break;
			}
			case 2 : {
				script += "(id_client,nom,prenom,no_rue,voie,code_postal,ville,pays) VALUES(?,?,?,?,?,?,?,?)";
				Client.Requete req = new Client.Requete(co, script);
				System.out.println("Entrez l'ID, le nom, le prenom, le numéro de rue, la voie, le code postal, la ville et le pays du client é ajouter :");
				System.out.println("ID : ");
				int a = sc.nextInt();
				sc.nextLine();
				
				System.out.println("nom : ");
				String b = sc.nextLine();
				System.out.println("prenom : ");
				String c = sc.nextLine();
				System.out.println("numero de rue : ");
				String d = sc.nextLine();
				System.out.println("voie : ");
				String e = sc.nextLine();
				System.out.println("code postal : ");
				String f = sc.nextLine();
				System.out.println("ville : ");;
				String g = sc.nextLine();
				System.out.println("pays : ");
				String h = sc.nextLine();
				
				req.execRequeteClientCreate(a, b, c, d, e, f, g, h);
				break;
			}
			case 3 : {
				script += "(id_periodicite,libelle) VALUES(?,?)";
				Periodicite.Requete req  = new Periodicite.Requete(co, script);
				System.out.println("Entrez l'ID et le libellé de la périodicité à créer");
				System.out.println("ID : ");
				int a = sc.nextInt();
				sc.nextLine();
				System.out.println("Libellé : ");
				String b = sc.nextLine();
				
				req.execRequetePeriodiciteCreate(a,b);
				break;
			}
			case 4 : {
				script += "(id_revue,titre,description,tarif_numero,visuel,id_periodicite) VALUES(?,?,?,?,?,?)";
				Revue.Requete req = new Revue.Requete(co, script);
				System.out.println("Entrez l'ID, le titre, la description, le tarif du numéro, le fichier du visuel et l'id de la périodicité de la revue à créer :");
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
				req.execRequeteRevueCreate(a, b, c, d, e, f);
				break;
			}
		}
	}
	
	public void update(String script, int n) {
		Scanner sc = new Scanner(System.in);
		switch(n) {
			case 1 : {
				Abonnement.Requete req = new Abonnement.Requete(co, script);
				script += "id_client = ?, id_revue = ?, tarif_numero = ? WHERE id_revue = ? AND id_client= ?";
				System.out.println("ID client : ");
				int a = sc.nextInt();
				sc.nextLine();
				System.out.println("ID revue : ");
				int b = sc.nextInt();
				System.out.println("date de début : ");
				String c = sc.nextLine();
				System.out.println("date de fin : ");
				String d = sc.nextLine(); 
				req.execRequeteAbonnementModif(a,b,c,d);
				break;
			}
			case 2 : {
				Client.Requete req = new Client.Requete(co, script);
				script += "nom = ?, prenom = ?, no_rue = ?, voie = ?, code_postal = ?, ville = ?, pays = ? WHERE id_client = ?";
				System.out.println("Entrez l'ID, le nom, le prenom, le numéro de rue, la voie, le code postal, la ville et le pays du client à modifier :");
				System.out.println("ID : ");
				int a = sc.nextInt();
				sc.nextLine();
				System.out.println("nom : ");
				String b = sc.nextLine();
				System.out.println("prenom : ");
				String c = sc.nextLine();
				System.out.println("numero de rue : ");
				String d = sc.nextLine();
				System.out.println("voie : ");
				String e = sc.nextLine();
				System.out.println("code postal : ");
				String f = sc.nextLine();
				System.out.println("ville : ");
				String g = sc.nextLine();
				System.out.println("pays : ");
				String h = sc.nextLine();
				req.execRequeteClientModif(a, b, c, d, e, f, g, h);
				break;
			}
			case 3 : {
				Periodicite.Requete req = new Periodicite.Requete(co, script);
				script += "libelle = ? WHERE id_periodicite = ?";
				System.out.println("Entrez l'ID de la périodicité à modifier et le nouveau libellé");
				System.out.println("ID : ");
				int a = sc.nextInt();
				sc.nextLine();
				System.out.println("Libellé : ");
				String b = sc.nextLine();
				req.execRequetePeriodiciteModif(a, b);
				break;
			}
			case 4 : {
				Revue.Requete req = new Revue.Requete(co, script);
				script += "titre = ?, description = ?, tarif_numero = ?, visuel = ?, id_periodicite = ? WHERE id_revue = ?";
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
				req.execRequeteRevueModif(a, b, c, d, e, f);
				break;
			}
		}
	}
	
	public void delete(String script, int n) {
		Scanner sc = new Scanner(System.in);
		int id;
		int id1;
		int id2;
		switch(n) {
			case 1 : {
				script += "id_client = ? AND id_revue = ?";
				Abonnement.Requete req = new Abonnement.Requete(co,script);
				System.out.println("Entrez l'ID du client et de la revue à supprimer : ");
				id1 = sc.nextInt();
				id2 = sc.nextInt();
				req.execRequeteAbonnementDelete(id1,id2);
				break;
			}
			case 2 : {
				script += "id_client = ?";
				Client.Requete req = new Client.Requete(co,script);
				System.out.println("Entrez l'ID du client à supprimer : ");
				id = sc.nextInt();
				req.execRequeteClientDelete(id);
				break;
			}
			case 3 : {
				script += "id_periodicite = ?";
				Periodicite.Requete req = new Periodicite.Requete(co, script);
				System.out.println("Entrez l'ID de la périodicité à supprimer : ");
				id = sc.nextInt();
				req.execRequetePeriodiciteDelete(id);
				break;
			}
			case 4 : {
				script += "id_revue = ?";
				Revue.Requete req = new Revue.Requete(co, script);
				System.out.println("Entrez l'ID de la revue à supprimer : ");
				id = sc.nextInt();
				req.execRequeteRevueDelete(id);
				break;
			}
		}
	}
}
