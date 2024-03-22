//TODO: Add Stage Reverser
//TODO: Add Spike Creator
//TODO: Add Middle Between Two Points

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
                middleOfTwoPoints();
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

        //initalize button 2 (this will be the stage reverser)
        JButton button3 = new JButton("Press 3");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                spikeSetter();
            }
        });
        frame.add(button3);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public static void middleOfTwoPoints() {

        //copy and pasteable answer for the middle of two stage pieces

        String num1xStr = JOptionPane.showInputDialog("Enter x coordinate of first point:");
        String num1zStr = JOptionPane.showInputDialog("Enter z coordinate of first point:");
        String num2xStr = JOptionPane.showInputDialog("Enter x coordinate of second point:");
        String num2zStr = JOptionPane.showInputDialog("Enter z coordinate of second point:");


        double num1x = Double.parseDouble(num1xStr);
        double num1z = Double.parseDouble(num1zStr);
        double num2x = Double.parseDouble(num2xStr);
        double num2z = Double.parseDouble(num2zStr);


        double middleX = (num1x + num2x) / 2;
        double middleY = (num1z + num2z) / 2;


        JTextArea textArea = new JTextArea(1, 20);
        textArea.setText("Middle point coordinates: (" + middleX + ", " + middleY + ")");
        textArea.setEditable(false);


        JScrollPane scrollPane = new JScrollPane(textArea);


        JOptionPane.showMessageDialog(null, scrollPane);
    }

    public static void stageReverser() {
        System.out.println("Button 2 clicked!");

    }

    public static void spikeSetter() {
        //TODO: take coords of one spike and how many you want, and then sets multiple for you
        System.out.println("Spike Setter Button Clicked");

    }
}
