package com.sreeram.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/vendors")
public class VendorServlet extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    String jdbcURL = "jdbc:mysql://localhost:3306/vendor_db";
    String dbUser = "root";
    String dbPassword = "your_mysql_password";

    out.println("<html><head><title>Vendor List</title></head><body>");
    out.println("<h2>List of Vendors</h2>");
    out.println("<table border='1'><tr><th>ID</th><th>Name</th><th>Contact</th></tr>");

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM vendors");

        while (rs.next()) {
            out.println("<tr>");
            out.println("<td>" + rs.getInt("id") + "</td>");
            out.println("<td>" + rs.getString("name") + "</td>");
            out.println("<td>" + rs.getString("contact") + "</td>");
            out.println("</tr>");
        }

        conn.close();

    } catch (Exception e) {
        out.println("<tr><td colspan='3'>Error: " + e.getMessage() + "</td></tr>");
    }

    out.println("</table></body></html>");
}
}