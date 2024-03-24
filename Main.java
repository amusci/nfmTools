//TODO: Add Stage Reverser
//TODO: Add Spike Creator
//TODO: Add Middle Between Two Points

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;



import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("NFMTools");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton button1 = new JButton("middle of two points");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                middleOfTwoPoints();
            }
        });
        frame.add(button1);

        JButton button2 = new JButton("stage reverser");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stageReverser();
            }
        });
        frame.add(button2);

        JButton button3 = new JButton("spike setter");
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
        String originalSpike = JOptionPane.showInputDialog("Enter the code of the first spike:");
        String[] splitSpike = originalSpike.split(",");
        String strAmountOfSpikes = JOptionPane.showInputDialog("Enter how many spikes you would like to set:");
        int intAmountOfSpikes = Integer.parseInt(strAmountOfSpikes);
        String valueToChange;
        String[] XZ = {"X", "Z"};
        int xOrZOption = JOptionPane.showOptionDialog(null,
                "Would you like to expand in the x or z direction?",
                "Direction Selection",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                XZ,
                XZ[0]);

        JTextArea updatedSpikeArea = new JTextArea();
        updatedSpikeArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(updatedSpikeArea);

        if (xOrZOption == 0) {
            valueToChange = splitSpike[1]; // take the x value
            ArrayList<Integer> ans = getValuesOfSpikes(valueToChange, intAmountOfSpikes);
            for (int i = 0; i < intAmountOfSpikes; i++) {
                splitSpike[1] = String.valueOf(ans.get(i));
                String updatedSpike = String.join(",", splitSpike);
                updatedSpikeArea.append(updatedSpike + "\n");
            }
        } else if (xOrZOption == 1) {
            valueToChange = splitSpike[2]; // take the z value
            ArrayList<Integer> ans = getValuesOfSpikes(valueToChange, intAmountOfSpikes);
            for (int i = 0; i < intAmountOfSpikes; i++) {
                splitSpike[2] = String.valueOf(ans.get(i));
                String updatedSpike = String.join(",", splitSpike);
                updatedSpikeArea.append(updatedSpike + "\n");
            }
        }

        JOptionPane.showMessageDialog(null, scrollPane);

    }
    public static ArrayList<Integer> getValuesOfSpikes(String value, int numberOfSpikes) {
        //returns the values of all the spikes being created
        ArrayList<Integer> values = new ArrayList<>();
        int newValue = Integer.parseInt(value);
        int SET_DISTANCE = 1100; // i believe this is spike distance idk

        String[] PlusMinus = {"+", "-"};
        int plusOrMinusOption = JOptionPane.showOptionDialog(null,
                "Are we going in a positive or negative direction?",
                "Direction Selection",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                PlusMinus,
                PlusMinus[0]);

        if (plusOrMinusOption == 0) {
            for (int i = 0; i <= numberOfSpikes; i++) {
                newValue += SET_DISTANCE;
                values.add(newValue);
            }
        } else if (plusOrMinusOption == 1) {
            for (int i = 0; i <= numberOfSpikes; i++) {
                newValue -= SET_DISTANCE;
                values.add(newValue);
            }
        }
        return values;
    }
}
