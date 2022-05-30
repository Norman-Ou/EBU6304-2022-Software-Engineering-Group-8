package CheckIn.GUI;

import Beans.Flight.SubClasses.ExtraOption;
import Tools.Utils;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;
/**
 * The type Meal norm 13.
 *
 * @author Jiayi Wang
 */
public class MealNorm extends JFrame {
    /**
     * The constant mealSelected.
     */
    public static String mealSelected="";
    /**
     * The Array meal add.
     */
    public static ArrayList<ExtraOption> arrayMealAdd;
    /**
     * The constant price.
     */
    public static int price;

    /**
     * Instantiates a new Meal norm 13.
     */
    public MealNorm() {
        initComponents();
    }

    private void exit(ActionEvent e) {dispose();
        JOptionPane.showMessageDialog(null, "You have chosen your meal: "+mealSelected+". Now handle your baggage.","Baggage next.", JOptionPane.QUESTION_MESSAGE);
        new Baggage_7().setVisible(true);}

    private void BackToMeal(ActionEvent e) {dispose();new Meal_12().setVisible(true);}

    private void help(ActionEvent e) {dispose();new Error().setVisible(true);}

    private void NorMealStateChanged(ChangeEvent e) {JTabbedPane tabbedPane = (JTabbedPane) e.getSource();addMealNormContent(tabbedPane);}

    /**
     * Add meal norm content.
     *
     * @param tabbedPane the tabbed pane
     */
    public void addMealNormContent(JTabbedPane tabbedPane){
        int selectedIndex = tabbedPane.getSelectedIndex();
        switch (selectedIndex) {
            case 0:
                mealSelected="Burger";
                System.out.println("Burger");
                if(!(EnterBN_3.getPsnTemp()==null)) {
                    arrayMealAdd = Objects.requireNonNull(EnterBN_3.getPsnTemp()).getExtraOptions();
                    if (arrayMealAdd.get(0).getKind() == 1) {
                        arrayMealAdd.get(0).setDescription("Burger");
                        arrayMealAdd.get(0).setPrice(6);
                        price = 6;
                    }
                }
                if(!(EnterOther_3.getPsnTemp1()==null)){
                    arrayMealAdd=Objects.requireNonNull(EnterOther_3.getPsnTemp1()).getExtraOptions();
                    if (arrayMealAdd.get(0).getKind() == 1) {
                        arrayMealAdd.get(0).setDescription("Burger");
                        arrayMealAdd.get(0).setPrice(6);
                        price = 6;
                    }
                }
                if(!(EnterOther_3.getPsnTemp2()==null)){
                    arrayMealAdd=Objects.requireNonNull(EnterOther_3.getPsnTemp2()).getExtraOptions();
                    if (arrayMealAdd.get(0).getKind() == 1) {
                        arrayMealAdd.get(0).setDescription("Burger");
                        arrayMealAdd.get(0).setPrice(6);
                        price = 6;
                    }
                }
                break;
            case 1:
                mealSelected="Cheese toast";
                System.out.println("Cheese toast");
                if(!(EnterBN_3.getPsnTemp()==null)) {
                    arrayMealAdd = Objects.requireNonNull(EnterBN_3.getPsnTemp()).getExtraOptions();
                    if (arrayMealAdd.get(0).getKind() == 1) {
                        arrayMealAdd.get(0).setDescription("Cheese toast");
                        arrayMealAdd.get(0).setPrice(7);
                        price = 7;
                    }
                }
                if(!(EnterOther_3.getPsnTemp1()==null)){
                    arrayMealAdd=Objects.requireNonNull(EnterOther_3.getPsnTemp1()).getExtraOptions();
                    if (arrayMealAdd.get(0).getKind() == 1) {
                        arrayMealAdd.get(0).setDescription("Cheese toast");
                        arrayMealAdd.get(0).setPrice(7);
                        price = 7;
                    }
                }
                if(!(EnterOther_3.getPsnTemp2()==null)){
                    arrayMealAdd=Objects.requireNonNull(EnterOther_3.getPsnTemp2()).getExtraOptions();
                    if (arrayMealAdd.get(0).getKind() == 1) {
                        arrayMealAdd.get(0).setDescription("Cheese toast");
                        arrayMealAdd.get(0).setPrice(7);
                        price = 7;
                    }
                }
                break;
            case 2:
                mealSelected="Hot dog";
                System.out.println("Hot dog");
                if(!(EnterBN_3.getPsnTemp()==null)) {
                    arrayMealAdd = Objects.requireNonNull(EnterBN_3.getPsnTemp()).getExtraOptions();
                    if (arrayMealAdd.get(0).getKind() == 1) {
                        arrayMealAdd.get(0).setDescription("Hot dog");
                        arrayMealAdd.get(0).setPrice(8);
                        price = 8;
                    }
                }
                if(!(EnterOther_3.getPsnTemp1()==null)){
                    arrayMealAdd=Objects.requireNonNull(EnterOther_3.getPsnTemp1()).getExtraOptions();
                    if (arrayMealAdd.get(0).getKind() == 1) {
                        arrayMealAdd.get(0).setDescription("Hot dog");
                        arrayMealAdd.get(0).setPrice(8);
                        price = 8;
                    }
                }
                if(!(EnterOther_3.getPsnTemp2()==null)){
                    arrayMealAdd=Objects.requireNonNull(EnterOther_3.getPsnTemp2()).getExtraOptions();
                    if (arrayMealAdd.get(0).getKind() == 1) {
                        arrayMealAdd.get(0).setDescription("Hot dog");
                        arrayMealAdd.get(0).setPrice(8);
                        price = 8;
                    }
                }
                break;
            case 3:
                mealSelected="Salad";
                System.out.println("Salad");
                if(!(EnterBN_3.getPsnTemp()==null)) {
                    arrayMealAdd = Objects.requireNonNull(EnterBN_3.getPsnTemp()).getExtraOptions();
                    if (arrayMealAdd.get(0).getKind() == 1) {
                        arrayMealAdd.get(0).setDescription("Salad");
                        arrayMealAdd.get(0).setPrice(9);
                        price = 9;
                    }
                }
                if(!(EnterOther_3.getPsnTemp1()==null)){
                    arrayMealAdd=Objects.requireNonNull(EnterOther_3.getPsnTemp1()).getExtraOptions();
                    if (arrayMealAdd.get(0).getKind() == 1) {
                        arrayMealAdd.get(0).setDescription("Salad");
                        arrayMealAdd.get(0).setPrice(9);
                        price = 9;
                    }
                }
                if(!(EnterOther_3.getPsnTemp2()==null)){
                    arrayMealAdd=Objects.requireNonNull(EnterOther_3.getPsnTemp2()).getExtraOptions();
                    if (arrayMealAdd.get(0).getKind() == 1) {
                        arrayMealAdd.get(0).setDescription("Salad");
                        arrayMealAdd.get(0).setPrice(9);
                        price = 9;
                    }
                }
                break;
        }
    }

    /**
     * Set meal pic.
     */
    public void setMealPic(){
        JLabel jl1=new JLabel(new ImageIcon(Utils.getRsrFile("burger.png")));
        panelBurger.add(jl1,BorderLayout.CENTER);

        JLabel jl2=new JLabel(new ImageIcon(Utils.getRsrFile("cheese_toast.png")));
        panelCheese.add(jl2,BorderLayout.CENTER);

        JLabel jl3=new JLabel(new ImageIcon(Utils.getRsrFile("hotdog.png")));
        panelHot.add(jl3,BorderLayout.CENTER);

        JLabel jl4=new JLabel(new ImageIcon(Utils.getRsrFile("salad.png")));
        panelSa.add(jl4,BorderLayout.CENTER);
    }

    /**
     * Set background.
     */
    public void setBackground() {
        ImageIcon background = new ImageIcon(Config.Config.bgPic);
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
        dialogPane = new JPanel();
        Nav = new JPanel();
        button1 = new JButton();
        panel5 = new JPanel();
        button2 = new JButton();
        panel6 = new JPanel();
        button3 = new JButton();
        tabbedPane2 = new JTabbedPane();
        panelBurger = new JPanel();
        label1 = new JLabel();
        label6 = new JLabel();
        panelCheese = new JPanel();
        label3 = new JLabel();
        label7 = new JLabel();
        panelHot = new JPanel();
        label4 = new JLabel();
        label8 = new JLabel();
        panelSa = new JPanel();
        label5 = new JLabel();
        label9 = new JLabel();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();
        panel1 = new JPanel();
        label2 = new JLabel();
        button4 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setOpaque(false);
            dialogPane.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(
                    new javax.swing.border.EmptyBorder(0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn"
                    ,javax.swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM
                    ,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12)
                    ,java.awt.Color.red),dialogPane. getBorder()));dialogPane. addPropertyChangeListener(
                new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e
                ){if("\u0062ord\u0065r".equals(e.getPropertyName()))throw new RuntimeException()
                        ;}});
            dialogPane.setLayout(new BorderLayout());

            //======== Nav ========
            {
                Nav.setOpaque(false);
                Nav.setLayout(new BorderLayout());

                //---- button1 ----
                button1.setText(bundle.getString("button1.text_23"));
                Nav.add(button1, BorderLayout.NORTH);

                //======== panel5 ========
                {
                    panel5.setLayout(new BorderLayout());

                    //---- button2 ----
                    button2.setText(bundle.getString("button2.text_15"));
                    button2.setEnabled(false);
                    panel5.add(button2, BorderLayout.NORTH);

                    //======== panel6 ========
                    {
                        panel6.setLayout(new BorderLayout());

                        //---- button3 ----
                        button3.setText(bundle.getString("button3.text_9"));
                        button3.setEnabled(false);
                        panel6.add(button3, BorderLayout.NORTH);
                    }
                    panel5.add(panel6, BorderLayout.CENTER);
                }
                Nav.add(panel5, BorderLayout.CENTER);
            }
            dialogPane.add(Nav, BorderLayout.WEST);

            //======== tabbedPane2 ========
            {
                tabbedPane2.setOpaque(false);
                tabbedPane2.setToolTipText("$32");
                tabbedPane2.addChangeListener(e -> NorMealStateChanged(e));

                //======== panelBurger ========
                {
                    panelBurger.setLayout(new BorderLayout());

                    //---- label1 ----
                    label1.setHorizontalAlignment(SwingConstants.CENTER);
                    panelBurger.add(label1, BorderLayout.CENTER);

                    //---- label6 ----
                    label6.setText(bundle.getString("label6.text_4"));
                    label6.setHorizontalAlignment(SwingConstants.CENTER);
                    panelBurger.add(label6, BorderLayout.NORTH);
                }
                tabbedPane2.addTab(bundle.getString("label1.tab.title"), panelBurger);

                //======== panelCheese ========
                {
                    panelCheese.setLayout(new BorderLayout());

                    //---- label3 ----
                    label3.setHorizontalAlignment(SwingConstants.CENTER);
                    panelCheese.add(label3, BorderLayout.CENTER);

                    //---- label7 ----
                    label7.setText(bundle.getString("label7.text_5"));
                    label7.setHorizontalAlignment(SwingConstants.CENTER);
                    panelCheese.add(label7, BorderLayout.NORTH);
                }
                tabbedPane2.addTab(bundle.getString("label3.tab.title_2"), panelCheese);

                //======== panelHot ========
                {
                    panelHot.setLayout(new BorderLayout());
                    panelHot.add(label4, BorderLayout.CENTER);

                    //---- label8 ----
                    label8.setText(bundle.getString("label8.text_4"));
                    label8.setHorizontalAlignment(SwingConstants.CENTER);
                    panelHot.add(label8, BorderLayout.NORTH);
                }
                tabbedPane2.addTab(bundle.getString("label4.tab.title_2"), panelHot);

                //======== panelSa ========
                {
                    panelSa.setLayout(new BorderLayout());
                    panelSa.add(label5, BorderLayout.CENTER);

                    //---- label9 ----
                    label9.setText(bundle.getString("label9.text_3"));
                    label9.setHorizontalAlignment(SwingConstants.CENTER);
                    panelSa.add(label9, BorderLayout.NORTH);
                }
                tabbedPane2.addTab(bundle.getString("label5.tab.title"), panelSa);
            }
            dialogPane.add(tabbedPane2, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setOpaque(false);
                buttonBar.setPreferredSize(new Dimension(177, 90));
                buttonBar.setLayout(new GridLayout());

                //---- okButton ----
                okButton.setText(bundle.getString("okButton.text_10"));
                okButton.addActionListener(e -> exit(e));
                buttonBar.add(okButton);

                //---- cancelButton ----
                cancelButton.setText(bundle.getString("cancelButton.text_10"));
                cancelButton.addActionListener(e -> BackToMeal(e));
                buttonBar.add(cancelButton);
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);

            //======== panel1 ========
            {
                panel1.setLayout(new BorderLayout());

                //---- label2 ----
                label2.setText(bundle.getString("label2.text_4"));
                label2.setFont(new Font("Lucida Grande", Font.BOLD, 24));
                label2.setHorizontalAlignment(SwingConstants.CENTER);
                panel1.add(label2, BorderLayout.CENTER);

                //---- button4 ----
                button4.setText(bundle.getString("button4.text_12"));
                button4.addActionListener(e -> help(e));
                panel1.add(button4, BorderLayout.EAST);
            }
            dialogPane.add(panel1, BorderLayout.NORTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(900, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        setMealPic();
        setBackground();}

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Gabirella Cambridge
    private JPanel dialogPane;
    private JPanel Nav;
    private JButton button1;
    private JPanel panel5;
    private JButton button2;
    private JPanel panel6;
    private JButton button3;
    private JTabbedPane tabbedPane2;
    private JPanel panelBurger;
    private JLabel label1;
    private JLabel label6;
    private JPanel panelCheese;
    private JLabel label3;
    private JLabel label7;
    private JPanel panelHot;
    private JLabel label4;
    private JLabel label8;
    private JPanel panelSa;
    private JLabel label5;
    private JLabel label9;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    private JPanel panel1;
    private JLabel label2;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
