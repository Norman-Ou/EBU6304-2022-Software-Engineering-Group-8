package CheckIn.GUI;

import javax.swing.event.*;
import Beans.Flight.Flight;
import Beans.Passenger.SubClasses.BoardingPass;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Objects;
import java.util.ResourceBundle;
/*
 * Created by JFormDesigner on Wed Mar 30 17:09:39 CST 2022
 */



/**
 * @author Jiayi Wang
 */
public class SeatFirst_5 extends JFrame {
    String fType = null;
    public SeatFirst_5() {
        initComponents();
    }

    private void checkinAgain(ActionEvent e) {
        dispose();
        new CheckIn_2().setVisible(true);
    }

    private void error(ActionEvent e) {
        dispose();
        new Error().setVisible(true);
    }
    private void seletSeat(ActionEvent e) {
        //TODO check airline
        dispose();
        new Seat_1_6().setVisible(true);
    }


//        if(EnterBN_3.getPsnTemp()==null){
//
//                fType= Objects.requireNonNull(EnterOther_3.getFlight()).getFlightType();
////                jumpSeat();
//            dispose();
//            new Seat_1_6().setVisible(true);
//        }
//        else if(EnterOther_3.getPsnTemp1()==null) {
//                fType= Objects.requireNonNull(EnterBN_3.getFlight()).getFlightType();
////                jumpSeat();
//        }else{
//
//                fType= Objects.requireNonNull(EnterOther_3.getFlight()).getFlightType();
////                jumpSeat();
//
//        }
//    }
    public void jumpSeat(){
        if(Objects.equals(fType, "A")){
            dispose();
            new Seat_1_6().setVisible(true);
        }else if(Objects.equals(fType, "B")){
            dispose();
            new Seat_3_6().setVisible(true);
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

    private void selectSeat(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Gabirella
        ResourceBundle bundle = ResourceBundle.getBundle("Check");
        label1 = new JLabel();
        dialogPane = new JPanel();
        buttonBar = new JPanel();
        cancelButton = new JButton();
        button3 = new JButton();
        panel1 = new JPanel();
        button2 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //---- label1 ----
        label1.setText(bundle.getString("label1.text_25"));
        label1.setFont(new Font("Lucida Grande", Font.BOLD, 30));
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(label1, BorderLayout.NORTH);

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setOpaque(false);
            dialogPane.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border
            .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e" , javax. swing .border . TitledBorder. CENTER ,javax
            . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "Dialo\u0067", java .awt . Font. BOLD ,
            12 ) ,java . awt. Color .red ) ,dialogPane. getBorder () ) ); dialogPane. addPropertyChangeListener( new java. beans
            .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "borde\u0072" .equals ( e.
            getPropertyName () ) )throw new RuntimeException( ) ;} } );
            dialogPane.setLayout(new BorderLayout());

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setOpaque(false);
                buttonBar.setLayout(new FlowLayout());

                //---- cancelButton ----
                cancelButton.setText(bundle.getString("cancelButton.text_16"));
                cancelButton.addActionListener(e -> checkinAgain(e));
                buttonBar.add(cancelButton);

                //---- button3 ----
                button3.setText(bundle.getString("button3.text_8"));
                button3.addActionListener(e -> error(e));
                buttonBar.add(button3);
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);

            //======== panel1 ========
            {
                panel1.setLayout(new GridLayout());
            }
            dialogPane.add(panel1, BorderLayout.NORTH);

            //---- button2 ----
            button2.setText(bundle.getString("button2.text_10"));
            button2.addActionListener(e -> selectSeat(e));
            dialogPane.add(button2, BorderLayout.CENTER);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(900, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        init();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Gabirella
    private JLabel label1;
    private JPanel dialogPane;
    private JPanel buttonBar;
    private JButton cancelButton;
    private JButton button3;
    private JPanel panel1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
