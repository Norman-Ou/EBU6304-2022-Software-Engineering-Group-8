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

import static CheckIn.GUI.EnterBN_3.format;
import static CheckIn.GUI.EnterBN_3.time;

/**
 * The type Enter other 3.
 *
 * @author Jiayi Wang
 */
public class EnterOther_3 extends JFrame {
    protected InfiniteProgressPanel glassPane;
    /**
     * The constant ETA.
     */
    public static String ETC = "";

    /**
     * Instantiates a new Enter other 3.
     */
    public EnterOther_3() {
        initComponents();
    }

    /**
     * The constant psnTemp1.
     */
    public static Passenger psnTemp1;
    /**
     * The constant psnTemp2.
     */
    public static Passenger psnTemp2;
    /**
     * The constant BookingNumber.
     */
    public static String BookingNumber;
    /**
     * The Flt temp1.
     */
    public static ArrayList<Flight> fltTemp;
    /**
     * The constant nowTime.
     */
    public static String nowTime = format.format(time.getTime());
    /**
     * The constant scanState.
     * Have not scanned for false, true for scanned.
     */
    public static boolean scanState;

    private void help(ActionEvent e) {dispose();new Error().setVisible(true);}

    private void cancel(ActionEvent e) {new Airline_1().setVisible(true);dispose();}

    private void scanID(ActionEvent e) throws Exception {
        new Demo1().setVisible(true);

        openNext();

        dispose();}

    private void ok(ActionEvent e) throws Exception {openNext();}

    /**
     * Open next page.
     *
     * @throws IllegalAccessException the illegal access exception
     * @throws ParseException         the parse exception
     */
    public void openNext()throws Exception{

        if(psnTemp1==null){
            String IDNum = Config.Config.idDocument1.getID();
            String surname=Config.Config.idDocument1.getSurname();
            psnTemp2 = cMonitors.getPassengerBySurname_ID(surname,IDNum);
            ArrayList<Flight> fltList = cMonitors.getFlightBySurname_ID(surname,IDNum);
            fltTemp=fltList;
        }else if(psnTemp2==null){
            String IDNum1=ID.getText();
            String surname1=Sur.getText();
            ArrayList<Flight> fltList1 = cMonitors.getFlightBySurname_ID(surname1,IDNum1);
            fltTemp = fltList1;
            psnTemp1=cMonitors.getPassengerBySurname_ID(surname1,IDNum1);
        }

        try{
            firstCheck();
        } catch (IllegalAccessException illegalAccessException) {
            illegalAccessException.printStackTrace();
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        }
        dispose();
    }

    /**
     * Gets flight.
     *
     * @return the flight
     */
    public static ArrayList<Flight> getFlight() {
        try {
            return fltTemp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Gets psn temp 1.
     *
     * @return the psn temp 1
     */
    public static Passenger getPsnTemp1() {
        try{
            BookingNumber=psnTemp1.getBookNumber();
            return psnTemp1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Gets psn temp 2.
     *
     * @return the psn temp 2
     */
    public static Passenger getPsnTemp2(){
        String IDNum = Config.Config.idDocument1.getID();
        String surname=Config.Config.idDocument1.getSurname();
        psnTemp2 = cMonitors.getPassengerBySurname_ID(surname,IDNum);
        try{
            return psnTemp2;
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
    /**
     * Check time, if overtime then deny.
     *
     */
    public void checkTime() throws ParseException, IllegalAccessException {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date date1 = format.parse(nowTime);
        Date date2 = new Date();
            date2 = format.parse(ETC);
            new AirPassCse().setVisible(true);
            long nowMillisecond = date1.getTime();
            long etaMillisecond = date2.getTime();
            if(etaMillisecond - nowMillisecond > 1800000) {
                System.out.println(etaMillisecond+"11111"+nowMillisecond);
                throw new IllegalAccessException();
            }
    }


    /**
     * First check.
     *
     * @throws IllegalAccessException the illegal access exception
     * @throws ParseException         the parse exception
     */
    public void firstCheck() throws IllegalAccessException, ParseException {
        ArrayList<Flight> list = EnterOther_3.getFlight();
        if(list==null){
            JOptionPane.showMessageDialog(null, "Invalid input, confirm your ID number or Surname again.","Invalid input", JOptionPane.WARNING_MESSAGE);
            dispose();
            new CheckIn_2().setVisible(true);
        }else{
            for(Flight flt : list) {
                ETC =flt.getETC();
            }
        }

        try{
            checkTime();
        } catch ( IllegalAccessException e) {
            errorHandel();
            e.printStackTrace();
        }

    }

    /**
     * ErrorWindow handel.
     */
    public static void errorHandel(){
        JOptionPane.showMessageDialog(null, "Sorry for the rejection of your checking in for there's less than 30 minutes for your flight.","Sorry", JOptionPane.WARNING_MESSAGE);
        new Error().setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        ResourceBundle bundle = ResourceBundle.getBundle("Check");
        dialogPane2 = new JPanel();
        buttonBar2 = new JPanel();
        button1 = new JButton();
        okButton2 = new JButton();
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

                //---- button1 ----
                button1.setText(bundle.getString("button1.text_18"));
                button1.addActionListener(e -> {
                    try {
                        scanID(e);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                });
                buttonBar2.add(button1);

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
        setBackground();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel dialogPane2;
    private JPanel buttonBar2;
    private JButton button1;
    private JButton okButton2;
    private JButton cancelButton2;
    private JPanel panel2;
    private JLabel label1;
    private JButton button2;
    private JPanel panel1;
    private JTextField Sur;
    private JTextField ID;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
