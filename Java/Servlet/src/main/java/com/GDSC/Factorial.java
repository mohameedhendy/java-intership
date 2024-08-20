package com.GDSC;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Factorial extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Factorial Table</h2>");
        out.println("<table border='1'><tr><th>Number</th><th>Factorial</th></tr>");

        for (int i = 0; i <= 10; i++) {
            out.println("<tr><td>" + i + "</td><td>" + factorial(i) + "</td></tr>");
        }

        out.println("</table>");
        out.println("</body></html>");
    }

    private long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
