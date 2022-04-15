package BackendGUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/*
 * Created by JFormDesigner on Mon Apr 11 01:25:45 CST 2022
 */



/**
 * @author Lingxiao
 */
public class Passenger extends JFrame {
    public Passenger() {
        initComponents();
    }

    private void button2MouseClicked(MouseEvent e) {
        if(e.getSource()==button2){
            backend B = new backend();
            B.setVisible(true);
            B.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }

    private void button1MouseClicked(MouseEvent e) {
        if(e.getSource()==button1){
            String p_ID=InputBar.getText();//Use p_ID as a key to search for information in DB
            PassengerID.setText(p_ID);
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        panel1 = new JPanel();
        InputBar = new JTextField();
        button1 = new JButton();
        label2 = new JLabel();
        PassengerID = new JTextField();
        label3 = new JLabel();
        PassengerName = new JTextField();
        label4 = new JLabel();
        FlightID = new JTextField();
        label5 = new JLabel();
        BaggageStatus = new JTextField();
        label6 = new JLabel();
        BoardingStatus = new JTextField();
        label7 = new JLabel();
        Tel = new JTextField();
        label8 = new JLabel();
        MealOption = new JTextField();
        button2 = new JButton();

        //======== this ========
        setTitle("Passenger enquiry page");
        var contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {0, 34, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- label1 ----
        label1.setText("Please input passenger's ID:");
        label1.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.add(label1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //======== panel1 ========
        {
            panel1.setLayout(new FlowLayout());
        }
        contentPane.add(panel1, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(InputBar, new GridBagConstraints(0, 1, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- button1 ----
        button1.setText("Confirm");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        contentPane.add(button1, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label2 ----
        label2.setText("Passenger ID:");
        label2.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.add(label2, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 5, 0));
        contentPane.add(PassengerID, new GridBagConstraints(1, 2, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 50, 0));

        //---- label3 ----
        label3.setText("Passenger Name:");
        label3.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.add(label3, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(PassengerName, new GridBagConstraints(1, 3, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label4 ----
        label4.setText("Flight ID:");
        label4.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.add(label4, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(FlightID, new GridBagConstraints(1, 4, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label5 ----
        label5.setText("Baggage Status:");
        label5.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.add(label5, new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(BaggageStatus, new GridBagConstraints(1, 5, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label6 ----
        label6.setText("Boarding Status:");
        label6.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.add(label6, new GridBagConstraints(0, 6, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(BoardingStatus, new GridBagConstraints(1, 6, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label7 ----
        label7.setText("Tel:");
        label7.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.add(label7, new GridBagConstraints(0, 7, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(Tel, new GridBagConstraints(1, 7, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label8 ----
        label8.setText("Meal Option:");
        label8.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.add(label8, new GridBagConstraints(0, 8, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(MealOption, new GridBagConstraints(1, 8, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- button2 ----
        button2.setText("Back");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        contentPane.add(button2, new GridBagConstraints(3, 9, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 0), 0, 0));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JPanel panel1;
    private JTextField InputBar;
    private JButton button1;
    private JLabel label2;
    private JTextField PassengerID;
    private JLabel label3;
    private JTextField PassengerName;
    private JLabel label4;
    private JTextField FlightID;
    private JLabel label5;
    private JTextField BaggageStatus;
    private JLabel label6;
    private JTextField BoardingStatus;
    private JLabel label7;
    private JTextField Tel;
    private JLabel label8;
    private JTextField MealOption;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

//    public static void main(String[] args) {
//        new Passenger().setVisible(true);
//    }
}
