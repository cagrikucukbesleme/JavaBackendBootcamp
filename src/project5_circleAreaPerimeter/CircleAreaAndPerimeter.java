package project5_circleAreaPerimeter;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        double pi=3.14;

        System.out.print("Enter the value of circles radius = ");
        Scanner input = new Scanner(System.in);
        double r= input.nextDouble();

        double areaCircle= pi*r*r;

        System.out.println("Area of circle : "+ areaCircle);

        double perimeterCircle= 2*pi*r;

        System.out.println("Perimeter of circle :"+ perimeterCircle);

        System.out.print("Enter the measure a of central angle = ");
        double a=input.nextDouble();

        double areaAngle= (pi*(r*r)*a)/360;

        System.out.println("Finds the area of a circle segment = "+ areaAngle);


    }
}
