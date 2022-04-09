package PassengerGUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ResourceBundle;
/*
 * Created by JFormDesigner on Tue Mar 29 18:56:09 CST 2022
 */



/**
 * @author Jiayi Wang
 */
public class Meal_12 extends JFrame {
    public Meal_12() {
        initComponents();
    }

    private void Normal(ActionEvent e) {
        dispose();
        new MealNorm_13().setVisible(true);
    }

    private void VIPMeal(ActionEvent e) {
        dispose();
        new MealAdd_14().setVisible(true);
    }

    private void cancelMeal(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Confirm cancel your meal?","Cancel meal check", JOptionPane.WARNING_MESSAGE);
        dispose();
        new exit_16().setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        ResourceBundle bundle = ResourceBundle.getBundle("Check");
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        panel2 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        panel1 = new JPanel();
        label1 = new JLabel();
        panel3 = new JPanel();

        //======== this ========
        setBackground(new Color(51, 153, 255));
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (
            new javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion"
            , javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM
            , new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 )
            , java. awt. Color. red) ,dialogPane. getBorder( )) ); dialogPane. addPropertyChangeListener (
            new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
            ) {if ("bord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( )
            ; }} );
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(new GridLayout(0, 1));

                //======== panel2 ========
                {
                    panel2.setLayout(new GridLayout());

                    //---- button1 ----
                    button1.setText(bundle.getString("button1.text_3"));
                    button1.addActionListener(e -> Normal(e));
                    panel2.add(button1);

                    //---- button2 ----
                    button2.setText(bundle.getString("button2.text_3"));
                    button2.addActionListener(e -> VIPMeal(e));
                    panel2.add(button2);

                    //---- button3 ----
                    button3.setText(bundle.getString("button3.text_2"));
                    button3.addActionListener(e -> cancelMeal(e));
                    panel2.add(button3);
                }
                contentPanel.add(panel2);
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== panel1 ========
            {
                panel1.setLayout(new BorderLayout());

                //---- label1 ----
                label1.setText(bundle.getString("label1.text_11"));
                label1.setHorizontalAlignment(SwingConstants.CENTER);
                label1.setFont(new Font("Lucida Grande", Font.BOLD, 22));
                label1.setForeground(UIManager.getColor("Button.select"));
                panel1.add(label1, BorderLayout.CENTER);

                //======== panel3 ========
                {
                    panel3.setLayout(new BorderLayout());
                }
                panel1.add(panel3, BorderLayout.SOUTH);
            }
            dialogPane.add(panel1, BorderLayout.NORTH);
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
    private JPanel panel2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JPanel panel1;
    private JLabel label1;
    private JPanel panel3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
