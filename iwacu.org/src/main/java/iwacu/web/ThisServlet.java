package iwacu.web;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import iwacu.bean.UserLogin1;
import iwacu.database.UserDAO1;



@WebServlet("/l0gin")
public class ThisServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserDAO1 userdao1;

    public void init() {
        userdao1 = new UserDAO1();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    	    throws ServletException, IOException{
    	doGet(request, response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserLogin1 userlogin1 = new UserLogin1();
        userlogin1.setUsername(username);
        userlogin1.setPassword(password);

        try {
            if (userdao1.validate(userlogin1)) {
                //HttpSession session = request.getSession();
                // session.setAttribute("username",username);
                //response.sendRedirect("UserServl3t.java");
            	RequestDispatcher rd = request.getRequestDispatcher("UserServl3t");
            	rd.forward(request,response);
            } else {
                HttpSession session = request.getSession();
                //session.setAttribute("user", username);
                response.sendRedirect("login.jsp");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}