package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a radius in metres");
        double radius = in.nextDouble();
        double area = (radius * radius) * Math.PI;
        System.out.println("Area of circle is: " + area + " metres");
    }




}
