package Lab_3;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        int x,y;
        String month=null;
        Scanner in= new Scanner(System.in);
        System.out.println("enter the number of the month :");
        x = in.nextInt();
        System.out.println("enter the number of the days :");
        y = in.nextInt();
        if (x==1 || x==2 || x==3)
            month ="winter";
        else if (x==4 || x==5 || x==6)
            month ="spring";
        else if (x==7 || x==8 || x==9)
            month ="summer";
        else if (x==10 || x==11 || x==12)
            month ="fall";


        if (x%3 == 0 && y>=21)
            if (month.equals("winter"))
                month="spring";
            else if (month.equals("spring"))
                month="summer";
            else if (month.equals("summer"))
                month="fall";
            else
                month="fall";

        System.out.println(month);



    }
}
