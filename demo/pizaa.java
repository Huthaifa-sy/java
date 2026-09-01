package demo;
import java.util.Scanner;
public class pizaa{
    public static void main(String[] args) {
        Scanner input =new Scanner (System .in);
        System.out.print("hvor mange personer");
        int frinds = input.nextInt();
        System.out.print("hvor mange pizzastykker per person");
        int slice =input.nextInt();
        System.out.print("hvor mange drikker per person");
        int drinks =input.nextInt();
        int totalslice = frinds * slice;
        int totaldrinks = frinds * drinks;
        int sliceperpizza = 8;
        double pizzaneeded = (double) totalslice / sliceperpizza;
        int pizza =2;
        int leftoverslice = (pizza * sliceperpizza) % totalslice;
        pizza++;
        totaldrinks +=2;
        System.out.println();
        System.out.println("pizza kveld");
        System.out.println("totalt antall pizzastykker: " + totalslice);
        System.out.println("totalt antall drikker: " + totaldrinks);
        System.out.println("totalt antall pizzaer: " + pizzaneeded);
        System.out.println("antall pizzaer "+ pizza);
        System.out.println("antall pizzastykker til overs: " + leftoverslice);
    }
}