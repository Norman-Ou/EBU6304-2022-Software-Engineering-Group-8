/*
 * Created by JFormDesigner on Wed Apr 27 09:24:35 CST 2022
 */

package CheckIn.GUI;

import Beans.Flight.SubClasses.Seat;
import Beans.Order.Order;
import DataBase.oDB;

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
    private static HashMap<String, Seat> mapNew = new HashMap<>();
    private static HashMap<String, Seat> map=new HashMap<>();
    private static boolean upgrade=false;
    public Seat_3_6() {
        initComponents();
    }

    private void PrintFlight(ActionEvent e) {
        if(upgrade){
            dispose();
            new CreditPage().setVisible(true);
        }else{
            dispose();
            new PrintFlight_6().setVisible(true);
        }
    }

    private void Back2Confirm(ActionEvent e) {
        dispose();
        new ConfirmPage_3().setVisible(true);
    }

    private void error(ActionEvent e) {
        dispose();
        new Error().setVisible(true);
    }

    private void button3(ActionEvent e) throws Exception {
        checkClass();
    }

    private void firClass(ItemEvent e) {
        int stateChange = e.getStateChange();
        if (stateChange == ItemEvent.ITEM_STATE_CHANGED){dispose();}
    }

    private void busSeat(ItemEvent e) {
        int stateChange = e.getStateChange();
        if (stateChange == ItemEvent.ITEM_STATE_CHANGED){dispose();}
    }

    private void ecoSeat(ItemEvent e) {
        int stateChange = e.getStateChange();
        if (stateChange == ItemEvent.ITEM_STATE_CHANGED){dispose();}
    }
    public void checkClass(){
        Iterator<Map.Entry<String,Seat>> itTemp = mapNew.entrySet().iterator();
        if(EnterOther_3.getPsnTemp1()==null) {
            try {
                String str=Objects.requireNonNull(EnterBN_3.getPsnTemp().getBookNumber());
                Order order = oDB.getOrderByBookingNumber(str);
                int intTemp=order.getSeatClass();
                //TODO 取不到seat class
                if(intTemp==0){
                    infoText.setText("You can choose form 5 to 40");
                    busS.setEditable(false);
                }else if(intTemp==1){
                    infoText.setText("You can choose form 1 to 3");
                    ecoS.setEditable(false);
                }else if(intTemp==-1){
                    infoText.setText("Seat class is -1 now");
                }
                showSeats();

            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }
    public void showSeats() throws Exception {
        if(EnterBN_3.getPsnTemp()==null){
            try {
                map= Objects.requireNonNull(AirPassCse.flightChoose.getSeatingList());
                map.forEach((k,v)->{
                    if (!mapNew.containsValue(v)){
                        mapNew.put(k,v);
                    }
                });
                System.out.println(mapNew);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        else
        if(EnterOther_3.getPsnTemp1()==null) {
            try {
                map= Objects.requireNonNull(EnterBN_3.getFlight()).getSeatingList();
                map.forEach((k,v)->{
                    if (!mapNew.containsValue(v)){
                        mapNew.put(k,v);
                    }
                });
                System.out.println(mapNew);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }

        Iterator<Map.Entry<String,Seat>> iter = mapNew.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String,Seat> entry = iter.next();
            Seat value = entry.getValue();
            int temp=value.getSeatClass();
            switch (temp) {
                case 0:
                    ecoS.addItem(entry.getKey());
                    break;
                case 1:
//                    vip.addItem(entry.getKey());
                    break;
                case 2:
                    busS.addItem(entry.getKey());
                    break;
            }

        }
    }

    private void upGrade(ActionEvent e) {
        if(map.isEmpty()){
            JOptionPane.showMessageDialog(null, "There is no available VIP seats.","No VIP Seats", JOptionPane.WARNING_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Confirm to pay more for upgrading your seat?","Upgrade", JOptionPane.WARNING_MESSAGE);
            upgrade=true;
            resetAvSeat();
        }
    }
    //乘客选择升舱之后开放vipSeats
    public void resetAvSeat(){
        busS.setEnabled(true);
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

    private void help(ActionEvent e) {
        dispose();
        new Error().setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Gabirella Cambridge
        ResourceBundle bundle = ResourceBundle.getBundle("Check");
        panel2 = new JPanel();
        button1 = new JButton();
        button6 = new JButton();
        panel5 = new JPanel();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        dialogPane3 = new JPanel();
        panel6 = new JPanel();
        infoText = new JTextField();
        panel1 = new JPanel();
        scrollPane2 = new JScrollPane();
        label4 = new JLabel();
        panel10 = new JPanel();
        panel33 = new JPanel();
        panel11 = new JPanel();
        panel12 = new JPanel();
        label10 = new JLabel();
        panel13 = new JPanel();
        busS = new JComboBox();
        label9 = new JLabel();
        ecoS = new JComboBox();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== panel2 ========
        {
            panel2.setOpaque(false);
            panel2.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .EmptyBorder (
            0, 0 ,0 , 0) ,  "JF\u006frmDes\u0069gner \u0045valua\u0074ion" , javax. swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder
            . BOTTOM, new java. awt .Font ( "D\u0069alog", java .awt . Font. BOLD ,12 ) ,java . awt. Color .
            red ) ,panel2. getBorder () ) ); panel2. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java .
            beans. PropertyChangeEvent e) { if( "\u0062order" .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );
            panel2.setLayout(new BorderLayout());

            //---- button1 ----
            button1.setText(bundle.getString("button1.text_31"));
            button1.addActionListener(e -> help(e));
            panel2.add(button1, BorderLayout.EAST);

            //---- button6 ----
            button6.setText(bundle.getString("button6.text"));
            button6.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 26));
            button6.addActionListener(e -> {
                try {
                    button3(e);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            });
            panel2.add(button6, BorderLayout.CENTER);
        }
        contentPane.add(panel2, BorderLayout.NORTH);

        //======== panel5 ========
        {
            panel5.setOpaque(false);
            panel5.setPreferredSize(new Dimension(254, 90));
            panel5.setLayout(new GridLayout());

            //---- button2 ----
            button2.setText(bundle.getString("button2.text_23"));
            button2.addActionListener(e -> upGrade(e));
            panel5.add(button2);

            //---- button3 ----
            button3.setText(bundle.getString("button3.text_13"));
            button3.addActionListener(e -> PrintFlight(e));
            panel5.add(button3);

            //---- button4 ----
            button4.setText(bundle.getString("button4.text_6"));
            button4.addActionListener(e -> Back2Confirm(e));
            panel5.add(button4);

            //---- button5 ----
            button5.setText(bundle.getString("button5.text_3"));
            button5.addActionListener(e -> error(e));
            panel5.add(button5);
        }
        contentPane.add(panel5, BorderLayout.SOUTH);

        //======== dialogPane3 ========
        {
            dialogPane3.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane3.setOpaque(false);
            dialogPane3.setLayout(new BoxLayout(dialogPane3, BoxLayout.X_AXIS));

            //======== panel6 ========
            {
                panel6.setLayout(new BorderLayout());

                //---- infoText ----
                infoText.setEditable(false);
                panel6.add(infoText, BorderLayout.NORTH);

                //======== panel1 ========
                {
                    panel1.setLayout(new BorderLayout());
                }
                panel6.add(panel1, BorderLayout.WEST);

                //======== scrollPane2 ========
                {
                    scrollPane2.setAutoscrolls(true);
                    scrollPane2.setFocusable(false);
                    scrollPane2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                    scrollPane2.setPreferredSize(new Dimension(80, 900));
                    scrollPane2.setMinimumSize(new Dimension(50, 900));
                    scrollPane2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

                    //---- label4 ----
                    label4.setIcon(new ImageIcon(getClass().getResource("/triSear.png")));
                    label4.setPreferredSize(new Dimension(20, 572));
                    label4.setIconTextGap(0);
                    label4.setHorizontalAlignment(SwingConstants.CENTER);
                    label4.setMaximumSize(new Dimension(150, 1500));
                    label4.setMinimumSize(new Dimension(150, 1500));
                    label4.setAutoscrolls(true);
                    label4.setFocusCycleRoot(true);
                    label4.setHorizontalTextPosition(SwingConstants.CENTER);
                    scrollPane2.setViewportView(label4);
                }
                panel6.add(scrollPane2, BorderLayout.CENTER);
            }
            dialogPane3.add(panel6);

            //======== panel10 ========
            {
                panel10.setOpaque(false);
                panel10.setPreferredSize(new Dimension(250, 76));
                panel10.setMaximumSize(new Dimension(150, 550));
                panel10.setLayout(new BoxLayout(panel10, BoxLayout.Y_AXIS));

                //======== panel33 ========
                {
                    panel33.setLayout(new BoxLayout(panel33, BoxLayout.X_AXIS));
                }
                panel10.add(panel33);

                //======== panel11 ========
                {
                    panel11.setOpaque(false);
                    panel11.setLayout(new BoxLayout(panel11, BoxLayout.Y_AXIS));

                    //======== panel12 ========
                    {
                        panel12.setOpaque(false);
                        panel12.setLayout(new BoxLayout(panel12, BoxLayout.X_AXIS));
                    }
                    panel11.add(panel12);

                    //---- label10 ----
                    label10.setText(bundle.getString("label10.text_4"));
                    label10.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 18));
                    panel11.add(label10);
                }
                panel10.add(panel11);

                //======== panel13 ========
                {
                    panel13.setOpaque(false);
                    panel13.setLayout(new BoxLayout(panel13, BoxLayout.Y_AXIS));

                    //---- busS ----
                    busS.addItemListener(e -> busSeat(e));
                    panel13.add(busS);

                    //---- label9 ----
                    label9.setText(bundle.getString("label9.text_5"));
                    label9.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 18));
                    panel13.add(label9);

                    //---- ecoS ----
                    ecoS.addItemListener(e -> ecoSeat(e));
                    panel13.add(ecoS);
                }
                panel10.add(panel13);
            }
            dialogPane3.add(panel10);
        }
        contentPane.add(dialogPane3, BorderLayout.CENTER);
        setSize(900, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        init();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Gabirella Cambridge
    private JPanel panel2;
    private JButton button1;
    private JButton button6;
    private JPanel panel5;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JPanel dialogPane3;
    private JPanel panel6;
    private JTextField infoText;
    private JPanel panel1;
    private JScrollPane scrollPane2;
    private JLabel label4;
    private JPanel panel10;
    private JPanel panel33;
    private JPanel panel11;
    private JPanel panel12;
    private JLabel label10;
    private JPanel panel13;
    private JComboBox busS;
    private JLabel label9;
    private JComboBox ecoS;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

}
