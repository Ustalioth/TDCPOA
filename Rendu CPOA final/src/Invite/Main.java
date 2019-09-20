package Invite;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n = 0;
		int m = 0;
		String table = "";
		String tableSQL = "";
		Connexion co = new Connexion("31713558");
		Scanner sc = new Scanner(System.in);
		SelectionRequete sr = new SelectionRequete(co);
		
		do {
			System.out.println("Quelle table voulez vous affecter ? \nAbonnement (1) Client (2) Periodicité (3) Revue (4)");
			n = sc.nextInt();
		} while (n < 1 || m > 4);
		
		switch(n) {
			case 1 : {
				System.out.println("Table actuelle : Abonnement\n");
				table = "un abonnement";
				tableSQL = "Abonnement";
				break;
			}
			case 2 : {
				System.out.println("Table actuelle : Client\n");
				table = "un client";
				tableSQL = "Client";
				break;
			}
			case 3 : {
				System.out.println("Table actuelle : Périodicité\n");
				table = "une périodicité";
				tableSQL = "Periodicite";
				break;
			}
			case 4 : {
				System.out.println("Table actuelle : Revue\n");
				table = "une revue";
				tableSQL = "Revue";
				break;
			}
		}
		
		do {
			System.out.println("Voulez vous ajouter (1) modifier (2) ou supprimer (3) " + table);
			m = sc.nextInt();
		} while (m < 1 || m > 3);

		String scriptDel = "DELETE FROM " + tableSQL + " WHERE ";
		String scriptUpdate = "UPDATE " + tableSQL + " SET ";
		String scriptAdd = "INSERT INTO " + tableSQL;
		
		switch(m) {
			case 1 : sr.add(scriptAdd,n);
				break;
			case 2 : sr.update(scriptUpdate,n);
				break;
			case 3 : sr.delete(scriptDel,n);
				break;
		}
		
		}
}
