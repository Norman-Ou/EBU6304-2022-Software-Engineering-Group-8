package CheckIn.GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ResourceBundle;

/**
 * The type Baggage 7.
 *
 * @author Jiayi Wang
 */
public class Baggage_7 extends JFrame {
    /**
     * Instantiates a new Baggage 7.
     */
    public Baggage_7() {
        initComponents();
    }

    private void weight(ActionEvent e) {dispose();new WeightShowWindow().setVisible(true);}

    private void storeBaggage(ActionEvent e) {dispose();new BagStore_8().setVisible(true);}

    private void BagAdd(ActionEvent e) {dispose();new BagStore_8().setVisible(true);}

    private void help(ActionEvent e) {dispose();new Error().setVisible(true);}

    private void return2ini(ActionEvent e) {dispose();new Airline_1().setVisible(true);}

    private void error(ActionEvent e) {dispose();new Error().setVisible(true);}

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
        ResourceBundle bundle = ResourceBundle.getBundle("Check");
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        button2 = new JButton();
        button1 = new JButton();
        button3 = new JButton();
        panel1 = new JPanel();
        label1 = new JLabel();
        button5 = new JButton();
        buttonBar = new JPanel();
        Return = new JButton();
        cancelButton = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setOpaque(false);
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

            //======== panel1 ========
            {
                panel1.setOpaque(false);
                panel1.setLayout(new BorderLayout());

                //---- label1 ----
                label1.setText(bundle.getString("label1.text_16"));
                label1.setHorizontalAlignment(SwingConstants.CENTER);
                label1.setFont(new Font("Lucida Grande", Font.BOLD, 28));
                panel1.add(label1, BorderLayout.CENTER);

                //---- button5 ----
                button5.setText(bundle.getString("button5.text_4"));
                button5.addActionListener(e -> help(e));
                panel1.add(button5, BorderLayout.EAST);
            }
            dialogPane.add(panel1, BorderLayout.NORTH);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setOpaque(false);
                buttonBar.setMinimumSize(new Dimension(168, 60));
                buttonBar.setPreferredSize(new Dimension(168, 90));
                buttonBar.setLayout(new GridLayout());

                //---- Return ----
                Return.setText(bundle.getString("Return.text_6"));
                Return.addActionListener(e -> return2ini(e));
                buttonBar.add(Return);

                //---- cancelButton ----
                cancelButton.setText(bundle.getString("cancelButton.text_17"));
                cancelButton.addActionListener(e -> error(e));
                buttonBar.add(cancelButton);
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(900, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        setBackground();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JButton button2;
    private JButton button1;
    private JButton button3;
    private JPanel panel1;
    private JLabel label1;
    private JButton button5;
    private JPanel buttonBar;
    private JButton Return;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


}
