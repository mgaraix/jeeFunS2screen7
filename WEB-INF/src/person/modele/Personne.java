package modele;


import java.io.IOException;
import java.io.Writer;


/*
 * screenS2:DAO avec JDBC - MODELE
 * Classe définissant les données associées à une personne sous la forme d'un
 * bean avec les méthodes accesseurs (getters) et modificateurs (setters)
 * correspondantes. 
 * @author GARAIX Michel
 */
 

public class Personne {

	private int id;
	private String nom;
	private String prenom;
	private int age;
	
	public Personne(  ) {
		
	}
	
	public Personne( int id, String nom,String prenom, int age ) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public int getId() { return id; }
	public void setId(int id) { this.id=id; }
	
	public String getNom() { return nom; }
	public void setNom( String nom ) { this.nom = nom; }
	
	public String getPrenom() { return prenom; }
	public void setPrenom( String prenom ) { this.prenom = prenom; }
	
	public int getAge() { return age; }
	public void setAge( int age ) { this.age = age; }
	
	/****************/
	public void affiche() { // console
			System.out.println("personne");
			System.out.println( String.format(".%03d -> %16s - %16s - %03d ", getId(),getNom(), getPrenom(),getAge()) );
	}

	
	public void printPerson(Writer out) { // HTML
		try {
			out.append("<ul>\n");
			out.append( String.format("<li class=\"%03d\">%03d - %16s - %16s- %03d</li>\n",this.getId(), this.getId(),this.getNom(),this.getPrenom(),this.getAge()));
			out.append("</ul>\n");  
		} catch (IOException e) {}
	}

}
