package Lab_4;
import java.awt.*;

public class Q1 {
    public static void main(String[] args) {
        Rectangle z=new Rectangle(10,20);
        double d=2* (z.getWidth()+z.getHeight());
        System.out.println("actual answer: "+d);
        System.out.println("Expected answer: "+2*(20+10));
    }
}
