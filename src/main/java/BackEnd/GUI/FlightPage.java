/*
 * Created by JFormDesigner on Wed May 04 17:59:41 CST 2022
 */

package BackEnd.GUI;

import BackEnd.Monitor.bMonitors;
import Beans.Flight.Flight;
import Beans.Passenger.Passenger;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

/**
 * @author Lingxiao
 */
public class FlightPage extends JFrame {
    public FlightPage() {
        initComponents();
    }
    public String TransInformation;
    // button "confirm"
    private void button1MouseClicked(MouseEvent e) {
        if(e.getSource()==button1){
            String f_ID=InputBar.getText();//Use f_ID as a key to search for information in DB
            FlightID.setText(f_ID);
            bMonitors bMonitor = new bMonitors();
            Flight targetFlight = bMonitor.getFlightList(f_ID);
            BoardingTime.setText(targetFlight.getETC());
            TimeLefttoBoard.setText(bMonitor.calculateDiff(targetFlight.getETC()));
            Destination.setText(targetFlight.getDestination());
            List<Passenger> psgs = bMonitor.getUnboardedPassengerList(f_ID); 
            List<String> infoList = bMonitor.printUnboardedPassengerList(psgs);
            // 这里写获取乘客名单的方法就好，这个变量会传到下一个页面里去显示";
            TransInformation = "PassengerId     passengerName\n";
            for(int j = 0; j<infoList.size(); j++){
                String info = infoList.get(j);
                TransInformation += info + "\n"; 
                System.out.println(info);
            }
            System.out.println("done");
        }
    }

    // button "see more passengerList"
    private void button3MouseClicked(MouseEvent e) {
        if(e.getSource()==button3){
            toShowPassengerList T = new toShowPassengerList(this.getPassengerList());
            T.setVisible(true);
            //T.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }

    // button "Back"
    private void button2MouseClicked(MouseEvent e) {
        if(e.getSource()==button2){
            backend B = new backend();
            B.setVisible(true);
            B.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        panel1 = new JPanel();
        InputBar = new JTextField();
        button1 = new JButton();
        label2 = new JLabel();
        FlightID = new JTextField();
        label3 = new JLabel();
        BoardingTime = new JTextField();
        label4 = new JLabel();
        scrollPane2 = new JScrollPane();
        TimeLefttoBoard = new JTextArea();
        label5 = new JLabel();
        // PassengernotBoarding = new JTextField();
        Destination = new JTextField();
//        label6 = new JLabel();
//        label7 = new JLabel();
//        scrollPane1 = new JScrollPane();
//        textArea1 = new JTextArea();
        button3 = new JButton();
        button2 = new JButton();

        //======== this ========
        setTitle("Flight enquiry page");
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- label1 ----
        label1.setText("Please input flight ID:");
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
        contentPane.add(InputBar, new GridBagConstraints(0, 1, 3, 1, 0.0, 0.0,
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
        contentPane.add(button1, new GridBagConstraints(3, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

        //---- label2 ----
        label2.setText("Flight ID:");
        label2.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.add(label2, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(FlightID, new GridBagConstraints(1, 2, 3, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

        //---- label3 ----
        label3.setText("Boarding Time:");
        label3.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.add(label3, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(BoardingTime, new GridBagConstraints(1, 3, 3, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

        //---- label4 ----
        label4.setText("Time Left to Board:");
        label4.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.add(label4, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

        //======== scrollPane2 ========
        {

            //---- TimeLefttoBoard ----
            TimeLefttoBoard.setColumns(10);
            scrollPane2.setViewportView(TimeLefttoBoard);
        }
        contentPane.add(scrollPane2, new GridBagConstraints(1, 4, 3, 2, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

        //---- label5 ----
        label5.setText("Destination:");
        label5.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.add(label5, new GridBagConstraints(0, 6, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(Destination, new GridBagConstraints(1, 6, 3, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

        //---- label6 ----
//        label6.setText("Passenger not Boarding:");
//        label6.setBorder(new EmptyBorder(5, 5, 5, 5));
//        contentPane.add(label6, new GridBagConstraints(0, 7, 1, 1, 0.0, 0.0,
//                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
//                new Insets(0, 0, 5, 5), 0, 0));
//
//        //---- label7 ----
//        label7.setText("Tel:");
//        label7.setBorder(new EmptyBorder(5, 5, 5, 5));
//        contentPane.add(label7, new GridBagConstraints(1, 7, 1, 1, 0.0, 0.0,
//                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
//                new Insets(0, 0, 5, 5), 0, 0));
//
//        //======== scrollPane1 ========
//        {
//            scrollPane1.setViewportView(textArea1);
//        }
//        contentPane.add(scrollPane1, new GridBagConstraints(0, 8, 4, 4, 0.0, 0.0,
//                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
//                new Insets(0, 0, 5, 0), 0, 0));

        //---- button3 ----
        button3.setText("Click to see who have not boarded");
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button3MouseClicked(e);
            }
        });
        contentPane.add(button3, new GridBagConstraints(2, 12, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 5), 0, 0));

        //---- button2 ----
        button2.setText("Back");
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        contentPane.add(button2, new GridBagConstraints(3, 12, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        setSize(505, 500);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    public String getPassengerList(){ return TransInformation;}
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JPanel panel1;
    private JTextField InputBar;
    private JButton button1;
    private JLabel label2;
    private JTextField FlightID;
    private JLabel label3;
    private JTextField BoardingTime;
    private JLabel label4;
    private JScrollPane scrollPane2;
    private JTextArea TimeLefttoBoard;
    private JLabel label5;
    // private JTextField PassengernotBoarding;
    private JTextField Destination;
//    private JLabel label6;
//    private JLabel label7;
//    private JScrollPane scrollPane1;
//    private JTextArea textArea1;
    private JButton button3;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
