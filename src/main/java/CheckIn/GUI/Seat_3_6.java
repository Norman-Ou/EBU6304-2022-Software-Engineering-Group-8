/*
 * Created by JFormDesigner on Wed Apr 27 09:24:35 CST 2022
 */

package CheckIn.GUI;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Jiayi Wang
 */
public class Seat_3_6 extends JFrame {
    public static String seat;
    public Seat_3_6() {
        initComponents();
    }

    private void PrintFlight(ActionEvent e) {
        seat= Objects.requireNonNull(VipWin.getSelectedItem()).toString();
        dispose();
        new PrintFlight_6().setVisible(true);
    }

    private void Back2Confirm(ActionEvent e) {
        dispose();
        new SeatFirst_5().setVisible(true);
    }

    private void VipWinItemStateChanged(ItemEvent e) {
        int stateChange = e.getStateChange();
        if (stateChange == ItemEvent.SELECTED){
            dispose();
            new VIPSeatPay().setVisible(true);
        }
    }

    private void VipOutItemStateChanged(ItemEvent e) {
        int stateChange = e.getStateChange();
        if (stateChange == ItemEvent.SELECTED){
            dispose();
            new VIPSeatPay().setVisible(true);
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Gabirella
        ResourceBundle bundle = ResourceBundle.getBundle("Check");
        label1 = new JLabel();
        panel3 = new JPanel();
        button2 = new JButton();
        button1 = new JButton();
        dialogPane2 = new JPanel();
        panel8 = new JPanel();
        panel10 = new JPanel();
        label9 = new JLabel();
        SecWin = new JComboBox();
        SecMid = new JComboBox();
        SecOut = new JComboBox();
        label10 = new JLabel();
        panel11 = new JPanel();
        ThrWin = new JComboBox();
        ThrOut = new JComboBox();
        panel4 = new JPanel();
        scrollPane1 = new JScrollPane();
        label2 = new JLabel();
        panel7 = new JPanel();
        panel2 = new JPanel();
        label7 = new JLabel();
        VipWin = new JComboBox();
        VipMid = new JComboBox();
        VipOut = new JComboBox();
        label8 = new JLabel();
        panel9 = new JPanel();
        FirWin = new JComboBox();
        FIrOut = new JComboBox();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //---- label1 ----
        label1.setText(bundle.getString("label1.text_31"));
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setFont(new Font("Lucida Grande", Font.BOLD, 26));
        contentPane.add(label1, BorderLayout.NORTH);

        //======== panel3 ========
        {
            panel3.setOpaque(false);
            panel3.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder
            ( 0, 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e", javax. swing. border. TitledBorder. CENTER, javax. swing. border
            . TitledBorder. BOTTOM, new java .awt .Font ("Dialo\u0067" ,java .awt .Font .BOLD ,12 ), java. awt
            . Color. red) ,panel3. getBorder( )) ); panel3. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void
            propertyChange (java .beans .PropertyChangeEvent e) {if ("borde\u0072" .equals (e .getPropertyName () )) throw new RuntimeException( )
            ; }} );
            panel3.setLayout(new FlowLayout());

            //---- button2 ----
            button2.setText(bundle.getString("button2.text_17"));
            button2.addActionListener(e -> PrintFlight(e));
            panel3.add(button2);

            //---- button1 ----
            button1.setText(bundle.getString("button1.text_25"));
            button1.addActionListener(e -> Back2Confirm(e));
            panel3.add(button1);
        }
        contentPane.add(panel3, BorderLayout.SOUTH);

        //======== dialogPane2 ========
        {
            dialogPane2.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane2.setOpaque(false);
            dialogPane2.setLayout(new BoxLayout(dialogPane2, BoxLayout.X_AXIS));

            //======== panel8 ========
            {
                panel8.setOpaque(false);
                panel8.setPreferredSize(new Dimension(250, 76));
                panel8.setMaximumSize(new Dimension(150, 550));
                panel8.setLayout(new BoxLayout(panel8, BoxLayout.Y_AXIS));

                //======== panel10 ========
                {
                    panel10.setLayout(new BoxLayout(panel10, BoxLayout.Y_AXIS));

                    //---- label9 ----
                    label9.setText(bundle.getString("label9.text_3"));
                    panel10.add(label9);
                    panel10.add(SecWin);
                    panel10.add(SecMid);
                    panel10.add(SecOut);

                    //---- label10 ----
                    label10.setText(bundle.getString("label10.text_4"));
                    panel10.add(label10);
                }
                panel8.add(panel10);

                //======== panel11 ========
                {
                    panel11.setLayout(new BoxLayout(panel11, BoxLayout.Y_AXIS));
                    panel11.add(ThrWin);
                    panel11.add(ThrOut);
                }
                panel8.add(panel11);
            }
            dialogPane2.add(panel8);

            //======== panel4 ========
            {
                panel4.setLayout(new BorderLayout());

                //======== scrollPane1 ========
                {
                    scrollPane1.setAutoscrolls(true);
                    scrollPane1.setFocusable(false);
                    scrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                    scrollPane1.setPreferredSize(new Dimension(80, 900));
                    scrollPane1.setMinimumSize(new Dimension(50, 900));
                    scrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

                    //---- label2 ----
                    label2.setIcon(new ImageIcon(getClass().getResource("/triSear.png")));
                    label2.setPreferredSize(new Dimension(20, 572));
                    label2.setIconTextGap(0);
                    label2.setHorizontalAlignment(SwingConstants.CENTER);
                    label2.setMaximumSize(new Dimension(150, 1500));
                    label2.setMinimumSize(new Dimension(150, 1500));
                    label2.setAutoscrolls(true);
                    label2.setFocusCycleRoot(true);
                    label2.setHorizontalTextPosition(SwingConstants.CENTER);
                    scrollPane1.setViewportView(label2);
                }
                panel4.add(scrollPane1, BorderLayout.CENTER);
            }
            dialogPane2.add(panel4);

            //======== panel7 ========
            {
                panel7.setOpaque(false);
                panel7.setPreferredSize(new Dimension(250, 76));
                panel7.setMaximumSize(new Dimension(150, 550));
                panel7.setLayout(new BoxLayout(panel7, BoxLayout.Y_AXIS));

                //======== panel2 ========
                {
                    panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

                    //---- label7 ----
                    label7.setText(bundle.getString("label7.text_5"));
                    panel2.add(label7);

                    //---- VipWin ----
                    VipWin.addItemListener(e -> VipWinItemStateChanged(e));
                    panel2.add(VipWin);
                    panel2.add(VipMid);

                    //---- VipOut ----
                    VipOut.addItemListener(e -> VipOutItemStateChanged(e));
                    panel2.add(VipOut);

                    //---- label8 ----
                    label8.setText(bundle.getString("label8.text_5"));
                    panel2.add(label8);
                }
                panel7.add(panel2);

                //======== panel9 ========
                {
                    panel9.setLayout(new BoxLayout(panel9, BoxLayout.Y_AXIS));
                    panel9.add(FirWin);
                    panel9.add(FIrOut);
                }
                panel7.add(panel9);
            }
            dialogPane2.add(panel7);
        }
        contentPane.add(dialogPane2, BorderLayout.CENTER);
        setSize(900, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Gabirella
    private JLabel label1;
    private JPanel panel3;
    private JButton button2;
    private JButton button1;
    private JPanel dialogPane2;
    private JPanel panel8;
    private JPanel panel10;
    private JLabel label9;
    private JComboBox SecWin;
    private JComboBox SecMid;
    private JComboBox SecOut;
    private JLabel label10;
    private JPanel panel11;
    private JComboBox ThrWin;
    private JComboBox ThrOut;
    private JPanel panel4;
    private JScrollPane scrollPane1;
    private JLabel label2;
    private JPanel panel7;
    private JPanel panel2;
    private JLabel label7;
    private JComboBox VipWin;
    private JComboBox VipMid;
    private JComboBox VipOut;
    private JLabel label8;
    private JPanel panel9;
    private JComboBox FirWin;
    private JComboBox FIrOut;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

}
