package CheckIn.GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.util.ResourceBundle;

/*
 * Created by JFormDesigner on Tue Mar 29 18:18:09 CST 2022
 */

/**
 * @author Jiayi Wang
 */
public class Airline_1 extends JFrame {
    public Airline_1() {
        initComponents();
    }

    private void ok(ActionEvent e) {
//        JOptionPane.showMessageDialog(null, "Confirm airline?","Airline check", JOptionPane.WARNING_MESSAGE);
        dispose();
        new CheckIn_3().setVisible(true);
    }

    private void exit(ActionEvent e) { dispose();}

    private void AirlineChosen(ItemEvent e) {
        String airlineChoose =(e.getItem()).toString();
        System.out.println(airlineChoose);
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
//    public void setFirstPic(){
//        JLabel jl1=new JLabel(new ImageIcon("src/main/resources/checkin.png"));
//        panel2.add(jl1,BorderLayout.CENTER);
//
//    }

    private void initComponents() {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        ResourceBundle bundle = ResourceBundle.getBundle("Check");
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        panel1 = new JPanel();
        panel2 = new JPanel();
        label1 = new JLabel();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setOpaque(false);
            dialogPane.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.
            EmptyBorder(0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax.swing.border.TitledBorder.CENTER,javax.swing
            .border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),
            java.awt.Color.red),dialogPane. getBorder()));dialogPane. addPropertyChangeListener(new java.beans.PropertyChangeListener()
            {@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("bord\u0065r".equals(e.getPropertyName()))
            throw new RuntimeException();}});
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

                        //---- label1 ----
                        label1.setText(bundle.getString("label1.text_5"));
                        label1.setHorizontalAlignment(SwingConstants.CENTER);
                        label1.setFont(new Font("Lucida Grande", Font.BOLD, 40));
                        label1.setForeground(Color.black);
                        label1.setBackground(new Color(0, 127, 255, 191));
                        panel2.add(label1, BorderLayout.CENTER);
                    }
                    panel1.add(panel2, BorderLayout.CENTER);
                }
                contentPanel.add(panel1, BorderLayout.CENTER);
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setOpaque(false);
                buttonBar.setLayout(new FlowLayout());

                //---- okButton ----
                okButton.setText(bundle.getString("okButton.text_5"));
                okButton.setOpaque(false);
                okButton.addActionListener(e -> ok(e));
                buttonBar.add(okButton);

                //---- cancelButton ----
                cancelButton.setText(bundle.getString("cancelButton.text_5"));
                cancelButton.setOpaque(false);
                cancelButton.addActionListener(e -> exit(e));
                buttonBar.add(cancelButton);
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(900, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
//        setFirstPic();
        init();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JPanel panel1;
    private JPanel panel2;
    private JLabel label1;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables



}
