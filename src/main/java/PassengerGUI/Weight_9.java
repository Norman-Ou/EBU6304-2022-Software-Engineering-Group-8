package PassengerGUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ResourceBundle;
/*
 * Created by JFormDesigner on Tue Mar 29 18:42:43 CST 2022
 */



/**
 * @author Jiayi Wang
 */
public class Weight_9 extends JFrame {
    public Weight_9() {
        initComponents();
    }

    private void PrintBag(ActionEvent e) {
        dispose();
        new PrintBag_11().setVisible(true);
    }

    private void AddBag(ActionEvent e) {
        dispose();
        new BaggageAdd_10().setVisible(true);
    }

    private void Back2Bag(ActionEvent e) {
        dispose();
        new Baggage_7().setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        ResourceBundle bundle = ResourceBundle.getBundle("Check");
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        label3 = new JLabel();
        label4 = new JLabel();
        panel1 = new JPanel();
        button4 = new JButton();
        button3 = new JButton();
        button2 = new JButton();
        label1 = new JLabel();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border.
            EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border. TitledBorder. CENTER, javax. swing
            . border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ),
            java. awt. Color. red) ,dialogPane. getBorder( )) ); dialogPane. addPropertyChangeListener (new java. beans. PropertyChangeListener( )
            { @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .equals (e .getPropertyName () ))
            throw new RuntimeException( ); }} );
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(new GridLayout(0, 1));

                //---- label3 ----
                label3.setText(bundle.getString("label3.text"));
                label3.setHorizontalAlignment(SwingConstants.CENTER);
                contentPanel.add(label3);

                //---- label4 ----
                label4.setText(bundle.getString("label4.text"));
                contentPanel.add(label4);

                //======== panel1 ========
                {
                    panel1.setLayout(new GridLayout());

                    //---- button4 ----
                    button4.setText(bundle.getString("button4.text"));
                    button4.addActionListener(e -> PrintBag(e));
                    panel1.add(button4);

                    //---- button3 ----
                    button3.setText(bundle.getString("button3.text"));
                    button3.addActionListener(e -> AddBag(e));
                    panel1.add(button3);

                    //---- button2 ----
                    button2.setText(bundle.getString("button2.text_2"));
                    button2.addActionListener(e -> Back2Bag(e));
                    panel1.add(button2);
                }
                contentPanel.add(panel1);
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //---- label1 ----
            label1.setText(bundle.getString("label1.text_9"));
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setFont(new Font("Lucida Grande", Font.BOLD, 30));
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
    private JLabel label3;
    private JLabel label4;
    private JPanel panel1;
    private JButton button4;
    private JButton button3;
    private JButton button2;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
