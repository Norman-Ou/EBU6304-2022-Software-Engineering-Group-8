package PassengerGUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ResourceBundle;
/*
 * Created by JFormDesigner on Tue Mar 29 20:16:17 CST 2022
 */



/**
 * @author Jiayi Wang
 */
public class Baggage_7 extends JFrame {
    public Baggage_7() {
        initComponents();
    }

    private void weight(ActionEvent e) {
        // TODO add your code here
        dispose();
        new Weight_9().setVisible(true);
    }

    private void storeBaggage(ActionEvent e) {
        // TODO add your code here
        dispose();
        new BagStore_8().setVisible(true);
    }

    private void BagAdd(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Confirm more payment for baggage?","Baggage extra payment check", JOptionPane.WARNING_MESSAGE);
        dispose();
        new BaggageAdd_10().setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        ResourceBundle bundle = ResourceBundle.getBundle("Check");
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        button2 = new JButton();
        button1 = new JButton();
        button3 = new JButton();
        label1 = new JLabel();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder (
            new javax . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn"
            , javax. swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM
            , new java. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 )
            ,java . awt. Color .red ) ,dialogPane. getBorder () ) ); dialogPane. addPropertyChangeListener(
            new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e
            ) { if( "\u0062ord\u0065r" .equals ( e. getPropertyName () ) )throw new RuntimeException( )
            ;} } );
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(new GridLayout());

                //---- button2 ----
                button2.setText(bundle.getString("button2.text_6"));
                button2.addActionListener(e -> weight(e));
                contentPanel.add(button2);

                //---- button1 ----
                button1.setText(bundle.getString("button1.text_15"));
                button1.addActionListener(e -> BagAdd(e));
                contentPanel.add(button1);

                //---- button3 ----
                button3.setText(bundle.getString("button3.text_4"));
                button3.addActionListener(e -> storeBaggage(e));
                contentPanel.add(button3);
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //---- label1 ----
            label1.setText(bundle.getString("label1.text_16"));
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setFont(new Font("Lucida Grande", Font.BOLD, 28));
            dialogPane.add(label1, BorderLayout.NORTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(425, 325);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JButton button2;
    private JButton button1;
    private JButton button3;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


}
