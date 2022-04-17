package PassengerGUI;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ResourceBundle;
/*
 * Created by JFormDesigner on Tue Mar 29 18:42:43 CST 2022
 */



/**
 * @author Jiayi Wang
 */
public class Weight_9 extends JFrame {
    public Weight_9() {
        initComponents();
    }

    private void PrintBag(ActionEvent e) {
        dispose();
        new PrintBag_11().setVisible(true);
    }

    private void AddBag(ActionEvent e) {
        dispose();
        new BaggageAdd_10().setVisible(true);
    }

    private void Back2Bag(ActionEvent e) {
        dispose();
        new Baggage_7().setVisible(true);
    }
    private void weighBtn(ActionEvent e) {
        double wei = Math.random()*30;

        if(wei<21){
            weightNum.setText("Your baggage weighs: "+ wei);
        }
        else{
            weightNum.setText("Your baggage weighs: "+ wei);
            JOptionPane.showMessageDialog(null, "Your baggage is overweight, please return to store or buy more baggage allowance.","Overweight baggage options", JOptionPane.QUESTION_MESSAGE);
        }
        // TODO write wei into baggage tag
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
        contentPanel = new JPanel();
        button1 = new JButton();
        weightNum = new JTextArea();
        panel1 = new JPanel();
        button4 = new JButton();
        button3 = new JButton();
        button2 = new JButton();
        label1 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setOpaque(false);
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder(
            0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder
            . BOTTOM, new java .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ), java. awt. Color.
            red) ,dialogPane. getBorder( )) ); dialogPane. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .
            beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setOpaque(false);
                contentPanel.setLayout(new GridLayout(0, 1));

                //---- button1 ----
                button1.setText(bundle.getString("button1.text_19"));
                button1.setFont(button1.getFont().deriveFont(button1.getFont().getSize() + 2f));
                button1.addActionListener(e -> weighBtn(e));
                contentPanel.add(button1);

                //---- weightNum ----
                weightNum.setEditable(false);
                contentPanel.add(weightNum);

                //======== panel1 ========
                {
                    panel1.setOpaque(false);
                    panel1.setLayout(new GridLayout());

                    //---- button4 ----
                    button4.setText(bundle.getString("button4.text"));
                    button4.addActionListener(e -> PrintBag(e));
                    panel1.add(button4);

                    //---- button3 ----
                    button3.setText(bundle.getString("button3.text"));
                    button3.addActionListener(e -> AddBag(e));
                    panel1.add(button3);

                    //---- button2 ----
                    button2.setText(bundle.getString("button2.text_2"));
                    button2.addActionListener(e -> Back2Bag(e));
                    panel1.add(button2);
                }
                contentPanel.add(panel1);
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //---- label1 ----
            label1.setText(bundle.getString("label1.text_9"));
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setFont(new Font("Lucida Grande", Font.BOLD, 30));
            dialogPane.add(label1, BorderLayout.NORTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(900, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        init();}

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JButton button1;
    private JTextArea weightNum;
    private JPanel panel1;
    private JButton button4;
    private JButton button3;
    private JButton button2;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
