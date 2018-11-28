package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.sun.jmx.snmp.ThreadContext.contains;

@WebServlet("/Servlet01")
public class Servlet01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");

        String currency = request.getParameter("currency");


        String number_1 = request.getParameter("number_1");



        double EUR_USD = 1.23;
        double USD_EUR = 1/EUR_USD;
        double EUR_PLN = 4.1;
        double PLN_EUR = 1/EUR_PLN;
        double USD_PLN = 3.4;
        double PLN_USD = 1/USD_PLN;


        double num = Double.parseDouble(number_1);


        List<Double> list = new ArrayList<>();

        list.add(EUR_USD);
        list.add(USD_EUR);
        list.add(EUR_PLN);
        list.add(PLN_EUR);
        list.add(USD_PLN);
        list.add(PLN_USD);

        double wynik =0;
        for(Double cur : list){

            if(cur.toString().equals(currency)){


               wynik = cur * num;


            }


        }







        response.getWriter().append("Przeliczam kwote: ");
        response.getWriter().append("<br>");
        response.getWriter().append(number_1);
        response.getWriter().append("<br>");
        response.getWriter().append("Wybrana para walutowa to: ");
        response.getWriter().append("<br>");
        response.getWriter().append(currency);
        response.getWriter().append("Wynik przeliczenia to kwota:");
        response.getWriter().append("<br>");

        String wynik_string = Double.toString(wynik);

        response.getWriter().append(wynik_string);














    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");











    }


}
