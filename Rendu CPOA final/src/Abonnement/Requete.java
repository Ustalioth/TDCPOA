package Abonnement;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Invite.Connexion;

public class Requete {
	Connexion laConnexion;
	String script;
	
	public Requete(Connexion co, String script) {
		laConnexion = co;
		this.script = script;
	}
	
	public void execRequeteAbonnementCreate(int id_client, int id_revue, String date_deb, String date_fin) {
		try {
			PreparedStatement requete = laConnexion.maConnexion.prepareStatement(script);
			requete.setInt(1,id_client);
			requete.setInt(2,id_revue);
			requete.setString(3, date_deb);
			requete.setString(4, date_fin);
			int res = requete.executeUpdate();
		} catch (SQLException sqle) {System.out.println("Pb select" + sqle.getMessage());}
		
	}
	public void execRequeteAbonnementModif(int id_client, int id_revue, String date_deb, String date_fin) {
		try {
			PreparedStatement requete = laConnexion.maConnexion.prepareStatement(script);
			requete.setInt(1,id_client);
			requete.setInt(2,id_revue);
			requete.setString(3, date_deb);
			requete.setString(4, date_fin);
			int res = requete.executeUpdate();
		} catch (SQLException sqle) {System.out.println("Pb select" + sqle.getMessage());}
		
	}
	public void execRequeteAbonnementDelete(int id_client, int id_revue) {
		try {
			PreparedStatement requete = laConnexion.maConnexion.prepareStatement(script);
			requete.setInt(id_client, id_revue);
			int res = requete.executeUpdate();
		} catch (SQLException sqle) {System.out.println("Pb select" + sqle.getMessage());}
	}
}

