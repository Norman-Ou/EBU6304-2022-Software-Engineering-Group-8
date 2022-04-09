package PassengerGUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.CaretEvent;
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
        // TODO add your code here
        dispose();
        new Error().setVisible(true);
    }

    private void confirm1B(ActionEvent e) {
        // TODO add your code here
        dispose();
        //dialogPane.setVisible(true);
        new SeatFirst_ac5().setVisible(true);
    }

    private void Back2Init(ActionEvent e) {
        dispose();
        new CheckIn_3().setVisible(true);
    }
    

    private void FlightCaretUpdate(CaretEvent e) {
        // TODO add your code here
        //e.getSource();
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
        label1 = new JLabel();
        textField1 = new JTextField();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder
            ( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder. CENTER, javax. swing. border
            . TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ), java. awt
            . Color. red) ,dialogPane. getBorder( )) ); dialogPane. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void
            propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .getPropertyName () )) throw new RuntimeException( )
            ; }} );
            dialogPane.setLayout(new BorderLayout());

            //======== panel1 ========
            {
                panel1.setLayout(new BorderLayout());

                //======== panel2 ========
                {
                    panel2.setLayout(new BorderLayout());

                    //---- button3 ----
                    button3.setText(bundle.getString("button3.text_3"));
                    button3.addActionListener(e -> confirm1B(e));
                    panel2.add(button3, BorderLayout.CENTER);

                    //---- button2 ----
                    button2.setText(bundle.getString("button2.text_5"));
                    button2.addActionListener(e -> Back2Init(e));
                    panel2.add(button2, BorderLayout.EAST);

                    //---- button1 ----
                    button1.setText(bundle.getString("button1.text_7"));
                    button1.addActionListener(e -> ErrorPage(e));
                    panel2.add(button1, BorderLayout.WEST);
                }
                panel1.add(panel2, BorderLayout.SOUTH);
            }
            dialogPane.add(panel1, BorderLayout.SOUTH);

            //---- label1 ----
            label1.setText(bundle.getString("label1.text_2"));
            label1.setFont(new Font("Lucida Grande", Font.BOLD, 14));
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            dialogPane.add(label1, BorderLayout.NORTH);

            //---- textField1 ----
            textField1.setEditable(false);
            textField1.addCaretListener(e -> FlightCaretUpdate(e));
            dialogPane.add(textField1, BorderLayout.CENTER);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(425, 325);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel dialogPane;
    private JPanel panel1;
    private JPanel panel2;
    private JButton button3;
    private JButton button2;
    private JButton button1;
    private JLabel label1;
    private JTextField textField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

}
