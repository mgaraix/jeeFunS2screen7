package person;

import java.sql.*;
import java.util.List;

import dao.PersonDao;
import dao.PersonDaoImpl;
import modele.Personne;

/***  screenS2:DAO avec JDBC - PERSON ***/
public class PersonTest {
	
	public static void main(String[] args) {
		String resource = PersonDao.SQLBDD +"BddPersons.db";
		System.out.println("resource " + resource);
		PersonDao pDao = new PersonDaoImpl(resource);
		// par defaut dans tomcat/bin/....
		
		List<Personne> lpers = pDao.listAll();
		if ( lpers.isEmpty() ) {
			System.out.println("Aucun utilisateur en base");
		}
		else
		for(Personne per : lpers) {
			System.out.println( 
				String.format(
					"%40s | %16s | %16s | %3d",
					per.getId(),
					per.getNom(),
					per.getPrenom(),
					per.getAge()
				)
			);
		}
	}	
}