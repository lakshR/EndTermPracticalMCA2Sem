import java.io.*;

import javax.servlet.*;

import javax.servlet.http.*;

import java.sql.*;

public class SignUpServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)

            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String n = request.getParameter("uname");

        String p = request.getParameter("upass");

        String e = request.getParameter("uemailId");

        String c = request.getParameter("ucountry");

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@mcndesktop07:1521:xe", "sandeep", "welcome");

            PreparedStatement stmt = con.prepareStatement("insert into userlogin values(?,?,?,?)");

            stmt.setString(1, n);

            stmt.setString(2, p);

            stmt.setString(3, e);

            stmt.setString(4, c);

            int i = stmt.executeUpdate();

            if (i > 0) {

                out.println("You are successfully registered.....");

            }

        } catch (Exception ey) {

            System.out.println(ey);

        }

        out.close();

    }

}
Step 11

Now ensure that the code of your web.xml file is the same as:

web.xml

<?xml version="1.0" encoding="UTF-8"?>

<web-app version="3.0" xmlns="http://java.sun.com/xml/ns/javaee" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd">

    <servlet>

        <servlet-name>SignUpServlet</servlet-name>

        <servlet-class>SignUpServlet</servlet-class>

    </servlet>

    <servlet-mapping>

        <servlet-name>SignUpServlet</servlet-name>

        <url-pattern>/SignUpServlet</url-pattern>

    </servlet-mapping>       

</web-app>