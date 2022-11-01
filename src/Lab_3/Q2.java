package Lab_3;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number :");
       int x= in.nextInt();
        System.out.println("enter the letter :");
        String y= in.next();
        if(y.equals("a") || y.equals("e") || y.equals("c") || y.equals("g"))
        {
            if (x%2==0)
                System.out.println("color is black");
            else
                System.out.println("color is white");
        }
        else
        {
            if (x % 2 != 0)
                System.out.println("color is black");
            else
                System.out.println("color is white");
        }
    }
}
