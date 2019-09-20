package Client;

import java.sql.*;
import Invite.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Requete {

	
		Connexion laConnexion;
		String script;
		
		public Requete(Connexion co, String script) {
			laConnexion = co;
			this.script = script;
		}
		
		
		public void execRequeteClientCreate(int id_client, String nom, String prenom, String no_rue, String voie, String code_postal, String ville, String pays) {
			try {
				PreparedStatement requete = laConnexion.maConnexion.prepareStatement(script);
				requete.setInt(1,id_client);
				requete.setString(2,nom);
				requete.setString(3,prenom);
				requete.setString(4,no_rue);
				requete.setString(5,voie);
				requete.setString(6,code_postal);
				requete.setString(7,ville);
				requete.setString(8,pays);
				int res = requete.executeUpdate();
			} catch (SQLException sqle) {System.out.println("Pb select" + sqle.getMessage());}
			
		}
		public void execRequeteClientModif(int id_client, String nom, String prenom, String no_rue, String voie, String code_postal, String ville, String pays) {
			try {
				PreparedStatement requete = laConnexion.maConnexion.prepareStatement(script);
				requete.setInt(8,id_client);
				requete.setString(1,nom);
				requete.setString(2,prenom);
				requete.setString(3,no_rue);
				requete.setString(4,voie);
				requete.setString(5,code_postal);
				requete.setString(6,ville);
				requete.setString(7,pays);
				int res = requete.executeUpdate();
			} catch (SQLException sqle) {System.out.println("Pb select" + sqle.getMessage());}
			
		}
		public void execRequeteClientDelete(int id_client) {
			try {
				PreparedStatement requete = laConnexion.maConnexion.prepareStatement(script);
				requete.setInt(1,id_client);
				int res = requete.executeUpdate();
			} catch (SQLException sqle) {System.out.println("Pb select" + sqle.getMessage());}
		}
	}


