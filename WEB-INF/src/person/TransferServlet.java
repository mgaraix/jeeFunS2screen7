package person;

/**  screenS2:DAO avec JDBC - PERSON***/

import javax.servlet.http.*;
import javax.servlet.ServletException;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/transfer"})
public class TransferServlet extends HttpServlet {
	
	PersonDao pDao;
	
	public void init()throws ServletException {
		System.out.println(
		"**************************/n"+
		"** TransferServlet Init( )**/n"+
		"**************************/n"
		);
		
	}
/*
	public void doGet(HttpServletRequest req, HttpServletResponse res) 
	throws IOException, ServletException
	{
				
		req.getRequestDispatcher("WEB-INF/jsp/person-listessai.jsp").forward(req,res);

	}
*/
}

