package PassengerGUI;

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
                break;
            case 1:
                System.out.println("Western");
                break;
        }
    }

    private void tabbedPane2StateChanged(ChangeEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        ResourceBundle bundle = ResourceBundle.getBundle("Check");
        dialogPane = new JPanel();
        tabbedPane2 = new JTabbedPane();
        label1 = new JLabel();
        label3 = new JLabel();
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
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax.
            swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border
            . TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog"
            ,java .awt .Font .BOLD ,12 ), java. awt. Color. red) ,dialogPane. getBorder
            ( )) ); dialogPane. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java
            .beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .getPropertyName () )) throw new RuntimeException
            ( ); }} );
            dialogPane.setLayout(new BorderLayout());

            //======== tabbedPane2 ========
            {
                tabbedPane2.addChangeListener(e -> {
			tabbedPane2StateChanged(e);
			NorMealStateChanged(e);
		});

                //---- label1 ----
                label1.setText(bundle.getString("label1.text_12"));
                label1.setHorizontalAlignment(SwingConstants.CENTER);
                tabbedPane2.addTab(bundle.getString("label1.tab.title"), label1);

                //---- label3 ----
                label3.setText(bundle.getString("label3.text_4"));
                label3.setHorizontalAlignment(SwingConstants.CENTER);
                tabbedPane2.addTab(bundle.getString("label3.tab.title_2"), label3);
            }
            dialogPane.add(tabbedPane2, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 85, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0};

                //---- okButton ----
                okButton.setText(bundle.getString("okButton.text_10"));
                okButton.addActionListener(e -> exit(e));
                buttonBar.add(okButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- cancelButton ----
                cancelButton.setText(bundle.getString("cancelButton.text_10"));
                cancelButton.addActionListener(e -> BackToMeal(e));
                buttonBar.add(cancelButton, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);

            //---- label2 ----
            label2.setText(bundle.getString("label2.text_4"));
            label2.setFont(new Font("Lucida Grande", Font.BOLD, 24));
            label2.setHorizontalAlignment(SwingConstants.CENTER);
            dialogPane.add(label2, BorderLayout.NORTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(425, 325);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel dialogPane;
    private JTabbedPane tabbedPane2;
    private JLabel label1;
    private JLabel label3;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
