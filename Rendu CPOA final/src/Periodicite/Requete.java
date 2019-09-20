package Periodicite;
import java.sql.*;

import Invite.Connexion;

public class Requete {
	Connexion laConnexion;
	String script;
	
	public Requete(Connexion co, String script) {
		laConnexion = co;
		this.script = script;
	}
	
	public void execRequetePeriodiciteCreate(int id, String lib) {
		try {
			PreparedStatement requete = laConnexion.maConnexion.prepareStatement(script);
			requete.setInt(1,id);
			requete.setString(2,lib);
			int res = requete.executeUpdate();
		} catch (SQLException sqle) {System.out.println("Pb select" + sqle.getMessage());}
		
	}
	public void execRequetePeriodiciteModif(int id, String lib) {
		try {
			PreparedStatement requete = laConnexion.maConnexion.prepareStatement(script);
			requete.setString(1,lib);
			requete.setInt(2,id);
			int res = requete.executeUpdate();
		} catch (SQLException sqle) {System.out.println("Pb select" + sqle.getMessage());}
		
	}
	public void execRequetePeriodiciteDelete(int id) {
		try {
			PreparedStatement requete = laConnexion.maConnexion.prepareStatement(script);
			requete.setInt(1,id);
			int res = requete.executeUpdate();
		} catch (SQLException sqle) {System.out.println("Pb select" + sqle.getMessage());}
	}
}
