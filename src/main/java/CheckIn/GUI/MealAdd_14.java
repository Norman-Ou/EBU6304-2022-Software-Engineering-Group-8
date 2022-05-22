package CheckIn.GUI;

import Beans.Flight.SubClasses.ExtraOption;
import CheckIn.Monitor.cMonitors;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;
/*
 * Created by JFormDesigner on Tue Mar 29 21:14:55 CST 2022
 */



/**
 * @author Jiayi Wang
 */
public class MealAdd_14 extends JFrame {
    public static String VIPmealSelected;
    public static ArrayList<ExtraOption> arrayMeal;
    public static int price;

    public MealAdd_14() {
        initComponents();
    }

    private void adMealState(ChangeEvent e) {
        JTabbedPane tabbedPane = (JTabbedPane) e.getSource();
        int selectedIndex = tabbedPane.getSelectedIndex();
        switch (selectedIndex) {
            case 0:
                VIPmealSelected="Sashimi";
                System.out.println("Sashimi");
                if(!(EnterBN_3.getPsnTemp()==null)) {
                    arrayMeal = Objects.requireNonNull(EnterBN_3.getPsnTemp()).getExtraOptions();
                    if (arrayMeal.get(0).getKind() == 1) {
                        arrayMeal.get(0).setDescription("Sashimi");
                        arrayMeal.get(0).setPrice(10);
                        price = 10;
                    }
                }
                if(!(EnterOther_3.getPsnTemp1()==null)){
                    arrayMeal=Objects.requireNonNull(EnterOther_3.getPsnTemp1()).getExtraOptions();
                    if (arrayMeal.get(0).getKind() == 1) {
                        arrayMeal.get(0).setDescription("Sashimi");
                        arrayMeal.get(0).setPrice(10);
                        price = 10;
                    }
                }
                break;
            case 1:
                VIPmealSelected="Steak";
                System.out.println("Steak");
                if(!(EnterBN_3.getPsnTemp()==null)) {
                    arrayMeal = Objects.requireNonNull(EnterBN_3.getPsnTemp()).getExtraOptions();
                    if (arrayMeal.get(0).getKind() == 1) {
                        arrayMeal.get(0).setDescription("Steak");
                        arrayMeal.get(0).setPrice(11);
                        price = 11;
                    }
                }
                if(!(EnterOther_3.getPsnTemp1()==null)){
                    arrayMeal=Objects.requireNonNull(EnterOther_3.getPsnTemp1()).getExtraOptions();
                    if (arrayMeal.get(0).getKind() == 1) {
                        arrayMeal.get(0).setDescription("Steak");
                        arrayMeal.get(0).setPrice(11);
                        price = 11;
                    }
                }
                break;
            case 2:
                VIPmealSelected="Tempura";
                System.out.println("Tempura");
                if(!(EnterBN_3.getPsnTemp()==null)) {
                    arrayMeal = Objects.requireNonNull(EnterBN_3.getPsnTemp()).getExtraOptions();
                    if (arrayMeal.get(0).getKind() == 1) {
                        arrayMeal.get(0).setDescription("Tempura");
                        arrayMeal.get(0).setPrice(12);
                        price = 12;
                    }
                }
                if(!(EnterOther_3.getPsnTemp1()==null)){
                    arrayMeal=Objects.requireNonNull(EnterOther_3.getPsnTemp1()).getExtraOptions();
                    if (arrayMeal.get(0).getKind() == 1) {
                        arrayMeal.get(0).setDescription("Tempura");
                        arrayMeal.get(0).setPrice(12);
                        price = 12;
                    }
                }
                break;
        }
    }
    private void MealPay(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Make sure your are in a safe payment environment","Safe pay", JOptionPane.WARNING_MESSAGE);
        dispose();
        new MealPay_15().setVisible(true);
    }
    private void Back2Meal(ActionEvent e) {
        dispose();
        new Meal_12().setVisible(true);
    }
    public void init() {
        JLabel jl3=new JLabel(new ImageIcon("src/main/resources/burger.png"));
        this.labelBurger.add(jl3);
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
    public void setMealAdPic(){
        JLabel jl1=new JLabel(new ImageIcon("src/main/resources/salmon_sashimi.png"));
        sahsimiPanel.add(jl1,BorderLayout.CENTER);
        sahsimiPanel.add(labelBurger, BorderLayout.NORTH);

        JLabel jl2=new JLabel(new ImageIcon("src/main/resources/steak.png"));
        steakPanel.add(jl2,BorderLayout.CENTER);
        steakPanel.add(labelBurger, BorderLayout.NORTH);

        JLabel jl3=new JLabel(new ImageIcon("src/main/resources/tempura.png"));
        tempuraPanel.add(jl3,BorderLayout.CENTER);
        tempuraPanel.add(labelBurger, BorderLayout.NORTH);
    }

    private void help(ActionEvent e) {
        dispose();
        new Error().setVisible(true);
    }

    private void initComponents() {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Gabirella Cambridge
        ResourceBundle bundle = ResourceBundle.getBundle("Check");
        dialogPane = new JPanel();
        Nav = new JPanel();
        button3 = new JButton();
        panel5 = new JPanel();
        button4 = new JButton();
        panel7 = new JPanel();
        button5 = new JButton();
        panel1 = new JPanel();
        label1 = new JLabel();
        panel3 = new JPanel();
        label2 = new JLabel();
        button6 = new JButton();
        panel6 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        tabbedPane2 = new JTabbedPane();
        sahsimiPanel = new JPanel();
        labelSashimi = new JLabel();
        label4 = new JLabel();
        steakPanel = new JPanel();
        labelBurger = new JLabel();
        label5 = new JLabel();
        tempuraPanel = new JPanel();
        label3 = new JLabel();
        label6 = new JLabel();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setOpaque(false);
            dialogPane.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .
            EmptyBorder ( 0, 0 ,0 , 0) ,  "JFor\u006dDesi\u0067ner \u0045valu\u0061tion" , javax. swing .border . TitledBorder. CENTER ,javax . swing
            . border .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,
            java . awt. Color .red ) ,dialogPane. getBorder () ) ); dialogPane. addPropertyChangeListener( new java. beans .PropertyChangeListener ( )
            { @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "bord\u0065r" .equals ( e. getPropertyName () ) )
            throw new RuntimeException( ) ;} } );
            dialogPane.setLayout(new BorderLayout());

            //======== Nav ========
            {
                Nav.setOpaque(false);
                Nav.setLayout(new BorderLayout());

                //---- button3 ----
                button3.setText(bundle.getString("button3.text_10"));
                button3.setEnabled(false);
                Nav.add(button3, BorderLayout.NORTH);

                //======== panel5 ========
                {
                    panel5.setLayout(new BorderLayout());

                    //---- button4 ----
                    button4.setText(bundle.getString("button4.text_4"));
                    panel5.add(button4, BorderLayout.NORTH);

                    //======== panel7 ========
                    {
                        panel7.setLayout(new BorderLayout());

                        //---- button5 ----
                        button5.setText(bundle.getString("button5.text_2"));
                        button5.setEnabled(false);
                        panel7.add(button5, BorderLayout.NORTH);
                    }
                    panel5.add(panel7, BorderLayout.CENTER);
                }
                Nav.add(panel5, BorderLayout.CENTER);
            }
            dialogPane.add(Nav, BorderLayout.WEST);

            //======== panel1 ========
            {
                panel1.setOpaque(false);
                panel1.setLayout(new BorderLayout());

                //---- label1 ----
                label1.setText(bundle.getString("label1.text_20"));
                label1.setHorizontalAlignment(SwingConstants.CENTER);
                label1.setFont(new Font("Lucida Grande", Font.BOLD, 23));
                panel1.add(label1, BorderLayout.CENTER);

                //======== panel3 ========
                {
                    panel3.setOpaque(false);
                    panel3.setLayout(new BorderLayout());

                    //---- label2 ----
                    label2.setText(bundle.getString("label2.text_3"));
                    label2.setFont(new Font("Lucida Grande", Font.BOLD, 16));
                    label2.setHorizontalAlignment(SwingConstants.CENTER);
                    panel3.add(label2, BorderLayout.CENTER);
                }
                panel1.add(panel3, BorderLayout.SOUTH);

                //---- button6 ----
                button6.setText(bundle.getString("button6.text_2"));
                button6.addActionListener(e -> help(e));
                panel1.add(button6, BorderLayout.EAST);
            }
            dialogPane.add(panel1, BorderLayout.NORTH);

            //======== panel6 ========
            {
                panel6.setOpaque(false);
                panel6.setPreferredSize(new Dimension(252, 90));
                panel6.setLayout(new GridLayout());

                //---- button1 ----
                button1.setText(bundle.getString("button1.text_9"));
                button1.addActionListener(e -> MealPay(e));
                panel6.add(button1);

                //---- button2 ----
                button2.setText(bundle.getString("button2.text_4"));
                button2.addActionListener(e -> Back2Meal(e));
                panel6.add(button2);
            }
            dialogPane.add(panel6, BorderLayout.SOUTH);

            //======== tabbedPane2 ========
            {
                tabbedPane2.addChangeListener(e -> adMealState(e));

                //======== sahsimiPanel ========
                {
                    sahsimiPanel.setLayout(new BorderLayout());

                    //---- labelSashimi ----
                    labelSashimi.setText(bundle.getString("labelSashimi.text_2"));
                    labelSashimi.setHorizontalAlignment(SwingConstants.CENTER);
                    sahsimiPanel.add(labelSashimi, BorderLayout.CENTER);

                    //---- label4 ----
                    label4.setText(bundle.getString("label4.text_5"));
                    label4.setHorizontalAlignment(SwingConstants.CENTER);
                    sahsimiPanel.add(label4, BorderLayout.NORTH);
                }
                tabbedPane2.addTab(bundle.getString("label4.tab.title"), sahsimiPanel);

                //======== steakPanel ========
                {
                    steakPanel.setLayout(new BorderLayout());

                    //---- labelBurger ----
                    labelBurger.setText(bundle.getString("labelBurger.text_3"));
                    labelBurger.setHorizontalAlignment(SwingConstants.CENTER);
                    steakPanel.add(labelBurger, BorderLayout.CENTER);

                    //---- label5 ----
                    label5.setText(bundle.getString("label5.text_4"));
                    label5.setHorizontalAlignment(SwingConstants.CENTER);
                    steakPanel.add(label5, BorderLayout.NORTH);
                }
                tabbedPane2.addTab(bundle.getString("labelBurger.tab.title"), steakPanel);

                //======== tempuraPanel ========
                {
                    tempuraPanel.setLayout(new BorderLayout());

                    //---- label3 ----
                    label3.setText(bundle.getString("label3.text"));
                    label3.setHorizontalAlignment(SwingConstants.CENTER);
                    tempuraPanel.add(label3, BorderLayout.CENTER);

                    //---- label6 ----
                    label6.setText(bundle.getString("label6.text_5"));
                    label6.setHorizontalAlignment(SwingConstants.CENTER);
                    tempuraPanel.add(label6, BorderLayout.NORTH);
                }
                tabbedPane2.addTab(bundle.getString("label3.tab.title"), tempuraPanel);
            }
            dialogPane.add(tabbedPane2, BorderLayout.CENTER);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(900, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        setMealAdPic();
        init();}


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Gabirella Cambridge
    private JPanel dialogPane;
    private JPanel Nav;
    private JButton button3;
    private JPanel panel5;
    private JButton button4;
    private JPanel panel7;
    private JButton button5;
    private JPanel panel1;
    private JLabel label1;
    private JPanel panel3;
    private JLabel label2;
    private JButton button6;
    private JPanel panel6;
    private JButton button1;
    private JButton button2;
    private JTabbedPane tabbedPane2;
    private JPanel sahsimiPanel;
    private JLabel labelSashimi;
    private JLabel label4;
    private JPanel steakPanel;
    private JLabel labelBurger;
    private JLabel label5;
    private JPanel tempuraPanel;
    private JLabel label3;
    private JLabel label6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
