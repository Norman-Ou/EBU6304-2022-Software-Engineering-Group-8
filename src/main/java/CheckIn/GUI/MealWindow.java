package CheckIn.GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ResourceBundle;

/**
 * The type Meal 12.
 *
 * @author Jiayi Wang
 */
public class MealWindow extends JFrame {
    /**
     * Instantiates a new Meal 12.
     */
    public MealWindow() {
        initComponents();
    }

    private void Normal(ActionEvent e) {dispose();new MealNormPanel().setVisible(true);}

    private void VIPMeal(ActionEvent e) {dispose();new MealAddPanel().setVisible(true);}

    private void help(ActionEvent e) {dispose();new ErrorWindow().setVisible(true);}

    private void cancelMeal(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Confirm cancel your meal?","Cancel meal check", JOptionPane.WARNING_MESSAGE);
        dispose();new ExitWindow().setVisible(true);}

    /**
     * Set background.
     */
    public void setBackground() {
        ImageIcon background = new ImageIcon(Config.Config.bgPic);
        JLabel label3 = new JLabel(background);
        label3.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());
        JPanel myPanel = (JPanel)this.getContentPane();
        myPanel.setOpaque(false);
        this.getLayeredPane().add(label3, Integer.valueOf(Integer.MIN_VALUE));
        this.setTitle("Passenger check-in system");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void initComponents() {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Gabirella Cambridge
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
        panel3 = new JPanel();
        label1 = new JLabel();
        button4 = new JButton();

        //======== this ========
        setBackground(new Color(51, 153, 255));
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setOpaque(false);
            dialogPane.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing
                    .border.EmptyBorder(0,0,0,0), "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e",javax.swing.border.TitledBorder
                    .CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("Dialo\u0067",java.
                    awt.Font.BOLD,12),java.awt.Color.red),dialogPane. getBorder()))
            ;dialogPane. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e
        ){if("borde\u0072".equals(e.getPropertyName()))throw new RuntimeException();}})
        ;
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

                //======== panel3 ========
                {
                    panel3.setOpaque(false);
                    panel3.setLayout(new BorderLayout());

                    //---- label1 ----
                    label1.setText(bundle.getString("label1.text_11"));
                    label1.setHorizontalAlignment(SwingConstants.CENTER);
                    label1.setFont(new Font("Lucida Grande", Font.BOLD, 22));
                    label1.setForeground(UIManager.getColor("Button.select"));
                    panel3.add(label1, BorderLayout.CENTER);

                    //---- button4 ----
                    button4.setText(bundle.getString("button4.text_9"));
                    button4.addActionListener(e -> help(e));
                    panel3.add(button4, BorderLayout.EAST);
                }
                panel1.add(panel3, BorderLayout.CENTER);
            }
            dialogPane.add(panel1, BorderLayout.NORTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(900, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        setBackground();}

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Gabirella Cambridge
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
    private JPanel panel3;
    private JLabel label1;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
