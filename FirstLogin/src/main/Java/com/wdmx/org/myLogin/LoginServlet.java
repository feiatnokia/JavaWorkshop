package com.wdmx.org.myLogin;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by wdmx
 * Date: 2017/2/23.
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        if(password.equals("password")) {
            req.getRequestDispatcher("profile.html").include(req, resp);
//            HttpSession session = req.getSession();
        } else {
            req.getRequestDispatcher("index.html").include(req, resp);
            out.print("user name or password incorrect");
        }
    }
}
