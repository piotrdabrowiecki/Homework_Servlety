package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/Servlet03")
public class Servlet03 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");


        HttpSession session =  request.getSession();

        String text1= request.getParameter("text1");
        String text2 = request.getParameter("text2");
        String text3= request.getParameter("text3");
        String text4 = request.getParameter("text4");
        String text5 = request.getParameter("text5");


        session.setAttribute(text1, text2);



        Enumeration<String> attributeNames = session.getAttributeNames();

        while(attributeNames.hasMoreElements()){

            String param = attributeNames.nextElement();
           response.getWriter().append("Parametr :"+ text1).append(param).append(" ma wartosc: "+text2).append((String) session.getAttribute(param));

        }






    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");

        response.getWriter().append("<form method=\"post\" action=\"/Homework3_war_exploded/Servlet03\">\n" +
                "\n" +
                "\n" +
                "<input type =\"text\" name=\"text1\"/>\n" +
                "<input type =\"text\" name=\"text2\"/>\n" +
                "<input type =\"text\" name=\"text3\"/>\n" +
                "<input type =\"text\" name=\"text4\"/>\n" +
                "<input type =\"text\" name=\"text5\"/>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "<input type=\"submit\" value=\"send\" />\n" +
                "\n" +
                "\n" +
                "</form>\n");



    }


}
