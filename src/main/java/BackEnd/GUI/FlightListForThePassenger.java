/*
 * Created by JFormDesigner on Sun May 22 01:09:19 CST 2022
 */

package BackEnd.GUI;

import javax.swing.*;

import BackEnd.Monitor.bMonitors;
import Beans.Flight.Flight;
import Beans.Passenger.Passenger;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 * @author unknown
 */
public class FlightListForThePassenger extends JFrame {
    public FlightListForThePassenger() {
        initComponents();
        Flight1Detail.setEnabled(false);
        Flight2Detail.setEnabled(false);
        Flight3Detail.setEnabled(false);
        Flight4Detail.setEnabled(false);
    }

    public String TransInformation1="";//这个值用于传递查询时输入的PassengerID
    public String TransInformation2="";//这个值用于传输查询到的该乘客book了的FlightID
    
    private void ConfirmButtonMouseClicked(MouseEvent e) {

            String p_ID=InputBar.getText();//Use p_ID as a key to search for information in DB
            TransInformation1=p_ID;//这里对传递信息赋值了，赋值为乘客ID
            bMonitors admin = new bMonitors();
            ArrayList<Passenger> psgList = admin.searchPassengerById(p_ID);
            ArrayList<Flight> fltList = admin.searchFlightByPassenger(psgList);
            int numOfFlight = fltList.size();
            if(numOfFlight>=1){
                Flight1.setText(fltList.get(0).getFlightNo());
                Flight1Destination.setText(fltList.get(0).getDestination());
                Flight1Detail.setEnabled(true);
            }
            if(numOfFlight>=2){
                Flight2.setText(fltList.get(1).getFlightNo());
                Flight2Destination.setText(fltList.get(1).getDestination());
                Flight2Detail.setEnabled(true);
            }
            if(numOfFlight>=3){
                Flight3.setText(fltList.get(2).getFlightNo());
                Flight3Destination.setText(fltList.get(2).getDestination());
                Flight3Detail.setEnabled(true);
            }
            if(numOfFlight>=4){
                Flight4.setText(fltList.get(3).getFlightNo());
                Flight4Destination.setText(fltList.get(3).getDestination());
                Flight4Detail.setEnabled(true);
            }
            //这个地方要用p_ID去查询航班，把一个或多个航班写进Flight 1，2，3，4这几个JTextField里面，把对应的目的地写进对应的Destination
    }

    private void BackButtonMouseClicked(MouseEvent e) {
            backend B = new backend();
            B.setVisible(true);
            B.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();

    }

    private void Flight1DetailMouseClicked(MouseEvent e) {
        TransInformation2=Flight1.getText();
        if(InputBar.getText().equals("")){
            InputBar.setText("Please input!");
        }
        if (Flight1.getText().equals("")){
            Flight1.setText("Sorry, no such Flight.");
        }
        else{
            PassengerPage1 P = new PassengerPage1(this.getPassengerID(),this.getFlightID());
            P.setVisible(true);
//            this.dispose();
//            P.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }

    }

    private void Flight2DetailMouseClicked(MouseEvent e) {
        TransInformation2=Flight2.getText();
        if(InputBar.getText().equals("")){
            InputBar.setText("Please input!");
        }
        if (Flight2.getText().equals("")){
            Flight2.setText("Sorry, no such Flight.");
        }
        else{
            PassengerPage1 P = new PassengerPage1(this.getPassengerID(),this.getFlightID());
            P.setVisible(true);
//            this.dispose();
//            P.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }

    private void Flight3DetailMouseClicked(MouseEvent e) {
        TransInformation2=Flight3.getText();
        if(InputBar.getText().equals("")){
            InputBar.setText("Please input!");
        }
        if (Flight3.getText().equals("")){
            Flight3.setText("Sorry, no such Flight.");
        }
        else{
            PassengerPage1 P = new PassengerPage1(this.getPassengerID(),this.getFlightID());
            P.setVisible(true);
//            this.dispose();
//            P.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }

    private void Flight4DetailMouseClicked(MouseEvent e) {
        TransInformation2=Flight4.getText();
        if(InputBar.getText().equals("")){
            InputBar.setText("Please input!");
        }
        if (Flight4.getText().equals("")){
            Flight4.setText("Sorry, no such Flight.");
        }
        else{
            PassengerPage1 P = new PassengerPage1(this.getPassengerID(),this.getFlightID());
            P.setVisible(true);
//            this.dispose();
//            P.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        InputBar = new JTextField();
        ConfirmButton = new JButton();
        label2 = new JLabel();
        Flight1 = new JTextField();
        label3 = new JLabel();
        Flight1Destination = new JTextField();
        Flight1Detail = new JButton();
        label4 = new JLabel();
        Flight2 = new JTextField();
        label5 = new JLabel();
        Flight2Destination = new JTextField();
        Flight2Detail = new JButton();
        label6 = new JLabel();
        Flight3 = new JTextField();
        label7 = new JLabel();
        Flight3Destination = new JTextField();
        Flight3Detail = new JButton();
        label8 = new JLabel();
        Flight4 = new JTextField();
        label9 = new JLabel();
        Flight4Destination = new JTextField();
        Flight4Detail = new JButton();
        BackButton = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
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
        contentPane.add(InputBar, new GridBagConstraints(0, 1, 6, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));

        //---- ConfirmButton ----
        ConfirmButton.setText("Confirm");
        ConfirmButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ConfirmButtonMouseClicked(e);
                ConfirmButtonMouseClicked(e);
            }
        });
        contentPane.add(ConfirmButton, new GridBagConstraints(6, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));

        //---- label2 ----
        label2.setText("Flight 1:");
        contentPane.add(label2, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));
        contentPane.add(Flight1, new GridBagConstraints(1, 2, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));

        //---- label3 ----
        label3.setText("Destination\uff1a");
        contentPane.add(label3, new GridBagConstraints(3, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));
        contentPane.add(Flight1Destination, new GridBagConstraints(4, 2, 3, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));

        //---- Fligh1Detail ----
        Flight1Detail.setText("See Detail");
        Flight1Detail.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Flight1DetailMouseClicked(e);
            }
        });
        contentPane.add(Flight1Detail, new GridBagConstraints(7, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 0), 0, 0));

        //---- label4 ----
        label4.setText("Flight 2:");
        contentPane.add(label4, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));
        contentPane.add(Flight2, new GridBagConstraints(1, 3, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));

        //---- label5 ----
        label5.setText("Destination:");
        contentPane.add(label5, new GridBagConstraints(3, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));
        contentPane.add(Flight2Destination, new GridBagConstraints(4, 3, 3, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));

        //---- Flight2Detail ----
        Flight2Detail.setText("See Detail");
        Flight2Detail.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Flight2DetailMouseClicked(e);
            }
        });
        contentPane.add(Flight2Detail, new GridBagConstraints(7, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 0), 0, 0));

        //---- label6 ----
        label6.setText("Flight 3:");
        contentPane.add(label6, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));
        contentPane.add(Flight3, new GridBagConstraints(1, 4, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));

        //---- label7 ----
        label7.setText("Destination:");
        contentPane.add(label7, new GridBagConstraints(3, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));
        contentPane.add(Flight3Destination, new GridBagConstraints(4, 4, 3, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));

        //---- Flight3Detail ----
        Flight3Detail.setText("See Detail");
        Flight3Detail.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Flight3DetailMouseClicked(e);
            }
        });
        contentPane.add(Flight3Detail, new GridBagConstraints(7, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 0), 0, 0));

        //---- label8 ----
        label8.setText("Flight 4:");
        contentPane.add(label8, new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));
        contentPane.add(Flight4, new GridBagConstraints(1, 5, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));

        //---- label9 ----
        label9.setText("Destination:");
        contentPane.add(label9, new GridBagConstraints(3, 5, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));
        contentPane.add(Flight4Destination, new GridBagConstraints(4, 5, 3, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 10), 0, 0));

        //---- Flight4Detail ----
        Flight4Detail.setText("See Detail");
        Flight4Detail.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Flight4DetailMouseClicked(e);
            }
        });
        contentPane.add(Flight4Detail, new GridBagConstraints(7, 5, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 0), 0, 0));

        //---- BackButton ----
        BackButton.setText("Back");
        BackButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                BackButtonMouseClicked(e);
            }
        });
        contentPane.add(BackButton, new GridBagConstraints(7, 6, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 10, 0), 0, 0));
        setSize(635, 495);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    public String getPassengerID(){ return TransInformation1;}
    public String getFlightID(){ return TransInformation2;}

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JTextField InputBar;
    private JButton ConfirmButton;
    private JLabel label2;
    private JTextField Flight1;
    private JLabel label3;
    private JTextField Flight1Destination;
    private JButton Flight1Detail;
    private JLabel label4;
    private JTextField Flight2;
    private JLabel label5;
    private JTextField Flight2Destination;
    private JButton Flight2Detail;
    private JLabel label6;
    private JTextField Flight3;
    private JLabel label7;
    private JTextField Flight3Destination;
    private JButton Flight3Detail;
    private JLabel label8;
    private JTextField Flight4;
    private JLabel label9;
    private JTextField Flight4Destination;
    private JButton Flight4Detail;
    private JButton BackButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
