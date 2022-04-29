package CheckIn.GUI;

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
        panel4 = new JPanel();
        MealPic = new JLabel();
        panel2 = new JPanel();
        button1 = new JButton();
        panel5 = new JPanel();
        button2 = new JButton();
        panel6 = new JPanel();
        button3 = new JButton();
        panel1 = new JPanel();
        label1 = new JLabel();

        //======== this ========
        setBackground(new Color(51, 153, 255));
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setOpaque(false);
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
                contentPanel.setOpaque(false);
                contentPanel.setLayout(new GridLayout(0, 1));

                //======== panel4 ========
                {
                    panel4.setLayout(new BorderLayout());

                    //---- MealPic ----
                    MealPic.setIcon(new ImageIcon(getClass().getResource("/13.png")));
                    panel4.add(MealPic, BorderLayout.CENTER);

                    //======== panel2 ========
                    {
                        panel2.setOpaque(false);
                        panel2.setLayout(new BorderLayout());

                        //---- button1 ----
                        button1.setText(bundle.getString("button1.text_3"));
                        button1.addActionListener(e -> Normal(e));
                        panel2.add(button1, BorderLayout.NORTH);

                        //======== panel5 ========
                        {
                            panel5.setLayout(new BorderLayout());

                            //---- button2 ----
                            button2.setText(bundle.getString("button2.text_3"));
                            button2.addActionListener(e -> VIPMeal(e));
                            panel5.add(button2, BorderLayout.NORTH);

                            //======== panel6 ========
                            {
                                panel6.setLayout(new BorderLayout());

                                //---- button3 ----
                                button3.setText(bundle.getString("button3.text_2"));
                                button3.addActionListener(e -> cancelMeal(e));
                                panel6.add(button3, BorderLayout.NORTH);
                            }
                            panel5.add(panel6, BorderLayout.CENTER);
                        }
                        panel2.add(panel5, BorderLayout.CENTER);
                    }
                    panel4.add(panel2, BorderLayout.WEST);
                }
                contentPanel.add(panel4);
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== panel1 ========
            {
                panel1.setOpaque(false);
                panel1.setLayout(new BorderLayout());

                //---- label1 ----
                label1.setText(bundle.getString("label1.text_11"));
                label1.setHorizontalAlignment(SwingConstants.CENTER);
                label1.setFont(new Font("Lucida Grande", Font.BOLD, 22));
                label1.setForeground(UIManager.getColor("Button.select"));
                panel1.add(label1, BorderLayout.CENTER);
            }
            dialogPane.add(panel1, BorderLayout.NORTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(900, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        init();}

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Gabirella
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JPanel panel4;
    private JLabel MealPic;
    private JPanel panel2;
    private JButton button1;
    private JPanel panel5;
    private JButton button2;
    private JPanel panel6;
    private JButton button3;
    private JPanel panel1;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
