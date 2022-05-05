/*
 * Created by JFormDesigner on Tue Apr 26 23:30:57 CST 2022
 */

package CheckIn.GUI;

import Beans.Flight.Flight;
import Beans.Flight.SubClasses.Seat;
import Beans.Passenger.SubClasses.BoardingPass;
import CheckIn.Monitor.cMonitors;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;

import static CheckIn.Monitor.cMonitors.getFlightByBookingNo;

/**
 * @author Jiayi Wang
 */
public class Seat_1_6 extends JFrame {
    public static String seat;
    public Seat_1_6() {
        initComponents();
    }

    private void PrintFlight(ActionEvent e) {
        //TODO
        seat= Objects.requireNonNull(vipWin.getSelectedItem()).toString();
        dispose();
        new PrintFlight_6().setVisible(true);
    }

    private void Back2Confirm(ActionEvent e) {
        dispose();
        new SeatFirst_5().setVisible(true);
    }

    private void vipWinItemStateChanged(ItemEvent e) {
        int stateChange = e.getStateChange();
        if (stateChange == ItemEvent.ITEM_STATE_CHANGED){
            dispose();
            new VIPSeatPay().setVisible(true);
        }
    }

    private void vipOutItemStateChanged(ItemEvent e) {
        int stateChange = e.getStateChange();
        if (stateChange == ItemEvent.ITEM_STATE_CHANGED){
            dispose();
            new VIPSeatPay().setVisible(true);
        }
    }
    public static BoardingPass bpOther = EnterOther_3.getPsnTemp1().getBoardingPass();
    public static BoardingPass bpScan = EnterOther_3.getPsnTemp2().getBoardingPass();
    public static BoardingPass bpNor = EnterBN_3.getPsnTemp().getBoardingPass();

    public void showSeats(){

        HashMap<String, Seat> map=new HashMap<>();
        if(EnterBN_3.getPsnTemp()==null){
            try{
//                 map= Objects.requireNonNull(EnterOther_3.getFlightList()).getSeatingList();
                bpOther.setSeatNo(seat);
//                EnterOther_3.getPsnTemp1().getBoardingPass().setSeatNo(seat);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        else if(EnterOther_3.getPsnTemp1()==null) {
            try {
                map= Objects.requireNonNull(EnterBN_3.getFlight()).getSeatingList();
//                EnterBN_3.getPsnTemp().getBoardingPass().setSeatNo(seat);
                bpNor.setSeatNo(seat);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }else{
            try{
                map= Objects.requireNonNull(EnterBN_3.getFlight()).getSeatingList();
//                EnterOther_3.getPsnTemp2().getBoardingPass().setSeatNo(seat);
                bpScan.setSeatNo(seat);

            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }

        if(!map.isEmpty()) {
            for (Map.Entry<String, Seat> entry : map.entrySet()) {
                //TODO 判断 是否被选择 是否为VIP座位
//                vipWin.addItem(entry.getKey());
                Seat s = entry.getValue();
                if(s == vipWin.getSelectedItem()){
                    s.setLockedStatus(true);

                }
                if(!entry.getValue().isLockedStatus()){
                    vipWin.addItem(entry.getKey());
                }


            }
        }

    }

    public void init() {
        ImageIcon background = new ImageIcon("src/main/resources/img.png");
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
        // Generated using JFormDesigner Evaluation license - Gabirella
        ResourceBundle bundle = ResourceBundle.getBundle("Check");
        label1 = new JLabel();
        panel3 = new JPanel();
        button2 = new JButton();
        button1 = new JButton();
        dialogPane2 = new JPanel();
        panel7 = new JPanel();
        panel = new JPanel();
        label7 = new JLabel();
        secWin = new JComboBox();
        secMid = new JComboBox();
        secOut = new JComboBox();
        label8 = new JLabel();
        panel9 = new JPanel();
        thrWin = new JComboBox();
        thrMid = new JComboBox();
        thrOut = new JComboBox();
        panel4 = new JPanel();
        scrollPane1 = new JScrollPane();
        label2 = new JLabel();
        panel10 = new JPanel();
        panel2 = new JPanel();
        label9 = new JLabel();
        vipWin = new JComboBox();
        vipOut = new JComboBox();
        label10 = new JLabel();
        panel11 = new JPanel();
        firWin = new JComboBox();
        firMid = new JComboBox();
        firOut = new JComboBox();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //---- label1 ----
        label1.setText(bundle.getString("label1.text_23"));
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setFont(new Font("Lucida Grande", Font.BOLD, 26));
        contentPane.add(label1, BorderLayout.NORTH);

        //======== panel3 ========
        {
            panel3.setOpaque(false);
            panel3.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing
            . border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", javax. swing. border. TitledBorder
            . CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069al\u006fg" ,java .
            awt .Font .BOLD ,12 ), java. awt. Color. red) ,panel3. getBorder( )) )
            ; panel3. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
            ) {if ("\u0062or\u0064er" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} )
            ;
            panel3.setLayout(new FlowLayout());

            //---- button2 ----
            button2.setText(bundle.getString("button2.text_16"));
            button2.addActionListener(e -> PrintFlight(e));
            panel3.add(button2);

            //---- button1 ----
            button1.setText(bundle.getString("button1.text_24"));
            button1.addActionListener(e -> Back2Confirm(e));
            panel3.add(button1);
        }
        contentPane.add(panel3, BorderLayout.SOUTH);

        //======== dialogPane2 ========
        {
            dialogPane2.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane2.setOpaque(false);
            dialogPane2.setLayout(new BoxLayout(dialogPane2, BoxLayout.X_AXIS));

            //======== panel7 ========
            {
                panel7.setOpaque(false);
                panel7.setPreferredSize(new Dimension(250, 76));
                panel7.setMaximumSize(new Dimension(150, 550));
                panel7.setLayout(new BoxLayout(panel7, BoxLayout.Y_AXIS));

                //======== panel ========
                {
                    panel.setOpaque(false);
                    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

                    //---- label7 ----
                    label7.setText(bundle.getString("label7.text_4"));
                    panel.add(label7);
                    panel.add(secWin);
                    panel.add(secMid);
                    panel.add(secOut);

                    //---- label8 ----
                    label8.setText(bundle.getString("label8.text_4"));
                    panel.add(label8);
                }
                panel7.add(panel);

                //======== panel9 ========
                {
                    panel9.setOpaque(false);
                    panel9.setLayout(new BoxLayout(panel9, BoxLayout.Y_AXIS));
                    panel9.add(thrWin);
                    panel9.add(thrMid);
                    panel9.add(thrOut);
                }
                panel7.add(panel9);
            }
            dialogPane2.add(panel7);

            //======== panel4 ========
            {
                panel4.setLayout(new BorderLayout());

                //======== scrollPane1 ========
                {
                    scrollPane1.setAutoscrolls(true);

                    //---- label2 ----
                    label2.setIcon(new ImageIcon(getClass().getResource("/TwoSeat.png")));
                    label2.setPreferredSize(new Dimension(30, 572));
                    label2.setIconTextGap(0);
                    label2.setHorizontalAlignment(SwingConstants.CENTER);
                    scrollPane1.setViewportView(label2);
                }
                panel4.add(scrollPane1, BorderLayout.CENTER);
            }
            dialogPane2.add(panel4);

            //======== panel10 ========
            {
                panel10.setOpaque(false);
                panel10.setPreferredSize(new Dimension(250, 76));
                panel10.setMaximumSize(new Dimension(150, 550));
                panel10.setLayout(new BoxLayout(panel10, BoxLayout.Y_AXIS));

                //======== panel2 ========
                {
                    panel2.setOpaque(false);
                    panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

                    //---- label9 ----
                    label9.setText(bundle.getString("label9.text_4"));
                    panel2.add(label9);

                    //---- vipWin ----
                    vipWin.addItemListener(e -> vipWinItemStateChanged(e));
                    panel2.add(vipWin);

                    //---- vipOut ----
                    vipOut.addItemListener(e -> vipOutItemStateChanged(e));
                    panel2.add(vipOut);

                    //---- label10 ----
                    label10.setText(bundle.getString("label10.text_5"));
                    panel2.add(label10);
                }
                panel10.add(panel2);

                //======== panel11 ========
                {
                    panel11.setOpaque(false);
                    panel11.setLayout(new BoxLayout(panel11, BoxLayout.Y_AXIS));
                    panel11.add(firWin);
                    panel11.add(firMid);
                    panel11.add(firOut);
                }
                panel10.add(panel11);
            }
            dialogPane2.add(panel10);
        }
        contentPane.add(dialogPane2, BorderLayout.CENTER);
        setSize(900, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        showSeats();
        init();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Gabirella
    private JLabel label1;
    private JPanel panel3;
    private JButton button2;
    private JButton button1;
    private JPanel dialogPane2;
    private JPanel panel7;
    private JPanel panel;
    private JLabel label7;
    private JComboBox secWin;
    private JComboBox secMid;
    private JComboBox secOut;
    private JLabel label8;
    private JPanel panel9;
    private JComboBox thrWin;
    private JComboBox thrMid;
    private JComboBox thrOut;
    private JPanel panel4;
    private JScrollPane scrollPane1;
    private JLabel label2;
    private JPanel panel10;
    private JPanel panel2;
    private JLabel label9;
    private JComboBox vipWin;
    private JComboBox vipOut;
    private JLabel label10;
    private JPanel panel11;
    private JComboBox firWin;
    private JComboBox firMid;
    private JComboBox firOut;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

}
