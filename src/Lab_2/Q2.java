package Lab_2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double bi=3.14;
        double x;
        System.out.println("enter the half of the qutr :");
        x= in.nextDouble();
        System.out.println("the area is :" + (bi*x*x));
        System.out.println("the parameter is :" + (bi*(2*x)));
    }
}
