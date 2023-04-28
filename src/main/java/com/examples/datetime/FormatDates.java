package com.examples.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {

        DateTimeFormatter formatter;
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println("Today is: " + today.format(formatter));

        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Today is: " + today.format(formatter));

        formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        System.out.println("Today is: " + today.format(formatter));

        formatter = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm");
        System.out.println("Today is: " + today.format(formatter));
    }
}
