package CheckIn.GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ResourceBundle;
/*
 * Created by JFormDesigner on Tue Mar 29 18:58:58 CST 2022
 */



/**
 * @author Jiayi Wang
 */
public class MealNorm_13 extends JFrame {
    public MealNorm_13() {
        initComponents();
    }

    private void exit(ActionEvent e) {
        dispose();
        new exit_16().setVisible(true);
    }

    private void BackToMeal(ActionEvent e) {
        dispose();
        new Meal_12().setVisible(true);
    }

    private void NorMealStateChanged(ChangeEvent e) {
        JTabbedPane tabbedPane = (JTabbedPane) e.getSource();
        int selectedIndex = tabbedPane.getSelectedIndex();
        switch (selectedIndex) {
            case 0:
                System.out.println("Chinese");
                //TODO store meal info
                break;
            case 1:
                System.out.println("Western");
                //TODO store meal info
                break;
        }
    }

    public void setMealPic(){
        JLabel jl1=new JLabel(new ImageIcon("src/main/resources/burger.png"));
        panelBurger.add(jl1,BorderLayout.CENTER);

        JLabel jl2=new JLabel(new ImageIcon("src/main/resources/cheese_toast.png"));
        panelCheese.add(jl2,BorderLayout.CENTER);

        JLabel jl3=new JLabel(new ImageIcon("src/main/resources/hotdog.png"));
        panelHot.add(jl3,BorderLayout.CENTER);

        JLabel jl4=new JLabel(new ImageIcon("src/main/resources/salad.png"));
        panelSa.add(jl4,BorderLayout.CENTER);
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
        tabbedPane2 = new JTabbedPane();
        panelBurger = new JPanel();
        label1 = new JLabel();
        panelCheese = new JPanel();
        label3 = new JLabel();
        panelHot = new JPanel();
        label4 = new JLabel();
        panelSa = new JPanel();
        label5 = new JLabel();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();
        label2 = new JLabel();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setOpaque(false);
            dialogPane.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(
            0,0,0,0), "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e",javax.swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder
            .BOTTOM,new java.awt.Font("D\u0069al\u006fg",java.awt.Font.BOLD,12),java.awt.Color.
            red),dialogPane. getBorder()));dialogPane. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.
            beans.PropertyChangeEvent e){if("\u0062or\u0064er".equals(e.getPropertyName()))throw new RuntimeException();}});
            dialogPane.setLayout(new BorderLayout());

            //======== tabbedPane2 ========
            {
                tabbedPane2.setOpaque(false);
                tabbedPane2.addChangeListener(e -> NorMealStateChanged(e));

                //======== panelBurger ========
                {
                    panelBurger.setLayout(new BorderLayout());

                    //---- label1 ----
                    label1.setHorizontalAlignment(SwingConstants.CENTER);
                    panelBurger.add(label1, BorderLayout.CENTER);
                }
                tabbedPane2.addTab(bundle.getString("label1.tab.title"), panelBurger);

                //======== panelCheese ========
                {
                    panelCheese.setLayout(new BorderLayout());

                    //---- label3 ----
                    label3.setHorizontalAlignment(SwingConstants.CENTER);
                    panelCheese.add(label3, BorderLayout.CENTER);
                }
                tabbedPane2.addTab(bundle.getString("label3.tab.title_2"), panelCheese);

                //======== panelHot ========
                {
                    panelHot.setLayout(new BorderLayout());
                    panelHot.add(label4, BorderLayout.CENTER);
                }
                tabbedPane2.addTab(bundle.getString("label4.tab.title_2"), panelHot);

                //======== panelSa ========
                {
                    panelSa.setLayout(new BorderLayout());
                    panelSa.add(label5, BorderLayout.CENTER);
                }
                tabbedPane2.addTab(bundle.getString("label5.tab.title"), panelSa);
            }
            dialogPane.add(tabbedPane2, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setOpaque(false);
                buttonBar.setLayout(new FlowLayout());

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

            //---- label2 ----
            label2.setText(bundle.getString("label2.text_4"));
            label2.setFont(new Font("Lucida Grande", Font.BOLD, 24));
            label2.setHorizontalAlignment(SwingConstants.CENTER);
            dialogPane.add(label2, BorderLayout.NORTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(900, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        setMealPic();
        init();}

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel dialogPane;
    private JTabbedPane tabbedPane2;
    private JPanel panelBurger;
    private JLabel label1;
    private JPanel panelCheese;
    private JLabel label3;
    private JPanel panelHot;
    private JLabel label4;
    private JPanel panelSa;
    private JLabel label5;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
