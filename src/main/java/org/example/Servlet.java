package org.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res){
        System.out.println("In service");
    }
}
