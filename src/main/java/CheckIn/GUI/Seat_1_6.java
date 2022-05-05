/*
 * Created by JFormDesigner on Tue Apr 26 23:30:57 CST 2022
 */

package CheckIn.GUI;

import Beans.Flight.Flight;
import Beans.Flight.SubClasses.Seat;
import Beans.Order.Order;
import Beans.Passenger.SubClasses.BoardingPass;
import CheckIn.Monitor.cMonitors;
import DataBase.oDB;
import Exceptions.DataNotFound;

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
    public Seat_1_6() throws Exception {
        initComponents();
    }

    private void PrintFlight(ActionEvent e) {

//        seat= Objects.requireNonNull(vipWin.getSelectedItem()).toString();
        dispose();
        new PrintFlight_6().setVisible(true);
    }

    private void Back2Confirm(ActionEvent e) {
        dispose();
        new SeatFirst_5().setVisible(true);
    }
    public void setSeatClass(){

    }

    private void firClass(ItemEvent e) {
        int stateChange = e.getStateChange();
        if (stateChange == ItemEvent.ITEM_STATE_CHANGED){
            dispose();
            seat=vip.getSelectedItem().toString();
//            new VIPSeatPay().setVisible(true);
        }
    }
    private void busSeat(ItemEvent e) {
        int stateChange = e.getStateChange();
        if (stateChange == ItemEvent.ITEM_STATE_CHANGED){
            dispose();
            seat=busS.getSelectedItem().toString();
//            new VIPSeatPay().setVisible(true);
        }
    }
    private void ecoSeat(ItemEvent e) {
        int stateChange = e.getStateChange();
        if (stateChange == ItemEvent.ITEM_STATE_CHANGED){
            dispose();
            seat=ecoS.getSelectedItem().toString();
//            new VIPSeatPay().setVisible(true);
        }
    }
    public void another() throws DataNotFound {
        //TODO 从order里面得到seat class
        String bookingNo = Objects.requireNonNull(EnterBN_3.getPsnTemp()).getBookNumber();
        Order o = oDB.getOrderByBookingNumber(bookingNo);
        assert o != null;
        int i = o.getSeatClass();
        switch (i) {
            case 0:
                infoText.setText("You can choose the seats form 1 to 2");
                break;
            case 1:
                infoText.setText("You can choose the seats form 11 to 17");
                break;
            case 2:
                infoText.setText("You can choose the seats form 18 to 30");
                break;
        }
    }

    public void showSeats() throws Exception {
        another();
        HashMap<String, Seat> map=new HashMap<>();
//        if(EnterBN_3.getPsnTemp()==null){
//            try{
//                //TODO other's seating list
////                 map= Objects.requireNonNull(EnterOther_3.getFlightList()).getSeatingList();
////                bpOther.setSeatNo(seat);
////                EnterOther_3.getPsnTemp1().getBoardingPass().setSeatNo(seat);
//            } catch (Exception e1) {
//                e1.printStackTrace();
//            }
//        }
//        else
        if(EnterOther_3.getPsnTemp1()==null) {
            try {
                map= Objects.requireNonNull(EnterBN_3.getFlight()).getSeatingList();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }else{
            try{
                map= Objects.requireNonNull(EnterBN_3.getFlight()).getSeatingList();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }

        if(!map.isEmpty()) {
            for (Map.Entry<String, Seat> entry : map.entrySet()) {
                EnterBN_3.getFlight().getSeatingList();
                EnterBN_3.getFlight().getSeatingList().values();
                Collection<Seat> values=map.values();
                Iterator<Seat> iterator2=values.iterator();

                int i = iterator2.next().getSeatClass();
                while (iterator2.hasNext()){
                    switch (i) {
                        case 0:
                            vip.addItem(entry.getKey());
                            break;
                        case 1:
                            busS.addItem(entry.getKey());
                            break;
                        case 2:
                            ecoS.addItem(entry.getKey());
                            break;
                    }
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

    private void button3(ActionEvent e) throws Exception {
        showSeats();
    }

    private void initComponents() throws Exception {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Gabirella Cambridge
        ResourceBundle bundle = ResourceBundle.getBundle("Check");
        label1 = new JLabel();
        panel3 = new JPanel();
        button2 = new JButton();
        button1 = new JButton();
        dialogPane2 = new JPanel();
        panel4 = new JPanel();
        scrollPane1 = new JScrollPane();
        label2 = new JLabel();
        infoText = new JTextField();
        button3 = new JButton();
        panel10 = new JPanel();
        panel6 = new JPanel();
        panel2 = new JPanel();
        label9 = new JLabel();
        panel5 = new JPanel();
        vip = new JComboBox();
        label10 = new JLabel();
        panel11 = new JPanel();
        busS = new JComboBox();
        label7 = new JLabel();
        ecoS = new JComboBox();

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
            panel3.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.
            EmptyBorder(0,0,0,0), "JF\u006frmDes\u0069gner \u0045valua\u0074ion",javax.swing.border.TitledBorder.CENTER,javax.swing
            .border.TitledBorder.BOTTOM,new java.awt.Font("D\u0069alog",java.awt.Font.BOLD,12),
            java.awt.Color.red),panel3. getBorder()));panel3. addPropertyChangeListener(new java.beans.PropertyChangeListener()
            {@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062order".equals(e.getPropertyName()))
            throw new RuntimeException();}});
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

                //---- infoText ----
                infoText.setEditable(false);
                panel4.add(infoText, BorderLayout.NORTH);

                //---- button3 ----
                button3.setText(bundle.getString("button3.text_12"));
                button3.addActionListener(e -> {
                    try {
                        button3(e);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                });
                panel4.add(button3, BorderLayout.WEST);
            }
            dialogPane2.add(panel4);

            //======== panel10 ========
            {
                panel10.setOpaque(false);
                panel10.setPreferredSize(new Dimension(250, 76));
                panel10.setMaximumSize(new Dimension(150, 550));
                panel10.setLayout(new BoxLayout(panel10, BoxLayout.Y_AXIS));

                //======== panel6 ========
                {
                    panel6.setLayout(new BoxLayout(panel6, BoxLayout.X_AXIS));
                }
                panel10.add(panel6);

                //======== panel2 ========
                {
                    panel2.setOpaque(false);
                    panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

                    //---- label9 ----
                    label9.setText(bundle.getString("label9.text_4"));
                    label9.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 18));
                    panel2.add(label9);

                    //======== panel5 ========
                    {
                        panel5.setLayout(new BoxLayout(panel5, BoxLayout.X_AXIS));

                        //---- vip ----
                        vip.addItemListener(e -> firClass(e));
                        panel5.add(vip);
                    }
                    panel2.add(panel5);

                    //---- label10 ----
                    label10.setText(bundle.getString("label10.text_5"));
                    label10.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 18));
                    panel2.add(label10);
                }
                panel10.add(panel2);

                //======== panel11 ========
                {
                    panel11.setOpaque(false);
                    panel11.setLayout(new BoxLayout(panel11, BoxLayout.Y_AXIS));

                    //---- busS ----
                    busS.addItemListener(e -> busSeat(e));
                    panel11.add(busS);

                    //---- label7 ----
                    label7.setText(bundle.getString("label7.text_4"));
                    label7.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 18));
                    panel11.add(label7);

                    //---- ecoS ----
                    ecoS.addItemListener(e -> ecoSeat(e));
                    panel11.add(ecoS);
                }
                panel10.add(panel11);
            }
            dialogPane2.add(panel10);
        }
        contentPane.add(dialogPane2, BorderLayout.CENTER);
        setSize(900, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
//        showSeats();
        init();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Gabirella Cambridge
    private JLabel label1;
    private JPanel panel3;
    private JButton button2;
    private JButton button1;
    private JPanel dialogPane2;
    private JPanel panel4;
    private JScrollPane scrollPane1;
    private JLabel label2;
    private JTextField infoText;
    private JButton button3;
    private JPanel panel10;
    private JPanel panel6;
    private JPanel panel2;
    private JLabel label9;
    private JPanel panel5;
    private JComboBox vip;
    private JLabel label10;
    private JPanel panel11;
    private JComboBox busS;
    private JLabel label7;
    private JComboBox ecoS;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

}
