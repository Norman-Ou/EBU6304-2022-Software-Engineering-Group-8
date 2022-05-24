package CheckIn.GUI;

import Beans.Passenger.Passenger;
import DataBase.pDB;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ResourceBundle;
/*
 * Created by JFormDesigner on Tue Mar 29 21:17:26 CST 2022
 */



/**
 * @author Jiayi Wang
 */
public class MealPay_15 extends JFrame {
    private static int seatFee=0;
    public MealPay_15() {

        if(Seat_1_6.upgrade||Seat_3_6.upgrade||MealAdd_14.mealState){
        initComponents();}
    }

    private void exit(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Thanks for using. Enjoy your flight!","Goodbye", JOptionPane.QUESTION_MESSAGE);
        dispose();
        new Exit().setVisible(true);
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
        if(Seat_1_6.upgrade){
            seatFee=100;
        }else if(Seat_3_6.upgrade){
            seatFee=100;
        }
        JOptionPane.showMessageDialog(null, "You have payed "+MealAdd_14.price+" for your Meal: "+getMealTemp()+" and "+seatFee+" for a VIP seat"+". Click confirm for exiting.","Safe pay for meal.", JOptionPane.QUESTION_MESSAGE);
        dispose();
        new Exit().setVisible(true);
    }
    private void BackMeal(ActionEvent e) {
        dispose();
        new Meal_12().setVisible(true);
    }
    private void payAdMeal(ActionEvent e) {
        if(MealAdd_14.VIPmealSelected==null){
            setMealTemp(MealNorm_13.mealSelected);
        }else{
            setMealTemp(MealAdd_14.VIPmealSelected);
        }
        if(Seat_1_6.upgrade){
            seatFee=100;
        }else if(Seat_3_6.upgrade){
            seatFee=100;
        }
        JOptionPane.showMessageDialog(null, "You have payed "+MealAdd_14.price+" for your Meal: "+getMealTemp()+" and "+seatFee+" for a VIP seat"+". Enjoy your flight!","Goodbye.", JOptionPane.QUESTION_MESSAGE);
        dispose();
        new Exit().setVisible(true);
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
    public void credit(){
        Passenger psn = pDB.loadPassengerByBookingNo(EnterBN_3.getPsnTemp().getBookNumber());
//        EnterBN_3.getPsnTemp().getBookNumber();
        //TODO get credit information
        String creditInfo = "Your credit card number:"+psn.getCreditCard().getCardNo();
        textField1.setText(creditInfo);
    }

    private void help(ActionEvent e) {
        dispose();
        new Error().setVisible(true);
    }

    private void initComponents() {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Gabirella Cambridge
        ResourceBundle bundle = ResourceBundle.getBundle("Check");
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        button1 = new JButton();
        button3 = new JButton();
        textField1 = new JTextField();
        buttonBar = new JPanel();
        button2 = new JButton();
        okButton = new JButton();
        cancelButton = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setOpaque(false);
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax.
            swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border
            . TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog"
            ,java .awt .Font .BOLD ,12 ), java. awt. Color. red) ,dialogPane. getBorder
            ( )) ); dialogPane. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java
            .beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .getPropertyName () )) throw new RuntimeException
            ( ); }} );
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setOpaque(false);
                contentPanel.setLayout(new GridLayout());

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

                            //---- button1 ----
                            button1.setText(bundle.getString("button1.text_20"));
                            button1.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 28));
                            button1.addActionListener(e -> payAdMeal(e));
                            panel3.add(button1, BorderLayout.CENTER);

                            //---- button3 ----
                            button3.setText(bundle.getString("button3.text_14"));
                            button3.addActionListener(e -> help(e));
                            panel3.add(button3, BorderLayout.EAST);
                        }
                        panel2.add(panel3, BorderLayout.NORTH);

                        //---- textField1 ----
                        textField1.setHorizontalAlignment(SwingConstants.CENTER);
                        panel2.add(textField1, BorderLayout.CENTER);
                    }
                    panel1.add(panel2, BorderLayout.CENTER);
                }
                contentPanel.add(panel1);
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setOpaque(false);
                buttonBar.setPreferredSize(new Dimension(260, 90));
                buttonBar.setLayout(new GridLayout());

                //---- button2 ----
                button2.setText(bundle.getString("button2.text_17"));
                button2.addActionListener(e -> payMeal(e));
                buttonBar.add(button2);

                //---- okButton ----
                okButton.setText(bundle.getString("okButton.text_6"));
                okButton.addActionListener(e -> exit(e));
                buttonBar.add(okButton);

                //---- cancelButton ----
                cancelButton.setText(bundle.getString("cancelButton.text_13"));
                cancelButton.addActionListener(e -> BackMeal(e));
                buttonBar.add(cancelButton);
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(900, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        credit();
        init();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Gabirella Cambridge
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JButton button1;
    private JButton button3;
    private JTextField textField1;
    private JPanel buttonBar;
    private JButton button2;
    private JButton okButton;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
