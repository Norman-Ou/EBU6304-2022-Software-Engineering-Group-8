/*
 * Created by JFormDesigner on Sat Apr 16 09:14:50 CST 2022
 */

package PassengerGUI;

import DataBase.pDB;
import Passenger.IDDocument.IDDocument;
import Passenger.Passenger;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Jiayi Wang
 */
public class EnterOther extends JFrame {
    public EnterOther() {
        initComponents();
    }

    public String IDNum;
    public String surname;
    public static Passenger psnTemp1;
    private void ok(ActionEvent e) throws Exception {
        new ConfirmPage_4().setVisible(true);
        dispose();
        this.IDNum=textArea3.getText();
        this.surname=textArea4.getText();
//        System.out.println(bookNum);
        Passenger psn = pDB.loadPassengerBySurname_ID(surname,IDNum);
//        System.out.println(psn);
        psnTemp1=psn;
    }
    public static Passenger getPsnTemp1() {
//        System.out.println(psnTemp1);
        return psnTemp1;
    }

    public static Passenger getPsnTemp2() {
        //Scan a passenger
        return psnTemp1;
    }
    private void cancel(ActionEvent e) {
        new Airline_1().setVisible(true);
        dispose();
    }

    private void textArea1CaretUpdate(ItemEvent e) {
        String sur =(e.getItem()).toString();
        System.out.println(sur);
    }

    private void scanID(ActionEvent e) {
        new ConfirmPage_4().setVisible(true);
        dispose();
        IDDocument id = new IDDocument("215200","orz");
//        System.out.println(bookNum);
        this.IDNum=id.getID();
        this.surname=id.getSurname();
        Passenger psn = new Passenger();
//        System.out.println(psn);
        psnTemp1=psn;

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

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        ResourceBundle bundle = ResourceBundle.getBundle("Check");
        dialogPane2 = new JPanel();
        buttonBar2 = new JPanel();
        okButton2 = new JButton();
        button1 = new JButton();
        cancelButton2 = new JButton();
        label1 = new JLabel();
        scrollPane1 = new JScrollPane();
        panel1 = new JPanel();
        textArea4 = new JTextArea();
        textArea3 = new JTextArea();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane2 ========
        {
            dialogPane2.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane2.setOpaque(false);
            dialogPane2.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax
            . swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e", javax. swing
            . border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .
            Font ("Dialo\u0067" ,java .awt .Font .BOLD ,12 ), java. awt. Color. red
            ) ,dialogPane2. getBorder( )) ); dialogPane2. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override
            public void propertyChange (java .beans .PropertyChangeEvent e) {if ("borde\u0072" .equals (e .getPropertyName (
            ) )) throw new RuntimeException( ); }} );
            dialogPane2.setLayout(new BorderLayout());

            //======== buttonBar2 ========
            {
                buttonBar2.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar2.setOpaque(false);
                buttonBar2.setLayout(new FlowLayout());

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

            //---- label1 ----
            label1.setText(bundle.getString("label1.text_29"));
            label1.setFont(new Font(".AppleSystemUIFont", Font.BOLD | Font.ITALIC, 20));
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            dialogPane2.add(label1, BorderLayout.NORTH);

            //======== scrollPane1 ========
            {
                scrollPane1.setOpaque(false);

                //======== panel1 ========
                {
                    panel1.setLayout(new GridLayout());

                    //---- textArea4 ----
                    textArea4.setToolTipText("Surname");
                    textArea4.setBorder(new TitledBorder(bundle.getString("textArea4.border")));
                    panel1.add(textArea4);

                    //---- textArea3 ----
                    textArea3.setToolTipText("ID number");
                    textArea3.setBorder(new TitledBorder("ID number"));
                    panel1.add(textArea3);
                }
                scrollPane1.setViewportView(panel1);
            }
            dialogPane2.add(scrollPane1, BorderLayout.CENTER);
        }
        contentPane.add(dialogPane2, BorderLayout.CENTER);
        setSize(905, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        init();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel dialogPane2;
    private JPanel buttonBar2;
    private JButton okButton2;
    private JButton button1;
    private JButton cancelButton2;
    private JLabel label1;
    private JScrollPane scrollPane1;
    private JPanel panel1;
    private JTextArea textArea4;
    private JTextArea textArea3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private static Passenger psnTemp;

    public void searchBySur(ItemEvent e) {
        String surName =(e.getItem()).toString();
        Passenger psn = pDB.loadPassengerByBookingNo(surName);
        psnTemp=psn;
    }

    public static Passenger getPassenger(){
        return psnTemp;
    }
}
