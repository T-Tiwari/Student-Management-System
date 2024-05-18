
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class registerpage extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
        
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/CRUD","root","mca6");
            PreparedStatement ps = c.prepareStatement("insert into register(username, email, password)  values(?,?,?)");
            ps.setString(1, username);
            ps.setString(2, email);
            ps.setString(3, password);
               
            ps.executeUpdate();
            out.println("<h1>Successfully Registered</h1>");
            res.sendRedirect("loginpage.jsp");
                
            }
        catch(Exception e){
            out.println(e);
            out.println("Failed");    
            }
        
    }

    

}
