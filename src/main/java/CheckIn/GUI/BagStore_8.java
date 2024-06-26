package CheckIn.GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.IOException;
import java.util.ResourceBundle;


/**
 * The type Bag store 8.
 *
 * @author Jiayi Wang
 */
public class BagStore_8 extends JFrame {
    /**
     * The constant court.
     * Store or additional baggage amount or court in destination.
     */
    public static int court;
    private boolean priceState;

    /**
     * Instantiates a new Bag store 8.
     */
    public BagStore_8() {
        initComponents();
    }

    private void Return2Baggage(ActionEvent e) {dispose();new Baggage_7().setVisible(true);}

    private void help(ActionEvent e) {dispose();new Error().setVisible(true);}

    private void ToMeal(ActionEvent e) throws IOException {dispose();
        payTotal();
        if(priceState){
            new FinalPay_15().setVisible(true);
        }else{
            new PrintFlight_6().setVisible(true);
        }

    }
    /**
     * Check total fee.
     */
    public void payTotal(){
        if(!(MealAdd_14.VIPmealSelected==null)){
            priceState=true;
        }
        if(Seat_1_6.upgrade){
            priceState=true;
        }
        if(Seat_3_6.upgrade){
            priceState=true;
        }
    }

    /**
     * Court shown.
     *
     * @param e the e
     */
    public void CourtShown(ComponentEvent e) {
        court = (int)(Math.random()*100)+2;
        e.setSource(court);
    }
    /**
     * Set court.
     */
    public void setCourt(){
        court = (int)(Math.random()*100);
        textField1.setText("Court: "+court+"");
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
        ResourceBundle bundle = ResourceBundle.getBundle("Check");
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        panel1 = new JPanel();
        textField1 = new JTextField();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();
        panel2 = new JPanel();
        button1 = new JButton();
        label1 = new JLabel();

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
                contentPanel.setLayout(new GridLayout(0, 1));

                //======== panel1 ========
                {
                    panel1.setLayout(new BorderLayout());

                    //---- textField1 ----
                    textField1.setHorizontalAlignment(SwingConstants.CENTER);
                    textField1.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 26));
                    textField1.addComponentListener(new ComponentAdapter() {
                        @Override
                        public void componentShown(ComponentEvent e) {
                            CourtShown(e);
                        }
                    });
                    panel1.add(textField1, BorderLayout.CENTER);
                }
                contentPanel.add(panel1);
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setPreferredSize(new Dimension(177, 90));
                buttonBar.setMinimumSize(new Dimension(177, 90));
                buttonBar.setLayout(new GridLayout());

                //---- okButton ----
                okButton.setText(bundle.getString("okButton.text_7"));
                okButton.addActionListener(e -> {
                    try {
                        ToMeal(e);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                });
                buttonBar.add(okButton);

                //---- cancelButton ----
                cancelButton.setText(bundle.getString("cancelButton.text_7"));
                cancelButton.addActionListener(e -> Return2Baggage(e));
                buttonBar.add(cancelButton);
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);

            //======== panel2 ========
            {
                panel2.setOpaque(false);
                panel2.setLayout(new BorderLayout());

                //---- button1 ----
                button1.setText(bundle.getString("button1.text_28"));
                button1.addActionListener(e -> help(e));
                panel2.add(button1, BorderLayout.EAST);

                //---- label1 ----
                label1.setText(bundle.getString("label1.text_8"));
                label1.setHorizontalAlignment(SwingConstants.CENTER);
                label1.setFont(new Font("Lucida Grande", Font.BOLD, 20));
                panel2.add(label1, BorderLayout.CENTER);
            }
            dialogPane.add(panel2, BorderLayout.NORTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(900, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        setBackground();
        setCourt();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JPanel panel1;
    private JTextField textField1;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    private JPanel panel2;
    private JButton button1;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
