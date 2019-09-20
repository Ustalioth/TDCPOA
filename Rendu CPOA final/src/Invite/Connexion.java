package Invite;
import java.sql.*;

public class Connexion {
	public Connection maConnexion = null;
	String url;
	String login;
	String pwd;
	
	public Connexion(String pass) {
		url = "jdbc:mysql://devbdd.iutmetz.univ-lorraine.fr:3306/henselma1u_tdcpoa";
		url += "?serverTimezone=Europe/Paris";
		login = "henselma1u_appli";
		pwd = pass;
		try { maConnexion = DriverManager.getConnection(url, login, pwd);
		} 
		catch (SQLException sqle) {System.out.println("Erreur connexion" + sqle.getMessage());
		}
	}
}
