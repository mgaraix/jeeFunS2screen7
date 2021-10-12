package person;


import javax.servlet.http.*;
import javax.servlet.ServletException;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;

import java.io.PrintWriter;
import java.io.Writer;

import dao.PersonDao;
import dao.PersonDaoImpl;

/**  screenS2:DAO avec JDBC - PERSON ***/
@WebServlet(urlPatterns={"/personlist"})
public class PersonServlet extends HttpServlet {
	
	PersonDao pDao;
	
	public void init()throws ServletException {
        System.out.println("#### INIT: " + getServletName()+ " OK ####");
		String resource=PersonDao.SQLBDD+"BddPersons.db";
		pDao = new PersonDaoImpl(resource);
		System.out.println("resource: "+resource);
		// par defaut dans tomcat/bin/....
	}
	//	String chemin=(String)req.getResourcePaths("/WEB-INF/sql/"+resource); 
		

	public void doGet(HttpServletRequest req, HttpServletResponse res) 
	throws IOException, ServletException
	{
		affInfo("GET",req);
		PrintWriter out = res.getWriter();
		this.affInfo(out,"GET",req);
		
		req.setAttribute("lPersons",pDao.listAll());		
		req.getRequestDispatcher("WEB-INF/jsp/person-list.jsp").forward(req,res);
	}
	
	// info servlet  page HTML 
	protected void affInfo(Writer out,String servMethod,HttpServletRequest _req) {
		try { // page HTML
			out.append("##### "+servMethod+":  "+ this.getServletName()+
		                       " CTX : "+ _req.getContextPath()+
       						   " PATH: "+_req.getServletPath()+"  ####\n");
							   //"appChemin: " +(String)_req.getServletContext().getRealPath("/WEB-INF"));
		} catch (IOException e) {}
	
	}
		// info servlet CONSOLE
	protected void affInfo(String servMethod,HttpServletRequest _req) {
		//console
		 System.out.println("##### "+servMethod+": "+ this.getServletName()+
		                            " CTX: "+ _req.getContextPath()+
  							        " PATH: "+_req.getServletPath()+"  ####\n");
	}	

}

