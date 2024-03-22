//TODO: Add Stage Reverser
//TODO: Add Spike Creator
//TODO: Add Distance Between Two Points

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;



import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("NFMTools");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.setLayout(new FlowLayout(FlowLayout.CENTER));

        //initalize button 1 (this will be distance between two points)
        JButton button1 = new JButton("Press 1");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                distanceBetweenTwoPoints();
            }
        });
        frame.add(button1);

        //initalize button 2 (this will be the stage reverser)
        JButton button2 = new JButton("Press 2");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stageReverser();
            }
        });
        frame.add(button2);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public static void distanceBetweenTwoPoints() {
        System.out.println("Button 1 clicked!");

    }

    public static void stageReverser() {
        System.out.println("Button 2 clicked!");

    }
}
