package demo;

import java.util.Scanner;

public class myclass {
    public static void main(String[] args) {
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = input.nextInt();
        System.out.println("age is: " + age);
        input.close();

        int friends = 5;
        int slice = 3;
        int totalSlices = friends * slice;

        int sliceperpizza = 8;
        int pizzasneeded = totalSlices / sliceperpizza;
        System.out.println("Number of pizzas needed: " + pizzasneeded);

        double pizzaneeded = (double) totalSlices / sliceperpizza;
        System.out.println("Number of pizzas needed: " + pizzaneeded);

        
    }
}

