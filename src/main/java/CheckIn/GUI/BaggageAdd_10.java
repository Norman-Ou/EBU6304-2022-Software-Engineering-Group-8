package CheckIn.GUI;

import Beans.Passenger.Passenger;
import Beans.Passenger.SubClasses.Baggage;
import DataBase.pDB;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ResourceBundle;
/*
 * Created by JFormDesigner on Wed Mar 30 17:42:23 CST 2022
 */



/**
 * @author Jiayi Wang
 */
public class BaggageAdd_10 extends JFrame {

    public BaggageAdd_10() {
        initComponents();
    }
    public String bookNum;
    public static Passenger psnTemp;
    
    private void BackWeight(ActionEvent e) {
        dispose();
        new Weight_9().setVisible(true);
    }
    private void adBagPay(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Make sure your are in a safe payment environment","Safe pay", JOptionPane.WARNING_MESSAGE);
        dispose();
        new CreditPage().setVisible(true);
        //TODO baggage tag
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
        dialogPane2 = new JPanel();
        contentPanel2 = new JPanel();
        panel1 = new JPanel();
        panel2 = new JPanel();
        adBagPay = new JButton();
        buttonBar2 = new JPanel();
        cancelButton2 = new JButton();
        label1 = new JLabel();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane2 ========
        {
            dialogPane2.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane2.setOpaque(false);
            dialogPane2.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax
            . swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e", javax. swing
            . border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .
            Font ("Dialo\u0067" ,java .awt .Font .BOLD ,12 ), java. awt. Color. red
            ) ,dialogPane2. getBorder( )) ); dialogPane2. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override
            public void propertyChange (java .beans .PropertyChangeEvent e) {if ("borde\u0072" .equals (e .getPropertyName (
            ) )) throw new RuntimeException( ); }} );
            dialogPane2.setLayout(new BorderLayout());

            //======== contentPanel2 ========
            {
                contentPanel2.setLayout(new GridLayout());

                //======== panel1 ========
                {
                    panel1.setLayout(new GridLayout());

                    //======== panel2 ========
                    {
                        panel2.setLayout(new GridLayout());

                        //---- adBagPay ----
                        adBagPay.setText(bundle.getString("adBagPay.text_21"));
                        adBagPay.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 20));
                        adBagPay.addActionListener(e -> adBagPay(e));
                        panel2.add(adBagPay);
                    }
                    panel1.add(panel2);
                }
                contentPanel2.add(panel1);
            }
            dialogPane2.add(contentPanel2, BorderLayout.CENTER);

            //======== buttonBar2 ========
            {
                buttonBar2.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar2.setLayout(new FlowLayout());

                //---- cancelButton2 ----
                cancelButton2.setText(bundle.getString("cancelButton2.text"));
                cancelButton2.addActionListener(e -> BackWeight(e));
                buttonBar2.add(cancelButton2);
            }
            dialogPane2.add(buttonBar2, BorderLayout.SOUTH);

            //---- label1 ----
            label1.setText(bundle.getString("label1.text_27"));
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setFont(new Font("Lucida Grande", Font.BOLD, 25));
            dialogPane2.add(label1, BorderLayout.NORTH);
        }
        contentPane.add(dialogPane2, BorderLayout.CENTER);
        setSize(900, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        init();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel dialogPane2;
    private JPanel contentPanel2;
    private JPanel panel1;
    private JPanel panel2;
    private JButton adBagPay;
    private JPanel buttonBar2;
    private JButton cancelButton2;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
