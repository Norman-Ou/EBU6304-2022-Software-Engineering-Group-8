package CheckIn.GUI;/*
 * Created by JFormDesigner on Wed Mar 30 11:36:13 CST 2022
 */

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ResourceBundle;

/**
 * @author Jiayi Wang
 */
public class PrintBag_11 extends JFrame {
    public PrintBag_11() {
        initComponents();
    }

    private void ToMeal(ActionEvent e) {
        dispose();
        new Meal_12().setVisible(true);
    }
    private void Return2Baggage(ActionEvent e) {
        dispose();
        new Baggage_7().setVisible(true);
    }
    private void showBagTag(ActionEvent e) {
        // TODO print baggage tag
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
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        textField1 = new JTextField();
        panel2 = new JPanel();
        button3 = new JButton();
        panel3 = new JPanel();
        button2 = new JButton();
        button1 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
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

                //---- textField1 ----
                textField1.setEditable(false);
                contentPanel.add(textField1);
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== panel2 ========
            {
                panel2.setOpaque(false);
                panel2.setLayout(new BorderLayout());

                //---- button3 ----
                button3.setText(bundle.getString("button3.text_5"));
                button3.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 20));
                button3.addActionListener(e -> showBagTag(e));
                panel2.add(button3, BorderLayout.SOUTH);
            }
            dialogPane.add(panel2, BorderLayout.NORTH);

            //======== panel3 ========
            {
                panel3.setOpaque(false);
                panel3.setLayout(new BorderLayout());

                //---- button2 ----
                button2.setText(bundle.getString("button2.text_8"));
                button2.addActionListener(e -> ToMeal(e));
                panel3.add(button2, BorderLayout.WEST);

                //---- button1 ----
                button1.setText(bundle.getString("button1.text_10"));
                button1.addActionListener(e -> Return2Baggage(e));
                panel3.add(button1, BorderLayout.EAST);
            }
            dialogPane.add(panel3, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(900, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        init();}

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JTextField textField1;
    private JPanel panel2;
    private JButton button3;
    private JPanel panel3;
    private JButton button2;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
