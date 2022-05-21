/*
 * Created by JFormDesigner on Sun May 22 01:09:19 CST 2022
 */

package BackEnd.GUI;

import java.awt.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class FlightListForThePassenger extends JFrame {
    public FlightListForThePassenger() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        textField3 = new JTextField();
        button2 = new JButton();
        label4 = new JLabel();
        textField4 = new JTextField();
        label5 = new JLabel();
        textField5 = new JTextField();
        button3 = new JButton();
        label6 = new JLabel();
        textField6 = new JTextField();
        label7 = new JLabel();
        textField7 = new JTextField();
        button4 = new JButton();
        label8 = new JLabel();
        textField8 = new JTextField();
        label9 = new JLabel();
        textField9 = new JTextField();
        button5 = new JButton();
        button6 = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- label1 ----
        label1.setText("Please input Passenger ID to enquiry");
        contentPane.add(label1, new GridBagConstraints(0, 0, 3, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));
        contentPane.add(textField1, new GridBagConstraints(0, 1, 6, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));

        //---- button1 ----
        button1.setText("Confirm");
        contentPane.add(button1, new GridBagConstraints(6, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));

        //---- label2 ----
        label2.setText("Flight 1:");
        contentPane.add(label2, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));
        contentPane.add(textField2, new GridBagConstraints(1, 2, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));

        //---- label3 ----
        label3.setText("Destination\uff1a");
        contentPane.add(label3, new GridBagConstraints(3, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));
        contentPane.add(textField3, new GridBagConstraints(4, 2, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));

        //---- button2 ----
        button2.setText("See Detail");
        contentPane.add(button2, new GridBagConstraints(6, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));

        //---- label4 ----
        label4.setText("Flight 2:");
        contentPane.add(label4, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));
        contentPane.add(textField4, new GridBagConstraints(1, 3, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));

        //---- label5 ----
        label5.setText("Destination:");
        contentPane.add(label5, new GridBagConstraints(3, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));
        contentPane.add(textField5, new GridBagConstraints(4, 3, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));

        //---- button3 ----
        button3.setText("See Detail");
        contentPane.add(button3, new GridBagConstraints(6, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));

        //---- label6 ----
        label6.setText("Flight 3:");
        contentPane.add(label6, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));
        contentPane.add(textField6, new GridBagConstraints(1, 4, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));

        //---- label7 ----
        label7.setText("Destination:");
        contentPane.add(label7, new GridBagConstraints(3, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));
        contentPane.add(textField7, new GridBagConstraints(4, 4, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));

        //---- button4 ----
        button4.setText("See Detail");
        contentPane.add(button4, new GridBagConstraints(6, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));

        //---- label8 ----
        label8.setText("Flight 4:");
        contentPane.add(label8, new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));
        contentPane.add(textField8, new GridBagConstraints(1, 5, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));

        //---- label9 ----
        label9.setText("Destination:");
        contentPane.add(label9, new GridBagConstraints(3, 5, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));
        contentPane.add(textField9, new GridBagConstraints(4, 5, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));

        //---- button5 ----
        button5.setText("See Detail");
        contentPane.add(button5, new GridBagConstraints(6, 5, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));

        //---- button6 ----
        button6.setText("Back");
        contentPane.add(button6, new GridBagConstraints(6, 6, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));
        setSize(585, 565);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JTextField textField1;
    private JButton button1;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JTextField textField3;
    private JButton button2;
    private JLabel label4;
    private JTextField textField4;
    private JLabel label5;
    private JTextField textField5;
    private JButton button3;
    private JLabel label6;
    private JTextField textField6;
    private JLabel label7;
    private JTextField textField7;
    private JButton button4;
    private JLabel label8;
    private JTextField textField8;
    private JLabel label9;
    private JTextField textField9;
    private JButton button5;
    private JButton button6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
