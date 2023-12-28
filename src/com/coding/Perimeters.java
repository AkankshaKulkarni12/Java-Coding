package com.coding;

import java.util.Scanner;

public class Perimeters {
    public static void main(String[] args) {

        System.out.println("Find the perimeters of any of the below shapes: ");
        System.out.println("1. Circle\n2. Equilateral triangle\n3. Parallelogram\n4. Rectangle\n5. Square\n6. Rhombus");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your option: ");
        int option = scanner.nextInt();


        switch (option) {

            case 1:
                System.out.println("Perimeter of Circle");
                System.out.print("Radius: ");
                int radius = scanner.nextInt();
                double perimeter = 2 * 3.14 * radius;
                System.out.println("Perimeter of circle : " + perimeter);
                break;

            case 2:
                System.out.println("Perimeter of Equilateral triangle");
                System.out.print("Side: ");
                int side = scanner.nextInt();
                perimeter = 3 * side;
                System.out.println("Perimeter of Triangle : " + perimeter);
                break;

            case 3:
                System.out.println("Perimeter of Parallelogram");
                System.out.print("Length: ");
                int length = scanner.nextInt();
                System.out.print("Breadth: ");
                int breadth = scanner.nextInt();
                perimeter = 2 * (length + breadth);
                System.out.println("Perimeter of Rectangle : " + perimeter);
                break;

            case 4:
                System.out.println("Perimeter of Rectangle");
                System.out.print("Length: ");
                length = scanner.nextInt();
                System.out.print("Breadth: ");
                breadth = scanner.nextInt();
                perimeter = 2 * (length + breadth);
                System.out.println("Perimeter of Isosceles Triangle : " + perimeter);
                break;

            case 5:
                System.out.println("Perimeter of Square");
                System.out.print("Side: ");
                side = scanner.nextInt();
                perimeter = 4 * side;
                System.out.println("Perimeter of Parallelogram : " + perimeter);
                break;

            case 6:
                System.out.println("Perimeter of Rhombus");
                System.out.print("Side: ");
                side = scanner.nextInt();
                perimeter = 4 * side;
                System.out.println("Perimeter of Rhombus : " + perimeter);
                break;

        }
    }
}
