package PassengerGUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.util.ResourceBundle;
/*
 * Created by JFormDesigner on Tue Mar 29 21:14:55 CST 2022
 */



/**
 * @author Jiayi Wang
 */
public class MealAdd_14 extends JFrame {
    public MealAdd_14() {
        initComponents();
    }

    private void pay(ActionEvent e) {
        dispose();
        new MealPay_15().setVisible(true);
    }

    private void tabbedPane2StateChanged(ChangeEvent e) {
        JTabbedPane tabbedPane = (JTabbedPane) e.getSource();
        int selectedIndex = tabbedPane.getSelectedIndex();
        switch (selectedIndex) {
            case 0:
                System.out.println("Chinese");
                break;
            case 1:
                System.out.println("Western");
                break;
        }
    }

    private void MealPay(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Make sure your are in a safe payment environment","Safe pay", JOptionPane.WARNING_MESSAGE);
        dispose();
        new MealPay_15().setVisible(true);
    }

    private void Back2Meal(ActionEvent e) {
        dispose();
        new Meal_12().setVisible(true);
    }

    private void AMeal(FocusEvent e) {
        // TODO add your code here
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        ResourceBundle bundle = ResourceBundle.getBundle("Check");
        dialogPane = new JPanel();
        panel1 = new JPanel();
        label1 = new JLabel();
        panel3 = new JPanel();
        label2 = new JLabel();
        panel6 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        tabbedPane2 = new JTabbedPane();
        label4 = new JLabel();
        label3 = new JLabel();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .
            EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmDes\u0069gner \u0045valua\u0074ion" , javax. swing .border . TitledBorder. CENTER ,javax . swing
            . border .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069alog", java .awt . Font. BOLD ,12 ) ,
            java . awt. Color .red ) ,dialogPane. getBorder () ) ); dialogPane. addPropertyChangeListener( new java. beans .PropertyChangeListener ( )
            { @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062order" .equals ( e. getPropertyName () ) )
            throw new RuntimeException( ) ;} } );
            dialogPane.setLayout(new BorderLayout());

            //======== panel1 ========
            {
                panel1.setLayout(new BorderLayout());

                //---- label1 ----
                label1.setText(bundle.getString("label1.text_20"));
                label1.setHorizontalAlignment(SwingConstants.CENTER);
                label1.setFont(new Font("Lucida Grande", Font.BOLD, 23));
                panel1.add(label1, BorderLayout.CENTER);

                //======== panel3 ========
                {
                    panel3.setLayout(new BorderLayout());

                    //---- label2 ----
                    label2.setText(bundle.getString("label2.text_3"));
                    label2.setFont(new Font("Lucida Grande", Font.BOLD, 16));
                    label2.setHorizontalAlignment(SwingConstants.CENTER);
                    panel3.add(label2, BorderLayout.CENTER);
                }
                panel1.add(panel3, BorderLayout.SOUTH);
            }
            dialogPane.add(panel1, BorderLayout.NORTH);

            //======== panel6 ========
            {
                panel6.setLayout(new BorderLayout());

                //---- button1 ----
                button1.setText(bundle.getString("button1.text_9"));
                button1.addActionListener(e -> MealPay(e));
                panel6.add(button1, BorderLayout.WEST);

                //---- button2 ----
                button2.setText(bundle.getString("button2.text_4"));
                button2.addActionListener(e -> Back2Meal(e));
                panel6.add(button2, BorderLayout.EAST);
            }
            dialogPane.add(panel6, BorderLayout.SOUTH);

            //======== tabbedPane2 ========
            {
                tabbedPane2.addChangeListener(e -> tabbedPane2StateChanged(e));

                //---- label4 ----
                label4.setText(bundle.getString("label4.text_2"));
                label4.setHorizontalAlignment(SwingConstants.CENTER);
                tabbedPane2.addTab(bundle.getString("label4.tab.title"), label4);

                //---- label3 ----
                label3.setText(bundle.getString("label3.text_3"));
                label3.setHorizontalAlignment(SwingConstants.CENTER);
                tabbedPane2.addTab(bundle.getString("label3.tab.title"), label3);
            }
            dialogPane.add(tabbedPane2, BorderLayout.CENTER);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(420, 325);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

    }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel dialogPane;
    private JPanel panel1;
    private JLabel label1;
    private JPanel panel3;
    private JLabel label2;
    private JPanel panel6;
    private JButton button1;
    private JButton button2;
    private JTabbedPane tabbedPane2;
    private JLabel label4;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
