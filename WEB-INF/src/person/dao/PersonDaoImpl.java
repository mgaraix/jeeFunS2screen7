package dao;

import java.sql.*;
import java.util.*;

import modele.Personne;

/**  screenS2:DAO avec JDBC - DAO  ***/
public class PersonDaoImpl implements PersonDao {
	
	private Connection conn;
	
	public PersonDaoImpl( String dbfile ) {
		// open a connection with propper jdbc
		try{ // dbfile = chemin de la resource
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection("jdbc:sqlite:"+ dbfile);
		}
		catch (SQLException | ClassNotFoundException e){
			throw new Error("impossible d'ouvrir le fichier sqlite"+ dbfile, e);
		}
    } 
	

	public List<Personne> listAll(){
		// get all personnnes and assign each to a list
		String query = "select * from persons";
		List<Personne> lpers = new ArrayList<>();
		
		try {
			Statement stm = conn.createStatement();
			ResultSet rs =  stm.executeQuery(query);
			while( rs.next() ){
				Personne p = new Personne();
				p.setId( rs.getInt("id") );				
				p.setNom( rs.getString("nom"));
				p.setPrenom( rs.getString("prenom"));
				p.setAge( rs.getInt("age"));
				lpers.add(p);			
			}		
		}
		catch (SQLException e ){
			throw new Error(" unable to excecute '"+ query+ "':",e);
		}
		
		return lpers;		
	}
}
