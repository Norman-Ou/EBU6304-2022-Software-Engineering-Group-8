/*
 * Created by JFormDesigner on Sun May 29 21:20:23 CST 2022
 */

package CheckIn.GUI;

import Config.Config;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Jiayi Wang
 */
public class Airline_1 extends JFrame {
    public Airline_1() {
        initComponents();
    }

    private void ok(ActionEvent e) {dispose();new CheckIn_2().setVisible(true);}

    private void help(ActionEvent e) {dispose();new ErrorWindow().setVisible(true);}


    /**
     * Sets background.
     */
    public void setBackground() {
        ImageIcon background = new ImageIcon(Config.bgPic);
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
        ResourceBundle bundle = ResourceBundle.getBundle("Check");
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel5 = new JPanel();
        label1 = new JLabel();
        label3 = new JLabel();
        panel4 = new JPanel();
        button1 = new JButton();
        label2 = new JLabel();
        buttonBar = new JPanel();
        okButton = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setOpaque(false);
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setOpaque(false);
                contentPanel.setLayout(new BorderLayout());

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

                            //======== panel5 ========
                            {
                                panel5.setOpaque(false);
                                panel5.setLayout(new BorderLayout());

                                //---- label1 ----
                                label1.setText(bundle.getString("label1.text_5"));
                                label1.setHorizontalAlignment(SwingConstants.CENTER);
                                label1.setFont(new Font("Lucida Grande", Font.BOLD, 40));
                                label1.setForeground(Color.black);
                                label1.setBackground(new Color(0, 127, 255, 191));
                                panel5.add(label1, BorderLayout.CENTER);

                                //---- label3 ----
                                label3.setText(bundle.getString("label3.text_9"));
                                label3.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 30));
                                label3.setHorizontalAlignment(SwingConstants.CENTER);
                                label3.setForeground(Color.black);
                                panel5.add(label3, BorderLayout.NORTH);
                            }
                            panel3.add(panel5, BorderLayout.CENTER);

                            //======== panel4 ========
                            {
                                panel4.setOpaque(false);
                                panel4.setLayout(new BorderLayout());

                                //---- button1 ----
                                button1.setText(bundle.getString("button1.text_25"));
                                button1.addActionListener(e -> help(e));
                                panel4.add(button1, BorderLayout.EAST);
                            }
                            panel3.add(panel4, BorderLayout.NORTH);

                            //---- label2 ----
                            label2.setMinimumSize(new Dimension(0, 150));
                            label2.setPreferredSize(new Dimension(0, 150));
                            label2.setMaximumSize(new Dimension(0, 100));
                            panel3.add(label2, BorderLayout.SOUTH);
                        }
                        panel2.add(panel3, BorderLayout.CENTER);
                    }
                    panel1.add(panel2, BorderLayout.CENTER);
                }
                contentPanel.add(panel1, BorderLayout.CENTER);
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setMinimumSize(new Dimension(168, 60));
                buttonBar.setPreferredSize(new Dimension(168, 90));
                buttonBar.setOpaque(false);
                buttonBar.setLayout(new GridLayout());

                //---- okButton ----
                okButton.setText(bundle.getString("okButton.text_5"));
                okButton.setOpaque(false);
                okButton.addActionListener(e -> ok(e));
                buttonBar.add(okButton);
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(900, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        setBackground();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel5;
    private JLabel label1;
    private JLabel label3;
    private JPanel panel4;
    private JButton button1;
    private JLabel label2;
    private JPanel buttonBar;
    private JButton okButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

}
