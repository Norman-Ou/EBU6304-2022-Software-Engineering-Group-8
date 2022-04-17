package PassengerGUI;

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

    private void NorSeat(ActionEvent e) {
        dispose();
        new SelectSeat_act6().setVisible(true);
    }

    private void VIPSeat(ActionEvent e) {
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

    private void initComponents() {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        ResourceBundle bundle = ResourceBundle.getBundle("Check");
        dialogPane = new JPanel();
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setOpaque(false);
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new
            javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax
            . swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java
            .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt
            . Color. red) ,dialogPane. getBorder( )) ); dialogPane. addPropertyChangeListener (new java. beans.
            PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r" .
            equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
            dialogPane.setLayout(new BorderLayout());

            //---- label1 ----
            label1.setText(bundle.getString("label1.text_25"));
            label1.setFont(new Font("Lucida Grande", Font.BOLD, 26));
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            dialogPane.add(label1, BorderLayout.NORTH);

            //---- button1 ----
            button1.setText(bundle.getString("button1.text_13"));
            button1.setOpaque(false);
            button1.addActionListener(e -> NorSeat(e));
            dialogPane.add(button1, BorderLayout.WEST);

            //---- button2 ----
            button2.setText(bundle.getString("button2.text_10"));
            button2.setOpaque(false);
            button2.addActionListener(e -> VIPSeat(e));
            dialogPane.add(button2, BorderLayout.EAST);

            //======== scrollPane1 ========
            {
                scrollPane1.setOpaque(false);

                //---- textArea1 ----
                textArea1.setText("\n\n\n\n               There would be  \n            an additional payment  \n                 for VIP Seats");
                textArea1.setLineWrap(true);
                textArea1.setEditable(false);
                textArea1.setTabSize(20);
                textArea1.setWrapStyleWord(true);
                textArea1.setFont(new Font(Font.MONOSPACED, Font.BOLD, 26));
                textArea1.setAlignmentX(50.0F);
                textArea1.setAlignmentY(50.0F);
                scrollPane1.setViewportView(textArea1);
            }
            dialogPane.add(scrollPane1, BorderLayout.CENTER);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(900, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        init();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel dialogPane;
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
