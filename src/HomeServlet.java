import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Bhuser;
import model.Bhpost;
import customTools.DbBullhorn;


@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public HomeServlet() {
        super();
    }

    
    protected void doPost(HttpServletRequest request, 
    							HttpServletResponse response) 
    									throws ServletException, IOException {
		//Date postdate = new Date();
		java.util.Date d = new java.util.Date();
		java.sql.Date postdate = new java.sql.Date(d.getTime());//returns current date
		String posttext = request.getParameter("posttext");
		String nextURL = "/error.jsp";
		//need a reference to the session
		//get user out of session. If they don't exist then send them back to the login page.
		//kill the session while you're at it.
		HttpSession session = request.getSession();
		if (session.getAttribute("user")==null){
			//http://stackoverflow.com/questions/13638446/checking-servlet-session-attribute-value-in-jsp-file
			nextURL = "/login.jsp";
			session.invalidate();
			response.sendRedirect(request.getContextPath() + nextURL);
		    return;//return prevents an error
		}
		
		//get user information from session so we can connect to the db
		Bhuser user = (Bhuser)session.getAttribute("user");
		int userid = (int)user.getBhuserid();
		 DbBullhorn.insert(postdate, posttext, userid);
		

		//go to the newsfeed or error
		 
		 nextURL = "/newsfeed.jsp";
		getServletContext().getRequestDispatcher(nextURL).forward(request, response);
		//nextURL = "/newsfeed.jsp";
		
		
		
	}

}