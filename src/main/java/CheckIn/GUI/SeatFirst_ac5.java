package CheckIn.GUI;

import Exceptions.DataNotFound;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ResourceBundle;
/*
 * Created by JFormDesigner on Wed Mar 30 17:09:39 CST 2022
 */



/**
 * @author Jiayi Wang
 */
public class SeatFirst_ac5 extends JFrame {
    public SeatFirst_ac5() {
        initComponents();
    }

    

    private void VIPSeat(ActionEvent e) throws DataNotFound {
        JOptionPane.showMessageDialog(null, "There would be an additional payment for VIP seats.","Additional payment check", JOptionPane.WARNING_MESSAGE);
        dispose();
        new VIPSeat().setVisible(true);
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

    private void checkinAgain(ActionEvent e) {
        dispose();
        new CheckIn_3().setVisible(true);
        
    }

    private void error(ActionEvent e) {
        dispose();
        new Error().setVisible(true);
    }

    private void button1(ActionEvent e) throws DataNotFound {
        dispose();
        new SelectSeat_act6().setVisible(true);
    }

    private void initComponents() {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Gabirella
        ResourceBundle bundle = ResourceBundle.getBundle("Check");
        dialogPane = new JPanel();
        label1 = new JLabel();
        buttonBar = new JPanel();
        cancelButton = new JButton();
        button3 = new JButton();
        panel1 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setOpaque(false);
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border
            . EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER, javax
            . swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,
            12 ), java. awt. Color. red) ,dialogPane. getBorder( )) ); dialogPane. addPropertyChangeListener (new java. beans
            . PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .
            getPropertyName () )) throw new RuntimeException( ); }} );
            dialogPane.setLayout(new BorderLayout());

            //---- label1 ----
            label1.setText(bundle.getString("label1.text_25"));
            label1.setFont(new Font("Lucida Grande", Font.BOLD, 30));
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            dialogPane.add(label1, BorderLayout.NORTH);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setOpaque(false);
                buttonBar.setLayout(new FlowLayout());

                //---- cancelButton ----
                cancelButton.setText(bundle.getString("cancelButton.text_16"));
                cancelButton.addActionListener(e -> checkinAgain(e));
                buttonBar.add(cancelButton);

                //---- button3 ----
                button3.setText(bundle.getString("button3.text_8"));
                button3.addActionListener(e -> error(e));
                buttonBar.add(button3);
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);

            //======== panel1 ========
            {
                panel1.setLayout(new GridLayout());

                //---- button1 ----
                button1.setText(bundle.getString("button1.text_13"));
                button1.setOpaque(false);
                button1.addActionListener(e -> {
                    try {
                        button1(e);
                    } catch (DataNotFound ex) {
                        ex.printStackTrace();
                    }
                });
                panel1.add(button1);

                //---- button2 ----
                button2.setText(bundle.getString("button2.text_10"));
                button2.setOpaque(false);
                button2.addActionListener(e -> {
                    try {
                        VIPSeat(e);
                    } catch (DataNotFound ex) {
                        ex.printStackTrace();
                    }
                });
                panel1.add(button2);
            }
            dialogPane.add(panel1, BorderLayout.CENTER);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(900, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        init();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Gabirella
    private JPanel dialogPane;
    private JLabel label1;
    private JPanel buttonBar;
    private JButton cancelButton;
    private JButton button3;
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
