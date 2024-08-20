package com.GDSC;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class AgeCalculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String dobStr = request.getParameter("dob");
        String atDateStr = request.getParameter("atDate");

        // Date format set to MM/DD/YYYY
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate dob = LocalDate.parse(dobStr, formatter);
        LocalDate atDate = LocalDate.parse(atDateStr, formatter);

        // Convert LocalDate to LocalDateTime (start of the day)
        LocalDateTime dobDateTime = dob.atStartOfDay();
        LocalDateTime atDateTime = atDate.atStartOfDay();

        // Calculate the period between the dates
        Period age = Period.between(dob, atDate);

        // Calculate total days, hours, minutes, and seconds
        long totalDays = ChronoUnit.DAYS.between(dobDateTime, atDateTime);
        long totalHours = ChronoUnit.HOURS.between(dobDateTime, atDateTime);
        long totalMinutes = ChronoUnit.MINUTES.between(dobDateTime, atDateTime);
        long totalSeconds = ChronoUnit.SECONDS.between(dobDateTime, atDateTime);

        out.println("<html><body>");
        out.println("<h2>Age Calculation</h2>");
        out.println("<p>Years: " + age.getYears() + "</p>");
        out.println("<p>Months: " + age.getMonths() + "</p>");
        out.println("<p>Days: " + age.getDays() + "</p>");
        out.println("<p>Total Days: " + totalDays + "</p>");
        out.println("<p>Total Hours: " + totalHours + "</p>");
        out.println("<p>Total Minutes: " + totalMinutes + "</p>");
        out.println("<p>Total Seconds: " + totalSeconds + "</p>");
        out.println("</body></html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
