package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class loginpage extends HttpServlet{
    
    public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
        
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        String username = req.getParameter("username");
        String password = req.getParameter("password");
//   
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/CRUD","root","mca6");
            PreparedStatement ps = c.prepareStatement("select * from register where username=? and password=?");
            ps.setString(1, username);
            ps.setString(2, password);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                HttpSession session = req.getSession();
                session.setAttribute("username", username);
                //session.setAttribute("password", password);
                res.sendRedirect("index.jsp");
            } else {
                out.println("Invalid username or password");
            }
     
            }
        catch(Exception e){
            out.println(e);
            out.println("Failed");    
            }
        
    }

  
    

} 
