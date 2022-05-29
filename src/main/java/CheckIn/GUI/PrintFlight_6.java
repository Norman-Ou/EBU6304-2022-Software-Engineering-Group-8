package CheckIn.GUI;

import Beans.Flight.Flight;
import Beans.Passenger.Passenger;
import DataBase.pDB;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ResourceBundle;
/*
 * Created by JFormDesigner on Tue Mar 29 20:34:40 CST 2022
 */


/**
 * The type Print flight 6.
 *
 * @author Jiayi Wang
 */
public class PrintFlight_6 extends JFrame {
    /**
     * The constant stage.
     */
    public static String stage;

    public static String surname1;
    public static String psnID1;
    public static boolean finalState=false;

    /**
     * Instantiates a new Print flight 6.
     */
    public PrintFlight_6() {
        initComponents();
    }

    private void printBoardingpass(ActionEvent e) {
        info();
    }

    private void Back2Confirm(ActionEvent e) {dispose();new ConfirmWindow().setVisible(true);}

    private void help(ActionEvent e) {dispose();new ErrorWindow().setVisible(true);}

    private void error(ActionEvent e) {dispose();new ErrorWindow().setVisible(true);}

    private void printThenBag(ActionEvent e) throws InterruptedException {
        if(finalState){
            bagInformation();
        }else{
            JOptionPane.showMessageDialog(null, "Please scan your ID card","SCAN", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void scanID(ActionEvent e) throws InterruptedException {
        finalCheckFlight();
        finalState=pDB.finalCheck(surname1,psnID1);
        JOptionPane.showMessageDialog(null, "Confirmed. please print your Boarding Pass","CONFIRM", JOptionPane.WARNING_MESSAGE);
    }

    public void finalCheckFlight(){
        if(!(EnterOther_3.getPsnTemp1()==null)){
            try {
                surname1 = EnterOther_3.getPsnTemp1().getSurName();
                psnID1 = EnterOther_3.getPsnTemp1().getPassengerId();
            } catch (Exception exception) {
                exception.printStackTrace();
            }

        }
        else if(!(EnterBN_3.getPsnTemp()==null)) {
            try {
                surname1 = EnterBN_3.getPsnTemp().getSurName();
                psnID1 = EnterBN_3.getPsnTemp().getPassengerId();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }else if(!(EnterOther_3.getPsnTemp2()==null)){
            try{
                surname1 = EnterOther_3.getPsnTemp2().getSurName();
                psnID1 = EnterOther_3.getPsnTemp2().getPassengerId();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }

    /**
     * Bag information.
     */
    public void bagInformation(){
        int temp=JOptionPane.showInternalConfirmDialog(null,
                "Ready for Baggage?", "Double check",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (temp == JOptionPane.NO_OPTION) {
            return;
        }if(temp == JOptionPane.YES_OPTION){
            dispose();
//            new Demo().setVisible(true);
            stage="BoardingPass";
            //            new BaggageWindow().setVisible(true);
        }if(temp == JOptionPane.CANCEL_OPTION){
            dispose();
            new ErrorWindow().setVisible(true);
        }dispose();
    }

    /**
     * Info.
     * Fill in information.
     */
    public void info(){
        if(!(EnterOther_3.getPsnTemp1()==null)){
            try{
                BookNum.setText(EnterOther_3.getPsnTemp1().getBookNumber());
                Surname.setText(EnterOther_3.getPsnTemp1().getSurName());
                IDNum.setText(EnterOther_3.getPsnTemp1().getPassengerId());
                Flight flt=AirPassCse.flightChoose;
                Depar.setText(flt.getDeparture());
                Desti.setText(flt.getDestination());
                ETA.setText(flt.getETA());
                ETC.setText(flt.getETC());
                ETD.setText(flt.getETD());
                Gate.setText(flt.getGate());
                if(SeatDoubleWindow.seat==null){
                    Seat.setText(SeatTripleWindow.seat);
                }else if(SeatTripleWindow.seat==null){
                    Seat.setText(SeatDoubleWindow.seat);
                }
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        else if(!(EnterBN_3.getPsnTemp()==null)) {
            try {
                BookNum.setText(EnterBN_3.getPsnTemp().getBookNumber());
                Surname.setText(EnterBN_3.getPsnTemp().getSurName());
                IDNum.setText(EnterBN_3.getPsnTemp().getPassengerId());
                Depar.setText(EnterBN_3.getFlight().getDeparture());
                Desti.setText(EnterBN_3.getFlight().getDestination());
                ETA.setText(EnterBN_3.getFlight().getETA());
                ETC.setText(EnterBN_3.getFlight().getETC());
                ETD.setText(EnterBN_3.getFlight().getETD());
                Gate.setText(EnterBN_3.getFlight().getGate());
                if(SeatDoubleWindow.seat==null){
                    Seat.setText(SeatTripleWindow.seat);
                }else if(SeatTripleWindow.seat==null){
                    Seat.setText(SeatDoubleWindow.seat);
                }
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }else if(!(EnterOther_3.getPsnTemp2()==null)){
            try{
                BookNum.setText(EnterOther_3.getPsnTemp2().getBookNumber());
                Surname.setText(EnterOther_3.getPsnTemp2().getSurName());
                IDNum.setText(EnterOther_3.getPsnTemp2().getPassengerId());
                Flight flt=AirPassCse.flightChoose;
                Depar.setText(flt.getDeparture());
                Desti.setText(flt.getDestination());
                ETA.setText(flt.getETA());
                ETC.setText(flt.getETC());
                ETD.setText(flt.getETD());
                Gate.setText(flt.getGate());
                if(SeatDoubleWindow.seat==null){
                    Seat.setText(SeatTripleWindow.seat);
                }else if(SeatTripleWindow.seat==null){
                    Seat.setText(SeatDoubleWindow.seat);
                }
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }

    /**
     * Write in boarding pass passenger.
     *
     * @return the passenger
     */
    public static Passenger writeInBoardingPass(){
        if(!(EnterBN_3.getPsnTemp()==null))  {
            EnterBN_3.getPsnTemp().getBoardingPass().setETA(EnterBN_3.getFlight().getETA());
            EnterBN_3.getPsnTemp().getBoardingPass().setETC(EnterBN_3.getFlight().getETC());
            EnterBN_3.getPsnTemp().getBoardingPass().setETD(EnterBN_3.getFlight().getETD());
            EnterBN_3.getPsnTemp().getBoardingPass().setFlightNo(EnterBN_3.getFlight().getFlightNo());
            if (SeatDoubleWindow.seat == null) {
                EnterBN_3.getPsnTemp().getBoardingPass().setSeatNo(SeatTripleWindow.seat);
            } else if (SeatTripleWindow.seat == null) {
                EnterBN_3.getPsnTemp().getBoardingPass().setSeatNo(SeatDoubleWindow.seat);
            }
            EnterBN_3.getPsnTemp().getBoardingPass().setDeparture(EnterBN_3.getFlight().getDeparture());
            EnterBN_3.getPsnTemp().getBoardingPass().setDestination(EnterBN_3.getFlight().getDestination());
            EnterBN_3.getPsnTemp().getBoardingPass().setGate(EnterBN_3.getFlight().getGate());
            return EnterBN_3.getPsnTemp();
        }else if(!(EnterOther_3.getPsnTemp1()==null)){
            EnterOther_3.getPsnTemp1().getBoardingPass().setETA(AirPassCse.flightChoose.getETA());
            EnterOther_3.getPsnTemp1().getBoardingPass().setETC(AirPassCse.flightChoose.getETC());
            EnterOther_3.getPsnTemp1().getBoardingPass().setETD(AirPassCse.flightChoose.getETD());
            EnterOther_3.getPsnTemp1().getBoardingPass().setFlightNo(AirPassCse.flightChoose.getFlightNo());
            if (SeatDoubleWindow.seat == null) {
                EnterOther_3.getPsnTemp1().getBoardingPass().setSeatNo(SeatTripleWindow.seat);
            } else if (SeatTripleWindow.seat == null) {
                EnterOther_3.getPsnTemp1().getBoardingPass().setSeatNo(SeatDoubleWindow.seat);
            }
            EnterOther_3.getPsnTemp1().getBoardingPass().setGate(AirPassCse.flightChoose.getGate());
            EnterOther_3.getPsnTemp1().getBoardingPass().setDeparture(AirPassCse.flightChoose.getDeparture());
            EnterOther_3.getPsnTemp1().getBoardingPass().setDestination(AirPassCse.flightChoose.getDestination());
            return EnterOther_3.getPsnTemp1();
        }else if(!(EnterOther_3.getPsnTemp2()==null)) {
            EnterOther_3.getPsnTemp2().getBoardingPass().setETA(AirPassCse.flightChoose.getETA());
            EnterOther_3.getPsnTemp2().getBoardingPass().setETC(AirPassCse.flightChoose.getETC());
            EnterOther_3.getPsnTemp2().getBoardingPass().setETD(AirPassCse.flightChoose.getETD());
            EnterOther_3.getPsnTemp2().getBoardingPass().setFlightNo(AirPassCse.flightChoose.getFlightNo());
            if (SeatDoubleWindow.seat == null) {
                EnterOther_3.getPsnTemp2().getBoardingPass().setSeatNo(SeatTripleWindow.seat);
            } else if (SeatTripleWindow.seat == null) {
                EnterOther_3.getPsnTemp2().getBoardingPass().setSeatNo(SeatDoubleWindow.seat);
            }
            EnterOther_3.getPsnTemp2().getBoardingPass().setGate(AirPassCse.flightChoose.getGate());
            EnterOther_3.getPsnTemp2().getBoardingPass().setDeparture(AirPassCse.flightChoose.getDeparture());
            EnterOther_3.getPsnTemp2().getBoardingPass().setDestination(AirPassCse.flightChoose.getDestination());
            return EnterOther_3.getPsnTemp2();
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
//        myPanel.setLayout(new FlowLayout());
//        this.getLayeredPane().setLayout(null);
        this.getLayeredPane().add(label3, Integer.valueOf(Integer.MIN_VALUE));
        this.setTitle("Passenger check-in system");
//        this.setBounds(300, 300, background.getIconWidth(), background.getIconHeight());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void initComponents() {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        ResourceBundle bundle = ResourceBundle.getBundle("Check");
        dialogPane = new JPanel();
        panel1 = new JPanel();
        button2 = new JButton();
        button3 = new JButton();
        contentPanel = new JPanel();
        panel4 = new JPanel();
        panel2 = new JPanel();
        label1 = new JLabel();
        label3 = new JLabel();
        label2 = new JLabel();
        BookNum = new JTextField();
        label10 = new JLabel();
        Surname = new JTextField();
        label4 = new JLabel();
        IDNum = new JTextField();
        label5 = new JLabel();
        Depar = new JTextField();
        label6 = new JLabel();
        Desti = new JTextField();
        label7 = new JLabel();
        ETA = new JTextField();
        label8 = new JLabel();
        ETC = new JTextField();
        label9 = new JLabel();
        ETD = new JTextField();
        label11 = new JLabel();
        Gate = new JTextField();
        label12 = new JLabel();
        Seat = new JTextField();
        buttonBar = new JPanel();
        PrintButton = new JButton();
        cancelButton = new JButton();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setOpaque(false);
            dialogPane.setLayout(new BorderLayout());

            //======== panel1 ========
            {
                panel1.setOpaque(false);
                panel1.setLayout(new BorderLayout());

                //---- button2 ----
                button2.setText(bundle.getString("button2.text_12"));
                button2.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 20));
                button2.addActionListener(e -> printBoardingpass(e));
                panel1.add(button2, BorderLayout.CENTER);

                //---- button3 ----
                button3.setText(bundle.getString("button3.text_15"));
                button3.addActionListener(e -> help(e));
                panel1.add(button3, BorderLayout.EAST);
            }
            dialogPane.add(panel1, BorderLayout.NORTH);

            //======== contentPanel ========
            {
                contentPanel.setOpaque(false);
                contentPanel.setLayout(new GridLayout());

                //======== panel4 ========
                {
                    panel4.setForeground(Color.white);
                    panel4.setBackground(Color.white);
                    panel4.setLayout(new BorderLayout());

                    //======== panel2 ========
                    {
                        panel2.setOpaque(false);
                        panel2.setForeground(Color.white);
                        panel2.setBackground(SystemColor.textHighlight);
                        panel2.setLayout(new GridBagLayout());
                        ((GridBagLayout)panel2.getLayout()).columnWidths = new int[] {0, 271, 0, 0, 0, 0};
                        ((GridBagLayout)panel2.getLayout()).rowHeights = new int[] {24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                        ((GridBagLayout)panel2.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0, 0.0, 0.0, 1.0E-4};
                        ((GridBagLayout)panel2.getLayout()).rowWeights = new double[] {1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

                        //---- label1 ----
                        label1.setText(bundle.getString("label1.text_12"));
                        label1.setHorizontalAlignment(SwingConstants.CENTER);
                        label1.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 24));
                        label1.setForeground(Color.black);
                        label1.setBackground(Color.white);
                        panel2.add(label1, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.NONE,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //---- label3 ----
                        label3.setText(bundle.getString("label3.text_3"));
                        label3.setHorizontalAlignment(SwingConstants.CENTER);
                        label3.setIcon(null);
                        label3.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 24));
                        label3.setForeground(Color.black);
                        label3.setBackground(Color.white);
                        panel2.add(label3, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.NONE,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //---- label2 ----
                        label2.setText(bundle.getString("label2.text_9"));
                        label2.setBorder(new EmptyBorder(5, 5, 5, 5));
                        label2.setForeground(Color.black);
                        label2.setBackground(Color.white);
                        label2.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
                        panel2.add(label2, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.NONE,
                            new Insets(0, 0, 0, 0), 0, 0));
                        panel2.add(BookNum, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //---- label10 ----
                        label10.setText(bundle.getString("label10.text_2"));
                        label10.setBorder(new EmptyBorder(5, 5, 5, 5));
                        label10.setForeground(Color.black);
                        label10.setBackground(Color.white);
                        label10.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
                        panel2.add(label10, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.NONE,
                            new Insets(0, 0, 0, 0), 0, 0));
                        panel2.add(Surname, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //---- label4 ----
                        label4.setText(bundle.getString("label4.text_2"));
                        label4.setBorder(new EmptyBorder(5, 5, 5, 5));
                        label4.setForeground(Color.black);
                        label4.setBackground(Color.white);
                        label4.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
                        panel2.add(label4, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.NONE,
                            new Insets(0, 0, 0, 0), 0, 0));
                        panel2.add(IDNum, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //---- label5 ----
                        label5.setText(bundle.getString("label5.text_3"));
                        label5.setBorder(new EmptyBorder(5, 5, 5, 5));
                        label5.setForeground(Color.black);
                        label5.setBackground(Color.white);
                        label5.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
                        panel2.add(label5, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.NONE,
                            new Insets(0, 0, 0, 0), 0, 0));
                        panel2.add(Depar, new GridBagConstraints(2, 4, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //---- label6 ----
                        label6.setText(bundle.getString("label6.text_3"));
                        label6.setBorder(new EmptyBorder(5, 5, 5, 5));
                        label6.setForeground(Color.black);
                        label6.setBackground(Color.white);
                        label6.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
                        panel2.add(label6, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.NONE,
                            new Insets(0, 0, 0, 0), 0, 0));
                        panel2.add(Desti, new GridBagConstraints(2, 5, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //---- label7 ----
                        label7.setText(bundle.getString("label7.text_3"));
                        label7.setBorder(new EmptyBorder(5, 5, 5, 5));
                        label7.setForeground(Color.black);
                        label7.setBackground(Color.white);
                        label7.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
                        panel2.add(label7, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.NONE,
                            new Insets(0, 0, 0, 0), 0, 0));
                        panel2.add(ETA, new GridBagConstraints(2, 6, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //---- label8 ----
                        label8.setText(bundle.getString("label8.text_3"));
                        label8.setBorder(new EmptyBorder(5, 5, 5, 5));
                        label8.setForeground(Color.black);
                        label8.setBackground(Color.white);
                        label8.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
                        panel2.add(label8, new GridBagConstraints(1, 7, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.NONE,
                            new Insets(0, 0, 0, 0), 0, 0));
                        panel2.add(ETC, new GridBagConstraints(2, 7, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //---- label9 ----
                        label9.setText(bundle.getString("label9.text_2"));
                        label9.setBorder(new EmptyBorder(5, 5, 5, 5));
                        label9.setForeground(Color.black);
                        label9.setBackground(Color.white);
                        label9.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
                        panel2.add(label9, new GridBagConstraints(1, 8, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.NONE,
                            new Insets(0, 0, 0, 0), 0, 0));
                        panel2.add(ETD, new GridBagConstraints(2, 8, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //---- label11 ----
                        label11.setText(bundle.getString("label11.text_2"));
                        label11.setBorder(new EmptyBorder(5, 5, 5, 5));
                        label11.setForeground(Color.black);
                        label11.setBackground(Color.white);
                        label11.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
                        panel2.add(label11, new GridBagConstraints(1, 9, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.NONE,
                            new Insets(0, 0, 0, 0), 0, 0));
                        panel2.add(Gate, new GridBagConstraints(2, 9, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //---- label12 ----
                        label12.setText(bundle.getString("label12.text"));
                        label12.setBorder(new EmptyBorder(5, 5, 5, 5));
                        label12.setForeground(Color.black);
                        label12.setBackground(Color.white);
                        label12.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
                        panel2.add(label12, new GridBagConstraints(1, 10, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.NONE,
                            new Insets(0, 0, 0, 0), 0, 0));
                        panel2.add(Seat, new GridBagConstraints(2, 10, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));
                    }
                    panel4.add(panel2, BorderLayout.CENTER);
                }
                contentPanel.add(panel4);
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setOpaque(false);
                buttonBar.setPreferredSize(new Dimension(254, 90));
                buttonBar.setLayout(new GridLayout());

                //---- PrintButton ----
                PrintButton.setText(bundle.getString("PrintButton.text_2"));
                PrintButton.addActionListener(e -> {
                    try {
                        printThenBag(e);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                });
                buttonBar.add(PrintButton);

                //---- cancelButton ----
                cancelButton.setText(bundle.getString("cancelButton.text_12"));
                cancelButton.addActionListener(e -> Back2Confirm(e));
                buttonBar.add(cancelButton);

                //---- button1 ----
                button1.setText(bundle.getString("button1.text_4"));
                button1.addActionListener(e -> error(e));
                buttonBar.add(button1);
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(900, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        setBackground();
        writeInBoardingPass();
//        Utils.newPsnFile();

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel dialogPane;
    private JPanel panel1;
    private JButton button2;
    private JButton button3;
    private JPanel contentPanel;
    private JPanel panel4;
    private JPanel panel2;
    private JLabel label1;
    private JLabel label3;
    private JLabel label2;
    private JTextField BookNum;
    private JLabel label10;
    private JTextField Surname;
    private JLabel label4;
    private JTextField IDNum;
    private JLabel label5;
    private JTextField Depar;
    private JLabel label6;
    private JTextField Desti;
    private JLabel label7;
    private JTextField ETA;
    private JLabel label8;
    private JTextField ETC;
    private JLabel label9;
    private JTextField ETD;
    private JLabel label11;
    private JTextField Gate;
    private JLabel label12;
    private JTextField Seat;
    private JPanel buttonBar;
    private JButton PrintButton;
    private JButton cancelButton;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) throws Exception {


        new PrintFlight_6().setVisible(true);
    }
}
