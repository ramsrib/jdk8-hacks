import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
                
        JButton button1 = new JButton("Click me!");
        JButton button2 = new JButton("Click me too!");
                
        frame.getContentPane().add(button1);
        frame.getContentPane().add(button2);
                
        button1.addActionListener(Test::doSomething);
        button2.addActionListener(e -> { System.out.println("Bye!"); });
    }
        
    public static void doSomething(ActionEvent e) {
                
        System.out.println("Hi!");
    }
}