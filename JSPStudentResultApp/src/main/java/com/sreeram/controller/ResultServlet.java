package com.sreeram.controller;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/result")
public class ResultServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        String name = request.getParameter("name");
        int marks = Integer.parseInt(request.getParameter("marks"));

        request.setAttribute("studentName", name);
        request.setAttribute("studentMarks", marks);

        if (marks >= 40) {
            RequestDispatcher rd = request.getRequestDispatcher("pass.jsp");
            rd.forward(request, response);
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("fail.jsp");
            rd.forward(request, response);
        }
    }
}
