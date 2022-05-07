package CheckIn.GUI;/*
 * Created by JFormDesigner on Wed Mar 30 11:36:13 CST 2022
 */

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Objects;
import java.util.ResourceBundle;

/**
 * @author Jiayi Wang
 */
public class PrintBag_11 extends JFrame {
    public static int bagNo;
    public static String stage0;
    public PrintBag_11() {
        initComponents();
    }

    private void ToMeal(ActionEvent e) {
        int temp=JOptionPane.showInternalConfirmDialog(null,
                "Ready for choosing Meal?", "Double check",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (temp == JOptionPane.NO_OPTION) {
            return;
        }if(temp == JOptionPane.YES_OPTION){
            dispose();
            stage0="BagTag";
            new Demo().setVisible(true);
//            new Meal_12().setVisible(true);
        }if(temp == JOptionPane.CANCEL_OPTION){
            dispose();
        }

    }
    public void setBagNo(){
        bagNo = (int)(Math.random()*1000000);
        for (int i = 0; i <= 200; i++)
        {
            int intFlag = (int)(Math.random() * 1000000);

            String flag = String.valueOf(intFlag);
            if (flag.length() == 6 && flag.substring(0, 1).equals("9"))
            {
                bagNo=intFlag;
            }
            else
            {
                bagNo = intFlag + 100000;
            }
        }

        if(EnterOther_3.getPsnTemp1()==null) {
            try {
                EnterBN_3.getPsnTemp().getBaggage().setBaggageNo(bagNo+"");
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }else if(EnterBN_3.getPsnTemp()==null) {
            try {
                EnterOther_3.getPsnTemp1().getBaggage().setBaggageNo(bagNo+"");
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        BagNum.setText(bagNo+"");

    }
    private void Return2Baggage(ActionEvent e) {
        dispose();
        new Baggage_7().setVisible(true);
    }
    private void showBagTag(ActionEvent e) {
        showBag();
    }
    public void showBag(){
        setBagNo();
        if(EnterBN_3.getPsnTemp()==null){
            try{
                int weightPsn = WeightShow_8.weightPsn;
                String str=weightPsn+"";
                int court=BagStore_8.court;
                String str1=court+"";
                Weight.setText(str);
                BagNum.setText(bagNo+"");
                CounterNo.setText(str1);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        else if(EnterOther_3.getPsnTemp1()==null) {
            try{
                int weightPsn = WeightShow_8.weightPsn;
                String str=weightPsn+"";
                int court=BagStore_8.court;
                String str1=court+"";
                Weight.setText(str);
                BagNum.setText(bagNo+"");
                CounterNo.setText(str1);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }else{
            try{
                int weightPsn = WeightShow_8.weightPsn;
                String str=weightPsn+"";
                int court=BagStore_8.court;
                String str1=court+"";
                Weight.setText(str);
                BagNum.setText(bagNo+"");
                CounterNo.setText(str1);
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
        // Generated using JFormDesigner Evaluation license - Gabirella Cambridge
        ResourceBundle bundle = ResourceBundle.getBundle("Check");
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        panel1 = new JPanel();
        label1 = new JLabel();
        label3 = new JLabel();
        label2 = new JLabel();
        Weight = new JTextField();
        label10 = new JLabel();
        BagNum = new JTextField();
        label4 = new JLabel();
        CounterNo = new JTextField();
        panel2 = new JPanel();
        panel4 = new JPanel();
        button3 = new JButton();
        button4 = new JButton();
        panel3 = new JPanel();
        button2 = new JButton();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setOpaque(false);
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new
            javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax
            . swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java
            .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ), java. awt
            . Color. red) ,dialogPane. getBorder( )) ); dialogPane. addPropertyChangeListener (new java. beans.
            PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .
            equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setOpaque(false);
                contentPanel.setLayout(new GridLayout());

                //======== panel1 ========
                {
                    panel1.setForeground(Color.black);
                    panel1.setBackground(Color.white);
                    panel1.setLayout(new GridBagLayout());
                    ((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {0, 265, 0, 0, 0, 0};
                    ((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {110, 62, 64, 70, 0};
                    ((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0, 0.0, 0.0, 1.0E-4};
                    ((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {1.0, 0.0, 0.0, 0.0, 1.0E-4};

                    //---- label1 ----
                    label1.setText(bundle.getString("label1.text_19"));
                    label1.setHorizontalAlignment(SwingConstants.CENTER);
                    label1.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 24));
                    label1.setOpaque(true);
                    label1.setForeground(Color.black);
                    label1.setBackground(Color.white);
                    panel1.add(label1, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0), 0, 0));

                    //---- label3 ----
                    label3.setText(bundle.getString("label3.text_4"));
                    label3.setHorizontalAlignment(SwingConstants.CENTER);
                    label3.setIcon(null);
                    label3.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 24));
                    label3.setOpaque(true);
                    label3.setPreferredSize(new Dimension(156, 20));
                    label3.setForeground(Color.black);
                    label3.setBackground(Color.white);
                    panel1.add(label3, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0), 0, 0));

                    //---- label2 ----
                    label2.setText(bundle.getString("label2.text_10"));
                    label2.setBorder(new EmptyBorder(5, 5, 5, 5));
                    label2.setForeground(Color.black);
                    label2.setBackground(Color.white);
                    label2.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
                    panel1.add(label2, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.NONE,
                        new Insets(0, 0, 0, 0), 0, 0));
                    panel1.add(Weight, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0), 0, 0));

                    //---- label10 ----
                    label10.setText(bundle.getString("label10.text_3"));
                    label10.setBorder(new EmptyBorder(5, 5, 5, 5));
                    label10.setForeground(Color.black);
                    label10.setBackground(Color.white);
                    label10.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
                    panel1.add(label10, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.NONE,
                        new Insets(0, 0, 0, 0), 0, 0));
                    panel1.add(BagNum, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0), 0, 0));

                    //---- label4 ----
                    label4.setText(bundle.getString("label4.text_3"));
                    label4.setBorder(new EmptyBorder(5, 5, 5, 5));
                    label4.setForeground(Color.black);
                    label4.setBackground(Color.white);
                    label4.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
                    panel1.add(label4, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.NONE,
                        new Insets(0, 0, 0, 0), 0, 0));
                    panel1.add(CounterNo, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                        new Insets(0, 0, 0, 0), 0, 0));
                }
                contentPanel.add(panel1);
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== panel2 ========
            {
                panel2.setOpaque(false);
                panel2.setLayout(new BorderLayout());

                //======== panel4 ========
                {
                    panel4.setOpaque(false);
                    panel4.setLayout(new BorderLayout());

                    //---- button3 ----
                    button3.setText(bundle.getString("button3.text_5"));
                    button3.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 26));
                    button3.addActionListener(e -> showBagTag(e));
                    panel4.add(button3, BorderLayout.CENTER);

                    //---- button4 ----
                    button4.setText(bundle.getString("button4.text_10"));
                    panel4.add(button4, BorderLayout.EAST);
                }
                panel2.add(panel4, BorderLayout.NORTH);
            }
            dialogPane.add(panel2, BorderLayout.NORTH);

            //======== panel3 ========
            {
                panel3.setOpaque(false);
                panel3.setPreferredSize(new Dimension(171, 90));
                panel3.setLayout(new GridLayout());

                //---- button2 ----
                button2.setText(bundle.getString("button2.text_8"));
                button2.addActionListener(e -> ToMeal(e));
                panel3.add(button2);

                //---- button1 ----
                button1.setText(bundle.getString("button1.text_10"));
                button1.addActionListener(e -> Return2Baggage(e));
                panel3.add(button1);
            }
            dialogPane.add(panel3, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(900, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        init();}

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Gabirella Cambridge
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JPanel panel1;
    private JLabel label1;
    private JLabel label3;
    private JLabel label2;
    private JTextField Weight;
    private JLabel label10;
    private JTextField BagNum;
    private JLabel label4;
    private JTextField CounterNo;
    private JPanel panel2;
    private JPanel panel4;
    private JButton button3;
    private JButton button4;
    private JPanel panel3;
    private JButton button2;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
