package Revue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
	
		Connection maConnexion = null;
		String url;
		String login;
		String pwd;
		
		public Connexion(String pass) {
			url = "jdbc:mysql://devbdd.iutmetz.univ-lorraine.fr:3306/franco349u_CPOA";
			url += "?serverTimezone=Europe/Paris";
			login = "franco349u_appli";
			pwd = pass;
			try { maConnexion = DriverManager.getConnection(url, login, pwd);
			} 
			catch (SQLException sqle) {System.out.println("Erreur connexion" + sqle.getMessage());
			}
		}
}
