/*
 * Created by JFormDesigner on Sun May 22 13:30:41 CST 2022
 */

package BackEnd.GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * @author unknown
 */
public class PassengerPage1 extends JFrame {
    public PassengerPage1(String trans1, String trans2) {
        initComponents(trans1,trans2);
    }


    private void BackButtonMouseClicked(MouseEvent e) {
//        FlightListForThePassenger FL = new FlightListForThePassenger();
//        FL.setVisible(true);
//        this.dispose();
//        FL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
    }


    private void initComponents(String trans1,String trans2) {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        IDBar = new JTextField();
        IDBar.setText(trans1);
        label2 = new JLabel();
        label7 = new JLabel();
        label4 = new JLabel();
        FlightID = new JTextField();
        FlightID.setText(trans2);
        label3 = new JLabel();
        PassengerName = new JTextField();
        label5 = new JLabel();
        BaggageStatus = new JTextField();
        label6 = new JLabel();
        BoardingStatus = new JTextField();
        label8 = new JLabel();
        MealOption = new JTextField();

        //======== this ========
        setTitle("Passenger enquiry page");
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {0, 34, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- label1 ----
        label1.setText("Passenger ID you are inquiring:");
        label1.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.add(label1, new GridBagConstraints(0, 0, 2, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(IDBar, new GridBagConstraints(0, 1, 5, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));
        contentPane.add(label2, new GridBagConstraints(3, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(label7, new GridBagConstraints(4, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

        //---- label4 ----
        label4.setText("Flight ID:");
        label4.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.add(label4, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(FlightID, new GridBagConstraints(1, 2, 4, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

        //---- label3 ----
        label3.setText("Passenger Name:");
        label3.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.add(label3, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(PassengerName, new GridBagConstraints(1, 3, 4, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

        //---- label5 ----
        label5.setText("Baggage Status:");
        label5.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.add(label5, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(BaggageStatus, new GridBagConstraints(1, 4, 4, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

        //---- label6 ----
        label6.setText("Boarding Status:");
        label6.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.add(label6, new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(BoardingStatus, new GridBagConstraints(1, 5, 4, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

        //---- label8 ----
        label8.setText("Meal Option:");
        label8.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.add(label8, new GridBagConstraints(0, 6, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(MealOption, new GridBagConstraints(1, 6, 4, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));
        setSize(420, 540);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JTextField IDBar;
    private JLabel label2;
    private JLabel label7;
    private JLabel label4;
    private JTextField FlightID;
    private JLabel label3;
    private JTextField PassengerName;
    private JLabel label5;
    private JTextField BaggageStatus;
    private JLabel label6;
    private JTextField BoardingStatus;
    private JLabel label8;
    private JTextField MealOption;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
