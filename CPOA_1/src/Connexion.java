import java.sql.*;

public class Connexion {
	Connection maConnexion = null;
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
	
	
	/*public void uneRequete() {
		try {
			Connection laConnexion = maConnexion;
			Statement requete = laConnexion.createStatement();
			ResultSet res = requete.executeQuery("select no_etudiant, nom_etudiant from etudiant");
			while (res.next()) {
				int id = res.getInt(1);
				String lib = res.getString("libelle");
			}
				
			if (res != null)
				res.close();
			if (requete != null)
				requete.close();
			if (laConnexion != null)
				laConnexion.close();
		} 
		catch (SQLException sqle) {System.out.println("Pb select" + sqle.getMessage());
		}
	}
	
	public void addPeriodicite(int id, String lib) {
		try {
			Connection connexion = maConnexion;
			PreparedStatement requete = connexion.prepareStatement("INSERT INTO Periodicite(id_periodicite,libelle) VALUES(?,?)");
			requete.setInt(1,id);
			requete.setString(2,lib);
			ResultSet res = requete.executeQuery();
		}
		catch (SQLException sqle) {System.out.println("Pb insert" + sqle.getMessage());}
	}*/
}
