package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double MinutesInYear = 60*24*365;

        Scanner input = new Scanner(System.in);

        System.out.println ("Input the minutes: ");
        double min = input.nextDouble();

        long years = (long) (min/MinutesInYear);
        int days = (int) (min/60/24)%365;

        System.out.println ((int)min + " minutes are approximately " + years + " years and " + days + " days.");
    }
}
