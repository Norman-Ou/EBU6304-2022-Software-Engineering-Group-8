/*
 * Created by JFormDesigner on Sun Apr 17 17:17:13 CST 2022
 */

package CheckIn.GUI;

import Beans.Passenger.Passenger;
import DataBase.pDB;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Jiayi Wang
 */
public class CreditPage extends JFrame {
    public CreditPage() {
        initComponents();
    }

    private void paySeat(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "You have payed for your VIP seat. Click confirm for printing your boarding pass.","Safe pay for seat.", JOptionPane.QUESTION_MESSAGE);
        dispose();
        new PrintFlight_6().setVisible(true);
    }
    private String mealTemp="";
    public void setMealTemp(String str){
        this.mealTemp=str;
    }
    public String getMealTemp(){
        return this.mealTemp;
    }
    private void payMeal(ActionEvent e) {

        if(MealAdd_14.VIPmealSelected==null){
            setMealTemp(MealNorm_13.mealSelected);
        }else{
            setMealTemp(MealAdd_14.VIPmealSelected);
        }
        JOptionPane.showMessageDialog(null, "You have payed for your Meal: "+getMealTemp()+". Click confirm for exiting.","Safe pay for meal.", JOptionPane.QUESTION_MESSAGE);
        dispose();
        new Exit().setVisible(true);
    }

    private void back2Seat(ActionEvent e) {
        dispose();
        new SeatFirst_5().setVisible(true);
    }

    private void mealSecond(ActionEvent e) {
        dispose();
        new Meal_12().setVisible(true);
        // TODO delete used meal information in user's meal information list
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
        // Generated using JFormDesigner Evaluation license - Gabirella
        ResourceBundle bundle = ResourceBundle.getBundle("Check");
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        scrollPane2 = new JScrollPane();
        textArea2 = new JTextArea();
        show = new JButton();
        buttonBar2 = new JPanel();
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        button2 = new JButton();
        okButton = new JButton();
        panel4 = new JPanel();
        button1 = new JButton();
        mealSecond = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setOpaque(false);
            dialogPane.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new
            javax.swing.border.EmptyBorder(0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn",javax
            .swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java
            .awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),java.awt
            .Color.red),dialogPane. getBorder()));dialogPane. addPropertyChangeListener(new java.beans.
            PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062ord\u0065r".
            equals(e.getPropertyName()))throw new RuntimeException();}});
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setOpaque(false);
                contentPanel.setLayout(new BorderLayout());

                //======== scrollPane1 ========
                {
                    scrollPane1.setViewportView(textArea1);
                }
                contentPanel.add(scrollPane1, BorderLayout.CENTER);

                //======== scrollPane2 ========
                {

                    //---- textArea2 ----
                    textArea2.setText(bundle.getString("credirPageIntro.text"));
                    textArea2.setFont(new Font(Font.MONOSPACED, Font.BOLD, 13));
                    scrollPane2.setViewportView(textArea2);
                }
                contentPanel.add(scrollPane2, BorderLayout.NORTH);
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //---- show ----
            show.setText(bundle.getString("show.text_21"));
            show.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 20));
            dialogPane.add(show, BorderLayout.NORTH);

            //======== buttonBar2 ========
            {
                buttonBar2.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar2.setOpaque(false);
                buttonBar2.setLayout(new BorderLayout());

                //======== panel1 ========
                {
                    panel1.setOpaque(false);
                    panel1.setLayout(new BorderLayout());

                    //======== panel2 ========
                    {
                        panel2.setOpaque(false);
                        panel2.setLayout(new BorderLayout());

                        //======== panel3 ========
                        {
                            panel3.setOpaque(false);
                            panel3.setLayout(new BorderLayout());

                            //---- button2 ----
                            button2.setText(bundle.getString("button2.text_13"));
                            button2.addActionListener(e -> payMeal(e));
                            panel3.add(button2, BorderLayout.SOUTH);

                            //---- okButton ----
                            okButton.setText(bundle.getString("okButton.text_9"));
                            okButton.addActionListener(e -> paySeat(e));
                            panel3.add(okButton, BorderLayout.NORTH);
                        }
                        panel2.add(panel3, BorderLayout.NORTH);

                        //======== panel4 ========
                        {
                            panel4.setOpaque(false);
                            panel4.setLayout(new BorderLayout());

                            //---- button1 ----
                            button1.setText(bundle.getString("button1.text_21"));
                            button1.addActionListener(e -> back2Seat(e));
                            panel4.add(button1, BorderLayout.NORTH);

                            //---- mealSecond ----
                            mealSecond.setText(bundle.getString("mealSecond.text_13"));
                            mealSecond.addActionListener(e -> mealSecond(e));
                            panel4.add(mealSecond, BorderLayout.SOUTH);
                        }
                        panel2.add(panel4, BorderLayout.SOUTH);
                    }
                    panel1.add(panel2, BorderLayout.CENTER);
                }
                buttonBar2.add(panel1, BorderLayout.CENTER);
            }
            dialogPane.add(buttonBar2, BorderLayout.WEST);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(900, 555);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        Passenger psn = pDB.loadPassengerByBookingNo("2019200");

        //TODO get credit information
        String creditInfo = "Your credit card number:"+psn.getCreditCard().getCardNo();
        textArea1.setText(creditInfo);
        init();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Gabirella
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JScrollPane scrollPane2;
    private JTextArea textArea2;
    private JButton show;
    private JPanel buttonBar2;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JButton button2;
    private JButton okButton;
    private JPanel panel4;
    private JButton button1;
    private JButton mealSecond;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
