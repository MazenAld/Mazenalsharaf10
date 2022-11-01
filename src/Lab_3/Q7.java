package Lab_3;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x,y,z;
        System.out.println("enter x :");
        x=in.nextInt();
        System.out.println("enter y :");
        y=in.nextInt();
        System.out.println("enter z :");
        z =in.nextInt();
        if (x > y && x > z && y>z)
            System.out.println(x + "  " + y + "  " + z);
        else if (y >x && y>z && x>z)
            System.out.println(y + "  " + x + "  " + z);
        else if (z > x && z >y && x>y)
            System.out.println(z + "  " + x + "  " + y);

    }
}
