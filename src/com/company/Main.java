package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Kap 5 EXERCISE 6
    // x min = (-b - sqrt(Math.pow(b,2.0)-4*a*c))/2*a
    // x max = (-b + sqrt(Math.pow(b,2.0)-4*a*c))/2*a


    double a = 1;
    double b = 1;
    double c = 1;

    try {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a ");
        a = in.nextDouble();
        System.out.print("Enter b ");
        b = in.nextDouble();
        System.out.print("Enter c ");
        c = in.nextDouble();
    }
    catch (Exception e){
        System.out.println("Input have to be a number..");
        return;
    }
    double d = Math.pow(b,2) - 4 * a * c ;

    System.out.println("Diskriminant = "+d);

    if (d<0){
        System.out.println("No solutions, discriminant i lower than 0");
    }
    if (d==0){
        double x = -b + Math.sqrt(d) / 2*a;
        System.out.println("Discriminant is zerro, One solution, x = "+x);
    }
    if (d>0){
        double x1 = -b + Math.sqrt(d) / 2*a;
        double x2 = -b - Math.sqrt(d) / 2*a;
        System.out.println("Two solutions \n"
                +"first  solution x = "+x1+ "\n"
                +"second solution x = "+x2);
    }
    }
}
