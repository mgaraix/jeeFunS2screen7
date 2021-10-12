package dao;


import java.util.List;
import modele.Personne;

/**  screenS2:DAO avec JDBC - DAO  ***/
public interface PersonDao {
	
     //  chemein absolu vers la resource db
	public static final String MYAPP ="screen2JDBCDAO";
	public static final String SQLBDD="C:\\MesAppli\\TOMCAT9\\apache-tomcat-9.0.44\\webapps\\"+ MYAPP + "\\WEB-INF\\sql\\";
	
	/*
	public void create(Personne p);
	public Personne find(int id);
	public void update(Personne p);
	public void delete(int id);
	*/
	public List<Personne> listAll();
}