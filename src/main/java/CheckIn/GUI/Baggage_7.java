package CheckIn.GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ResourceBundle;
/*
 * Created by JFormDesigner on Tue Mar 29 20:16:17 CST 2022
 */

/**
 * @author Jiayi Wang
 */
public class Baggage_7 extends JFrame {
    public Baggage_7() {
        initComponents();
    }

    private void weight(ActionEvent e) {
        dispose();
        new WeightShow_8().setVisible(true);
    }

    private void storeBaggage(ActionEvent e) {
        dispose();
        new BagStore_8().setVisible(true);
    }

    private void BagAdd(ActionEvent e) {
//        JOptionPane.showMessageDialog(null, "Confirm more payment for baggage?","Baggage extra payment check", JOptionPane.WARNING_MESSAGE);
        dispose();
        new BagStore_8().setVisible(true);
//        new BaggageAdd_10().setVisible(true);
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

    private void seatAgain(ActionEvent e) {
        dispose();
        new SeatFirst_5().setVisible(true);
    }

    private void error(ActionEvent e) {
        dispose();
        new Error().setVisible(true);
    }

    private void initComponents() {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Gabirella
        ResourceBundle bundle = ResourceBundle.getBundle("Check");
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        button2 = new JButton();
        button1 = new JButton();
        button3 = new JButton();
        label1 = new JLabel();
        buttonBar = new JPanel();
        cancelButton = new JButton();
        button4 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setOpaque(false);
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border.
            EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e", javax. swing. border. TitledBorder. CENTER, javax. swing
            . border. TitledBorder. BOTTOM, new java .awt .Font ("Dialo\u0067" ,java .awt .Font .BOLD ,12 ),
            java. awt. Color. red) ,dialogPane. getBorder( )) ); dialogPane. addPropertyChangeListener (new java. beans. PropertyChangeListener( )
            { @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("borde\u0072" .equals (e .getPropertyName () ))
            throw new RuntimeException( ); }} );
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(new GridLayout());

                //---- button2 ----
                button2.setText(bundle.getString("button2.text_6"));
                button2.addActionListener(e -> weight(e));
                contentPanel.add(button2);

                //---- button1 ----
                button1.setText(bundle.getString("button1.text_15"));
                button1.addActionListener(e -> BagAdd(e));
                contentPanel.add(button1);

                //---- button3 ----
                button3.setText(bundle.getString("button3.text_4"));
                button3.addActionListener(e -> storeBaggage(e));
                contentPanel.add(button3);
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //---- label1 ----
            label1.setText(bundle.getString("label1.text_16"));
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setFont(new Font("Lucida Grande", Font.BOLD, 28));
            dialogPane.add(label1, BorderLayout.NORTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(900, 550);
        setLocationRelativeTo(getOwner());

        //======== buttonBar ========
        {
            buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
            buttonBar.setOpaque(false);
            buttonBar.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .
            EmptyBorder ( 0, 0 ,0 , 0) ,  "JFor\u006dDesi\u0067ner \u0045valu\u0061tion" , javax. swing .border . TitledBorder. CENTER ,javax . swing
            . border .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,
            java . awt. Color .red ) ,buttonBar. getBorder () ) ); buttonBar. addPropertyChangeListener( new java. beans .PropertyChangeListener ( )
            { @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "bord\u0065r" .equals ( e. getPropertyName () ) )
            throw new RuntimeException( ) ;} } );
            buttonBar.setLayout(new FlowLayout());

            //---- cancelButton ----
            cancelButton.setText(bundle.getString("cancelButton.text_17"));
            cancelButton.addActionListener(e -> seatAgain(e));
            buttonBar.add(cancelButton);

            //---- button4 ----
            button4.setText(bundle.getString("button4.text_3"));
            button4.addActionListener(e -> error(e));
            buttonBar.add(button4);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        init();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Gabirella
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JButton button2;
    private JButton button1;
    private JButton button3;
    private JLabel label1;
    private JPanel buttonBar;
    private JButton cancelButton;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


}
