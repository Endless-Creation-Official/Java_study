package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
                System.out.print("Enter the points scored by the student: ");
                if (scanner.hasNextDouble()) {
                    double points = scanner.nextDouble();

                    if (points >= 0 && points <= 100) {
                        String grade;

                        if (points >= 90)
                            grade = "A";
                        else if (points >= 80)
                            grade = "B";
                        else if (points >= 70)
                            grade = "C";
                        else if (points >= 60)
                            grade = "D";
                        else
                            grade = "F";

                        System.out.println("The letter grade for the student is: " + grade);
                        System.out.println();
                    } else {
                        System.out.println("The points should be in the range from 0 to 100.");
                        System.out.println();
                    }
                } else {
                    System.out.println("The points entered is invalid!");
                    System.out.println();
                    scanner.next();
                }
            }
        }
    }
