package web;

import java.io.IOException;



import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import bean.LoginBean;
import database.LoginDatabase;



@WebServlet("/l0gin")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private LoginDatabase loginDatabase;

    public void init() {
        loginDatabase = new LoginDatabase();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    	    throws ServletException, IOException{
    	doGet(request, response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        LoginBean loginBean = new LoginBean();
        loginBean.setUsername(username);
        loginBean.setPassword(password);

        try {
            if (loginDatabase.validate(loginBean)) {
                //HttpSession session = request.getSession();
                // session.setAttribute("username",username);
                response.sendRedirect("LoginSuccess.jsp");
            } else {
                HttpSession session = request.getSession();
                //session.setAttribute("user", username);
                response.sendRedirect("L0gin.jsp");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}