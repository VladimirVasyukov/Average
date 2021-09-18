package com.epam.rd.autotasks;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 04_Java_Fundamentals - Vladimir Vasyukov
 * Application's entry point, use it to demonstrate code execution
 */
public class Average {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8.name());
        int number;
        int sumOfNumbers = 0;
        int amountOfNumbers = 0;
        int average;
        do {
            number = scanner.nextInt();
            sumOfNumbers += number;
            amountOfNumbers++;
        } while (number != 0);

        if (number == 0) {
            average = sumOfNumbers / (amountOfNumbers - 1);
            System.out.println(average);
        }
    }
}
