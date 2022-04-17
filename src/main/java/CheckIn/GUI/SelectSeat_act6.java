package CheckIn.GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.CaretEvent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ResourceBundle;
/*
 * Created by JFormDesigner on Wed Mar 30 12:24:03 CST 2022
 */

/**
 * @author JiayiWang
 */
public class SelectSeat_act6 extends JFrame {
    public SelectSeat_act6() {
        initComponents();
    }

    private void PrintFlight(ActionEvent e) {
        dispose();
        new PrintFlight_6().setVisible(true);
    }

    private void Back2Confirm(ActionEvent e) {
        dispose();
        new SeatFirst_ac5().setVisible(true);
    }

    private void SeatPa(KeyEvent e) {
        String seat = textField2.getText();
        //TODO add seat info to boarding pass
    }

    private void AvailableSeat(CaretEvent e) {
        // TODO add your code here
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
        label1 = new JLabel();
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        panel4 = new JPanel();
        label2 = new JLabel();
        avNorSeat = new JTextField();
        panel5 = new JPanel();
        label3 = new JLabel();
        textField2 = new JTextField();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setOpaque(false);
            dialogPane.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing.
            border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JFor\u006dDesi\u0067ner \u0045valu\u0061tion" , javax. swing .border . TitledBorder. CENTER
            ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .awt . Font
            . BOLD ,12 ) ,java . awt. Color .red ) ,dialogPane. getBorder () ) ); dialogPane. addPropertyChangeListener(
            new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "bord\u0065r"
            .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );
            dialogPane.setLayout(new BorderLayout());

            //---- label1 ----
            label1.setText(bundle.getString("label1.text_24"));
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setFont(new Font("Lucida Grande", Font.BOLD, 26));
            dialogPane.add(label1, BorderLayout.NORTH);

            //======== panel1 ========
            {
                panel1.setOpaque(false);
                panel1.setLayout(new BorderLayout());
            }
            dialogPane.add(panel1, BorderLayout.WEST);

            //======== panel2 ========
            {
                panel2.setOpaque(false);
                panel2.setLayout(new BorderLayout());

                //======== panel3 ========
                {
                    panel3.setOpaque(false);
                    panel3.setLayout(new BorderLayout());

                    //---- button1 ----
                    button1.setText(bundle.getString("button1.text_12"));
                    button1.addActionListener(e -> Back2Confirm(e));
                    panel3.add(button1, BorderLayout.EAST);

                    //---- button2 ----
                    button2.setText(bundle.getString("button2.text_9"));
                    button2.addActionListener(e -> PrintFlight(e));
                    panel3.add(button2, BorderLayout.WEST);
                }
                panel2.add(panel3, BorderLayout.SOUTH);

                //======== panel4 ========
                {
                    panel4.setLayout(new BorderLayout());

                    //---- label2 ----
                    label2.setText(bundle.getString("label2.text_7"));
                    label2.setOpaque(true);
                    panel4.add(label2, BorderLayout.WEST);

                    //---- avNorSeat ----
                    avNorSeat.setEditable(false);
                    avNorSeat.addCaretListener(e -> AvailableSeat(e));
                    panel4.add(avNorSeat, BorderLayout.CENTER);

                    //======== panel5 ========
                    {
                        panel5.setOpaque(false);
                        panel5.setLayout(new BorderLayout());

                        //---- label3 ----
                        label3.setText(bundle.getString("label3.text_5"));
                        panel5.add(label3, BorderLayout.WEST);

                        //---- textField2 ----
                        textField2.addKeyListener(new KeyAdapter() {
                            @Override
                            public void keyTyped(KeyEvent e) {
                                SeatPa(e);
                            }
                        });
                        panel5.add(textField2, BorderLayout.CENTER);
                    }
                    panel4.add(panel5, BorderLayout.SOUTH);
                }
                panel2.add(panel4, BorderLayout.CENTER);
            }
            dialogPane.add(panel2, BorderLayout.CENTER);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(900, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        avNorSeat.setText("Available seats: ");
        //TODO available seats
        init();
    }
    

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel dialogPane;
    private JLabel label1;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JButton button1;
    private JButton button2;
    private JPanel panel4;
    private JLabel label2;
    private JTextField avNorSeat;
    private JPanel panel5;
    private JLabel label3;
    private JTextField textField2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

}
