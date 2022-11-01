package Lab_3;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x,y,z;
        System.out.println("enter x :");
        x=in.nextInt();
        System.out.println("enter y :");
        y=in.nextInt();
        System.out.println("enter z :");
        z =in.nextInt();
        if (x == y || x==z)
            System.out.println("all the same");
        else if (x != y || x!= z) {
            System.out.println("al not the same");
        }
    }
}
