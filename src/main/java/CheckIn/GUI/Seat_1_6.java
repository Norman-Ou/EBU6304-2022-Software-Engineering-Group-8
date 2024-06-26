/*
 * Created by JFormDesigner on Tue Apr 26 23:30:57 CST 2022
 */

package CheckIn.GUI;

import Beans.Flight.SubClasses.Seat;
import Beans.Order.Order;
import DataBase.oDB;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.util.*;


/**
 * The type Seat 1 6.
 *
 * @author Jiayi Wang
 */
public class Seat_1_6 extends JFrame {
    /**
     * The constant seat.
     */
    public static String seat;
    private static HashMap<String, Seat> mapNew = new HashMap<>();
    private static HashMap<String, Seat> map=new HashMap<>();
    /**
     * The constant upgrade.
     * True for upgrading.
     */
    public static boolean upgrade;
    /**
     * The Entry.
     */
    public static Map.Entry<String,Seat> entry;

    public static int stateChangeTemp1;
    public static int stateChangeTemp2;

    /**
     * Instantiates a new Seat 1 6.
     *
     * @throws Exception the exception
     */
    public Seat_1_6() throws Exception {initComponents();}

    private void error(ActionEvent e) {dispose();new Error().setVisible(true);}

    private void Return(ActionEvent e) {dispose();

        new ConfirmPage_3().setVisible(true);}

    private void upGrade(ActionEvent e) {setUpgrade();}

    private void help(ActionEvent e) {dispose();new Error().setVisible(true);}

    private void firClass(ItemEvent e) {
        int stateChange = e.getStateChange();
        if (stateChange == ItemEvent.ITEM_STATE_CHANGED){
            stateChangeTemp1=stateChange;

        }
        seat=vip.getSelectedItem().toString();
    }
    private void ecoSeat(ItemEvent e) {
        int stateChange = e.getStateChange();

        if (stateChange == ItemEvent.ITEM_STATE_CHANGED){
            stateChangeTemp2=stateChange;
        }seat=ecoS.getSelectedItem().toString();
    }

    private void PrintFlight(ActionEvent e) throws Exception {dispose();
        sortSeat();
        if(upgrade){

                JOptionPane.showMessageDialog(null, "You have chosen seat "+seat,"Seat confirm", JOptionPane.QUESTION_MESSAGE);
            dispose();
                new Meal_12().setVisible(true);
            }else{

                JOptionPane.showMessageDialog(null, "You have chosen seat "+seat,"Seat confirm", JOptionPane.QUESTION_MESSAGE);
            dispose();
                new Meal_12().setVisible(true);
            }
//        }
    }
    /**
     * Check class.
     */
    public void checkClass(){
        Iterator<Map.Entry<String,Seat>> itTemp = mapNew.entrySet().iterator();
        if(!(EnterOther_3.getPsnTemp1()==null)) {
            try {setCombox();} catch (Exception e1) {e1.printStackTrace();}
        }else if(!(EnterOther_3.getPsnTemp2()==null)){
            try {setCombox();} catch (Exception e1) {e1.printStackTrace();}
        }else if(!(EnterOther_3.getPsnTemp1()==null)){
            try {setCombox();} catch (Exception e1) {e1.printStackTrace();}
        }
    }

    /**
     * Gets seat clazz.
     *
     * @return the seat clazz
     * @throws Exception the exception
     */
    public int getSeatClazz() throws Exception {
        int clazz;
        if(EnterBN_3.getPsnTemp() != null){
            Order order = oDB.getOrderByBookingNumber(EnterBN_3.getPsnTemp().getBookNumber());
            clazz =order.getSeatClass();
            return clazz;
        }else if(EnterOther_3.getPsnTemp1() != null){
            Order other2 = oDB.getOrderByBookingNumber(EnterOther_3.getPsnTemp1().getBookNumber());
            clazz =other2.getSeatClass();
            return clazz;
        }else if(EnterOther_3.getPsnTemp2() != null){
            Order other2 = oDB.getOrderByBookingNumber(EnterOther_3.getPsnTemp2().getBookNumber());
            clazz =other2.getSeatClass();
            return clazz;
        }
        return -1;
    }

    /**
     * Sets combox.
     *
     * @throws Exception the exception
     */
    public void setCombox() throws Exception {

        int intTemp=getSeatClazz();
        if(intTemp==0){
            vip.setEnabled(false);
        }else if(intTemp==2){
            ecoS.setEnabled(false);
        }else if(intTemp==-1){
            ecoS.setEnabled(false);
            vip.setEnabled(false);
        }
        showSeats();
    }





    /**
     * Show seats.
     *
     * @throws Exception the exception
     */
    public void showSeats() throws Exception {
        if(EnterBN_3.getPsnTemp()==null){
            try {
                map= Objects.requireNonNull(AirPassCse.flightChoose.getSeatingList());
                map.forEach((k,v)->{
                    if (!mapNew.containsValue(v)){
                        mapNew.put(k,v);
                    }
                });
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        else if(EnterOther_3.getPsnTemp1()==null) {
            try {
                map= Objects.requireNonNull(EnterBN_3.getFlight()).getSeatingList();
                map.forEach((k,v)->{
                    if (!mapNew.containsValue(v)){
                        mapNew.put(k,v);
                    }
                });
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }else{
            try {
                map= Objects.requireNonNull(AirPassCse.flightChoose.getSeatingList());
                map.forEach((k,v)->{
                    if (!mapNew.containsValue(v)){
                        mapNew.put(k,v);
                    }
                });
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        Iterator<Map.Entry<String,Seat>> iter;
        iter = mapNew.entrySet().iterator();
        while(iter.hasNext()){

            entry = iter.next();
            for(String str : sortSeat()){
                String str1=str.substring(0,2);
                int i = Integer.parseInt(str1);
                if(i<3){
                    vip.addItem(str);
                }else if(i>2&&i<31){
                    ecoS.addItem(str);
                }
            }
            break;
        }

    }

    /**
     * Sort seat array list.
     *
     * @return the array list
     */
    public static ArrayList<String> sortSeat(){
        ArrayList<String> seatList=new ArrayList<>();
        Iterator<Map.Entry<String,Seat>> iter1 = mapNew.entrySet().iterator();
        ArrayList<Integer> arr = new ArrayList<>();
        while(iter1.hasNext()){
            seatList.add(iter1.next().getKey());
            for(int i=0; i<seatList.size();i++){
                Integer firSeat=Integer.parseInt(seatList.get(i).substring(0,2));

                arr.add(firSeat);

                Arrays.sort(new ArrayList[]{arr});
            }
        }
        seatList.sort(Comparator.naturalOrder());
        return seatList;
    }

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


    /**
     * Reset av seat.
     * Open all combox after upgrading.
     */
    public void resetAvSeat(){
        vip.setEnabled(true);
        ecoS.setEnabled(false);

    }

    /**
     * Set upgrade.
     */
    public void setUpgrade(){
        if(map.isEmpty()){
            JOptionPane.showMessageDialog(null, "There is no available VIP seats.","No VIP Seats", JOptionPane.WARNING_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Confirm to pay more for upgrading your seat?","Upgrade", JOptionPane.WARNING_MESSAGE);
            upgrade=true;
            resetAvSeat();
        }
    }

    private void initComponents() throws Exception {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        ResourceBundle bundle = ResourceBundle.getBundle("Check");
        panel1 = new JPanel();
        button5 = new JButton();
        button3 = new JButton();
        panel3 = new JPanel();
        button6 = new JButton();
        button2 = new JButton();
        button1 = new JButton();
        button4 = new JButton();
        dialogPane2 = new JPanel();
        panel4 = new JPanel();
        scrollPane1 = new JScrollPane();
        label2 = new JLabel();
        panel10 = new JPanel();
        panel6 = new JPanel();
        panel2 = new JPanel();
        label9 = new JLabel();
        panel5 = new JPanel();
        vip = new JComboBox();
        panel11 = new JPanel();
        label7 = new JLabel();
        ecoS = new JComboBox();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== panel1 ========
        {
            panel1.setOpaque(false);
            panel1.setLayout(new BorderLayout());

            //---- button5 ----
            button5.setText(bundle.getString("button5.text_5"));
            button5.addActionListener(e -> help(e));
            panel1.add(button5, BorderLayout.EAST);

            //---- button3 ----
            button3.setText(bundle.getString("button3.text_12"));
            button3.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 26));
            panel1.add(button3, BorderLayout.CENTER);
        }
        contentPane.add(panel1, BorderLayout.NORTH);

        //======== panel3 ========
        {
            panel3.setOpaque(false);
            panel3.setPreferredSize(new Dimension(254, 90));
            panel3.setLayout(new GridLayout());

            //---- button6 ----
            button6.setText(bundle.getString("button6.text_3"));
            button6.addActionListener(e -> upGrade(e));
            panel3.add(button6);

            //---- button2 ----
            button2.setText(bundle.getString("button2.text_16"));
            button2.addActionListener(e -> {
                try {
                    PrintFlight(e);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            });
            panel3.add(button2);

            //---- button1 ----
            button1.setText(bundle.getString("button1.text_24"));
            button1.addActionListener(e -> Return(e));
            panel3.add(button1);

            //---- button4 ----
            button4.setText(bundle.getString("button4.text_7"));
            button4.addActionListener(e -> error(e));
            panel3.add(button4);
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
                }
                panel10.add(panel2);

                //======== panel11 ========
                {
                    panel11.setLayout(new BoxLayout(panel11, BoxLayout.Y_AXIS));

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
        setBackground();
        checkClass();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JButton button5;
    private JButton button3;
    private JPanel panel3;
    private JButton button6;
    private JButton button2;
    private JButton button1;
    private JButton button4;
    private JPanel dialogPane2;
    private JPanel panel4;
    private JScrollPane scrollPane1;
    private JLabel label2;
    private JPanel panel10;
    private JPanel panel6;
    private JPanel panel2;
    private JLabel label9;
    private JPanel panel5;
    private JComboBox vip;
    private JPanel panel11;
    private JLabel label7;
    private JComboBox ecoS;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

}