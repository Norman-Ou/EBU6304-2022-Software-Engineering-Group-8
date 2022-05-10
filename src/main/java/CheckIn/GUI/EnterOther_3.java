/*
 * Created by JFormDesigner on Sat Apr 16 09:14:50 CST 2022
 */

package CheckIn.GUI;

import Beans.Flight.Flight;
import CheckIn.Monitor.cMonitors;
import DataBase.pDB;
import Beans.IDDocument.IDDocument;
import Beans.Passenger.Passenger;
import Exceptions.DataNotFound;

import java.awt.*;
import java.awt.event.*;
import java.net.IDN;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import net.miginfocom.swing.*;

/**
 * @author Jiayi Wang
 */
public class EnterOther_3 extends JFrame {
    public EnterOther_3() {
        initComponents();
    }

    public static String IDNum;
    public static String surname;
    public static Passenger psnTemp1;
    public static Passenger psnTemp2;
    public static String BookingNumber;
    public static ArrayList<Flight> fltTemp;

    private void ok(ActionEvent e) throws Exception {
        //open next page
        new AirPassCse().setVisible(true);
        dispose();

        IDNum=ID.getText();
        surname=Sur.getText();
        ArrayList<Flight> fltList = cMonitors.getFlightBySurname_ID(surname,IDNum);
        fltTemp = fltList;
        psnTemp1=cMonitors.getPassengerBySurname_ID(surname,IDNum);
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
//        IDDocument id = new IDDocument("215200","orz");
//        IDNum=id.getID();
//        surname=id.getSurname();
//        Passenger psn = new Passenger();
//        psnTemp1=psn;
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

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Gabirella Cambridge
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
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane2 ========
        {
            dialogPane2.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane2.setOpaque(false);
            dialogPane2.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder
            ( 0, 0, 0, 0) , "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", javax. swing. border. TitledBorder. CENTER, javax. swing. border
            . TitledBorder. BOTTOM, new java .awt .Font ("D\u0069al\u006fg" ,java .awt .Font .BOLD ,12 ), java. awt
            . Color. red) ,dialogPane2. getBorder( )) ); dialogPane2. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void
            propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062or\u0064er" .equals (e .getPropertyName () )) throw new RuntimeException( )
            ; }} );
            dialogPane2.setLayout(new BorderLayout());

            //======== buttonBar2 ========
            {
                buttonBar2.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar2.setOpaque(false);
                buttonBar2.setPreferredSize(new Dimension(254, 90));
                buttonBar2.setLayout(new GridLayout());

                //---- okButton2 ----
                okButton2.setText(bundle.getString("okButton2.text_3"));
                okButton2.addActionListener(e -> {
                    try {
                        ok(e);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                });
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
                panel1.setLayout(new MigLayout(
                    "insets 0,hidemode 3,gap 0 0",
                    // columns
                    "[fill]" +
                    "[grow,fill]" +
                    "[grow,fill]",
                    // rows
                    "[grow,center]"));

                //---- Sur ----
                Sur.setToolTipText("Surname");
                Sur.setBorder(new TitledBorder("Surname"));
                Sur.setMinimumSize(new Dimension(49, 90));
                Sur.setPreferredSize(new Dimension(49, 90));
                Sur.setHorizontalAlignment(SwingConstants.CENTER);
                panel1.add(Sur, "cell 1 0");

                //---- ID ----
                ID.setToolTipText("IDNo");
                ID.setBorder(new TitledBorder("ID Number"));
                ID.setMinimumSize(new Dimension(49, 90));
                ID.setPreferredSize(new Dimension(49, 90));
                ID.setHorizontalAlignment(SwingConstants.CENTER);
                panel1.add(ID, "cell 2 0");
            }
            dialogPane2.add(panel1, BorderLayout.CENTER);
        }
        contentPane.add(dialogPane2, BorderLayout.CENTER);
        setSize(905, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        init();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Gabirella Cambridge
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
