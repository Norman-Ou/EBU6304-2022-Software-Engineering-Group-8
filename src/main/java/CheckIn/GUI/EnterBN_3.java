/*
 * Created by JFormDesigner on Sat Apr 16 09:22:14 CST 2022
 */

package CheckIn.GUI;

import Beans.Flight.Flight;
import Beans.Passenger.Passenger;
import CheckIn.Monitor.cMonitors;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;

/**
 * @author Jiayi Wang
 */
public class EnterBN_3 extends JFrame {

    public EnterBN_3() {
        initComponents();
    }
    public static String bookNum;
    public static Passenger psnTemp;
    public static Flight fltTemp;
    public static Calendar time = Calendar.getInstance();
    public static SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    public static String nowTime = format.format(time.getTime());
//    public static String nowTime = "07-09-2022 7:42:32";


    private void ok(ActionEvent e) throws IllegalAccessException, ParseException, Exception {


        String str=textField1.getText();
        bookNum=str;
//        System.out.println(bookNum);
        Flight flt = new Flight();
        try {
            flt = cMonitors.getFlightByBookingNo(bookNum);
            Passenger psn = cMonitors.getPassengerByBookingNo(bookNum);
//        System.out.println(psn);
            fltTemp = flt;
            psnTemp = psn;
        }catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "Invalid input, confirm your Booking Number again.","Invalid input", JOptionPane.WARNING_MESSAGE);
        new CheckIn_2().setVisible(true);
        }
        if(flt==null){
            throw new Exception(bookNum);
        }

        try{
            firstCheck();
        } catch (IllegalAccessException illegalAccessException) {
            illegalAccessException.printStackTrace();
            errorHandel();
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        } catch (Exception exception){
            dispose();
        }
        dispose();
    }
    public static void errorHandel(){
        JOptionPane.showMessageDialog(null, "Sorry for the rejection of your checking in for there's less than 30 minutes for your flight.","Sorry", JOptionPane.WARNING_MESSAGE);
        new Error().setVisible(true);
    }
    public void firstCheck() throws IllegalAccessException, ParseException {
        try{
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            Date date1 = format.parse(nowTime);
            Date date2 = new Date();
            try{
                date2 = format.parse(fltTemp.getETD());
                new ConfirmPage_3().setVisible(true);
            } catch (Exception error){
                JOptionPane.showMessageDialog(null, "Invalid input, confirm your Booking Number again.","Invalid input", JOptionPane.WARNING_MESSAGE);
                dispose();
                new CheckIn_2().setVisible(true);
            }
            long nowMillisecond = date1.getTime();
            long etdMillisecond = date2.getTime();
            System.out.println(etdMillisecond);
            System.out.println(nowMillisecond);
            if( etdMillisecond - nowMillisecond < 1800000){
                throw new IllegalAccessException();
            }
        } catch (ParseException | IllegalAccessException e) {
            errorHandel();
            e.printStackTrace();
        }

    }
    public static Passenger getPsnTemp() {
        try {
            return psnTemp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Flight getFlight() {
        try {
            return fltTemp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private void forgetBN(ActionEvent e) {
        new EnterOther_3().setVisible(true);
        dispose();
    }

    private void back(ActionEvent e) {
        new Airline_1().setVisible(true);
        dispose();
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
        ResourceBundle bundle = ResourceBundle.getBundle("Check");
        dialogPane2 = new JPanel();
        buttonBar2 = new JPanel();
        okButton2 = new JButton();
        button1 = new JButton();
        cancelButton2 = new JButton();
        panel1 = new JPanel();
        button2 = new JButton();
        label1 = new JLabel();
        panel2 = new JPanel();
        textField1 = new JTextField();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane2 ========
        {
            dialogPane2.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane2.setOpaque(false);
            dialogPane2.setLayout(new BorderLayout());

            //======== buttonBar2 ========
            {
                buttonBar2.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar2.setOpaque(false);
                buttonBar2.setPreferredSize(new Dimension(234, 90));
                buttonBar2.setLayout(new GridLayout());

                //---- okButton2 ----
                okButton2.setText(bundle.getString("okButton2.text_4"));
                okButton2.addActionListener(e -> {
                    try {
                        ok(e);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                });
                buttonBar2.add(okButton2);

                //---- button1 ----
                button1.setText(bundle.getString("button1.text_16"));
                button1.addActionListener(e -> forgetBN(e));
                buttonBar2.add(button1);

                //---- cancelButton2 ----
                cancelButton2.setText(bundle.getString("cancelButton2.text_4"));
                cancelButton2.addActionListener(e -> back(e));
                buttonBar2.add(cancelButton2);
            }
            dialogPane2.add(buttonBar2, BorderLayout.SOUTH);

            //======== panel1 ========
            {
                panel1.setOpaque(false);
                panel1.setLayout(new BorderLayout());

                //---- button2 ----
                button2.setText(bundle.getString("button2.text_21"));
                button2.addActionListener(e -> help(e));
                panel1.add(button2, BorderLayout.EAST);

                //---- label1 ----
                label1.setText(bundle.getString("label1.text_30"));
                label1.setFont(new Font(".AppleSystemUIFont", Font.BOLD | Font.ITALIC, 25));
                label1.setHorizontalAlignment(SwingConstants.CENTER);
                label1.setPreferredSize(new Dimension(632, 90));
                panel1.add(label1, BorderLayout.CENTER);
            }
            dialogPane2.add(panel1, BorderLayout.NORTH);

            //======== panel2 ========
            {
                panel2.setOpaque(false);
                panel2.setLayout(new GridBagLayout());
                ((GridBagLayout)panel2.getLayout()).columnWidths = new int[] {0, 0};
                ((GridBagLayout)panel2.getLayout()).rowHeights = new int[] {0, 0};
                ((GridBagLayout)panel2.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
                ((GridBagLayout)panel2.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

                //---- textField1 ----
                textField1.setPreferredSize(new Dimension(49, 90));
                textField1.setHorizontalAlignment(SwingConstants.CENTER);
                panel2.add(textField1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane2.add(panel2, BorderLayout.CENTER);
        }
        contentPane.add(dialogPane2, BorderLayout.CENTER);
        setSize(900, 550);
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
    private JPanel panel1;
    private JButton button2;
    private JLabel label1;
    private JPanel panel2;
    private JTextField textField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

}
