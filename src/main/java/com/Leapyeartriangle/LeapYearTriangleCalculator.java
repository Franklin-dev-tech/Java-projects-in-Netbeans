/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Leapyeartriangle;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
    public class LeapYearTriangleCalculator {
    public void checkLeapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("The year " + year + " is a leap year.");
        } else {
            System.out.println("The year " + year + " is not a leap year.");
        }
    }

    public void getTriangleBaseAndHeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        calculateTriangleArea(base, height);
    }

    public void calculateTriangleArea(double base, double height) {
        double area = (base * height) / 2;
        System.out.println("The area of the triangle is: " + area);
    }

    public static void main(String[] args) {
        LeapYearTriangleCalculator calculator = new LeapYearTriangleCalculator();
        calculator.checkLeapYear();
        calculator.getTriangleBaseAndHeight();
    }
}

    

