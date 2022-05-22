/*
 * Created by JFormDesigner on Sat Apr 16 09:14:50 CST 2022
 */

package CheckIn.GUI;

import Beans.Flight.Flight;
import Beans.Passenger.Passenger;
import CheckIn.Monitor.cMonitors;
//import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;

/**
 * @author Jiayi Wang
 */
public class EnterOther_3 extends JFrame {
    public static String ETA= "";

    public EnterOther_3() {
        initComponents();
    }

    public static String IDNum;
    public static String surname;
    public static Passenger psnTemp1;
    public static Passenger psnTemp2;
    public static String BookingNumber;
    public static ArrayList<Flight> fltTemp;
    public static String nowTime = "07-09-2022 9:42:32";

    private void ok(ActionEvent e) throws Exception {
        //open next page

        IDNum=ID.getText();
        surname=Sur.getText();
        ArrayList<Flight> fltList = cMonitors.getFlightBySurname_ID(surname,IDNum);
        fltTemp = fltList;
        psnTemp1=cMonitors.getPassengerBySurname_ID(surname,IDNum);

        try{
            firstCheck();

        } catch (IllegalAccessException illegalAccessException) {
            illegalAccessException.printStackTrace();
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        }
//        new AirPassCse().setVisible(true);
        dispose();
    }
    public static ArrayList<Flight> getFlight() {
        try {
            return fltTemp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static Passenger getPsnTemp1() {
        try{
            BookingNumber=psnTemp1.getBookNumber();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return psnTemp1;
    }

    public static Passenger getPsnTemp2() {
        //Scan a passenger
        try{
            BookingNumber=psnTemp1.getBookNumber();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return psnTemp1;
    }

    public static ArrayList<Flight> getFlightList() {
        try {
            return fltTemp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private void cancel(ActionEvent e) {
        new Airline_1().setVisible(true);
        dispose();
    }

    private void scanID(ActionEvent e) {
        new ConfirmPage_3().setVisible(true);
        dispose();
        getPsnTemp2();
    }

    public void init() {
        ImageIcon background = new ImageIcon("src/main/resources/img.png");
        JLabel label3 = new JLabel(background);
        label3.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());
        JPanel myPanel = (JPanel)this.getContentPane();
        myPanel.setOpaque(false);
//        myPanel.setLayout(new FlowLayout());
//        this.getLayeredPane().setLayout(null);
        this.getLayeredPane().add(label3, Integer.valueOf(Integer.MIN_VALUE));
        this.setTitle("Passenger check-in system");
//        this.setBounds(300, 300, background.getIconWidth(), background.getIconHeight());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void help(ActionEvent e) {
        dispose();
        new Error().setVisible(true);
    }
    public void firstCheck() throws IllegalAccessException, ParseException {

        ArrayList<Flight> list=EnterOther_3.getFlight();
        if(list==null){
            JOptionPane.showMessageDialog(null, "Invalid input, confirm your ID number or Surname again.","Invalid input", JOptionPane.WARNING_MESSAGE);
            dispose();
            new CheckIn_2().setVisible(true);
        }else{
            for(Flight flt : list) {          //同for(int i = 0;i<list.size();i++)
                ETA=flt.getETA();
                System.out.println(ETA);
                String eta=flt.getETA();
                SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                Date date1 = format.parse(nowTime);
                Date date2 = format.parse(eta);

                try{
                    date2 = format.parse(eta);
                    new AirPassCse().setVisible(true);
                } catch (Exception error){
                    long nowMillisecond = date1.getTime();
                    long etaMillisecond = date2.getTime();
                    if(etaMillisecond - nowMillisecond < 1800000){
                    }else{
                        throw new IllegalAccessException();
                    }
                }
            }
        }
        String eta=ETA;
        try{
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            Date date1 = format.parse(nowTime);
            Date date2 = new Date();
            try{
                date2 = format.parse(eta);
                new AirPassCse().setVisible(true);
            } catch (Exception error){
                long nowMillisecond = date1.getTime();
                long etaMillisecond = date2.getTime();
                if(etaMillisecond - nowMillisecond < 1800000){
                }else{
                    throw new IllegalAccessException();
                }
            }
        } catch (ParseException | IllegalAccessException e) {
            errorHandel();
            e.printStackTrace();
        }

    }
    public static void errorHandel(){
        JOptionPane.showMessageDialog(null, "Sorry for the rejection of your checking in for there's less than 30 minutes for your flight.","Sorry", JOptionPane.WARNING_MESSAGE);
        new Error().setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        ResourceBundle bundle = ResourceBundle.getBundle("Check");
        dialogPane2 = new JPanel();
        buttonBar2 = new JPanel();
        okButton2 = new JButton();
        button1 = new JButton();
        cancelButton2 = new JButton();
        panel2 = new JPanel();
        label1 = new JLabel();
        button2 = new JButton();
        panel1 = new JPanel();
        Sur = new JTextField();
        ID = new JTextField();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {0, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {0, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

        //======== dialogPane2 ========
        {
            dialogPane2.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane2.setOpaque(false);
            dialogPane2.setLayout(new BorderLayout());

            //======== buttonBar2 ========
            {
                buttonBar2.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar2.setOpaque(false);
                buttonBar2.setPreferredSize(new Dimension(254, 90));
                buttonBar2.setLayout(new GridLayout());

                //---- okButton2 ----
                okButton2.setText(bundle.getString("okButton2.text_3"));
                okButton2.addActionListener(e -> ok(e));
                buttonBar2.add(okButton2);

                //---- button1 ----
                button1.setText(bundle.getString("button1.text_18"));
                button1.addActionListener(e -> scanID(e));
                buttonBar2.add(button1);

                //---- cancelButton2 ----
                cancelButton2.setText(bundle.getString("cancelButton2.text_3"));
                cancelButton2.addActionListener(e -> cancel(e));
                buttonBar2.add(cancelButton2);
            }
            dialogPane2.add(buttonBar2, BorderLayout.SOUTH);

            //======== panel2 ========
            {
                panel2.setOpaque(false);
                panel2.setLayout(new BorderLayout());

                //---- label1 ----
                label1.setText(bundle.getString("label1.text_29"));
                label1.setFont(new Font(".AppleSystemUIFont", Font.BOLD | Font.ITALIC, 20));
                label1.setHorizontalAlignment(SwingConstants.CENTER);
                label1.setPreferredSize(new Dimension(744, 90));
                panel2.add(label1, BorderLayout.CENTER);

                //---- button2 ----
                button2.setText(bundle.getString("button2.text_22"));
                button2.addActionListener(e -> help(e));
                panel2.add(button2, BorderLayout.EAST);
            }
            dialogPane2.add(panel2, BorderLayout.NORTH);

            //======== panel1 ========
            {
                panel1.setOpaque(false);
                panel1.setLayout(new GridBagLayout());
                ((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {0, 0, 0, 0};
                ((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {0, 0};
                ((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {0.0, 1.0, 1.0, 1.0E-4};
                ((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

                //---- Sur ----
                Sur.setToolTipText("Surname");
                Sur.setBorder(new TitledBorder("Surname"));
                Sur.setMinimumSize(new Dimension(49, 90));
                Sur.setPreferredSize(new Dimension(49, 90));
                Sur.setHorizontalAlignment(SwingConstants.CENTER);
                panel1.add(Sur, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                    new Insets(0, 0, 0, 0), 0, 0));

                //---- ID ----
                ID.setToolTipText("IDNo");
                ID.setBorder(new TitledBorder("ID Number"));
                ID.setMinimumSize(new Dimension(49, 90));
                ID.setPreferredSize(new Dimension(49, 90));
                ID.setHorizontalAlignment(SwingConstants.CENTER);
                panel1.add(ID, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane2.add(panel1, BorderLayout.CENTER);
        }
        contentPane.add(dialogPane2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
        setSize(905, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        init();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel dialogPane2;
    private JPanel buttonBar2;
    private JButton okButton2;
    private JButton button1;
    private JButton cancelButton2;
    private JPanel panel2;
    private JLabel label1;
    private JButton button2;
    private JPanel panel1;
    private JTextField Sur;
    private JTextField ID;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
