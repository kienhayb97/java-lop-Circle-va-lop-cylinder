package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5,6,8);
        Cylinder cylinder1 = new Cylinder();
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double c = scanner.nextDouble();
        double h = scanner.nextDouble();
        cylinder1.setRadius(r);
        cylinder1.setColor(c);
        cylinder1.setHeight(h);
        System.out.println(cylinder1.TheTich());
        System.out.println(cylinder.getHeight());
    }
}
