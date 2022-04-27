package CheckIn.GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ResourceBundle;
import javax.swing.table.*;
/*
 * Created by JFormDesigner on Tue Mar 29 16:44:21 CST 2022
 */



/**
 * @author Jiayi Wang
 */
public class ConfirmPage_4 extends JFrame {
    public ConfirmPage_4() {
        initComponents();
    }

    private void ErrorPage(ActionEvent e) {
        dispose();
        new Error().setVisible(true);
    }

    private void confirm1B(ActionEvent e) {
        dispose();
        new SeatFirst_ac5().setVisible(true);
    }

    private void Back2Init(ActionEvent e) {
        dispose();
        new CheckIn_3().setVisible(true);
    }
    public void init() {
        ImageIcon background = new ImageIcon("src/main/resources/img.png");
        JLabel label3 = new JLabel(background);
        label3.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());
        JPanel myPanel = (JPanel)this.getContentPane();
        myPanel.setOpaque(false);
//        myPanel.setLayout(new FlowLayout());
//        this.getLayeredPane().setLayout(null);
        this.getLayeredPane().add(label3, new Integer(Integer.MIN_VALUE));
        this.setTitle("Passenger check-in system");
//        this.setBounds(300, 300, background.getIconWidth(), background.getIconHeight());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


    public void info(){
        if(EnterBN.getPsnTemp()==null){
            try{
                BookNum.setText(EnterOther.getPsnTemp1().getBookNumber());
                Surname.setText(EnterOther.getPsnTemp1().getSurName());
                IDNum.setText(EnterOther.getPsnTemp1().getPassengerId());
                Depar.setText(EnterOther.getPsnTemp1().getBoardingPass().getDeparture());
                Desti.setText(EnterOther.getPsnTemp1().getBoardingPass().getDestination());
                ETA.setText(EnterOther.getPsnTemp1().getBoardingPass().getETA());
                ETC.setText(EnterOther.getPsnTemp1().getBoardingPass().getETC());
                ETD.setText(EnterOther.getPsnTemp1().getBoardingPass().getETD());
                Gate.setText(EnterOther.getPsnTemp1().getBoardingPass().getGate());
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        else if(EnterOther.getPsnTemp1()==null) {
            try {
                BookNum.setText(EnterBN.getPsnTemp().getBookNumber());
                Surname.setText(EnterBN.getPsnTemp().getSurName());
                IDNum.setText(EnterBN.getPsnTemp().getPassengerId());
                Depar.setText(EnterBN.getPsnTemp().getBoardingPass().getDeparture());
                Desti.setText(EnterBN.getPsnTemp().getBoardingPass().getDestination());
                ETA.setText(EnterBN.getPsnTemp().getBoardingPass().getETA());
                ETC.setText(EnterBN.getPsnTemp().getBoardingPass().getETC());
                ETD.setText(EnterBN.getPsnTemp().getBoardingPass().getETD());
                Gate.setText(EnterBN.getPsnTemp().getBoardingPass().getGate());
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }else{
            try{
//                FirstConfirm.setText(
//                        EnterOther.getPsnTemp2().getBoardingPass().toString());
                BookNum.setText(EnterOther.getPsnTemp2().getBookNumber());
                Surname.setText(EnterOther.getPsnTemp2().getSurName());
                IDNum.setText(EnterOther.getPsnTemp2().getPassengerId());
                Depar.setText(EnterOther.getPsnTemp2().getBoardingPass().getDeparture());
                Desti.setText(EnterOther.getPsnTemp2().getBoardingPass().getDestination());
                ETA.setText(EnterOther.getPsnTemp2().getBoardingPass().getETA());
                ETC.setText(EnterOther.getPsnTemp2().getBoardingPass().getETC());
                ETD.setText(EnterOther.getPsnTemp2().getBoardingPass().getETD());
                Gate.setText(EnterOther.getPsnTemp2().getBoardingPass().getGate());
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }

    private void showInitialInfo(ActionEvent e) {
        info();
    }

    private void initComponents() {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Gabirella
        ResourceBundle bundle = ResourceBundle.getBundle("Check");
        dialogPane = new JPanel();
        ButtonPanel = new JPanel();
        panel2 = new JPanel();
        button3 = new JButton();
        button2 = new JButton();
        button1 = new JButton();
        panel4 = new JPanel();
        panel1 = new JPanel();
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
        panel3 = new JPanel();
        onfirm = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setOpaque(false);
            dialogPane.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .EmptyBorder ( 0
            , 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax. swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM
            , new java. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,java . awt. Color .red ) ,
            dialogPane. getBorder () ) ); dialogPane. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e
            ) { if( "\u0062ord\u0065r" .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );
            dialogPane.setLayout(new BorderLayout());

            //======== ButtonPanel ========
            {
                ButtonPanel.setLayout(new BorderLayout());

                //======== panel2 ========
                {
                    panel2.setOpaque(false);
                    panel2.setLayout(new FlowLayout());

                    //---- button3 ----
                    button3.setText(bundle.getString("button3.text_3"));
                    button3.addActionListener(e -> confirm1B(e));
                    panel2.add(button3);

                    //---- button2 ----
                    button2.setText(bundle.getString("button2.text_5"));
                    button2.addActionListener(e -> Back2Init(e));
                    panel2.add(button2);

                    //---- button1 ----
                    button1.setText(bundle.getString("button1.text_7"));
                    button1.addActionListener(e -> ErrorPage(e));
                    panel2.add(button1);
                }
                ButtonPanel.add(panel2, BorderLayout.SOUTH);

                //======== panel4 ========
                {
                    panel4.setLayout(new BorderLayout());

                    //======== panel1 ========
                    {
                        panel1.setOpaque(false);
                        panel1.setLayout(new GridBagLayout());
                        ((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {0, 179, 0, 0, 0, 0};
                        ((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {36, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                        ((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0, 0.0, 0.0, 1.0E-4};
                        ((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

                        //---- label1 ----
                        label1.setText(bundle.getString("label1.text_2"));
                        label1.setHorizontalAlignment(SwingConstants.CENTER);
                        label1.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 16));
                        panel1.add(label1, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //---- label3 ----
                        label3.setText(bundle.getString("label3.text_2"));
                        label3.setHorizontalAlignment(SwingConstants.CENTER);
                        label3.setIcon(null);
                        label3.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 18));
                        panel1.add(label3, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //---- label2 ----
                        label2.setText(bundle.getString("label2.text_5"));
                        label2.setBorder(new EmptyBorder(5, 5, 5, 5));
                        panel1.add(label2, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));
                        panel1.add(BookNum, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //---- label10 ----
                        label10.setText(bundle.getString("label10.text"));
                        label10.setBorder(new EmptyBorder(5, 5, 5, 5));
                        panel1.add(label10, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));
                        panel1.add(Surname, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //---- label4 ----
                        label4.setText(bundle.getString("label4.text"));
                        label4.setBorder(new EmptyBorder(5, 5, 5, 5));
                        panel1.add(label4, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));
                        panel1.add(IDNum, new GridBagConstraints(2, 4, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //---- label5 ----
                        label5.setText(bundle.getString("label5.text_2"));
                        label5.setBorder(new EmptyBorder(5, 5, 5, 5));
                        panel1.add(label5, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));
                        panel1.add(Depar, new GridBagConstraints(2, 5, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //---- label6 ----
                        label6.setText(bundle.getString("label6.text_2"));
                        label6.setBorder(new EmptyBorder(5, 5, 5, 5));
                        panel1.add(label6, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));
                        panel1.add(Desti, new GridBagConstraints(2, 6, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //---- label7 ----
                        label7.setText(bundle.getString("label7.text_2"));
                        label7.setBorder(new EmptyBorder(5, 5, 5, 5));
                        panel1.add(label7, new GridBagConstraints(1, 7, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));
                        panel1.add(ETA, new GridBagConstraints(2, 7, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //---- label8 ----
                        label8.setText(bundle.getString("label8.text_2"));
                        label8.setBorder(new EmptyBorder(5, 5, 5, 5));
                        panel1.add(label8, new GridBagConstraints(1, 8, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));
                        panel1.add(ETC, new GridBagConstraints(2, 8, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //---- label9 ----
                        label9.setText(bundle.getString("label9.text"));
                        label9.setBorder(new EmptyBorder(5, 5, 5, 5));
                        panel1.add(label9, new GridBagConstraints(1, 9, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));
                        panel1.add(ETD, new GridBagConstraints(2, 9, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));

                        //---- label11 ----
                        label11.setText(bundle.getString("label11.text"));
                        label11.setBorder(new EmptyBorder(5, 5, 5, 5));
                        panel1.add(label11, new GridBagConstraints(1, 10, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));
                        panel1.add(Gate, new GridBagConstraints(2, 10, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));
                    }
                    panel4.add(panel1, BorderLayout.CENTER);
                }
                ButtonPanel.add(panel4, BorderLayout.CENTER);
            }
            dialogPane.add(ButtonPanel, BorderLayout.CENTER);

            //======== panel3 ========
            {
                panel3.setLayout(new BorderLayout());
            }
            dialogPane.add(panel3, BorderLayout.SOUTH);

            //---- onfirm ----
            onfirm.setText(bundle.getString("onfirm.text_3"));
            onfirm.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 22));
            onfirm.addActionListener(e -> showInitialInfo(e));
            dialogPane.add(onfirm, BorderLayout.NORTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(900, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        //Read input passenger

        init();}

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Gabirella
    private JPanel dialogPane;
    private JPanel ButtonPanel;
    private JPanel panel2;
    private JButton button3;
    private JButton button2;
    private JButton button1;
    private JPanel panel4;
    private JPanel panel1;
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
    private JPanel panel3;
    private JButton onfirm;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

}
