package Lab_3;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number 1 :");
        int x= in.nextInt();
        System.out.println("enter the number 2  :");
        int y = in.nextInt();
        System.out.println("enter the number 3  :");
        int z = in.nextInt();
        if (x==y && y==z)
            System.out.println("all the same");
        else
            System.out.println("all different");


    }
}
