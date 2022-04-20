package CheckIn.GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ResourceBundle;
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
                FirstConfirm.setText(
                        EnterOther.getPsnTemp1().getBoardingPass().toString());
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }else if(EnterOther.getPsnTemp1()==null) {
            try {
                FirstConfirm.setText(
                        EnterBN.getPsnTemp().getBoardingPass().toString());
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }else{
            try{
                FirstConfirm.setText(
                        EnterOther.getPsnTemp2().getBoardingPass().toString());
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
        // Generated using JFormDesigner Evaluation license - unknown
        ResourceBundle bundle = ResourceBundle.getBundle("Check");
        dialogPane = new JPanel();
        panel1 = new JPanel();
        panel2 = new JPanel();
        button3 = new JButton();
        button2 = new JButton();
        button1 = new JButton();
        panel3 = new JPanel();
        onfirm = new JButton();
        scrollPane1 = new JScrollPane();
        FirstConfirm = new JTextArea();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setOpaque(false);
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new
            javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax
            . swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java
            .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ), java. awt
            . Color. red) ,dialogPane. getBorder( )) ); dialogPane. addPropertyChangeListener (new java. beans.
            PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .
            equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
            dialogPane.setLayout(new BorderLayout());

            //======== panel1 ========
            {
                panel1.setOpaque(false);
                panel1.setLayout(new BorderLayout());

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
                panel1.add(panel2, BorderLayout.SOUTH);
            }
            dialogPane.add(panel1, BorderLayout.SOUTH);

            //======== panel3 ========
            {
                panel3.setLayout(new BorderLayout());

                //---- onfirm ----
                onfirm.setText(bundle.getString("onfirm.text_3"));
                onfirm.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 22));
                onfirm.addActionListener(e -> showInitialInfo(e));
                panel3.add(onfirm, BorderLayout.NORTH);

                //======== scrollPane1 ========
                {
                    scrollPane1.setViewportView(FirstConfirm);
                }
                panel3.add(scrollPane1, BorderLayout.CENTER);
            }
            dialogPane.add(panel3, BorderLayout.CENTER);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(900, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        //Read input passenger


//        try{
//            Passenger psn2 = EnterOther.getPassenger();
//            textField1.setText(psn2.toString());
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        try{
//            Passenger psn3 = EnterOther.getPassenger();
//            textField1.setText(psn3.toString());
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        init();}

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel dialogPane;
    private JPanel panel1;
    private JPanel panel2;
    private JButton button3;
    private JButton button2;
    private JButton button1;
    private JPanel panel3;
    private JButton onfirm;
    private JScrollPane scrollPane1;
    private JTextArea FirstConfirm;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

}
