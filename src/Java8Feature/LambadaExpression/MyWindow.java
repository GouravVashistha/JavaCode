package Java8Feature.LambadaExpression;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow {
    public static void main(String[] args) {
        //Window
        JFrame fram = new JFrame("My Window");
        fram.setSize(400,400);
        fram.setLayout(new FlowLayout());


        // creating Button
        JButton button  = new JButton("Click Me !!");
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("button clicked");
//                JOptionPane.showMessageDialog(null, "hey, Button Clicked");
//            }
//        });
        button.addActionListener((ActionEvent e)->{
            System.out.println("button clicked");
            JOptionPane.showMessageDialog(null, "hey, Button Clicked");
        });

        fram.add(button);
        fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fram.setVisible(true);
    }
}
