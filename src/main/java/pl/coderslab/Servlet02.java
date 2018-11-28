package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet("/Servlet02")
public class Servlet02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");

        String poleliczbowe = request.getParameter("pole");
        String reg1 = "[01]+";



        Pattern compiledPattern = Pattern.compile(reg1);
        Matcher matcher = compiledPattern.matcher(poleliczbowe);



        List<String> list = new ArrayList<>();

        if(matcher.find()) {

            StringBuilder sb = new StringBuilder();
            StringTokenizer tokenizer = new StringTokenizer(poleliczbowe);
            while (tokenizer.hasMoreTokens()) {
                String word = tokenizer.nextToken();

                list.add(word);

            }
            int y = 1;
            double sum =0;
            int i =0;
            for(String w: list){


                i = Integer.parseInt(w);
                double wynik_c =  i * Math.pow(2, y);
                y++;
                sum += wynik_c;





            }
            response.getWriter().append("Uzyskana suma iloczynow cyfr z wprowadzonych liczb to: "+ sum);










        }
        else{

            response.getWriter().append("input nie sklada sie tylko z zer i jedynek");
        }







    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");






    }


}
