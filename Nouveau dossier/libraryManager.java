package Bibliothéque;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class libraryManager {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//afficher_livre();
		//ajouter_livre ();
		//rechercher_livreparID();
		// rechercher_livreparauteur();
		//livre_pret();
		//livre_pret_user();
		//Rechercher_user_par_ID();
		Trier_par_date();
	}
	
	
	public static void afficher_livre() {
		
		String url = "jdbc:mysql://localhost/db_biblio";
		String login = "root";
		String passwd = "";
		Connection cn =null;
		Statement st =null;
		ResultSet rs =null ; 
		try {
			
			// Information d'accès à la base de données
		
			cn = DriverManager.getConnection (url, login, passwd);
			st = cn.createStatement();
			// Etape 3 : Création d'un statement
			

			String sql = "SELECT ID_book, title,author,editor,pageNb,summary FROM book;";

			// Etape 4 : exécution requête
			rs = st.executeQuery(sql);

			// Si récup données alors étapes 5 (parcours Resultset)

			while (rs.next()) {
				int ID_book = rs.getInt("Id_book");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String editor = rs.getString("editor");
				int pageNb = rs.getInt("pageNb");
				String Summary = rs.getString("summary");
				book book = new book (ID_book,title,author,editor,pageNb,Summary,null);
				book.afficher_livre();
				// Etape 6 : libérer ressources de la mémoire.
				
			}
		 } catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void ajouter_livre () {
	String url = "jdbc:mysql://localhost/db_biblio";
	String login = "root";
	String passwd = "";
	Connection cn =null;
	Statement st =null;
	try {
		cn = DriverManager.getConnection (url, login, passwd);
		st = cn.createStatement();
		//String sql = "INSERT INTO book"('Id_book',title,author,editor,pageNb,summary,Ref_ID_Library,Ref_ID_Rent)  "VALUES" +(NULL,train,radi,redstar,45,histoire du pays, 2,NULL) ;
		System.out.println("donner le titre du livre ") ;
	    Scanner sc = new Scanner(System.in);
		String titre = sc.next();
		System.out.println("donner l'auteur du livre ") ;
		String author = sc.next();
		System.out.println("donner l'editeur du livre ") ;
		String editor = sc.next();
		System.out.println("donner le nombre des pages du livre ") ;
		int nbr_pages = sc.nextInt();
		System.out.println("donner le resumé du livre ") ;
		String summary = sc.next();
		String sql = "INSERT INTO book ( ID_book, title , author ,editor,pageNb,summary,Ref_ID_Library,Ref_ID_Rent)  VALUES (default ,'"+titre+"','"+author+"','"+editor+"',"+nbr_pages+",'"+summary+"',NULL,NULL)";
		st.executeUpdate(sql);
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
		// Etape 6 : libérer ressources de la mémoire.
			cn.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
	public static void rechercher_livreparID() {
		String url = "jdbc:mysql://localhost/db_biblio";
		String login = "root";
		String passwd = "";
		Connection cn =null;
		Statement st =null;
		ResultSet rs =null ; 

		try {
			cn = DriverManager.getConnection (url, login, passwd);
			st = cn.createStatement();
		System.out.println("merci de nous fournir l'ID du livre recherché");
		 Scanner sc = new Scanner(System.in);
			int  ID = sc.nextInt();
			String sql = "SELECT* FROM book WHERE Id_book="+ID+" ;";
			rs = st.executeQuery(sql);
			while (rs.next()) {
				
				int ID_book = rs.getInt("Id_book");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String editor = rs.getString("editor");
				int pageNb = rs.getInt("pageNb");
				String Summary = rs.getString("summary");
				book book = new book (ID_book,title,author,editor,pageNb,Summary,null);
				book.afficher_livre();}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
			// Etape 6 : libérer ressources de la mémoire.
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}	
	}
	public static void rechercher_livreparauteur() {
		String url = "jdbc:mysql://localhost/db_biblio";
		String login = "root";
		String passwd = "";
		Connection cn =null;
		Statement st =null;
		ResultSet rs =null ; 

		try {
			cn = DriverManager.getConnection (url, login, passwd);
			st = cn.createStatement();
		System.out.println("merci de nous fournir l'auteur du livre");
		 Scanner sc = new Scanner(System.in);
			String author = sc.next();
			String sql = "SELECT* FROM book  WHERE author LIKE '%"+author+"%';";
			rs = st.executeQuery(sql);
			while (rs.next()) {
				{
				int ID_book = rs.getInt("Id_book");
				String title = rs.getString("title");
				String author1 = rs.getString("author");
				String editor = rs.getString("editor");
				int pageNb = rs.getInt("pageNb");
				String Summary = rs.getString("summary");
				book book = new book (ID_book,title,author1,editor,pageNb,Summary,null);
				book.afficher_livre();}
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
			// Etape 6 : libérer ressources de la mémoire.
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}	
	}
public static void livre_pret() {
	String url = "jdbc:mysql://localhost/db_biblio";
	String login = "root";
	String passwd = "";
	Connection cn =null;
	Statement st =null;
	ResultSet rs =null ; 

	try {
		cn = DriverManager.getConnection (url, login, passwd);
		st = cn.createStatement();
		System.out.println("les livres en cours de pret : ");
		String sql = "SELECT Id_book,title,author,editor,ID_rent,Ref_ID_Book,pageNb FROM book,rent WHERE rent.Ref_ID_Book= book.Id_book ";
		
		rs = st.executeQuery(sql);
		while (rs.next()) {
			int ID_book = rs.getInt("Id_book");
			String title = rs.getString("title");
			String author = rs.getString("author");
			String editor = rs.getString("editor");
			int pageNb = rs.getInt("pageNb");
			book book = new book (ID_book,title,author,editor,pageNb);
			book.afficher_livre();
}
	}
	catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
		// Etape 6 : libérer ressources de la mémoire.
			cn.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
}

public static void livre_pret_user() {
	String url = "jdbc:mysql://localhost/db_biblio";
	String login = "root";
	String passwd = "";
	Connection cn =null;
	Statement st =null;
	ResultSet rs =null ; 

	try {
		cn = DriverManager.getConnection (url, login, passwd);
		st = cn.createStatement();
		
		System.out.println("merci de nous fournir l'ID de l'utilisateur ");
		 Scanner sc = new Scanner(System.in);
		 int ID= sc.nextInt();
			System.out.println("les livres en pret de l'utilisateur n" +ID+ " sont :");
		String sql = "SELECT * FROM book,rent,user WHERE rent.Ref_ID_Book= book.Id_book AND user.ID_user=rent.Ref_ID_User ";
		//Id_book,title,Ref_ID_User,ID_rent,Ref_ID_Book,
		rs = st.executeQuery(sql);
		while (rs.next()) {
			int ID_book = rs.getInt("Id_book");
			String title = rs.getString("title");
			String author = rs.getString("author");
			String editor = rs.getString("editor");
			int pageNb = rs.getInt("pageNb");
			book book = new book (ID_book,title,author,editor,pageNb);
			book.afficher_livre();
}
	}
	catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
		// Etape 6 : libérer ressources de la mémoire.
			cn.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
}

public static void Rechercher_user_par_ID() {
	String url = "jdbc:mysql://localhost/db_biblio";
	String login = "root";
	String passwd = "";
	Connection cn =null;
	Statement st =null;
	ResultSet rs =null ; 
	try {
		cn = DriverManager.getConnection (url, login, passwd);
		st = cn.createStatement();
		
		System.out.println("merci de nous fournir l'ID de l'utilisateur ");
		 Scanner sc = new Scanner(System.in);
		 int ID= sc.nextInt();
		String sql = "SELECT * FROM user WHERE  Id_user="+ID+" ;";
		//Id_book,title,Ref_ID_User,ID_rent,Ref_ID_Book,
		rs = st.executeQuery(sql);
		while (rs.next()) {
			int ID_user = rs.getInt("Id_user");
			String nom = rs.getString("nom");
			String prenom = rs.getString("prenom");
			String adresse = rs.getString("address");
			String numTel = rs.getString("numTel");
			String mail = rs.getString("mail");
			
			user user = new user(ID_user, nom, prenom, adresse, numTel, mail);
			user.Afficher_utilisateur();
}
	}
	catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
		// Etape 6 : libérer ressources de la mémoire.
			cn.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
}
public static void Trier_par_date() {
	String url = "jdbc:mysql://localhost/db_biblio";
	String login = "root";
	String passwd = "";
	Connection cn =null;
	Statement st =null;
	ResultSet rs =null ; 
	try {
		cn = DriverManager.getConnection (url, login, passwd);
		st = cn.createStatement();
		String sql = "SELECT * FROM rent ORDER BY DateFin DESC ;";
		rs = st.executeQuery(sql);
		while (rs.next()) {
		}
}catch (SQLException e) {
	e.printStackTrace();
} finally {
	try {
	// Etape 6 : libérer ressources de la mémoire.
		cn.close();
		st.close();
	} catch (SQLException e) {
		e.printStackTrace();
		 
	}
}	
}
}
