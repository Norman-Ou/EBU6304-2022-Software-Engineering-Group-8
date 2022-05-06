/*
 * Created by JFormDesigner on Fri Apr 29 13:19:39 CST 2022
 */

package CheckIn.GUI;

import DataBase.fDB;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Gabirella
 */
public class WeightShow_8 extends JFrame {
    public static int weightPsn;
    public WeightShow_8() {
        initComponents();
    }

    private void weighBtn(ActionEvent e) {
        showWeight();
    }

    private void button3(ActionEvent e) {
        dispose();
        new PrintBag_11().setVisible(true);
    }

    private void Back2Bag(ActionEvent e) {
        dispose();
        new Baggage_7().setVisible(true);
    }
    public void showWeight(){
        if(EnterBN_3.getPsnTemp()==null){
            try {
                weightNum.setText(String.valueOf(EnterOther_3.getPsnTemp1().getBaggage().getBaggageWeight()));
                weightPsn=EnterOther_3.getPsnTemp1().getBaggage().getBaggageWeight();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        else if(EnterOther_3.getPsnTemp1()==null) {
            try {
                weightNum.setText(String.valueOf(EnterBN_3.getPsnTemp().getBaggage().getBaggageWeight()));
                weightPsn=EnterBN_3.getPsnTemp().getBaggage().getBaggageWeight();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }
    public void init() {
        ImageIcon background = new ImageIcon("src/main/resources/img.png");
        JLabel label3 = new JLabel(background);
        label3.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());
        JPanel myPanel = (JPanel)this.getContentPane();
        myPanel.setOpaque(false);
//        myPanel.setLayout(new FlowLayout());
//        this.getLayeredPane().setLayout(null);
        this.getLayeredPane().add(label3, Integer.valueOf(Integer.MIN_VALUE));
        this.setTitle("Passenger check-in system");
//        this.setBounds(300, 300, background.getIconWidth(), background.getIconHeight());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Gabirella
        ResourceBundle bundle = ResourceBundle.getBundle("Check");
        dialogPane2 = new JPanel();
        contentPanel2 = new JPanel();
        button1 = new JButton();
        weightNum = new JTextArea();
        label1 = new JLabel();
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
            dialogPane2.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing.
            border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", javax. swing. border. TitledBorder. CENTER
            , javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069al\u006fg" ,java .awt .Font
            .BOLD ,12 ), java. awt. Color. red) ,dialogPane2. getBorder( )) ); dialogPane2. addPropertyChangeListener (
            new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062or\u0064er"
            .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
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

                //---- weightNum ----
                weightNum.setEditable(false);
                contentPanel2.add(weightNum);
            }
            dialogPane2.add(contentPanel2, BorderLayout.CENTER);

            //---- label1 ----
            label1.setText(bundle.getString("label1.text_32"));
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setFont(new Font("Lucida Grande", Font.BOLD, 30));
            dialogPane2.add(label1, BorderLayout.NORTH);

            //======== panel1 ========
            {
                panel1.setOpaque(false);
                panel1.setLayout(new FlowLayout());

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
        init();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Gabirella
    private JPanel dialogPane2;
    private JPanel contentPanel2;
    private JButton button1;
    private JTextArea weightNum;
    private JLabel label1;
    private JPanel panel1;
    private JButton button3;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
