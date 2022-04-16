/*
 * Created by JFormDesigner on Sat Apr 16 09:14:50 CST 2022
 */

package PassengerGUI;

import DataBase.pDB;
import Passenger.Passenger;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author unknown
 */
public class EnterOther extends JFrame {
    public EnterOther() {
        initComponents();
    }

    public String IDNum;
    public String surname;
    public static Passenger psnTemp1;
    private void ok(ActionEvent e) throws Exception {
        new ConfirmPage_4().setVisible(true);
        dispose();
        String str=textArea1.getText();
        this.IDNum=str;
//        System.out.println(bookNum);
        Passenger psn = pDB.loadPassengerBySurname_ID(surname,IDNum);
//        System.out.println(psn);
        psnTemp1=psn;
    }
    public static Passenger getPsnTemp1() {
        System.out.println(psnTemp1);
        return psnTemp1;
    }

    private void cancel(ActionEvent e) {
        new Airline_1().setVisible(true);
        dispose();
    }


    private void textArea1CaretUpdate(ItemEvent e) {
        String sur =(e.getItem()).toString();
        System.out.println(sur);
    }

    public void init() {
        ImageIcon background = new ImageIcon("src/main/java/img/img.png");//要设置的背景图片
        JLabel label3 = new JLabel(background);		//把背景图片添加到标签里
        label3.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());	//把标签设置为和图片等高等宽
        JPanel myPanel = (JPanel)this.getContentPane();		//把我的面板设置为内容面板
        myPanel.setOpaque(false);					//把我的面板设置为不可视
//        myPanel.setLayout(new FlowLayout());		//把我的面板设置为流动布局
//        this.getLayeredPane().setLayout(null);		//把分层面板的布局置空
        this.getLayeredPane().add(label3, new Integer(Integer.MIN_VALUE));		//把标签添加到分层面板的最底层
        //设置界面属性
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
        buttonBar2 = new JPanel();
        okButton2 = new JButton();
        cancelButton2 = new JButton();
        textArea1 = new JTextArea();
        label1 = new JLabel();
        scrollPane1 = new JScrollPane();
        panel1 = new JPanel();
        textArea2 = new JTextArea();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane2 ========
        {
            dialogPane2.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane2.setOpaque(false);
            dialogPane2.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax
            . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e" , javax. swing
            .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .
            Font ( "Dialo\u0067", java .awt . Font. BOLD ,12 ) ,java . awt. Color .red
            ) ,dialogPane2. getBorder () ) ); dialogPane2. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override
            public void propertyChange (java . beans. PropertyChangeEvent e) { if( "borde\u0072" .equals ( e. getPropertyName (
            ) ) )throw new RuntimeException( ) ;} } );
            dialogPane2.setLayout(new BorderLayout());

            //======== buttonBar2 ========
            {
                buttonBar2.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar2.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar2.getLayout()).columnWidths = new int[] {0, 85, 80};
                ((GridBagLayout)buttonBar2.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0};

                //---- okButton2 ----
                okButton2.setText(bundle.getString("okButton2.text_3"));
                okButton2.addActionListener(e -> {
                    try {
                        ok(e);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                });
                buttonBar2.add(okButton2, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- cancelButton2 ----
                cancelButton2.setText(bundle.getString("cancelButton2.text_3"));
                cancelButton2.addActionListener(e -> cancel(e));
                buttonBar2.add(cancelButton2, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane2.add(buttonBar2, BorderLayout.SOUTH);
            dialogPane2.add(textArea1, BorderLayout.WEST);

            //---- label1 ----
            label1.setText(bundle.getString("label1.text_29"));
            label1.setFont(new Font(".AppleSystemUIFont", Font.BOLD | Font.ITALIC, 26));
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            dialogPane2.add(label1, BorderLayout.NORTH);

            //======== scrollPane1 ========
            {

                //======== panel1 ========
                {
                    panel1.setLayout(new GridLayout());
                    panel1.add(textArea2);
                }
                scrollPane1.setViewportView(panel1);
            }
            dialogPane2.add(scrollPane1, BorderLayout.CENTER);
        }
        contentPane.add(dialogPane2, BorderLayout.CENTER);
        setSize(905, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        init();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel dialogPane2;
    private JPanel buttonBar2;
    private JButton okButton2;
    private JButton cancelButton2;
    private JTextArea textArea1;
    private JLabel label1;
    private JScrollPane scrollPane1;
    private JPanel panel1;
    private JTextArea textArea2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private static Passenger psnTemp;

    public void searchBySur(ItemEvent e) {
        String surName =(e.getItem()).toString();
        Passenger psn = pDB.loadPassengerByBookingNo(surName);
        psnTemp=psn;
    }

    public static Passenger getPassenger(){
        return psnTemp;
    }
}
