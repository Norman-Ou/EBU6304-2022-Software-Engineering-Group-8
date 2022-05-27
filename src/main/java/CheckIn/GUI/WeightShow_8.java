/*
 * Created by JFormDesigner on Fri Apr 29 13:19:39 CST 2022
 */

package CheckIn.GUI;

import Beans.Passenger.Passenger;
import Config.Config;
import DataBase.fDB;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * The type Weight show 8.
 *
 * @author Gabirella
 */
public class WeightShow_8 extends JFrame {
    /**
     * The constant weightPsn.
     */
    public static int weightPsn;
    /**
     * The constant dropCourt.
     */
    public static int dropCourt;

    /**
     * Instantiates a new Weight show 8.
     */
    public WeightShow_8() {
        initComponents();
    }

    private void weighBtn(ActionEvent e) {
        showWeight();
    }

    private void button3(ActionEvent e) {dispose();new PrintBag_11().setVisible(true);}

    private void Back2Bag(ActionEvent e) {dispose();new Baggage_7().setVisible(true);}

    private void help(ActionEvent e) {dispose();new Error().setVisible(true);}

    /**
     * Over weight.
     *
     * @param psn the psn
     */
    public void overWeight(Passenger psn){
        int wei = psn.getBaggage().getBaggageWeight();
        if(wei>29){
            JOptionPane.showMessageDialog(null, "Overweight Baggage.","No permission", JOptionPane.WARNING_MESSAGE);
            dispose();
            new BagStore_8().setVisible(true);

        }
    }

    /**
     * Show weight.
     */
    public void showWeight(){
        String str = "Your baggage weighs: ";
        dropCourt = (int)(Math.random()*100)+2;

        if(!(EnterOther_3.getPsnTemp1()==null)){
            overWeight(EnterOther_3.getPsnTemp1());
            EnterOther_3.getPsnTemp1().getBaggage().setDropCounter(dropCourt+"");
            try {
                weiText.setText(str+EnterOther_3.getPsnTemp1().getBaggage().getBaggageWeight()+" kg");
                weightPsn=EnterOther_3.getPsnTemp1().getBaggage().getBaggageWeight();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        } else if(!(EnterBN_3.getPsnTemp()==null))  {
            overWeight(EnterBN_3.getPsnTemp());
            EnterBN_3.getPsnTemp().getBaggage().setDropCounter(dropCourt+"");
            System.out.println(EnterBN_3.getPsnTemp().getBaggage().getDropCounter());
            try {
                weiText.setText(str+ EnterBN_3.getPsnTemp().getBaggage().getBaggageWeight()+" kg");
                weightPsn=EnterBN_3.getPsnTemp().getBaggage().getBaggageWeight();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }else if(!(EnterOther_3.getPsnTemp2()==null)){
            overWeight(EnterOther_3.getPsnTemp2());
            EnterOther_3.getPsnTemp2().getBaggage().setDropCounter(dropCourt+"");
            try {
                weiText.setText(str+EnterOther_3.getPsnTemp2().getBaggage().getBaggageWeight()+" kg");
                weightPsn=EnterOther_3.getPsnTemp2().getBaggage().getBaggageWeight();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }

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
        // Generated using JFormDesigner Evaluation license - Gabirella Cambridge
        ResourceBundle bundle = ResourceBundle.getBundle("Check");
        dialogPane2 = new JPanel();
        contentPanel2 = new JPanel();
        button1 = new JButton();
        weiText = new JTextField();
        panel2 = new JPanel();
        label1 = new JLabel();
        button4 = new JButton();
        panel1 = new JPanel();
        button3 = new JButton();
        button2 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane2 ========
        {
            dialogPane2.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane2.setOpaque(false);
            dialogPane2.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax.
                    swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", javax. swing. border
                    . TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069al\u006fg"
                    ,java .awt .Font .BOLD ,12 ), java. awt. Color. red) ,dialogPane2. getBorder
                    ( )) ); dialogPane2. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java
                                                                                                                                                              .beans .PropertyChangeEvent e) {if ("\u0062or\u0064er" .equals (e .getPropertyName () )) throw new RuntimeException
                ( ); }} );
            dialogPane2.setLayout(new BorderLayout());

            //======== contentPanel2 ========
            {
                contentPanel2.setOpaque(false);
                contentPanel2.setLayout(new GridLayout(0, 1));

                //---- button1 ----
                button1.setText(bundle.getString("button1.text_13"));
                button1.setFont(button1.getFont().deriveFont(button1.getFont().getSize() + 2f));
                button1.addActionListener(e -> weighBtn(e));
                contentPanel2.add(button1);

                //---- weiText ----
                weiText.setHorizontalAlignment(SwingConstants.CENTER);
                weiText.setFont(new Font(".AppleSystemUIFont", Font.BOLD | Font.ITALIC, 26));
                contentPanel2.add(weiText);
            }
            dialogPane2.add(contentPanel2, BorderLayout.CENTER);

            //======== panel2 ========
            {
                panel2.setOpaque(false);
                panel2.setLayout(new BorderLayout());

                //---- label1 ----
                label1.setText(bundle.getString("label1.text_32"));
                label1.setHorizontalAlignment(SwingConstants.CENTER);
                label1.setFont(new Font("Lucida Grande", Font.BOLD, 30));
                panel2.add(label1, BorderLayout.CENTER);

                //---- button4 ----
                button4.setText(bundle.getString("button4.text_11"));
                button4.addActionListener(e -> help(e));
                panel2.add(button4, BorderLayout.EAST);
            }
            dialogPane2.add(panel2, BorderLayout.NORTH);

            //======== panel1 ========
            {
                panel1.setOpaque(false);
                panel1.setPreferredSize(new Dimension(171, 90));
                panel1.setLayout(new GridLayout());

                //---- button3 ----
                button3.setText(bundle.getString("button3.text_11"));
                button3.addActionListener(e -> button3(e));
                panel1.add(button3);

                //---- button2 ----
                button2.setText(bundle.getString("button2.text_18"));
                button2.addActionListener(e -> Back2Bag(e));
                panel1.add(button2);
            }
            dialogPane2.add(panel1, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane2, BorderLayout.CENTER);
        setSize(900, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        setBackground();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Gabirella Cambridge
    private JPanel dialogPane2;
    private JPanel contentPanel2;
    private JButton button1;
    private JTextField weiText;
    private JPanel panel2;
    private JLabel label1;
    private JButton button4;
    private JPanel panel1;
    private JButton button3;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
