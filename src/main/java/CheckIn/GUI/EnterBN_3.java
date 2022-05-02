/*
 * Created by JFormDesigner on Sat Apr 16 09:22:14 CST 2022
 */

package CheckIn.GUI;

import DataBase.pDB;
import Beans.Flight.Flight;
import Beans.Passenger.Passenger;
import CheckIn.Monitor.cMonitors;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;

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
    private void ok(ActionEvent e) {
        new ConfirmPage_3().setVisible(true);
        dispose();

        String str=textArea1.getText();
        this.bookNum=str;
//        System.out.println(bookNum);
        Flight flt = cMonitors.getFlightByBookingNo(bookNum);
        Passenger psn = pDB.loadPassengerByBookingNo(bookNum);
//        System.out.println(psn);
        fltTemp=flt;
        psnTemp=psn;
    }
    public static Passenger getPsnTemp() {
        try{
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
        textArea1 = new JTextArea();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane2 ========
        {
            dialogPane2.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane2.setOpaque(false);
            dialogPane2.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder
            (0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax.swing.border.TitledBorder.CENTER,javax.swing.border
            .TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),java.awt
            .Color.red),dialogPane2. getBorder()));dialogPane2. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void
            propertyChange(java.beans.PropertyChangeEvent e){if("bord\u0065r".equals(e.getPropertyName()))throw new RuntimeException()
            ;}});
            dialogPane2.setLayout(new BorderLayout());

            //======== buttonBar2 ========
            {
                buttonBar2.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar2.setOpaque(false);
                buttonBar2.setLayout(new FlowLayout());

                //---- okButton2 ----
                okButton2.setText(bundle.getString("okButton2.text_4"));
                okButton2.addActionListener(e -> ok(e));
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

            //---- label1 ----
            label1.setText(bundle.getString("label1.text_30"));
            label1.setFont(new Font(".AppleSystemUIFont", Font.BOLD | Font.ITALIC, 25));
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            dialogPane2.add(label1, BorderLayout.NORTH);

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(textArea1);
            }
            dialogPane2.add(scrollPane1, BorderLayout.CENTER);
        }
        contentPane.add(dialogPane2, BorderLayout.CENTER);
        setSize(900, 550);
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
    private JTextArea textArea1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

}
