/*
 * Created by JFormDesigner on Wed Mar 30 19:17:25 CST 2022
 */

package CheckIn.GUI;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Jiayi Wang
 */
public class VIPSeatPay extends JFrame {
    public VIPSeatPay() {
        initComponents();
    }

    private void FlightPrint(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Make sure your are in a safe payment environment", "Safe pay", JOptionPane.WARNING_MESSAGE);
        dispose();
        new CreditPage().setVisible(true);
    }
    private void BackSeat(ActionEvent e) {
       dispose();
       new SeatFirst_ac5().setVisible(true);
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
        label3 = new JLabel();
        buttonBar2 = new JPanel();
        okButton2 = new JButton();
        cancelButton2 = new JButton();
        label1 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane2 ========
        {
            dialogPane2.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane2.setOpaque(false);
            dialogPane2.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border
            .EmptyBorder(0,0,0,0), "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e",javax.swing.border.TitledBorder.CENTER,javax
            .swing.border.TitledBorder.BOTTOM,new java.awt.Font("Dialo\u0067",java.awt.Font.BOLD,
            12),java.awt.Color.red),dialogPane2. getBorder()));dialogPane2. addPropertyChangeListener(new java.beans
            .PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("borde\u0072".equals(e.
            getPropertyName()))throw new RuntimeException();}});
            dialogPane2.setLayout(new BorderLayout());

            //======== contentPanel2 ========
            {
                contentPanel2.setOpaque(false);
                contentPanel2.setLayout(new GridLayout());

                //======== panel1 ========
                {
                    panel1.setOpaque(false);
                    panel1.setLayout(new GridLayout());

                    //======== panel2 ========
                    {
                        panel2.setOpaque(false);
                        panel2.setLayout(new GridLayout());

                        //---- label3 ----
                        label3.setText(bundle.getString("label3.text_8"));
                        panel2.add(label3);
                    }
                    panel1.add(panel2);
                }
                contentPanel2.add(panel1);
            }
            dialogPane2.add(contentPanel2, BorderLayout.CENTER);

            //======== buttonBar2 ========
            {
                buttonBar2.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar2.setOpaque(false);
                buttonBar2.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar2.getLayout()).columnWidths = new int[] {0, 85, 80};
                ((GridBagLayout)buttonBar2.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0};

                //---- okButton2 ----
                okButton2.setText(bundle.getString("okButton2.text_2"));
                okButton2.addActionListener(e -> FlightPrint(e));
                buttonBar2.add(okButton2, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- cancelButton2 ----
                cancelButton2.setText(bundle.getString("cancelButton2.text_2"));
                cancelButton2.addActionListener(e -> BackSeat(e));
                buttonBar2.add(cancelButton2, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane2.add(buttonBar2, BorderLayout.SOUTH);

            //---- label1 ----
            label1.setText(bundle.getString("label1.text_28"));
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setFont(new Font("Lucida Grande", Font.BOLD, 16));
            dialogPane2.add(label1, BorderLayout.NORTH);
        }
        contentPane.add(dialogPane2, BorderLayout.CENTER);
        setSize(900, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        init();}

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel dialogPane2;
    private JPanel contentPanel2;
    private JPanel panel1;
    private JPanel panel2;
    private JLabel label3;
    private JPanel buttonBar2;
    private JButton okButton2;
    private JButton cancelButton2;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
