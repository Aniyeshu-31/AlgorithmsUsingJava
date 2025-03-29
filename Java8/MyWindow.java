import javax.swing.*;
import java.awt.*;
public class MyWindow {
    public static void main(String[] args) {   
        JFrame frame = new JFrame("MyWindow");
        JButton button = new JButton("Click ME");
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());
        button.addActionListener((e)->{
            System.out.println("Button Clicked");
            JOptionPane.showMessageDialog(null,"Button is Clicked!!!");
        });
        frame.setVisible(true);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
