package Lab_2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x,y;
        System.out.println("enter x :");
        x= in.nextDouble();
        System.out.println("enter y");
        y= in.nextDouble();

        System.out.println("the area is :" + (x*y));
        System.out.println("the parameter is :" + (2*(x+y)));
    }
}
