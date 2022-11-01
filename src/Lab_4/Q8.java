package Lab_4;
import javax.swing.*;

public class Q8 {
    public static void main(String[] args) {
        JFrame x=new JFrame("My_Name" );

        x.setSize(500,500);
        Draw d=new Draw();
        x.add(d);
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.setVisible(true);

    }
}
