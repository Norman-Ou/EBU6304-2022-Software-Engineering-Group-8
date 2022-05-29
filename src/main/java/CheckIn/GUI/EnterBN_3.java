/*
 * Created by JFormDesigner on Sat Apr 16 09:22:14 CST 2022
 */

package CheckIn.GUI;

import Beans.Flight.Flight;
import Beans.Passenger.Passenger;
import CheckIn.Monitor.cMonitors;
import org.junit.Test;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.ResourceBundle;

/**
 * The type Enter bn 3.
 *
 * @author Jiayi Wang
 */
public class EnterBN_3 extends JFrame {

    /**
     * Instantiates a new Enter bn 3.
     */
    public EnterBN_3() throws ParseException {initComponents();}

    /**
     * The constant bookNum.
     */
    public static String bookNum;
    /**
     * The constant psnTemp.
     */
    public static Passenger psnTemp;
    /**
     * The constant fltTemp.
     */
    public static Flight fltTemp;
    /**
     * The constant time.
     */
    public static Calendar time = Calendar.getInstance();
    /**
     * The constant format.
     */
    public static SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    /**
     * The constant nowTime.
     */
    public static String nowTime = format.format(time.getTime());
    public static boolean firState=false;

    private void forgetBN(ActionEvent e) {new EnterOther_3().setVisible(true);dispose();}

    private void back(ActionEvent e) {new AirlineWindow().setVisible(true);dispose();}

    private void help(ActionEvent e) {dispose();new ErrorWindow().setVisible(true);}

    private void ok(ActionEvent e) throws Exception {bookNumHandel();}

    /**
     * BookNumber handel.
     * Initialize fltTemp and psnTemp with error input detection.
     */
    public void bookNumHandel()throws Exception{
        String str=textField1.getText();
        bookNum=str;
        Flight flt = new Flight();
//        fltTemp = cMonitors.getFlightByBookingNo(bookNum);
//        psnTemp = cMonitors.getPassengerByBookingNo(bookNum);

        try {
            flt = cMonitors.getFlightByBookingNo(bookNum);

//            System.out.println(flt);
//            fltTemp = cMonitors.getFlightByBookingNo(bookNum);
            System.out.println(fltTemp);
            Passenger psn = cMonitors.getPassengerByBookingNo(bookNum);
            fltTemp = flt;
            System.out.println(fltTemp);
            psnTemp = psn;
//            System.out.println(psnTemp+"222");
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        try{
            firstCheck();
        } catch (IllegalAccessException illegalAccessException) {
            illegalAccessException.printStackTrace();
//            errorHandel();
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        } catch (Exception exception){
            dispose();
        }
        dispose();
    }

    /**
     * ErrorWindow handle.
     */
    public static void errorHandel() throws Exception {
        JOptionPane.showMessageDialog(null, "Sorry for the rejection of your checking in for there's less than 30 minutes for your flight.","Sorry", JOptionPane.WARNING_MESSAGE);
//        new ErrorWindow().setVisible(true);
        new Seat_1_6().setVisible(true);
    }

    public void inputValid() throws InputMismatchException {
        if (psnTemp == null) {
//            JOptionPane.showMessageDialog(null, "Please enter your booking number again.","Invalid input", JOptionPane.WARNING_MESSAGE);
//            dispose();
//            new CheckInWindow().setVisible(true);
            throw new InputMismatchException();
        }else{
            firState=true;
        }
    }

    /**
     * First check.
     *
     * @throws IllegalAccessException the illegal access exception for overtime
     * @throws ParseException         the parse exception for invalid input
     */
    public void firstCheck() throws Exception {
        try{
            inputValid();
        }
        catch (InputMismatchException error){
            JOptionPane.showMessageDialog(null, "Please enter your booking number again.","Invalid input", JOptionPane.WARNING_MESSAGE);
            dispose();
            new CheckInWindow().setVisible(true);
        }
        secondCheck();
    }

    public void secondCheck() throws Exception {
        if(firState){
            try{
                checkTime();

//                new ConfirmPage_3().setVisible(true);
                new Seat_1_6().setVisible(true);
            } catch (IllegalAccessException e) {
                errorHandel();
                e.printStackTrace();
            } catch (ParseException e1){
                e1.printStackTrace();
            }
        }

    }
    public void checkTime() throws ParseException, IllegalAccessException {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date date1 = format.parse(nowTime);
        Date date2 = new Date();

        date2 = format.parse(fltTemp.getETD());
        long nowMillisecond = date1.getTime();
        long etdMillisecond = date2.getTime();
        //etdMillisecond - nowMillisecond < 1800000
        if(etdMillisecond - nowMillisecond < 1800000){
            throw new IllegalAccessException();
        }
    }

    /**
     * Gets psn temp.
     *
     * @return the psn temp
     */
    public static Passenger getPsnTemp() {
        try {
            return psnTemp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Gets flight.
     *
     * @return the flight
     */
    public static Flight getFlight() {
        try {
            return fltTemp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Set background.
     */
    public void setBackground() {
        ImageIcon background = new ImageIcon(Config.Config.bgPic);
        JLabel label3 = new JLabel(background);
        label3.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());
        JPanel myPanel = (JPanel)this.getContentPane();
        myPanel.setOpaque(false);
        this.getLayeredPane().add(label3, Integer.valueOf(Integer.MIN_VALUE));
        this.setTitle("Passenger check-in system");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


    private void initComponents() throws ParseException {
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
        setBackground();
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
