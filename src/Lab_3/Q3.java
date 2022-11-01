package Lab_3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int x;
        System.out.println("enter x :");
        x=in.nextInt();
        if (x>0)
            System.out.println("positive");
        else if (x<0) {
            System.out.println("negative");
        }
        else
            System.out.println("the number is 0");
    }
}
