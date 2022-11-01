package Lab_2;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x,y,z,a;
        System.out.println("enter x :");
        x= in.nextInt();
        System.out.println("enter y");
        y= in.nextInt();
        System.out.println("enter z");
        z= in.nextInt();
        a=x+y+z;
        System.out.println("the average is :" + a);
    }
}
