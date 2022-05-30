package CheckIn.GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.util.ResourceBundle;


/**
 * The type Check in 2.
 *
 * @author Jiayi Wang
 */
public class CheckIn_2 extends JFrame {
    /**
     * Instantiates a new Check in 2.
     */
    public CheckIn_2() {
        initComponents();
    }

    private void CheckInButton(ActionEvent e) throws ParseException {dispose();new EnterBN_3().setVisible(true);}

    private void AirlineRe(ActionEvent e) {dispose();new Airline_1().setVisible(true);}

    private void help(ActionEvent e) {dispose();new ErrorWindow().setVisible(true);}
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
        button1 = new JButton();
        buttonBar = new JPanel();
        cancelButton = new JButton();
        panel1 = new JPanel();
        label1 = new JLabel();
        button2 = new JButton();

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
                contentPanel.setOpaque(false);
                contentPanel.setLayout(new GridLayout());

                //---- button1 ----
                button1.setText(bundle.getString("button1.text_6"));
                button1.setFont(new Font("Lucida Grande", Font.BOLD, 24));
                button1.setOpaque(false);
                button1.addActionListener(e -> {
                    try {
                        CheckInButton(e);
                    } catch (ParseException ex) {
                        ex.printStackTrace();
                    }
                });
                contentPanel.add(button1);
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setOpaque(false);
                buttonBar.setLayout(new GridLayout());

                //---- cancelButton ----
                cancelButton.setText(bundle.getString("cancelButton.text_11"));
                cancelButton.setPreferredSize(new Dimension(78, 90));
                cancelButton.addActionListener(e -> AirlineRe(e));
                buttonBar.add(cancelButton);
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);

            //======== panel1 ========
            {
                panel1.setOpaque(false);
                panel1.setLayout(new BorderLayout());

                //---- label1 ----
                label1.setText(bundle.getString("label1.text_14"));
                label1.setFont(new Font("Lucida Grande", Font.BOLD, 20));
                label1.setHorizontalAlignment(SwingConstants.CENTER);
                panel1.add(label1, BorderLayout.CENTER);

                //---- button2 ----
                button2.setText(bundle.getString("button2.text_20"));
                button2.addActionListener(e -> help(e));
                panel1.add(button2, BorderLayout.EAST);
            }
            dialogPane.add(panel1, BorderLayout.NORTH);
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
    private JButton button1;
    private JPanel buttonBar;
    private JButton cancelButton;
    private JPanel panel1;
    private JLabel label1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
