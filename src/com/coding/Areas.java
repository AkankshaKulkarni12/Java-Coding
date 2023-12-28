package com.coding;

import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {

        System.out.println("Find the area of any of the below shapes: ");
        System.out.println("1. Circle\n2. Triangle\n3. Rectangle\n4. Isosceles Triangle\n5. Parallelogram\n6. Rhombus\n7. Equilateral triangle");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your option: ");
        int option = scanner.nextInt();

        switch (option){

            case 1:
                System.out.println("Area of Circle");
                System.out.print("Radius: ");
                int radius = scanner.nextInt();
                double area = 3.14 * radius * radius;
                System.out.println("Area of circle : " + area);
                break;

            case 2:
                System.out.println("Area of Triangle");
                System.out.print("Base: ");
                int base = scanner.nextInt();
                System.out.print("Height: ");
                int height = scanner.nextInt();
                area = 0.5 * base * height;
                System.out.println("Area of Triangle : " + area);
                break;

            case 3:
                System.out.println("Area of Rectangle");
                System.out.print("Length: ");
                int length = scanner.nextInt();
                System.out.print("Breadth: ");
                int breadth = scanner.nextInt();
                area = length * breadth;
                System.out.println("Area of Rectangle : " + area);
                break;

            case 4:
                System.out.println("Area of Isosceles Triangle");
                System.out.print("Base: ");
                base = scanner.nextInt();
                System.out.print("Height: ");
                height = scanner.nextInt();
                area =  (base * height)/0.5;
                System.out.println("Area of Isosceles Triangle : " + area);
                break;

            case 5:
                System.out.println("Area of Parallelogram");
                System.out.print("Base: ");
                base = scanner.nextInt();
                System.out.print("Height: ");
                height = scanner.nextInt();
                area = base * height;
                System.out.println("Area of Parallelogram : " + area);
                break;

            case 6:
                System.out.println("Area of Rhombus");
                System.out.print("Diagonal1: ");
                int diagonal1 = scanner.nextInt();
                System.out.print("Diagonal2: ");
                int diagonal2 = scanner.nextInt();
                area = (diagonal1 * diagonal1)/2;
                System.out.println("Area of Rhombus : " + area);
                break;

            case 7:
                System.out.println("Area of Equilateral triangle");
                System.out.print("Side: ");
                int side = scanner.nextInt();
                area = (Math.sqrt(3)/4) * side * side;
                System.out.println("Area of Equilateral triangle : " + area);
                break;


        }

    }
}
