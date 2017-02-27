package com.wdmx.org.myLogin;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by wdmx
 * Date: 2017/2/24.
 */
public class SignupServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        req.getRequestDispatcher("index.html").include(req, resp);
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        if(password.equals("password")) {
            req.getRequestDispatcher("profile.html").include(req, resp);
        } else {
            req.getRequestDispatcher("index.html").include(req, resp);
        }

        out.close();
    }
}
