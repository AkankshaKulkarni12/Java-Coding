package com.coding;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {

        System.out.println("Enter the coordinates of the two points: ");
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.println(disatnceBetweenTwoPoints(x1, x2, y1, y2));
    }

    static double disatnceBetweenTwoPoints(int a, int b, int c, int d){
        int x = b - a;
        int y = d - c;

        double distance = Math.sqrt((x*x) + (y*y));

        return distance;
    }
}
