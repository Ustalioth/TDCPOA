package Revue;
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
		
		
		public void execRequeteRevueCreate(int id, String titre, String descr, float tarif_numero, String visuel, int id_periodicite) {
			try {
				PreparedStatement requete = laConnexion.maConnexion.prepareStatement(script);
				requete.setInt(1,id);
				requete.setString(2,titre);
				requete.setString(3,descr);
				requete.setFloat(4,tarif_numero);
				requete.setString(5,visuel);
				requete.setInt(6,id_periodicite);
				int res = requete.executeUpdate();
			} catch (SQLException sqle) {System.out.println("Pb select" + sqle.getMessage());}
			
		}
		public void execRequeteRevueModif(int id, String titre, String descr, float tarif_numero, String visuel, int id_periodicite) {
			try {
				PreparedStatement requete = laConnexion.maConnexion.prepareStatement(script);
				requete.setInt(1,id);
				requete.setString(2,titre);
				requete.setString(3,descr);
				requete.setFloat(4,tarif_numero);
				requete.setString(5,visuel);
				requete.setInt(6,id_periodicite);
				int res = requete.executeUpdate();
			} catch (SQLException sqle) {System.out.println("Pb select" + sqle.getMessage());}
			
		}
		public void execRequeteRevueDelete(int id) {
			try {
				PreparedStatement requete = laConnexion.maConnexion.prepareStatement(script);
				requete.setInt(1,id);
				int res = requete.executeUpdate();
			} catch (SQLException sqle) {System.out.println("Pb select" + sqle.getMessage());}
		}
	}

