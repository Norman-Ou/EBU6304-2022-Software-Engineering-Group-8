package CheckIn.GUI;

import Config.Config;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ResourceBundle;

/**
 * The type Airline 1.
 *
 * @author Jiayi Wang
 */
public class AirlineWindow extends JFrame {
    /**
     * Instantiates a new Airline 1.
     */
    public AirlineWindow() {
        initComponents();
    }

    private void ok(ActionEvent e) {dispose();new CheckInWindow().setVisible(true);}

    private void exit(ActionEvent e) throws InterruptedException { dispose();}

    private void help(ActionEvent e) {dispose();new ErrorWindow().setVisible(true);}


    /**
     * Sets background.
     */
    public void setBackground() {
        ImageIcon background = new ImageIcon(Config.bgPic);
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
        contentPanel = new JPanel();
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        label1 = new JLabel();
        panel4 = new JPanel();
        button1 = new JButton();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setOpaque(false);
            dialogPane.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder (
                    new javax . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JFor\u006dDesi\u0067ner \u0045valu\u0061tion"
                    , javax. swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM
                    , new java. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 )
                    ,java . awt. Color .red ) ,dialogPane. getBorder () ) ); dialogPane. addPropertyChangeListener(
                new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e
                ) { if( "bord\u0065r" .equals ( e. getPropertyName () ) )throw new RuntimeException( )
                        ;} } );
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setOpaque(false);
                contentPanel.setLayout(new BorderLayout());

                //======== panel1 ========
                {
                    panel1.setOpaque(false);
                    panel1.setLayout(new BorderLayout());

                    //======== panel2 ========
                    {
                        panel2.setOpaque(false);
                        panel2.setLayout(new BorderLayout());

                        //======== panel3 ========
                        {
                            panel3.setOpaque(false);
                            panel3.setLayout(new BorderLayout());

                            //---- label1 ----
                            label1.setText(bundle.getString("label1.text_5"));
                            label1.setHorizontalAlignment(SwingConstants.CENTER);
                            label1.setFont(new Font("Lucida Grande", Font.BOLD, 40));
                            label1.setForeground(Color.black);
                            label1.setBackground(new Color(0, 127, 255, 191));
                            panel3.add(label1, BorderLayout.CENTER);

                            //======== panel4 ========
                            {
                                panel4.setOpaque(false);
                                panel4.setLayout(new BorderLayout());

                                //---- button1 ----
                                button1.setText(bundle.getString("button1.text_25"));
                                button1.addActionListener(e -> help(e));
                                panel4.add(button1, BorderLayout.EAST);
                            }
                            panel3.add(panel4, BorderLayout.NORTH);
                        }
                        panel2.add(panel3, BorderLayout.CENTER);
                    }
                    panel1.add(panel2, BorderLayout.CENTER);
                }
                contentPanel.add(panel1, BorderLayout.CENTER);
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setOpaque(false);
                buttonBar.setMinimumSize(new Dimension(168, 60));
                buttonBar.setPreferredSize(new Dimension(168, 90));
                buttonBar.setLayout(new GridLayout());

                //---- okButton ----
                okButton.setText(bundle.getString("okButton.text_5"));
                okButton.setOpaque(false);
                okButton.addActionListener(e -> ok(e));
                buttonBar.add(okButton);

                //---- cancelButton ----
                cancelButton.setText(bundle.getString("cancelButton.text_5"));
                cancelButton.setOpaque(false);
                cancelButton.addActionListener(e -> {
                    try {
                        exit(e);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                });
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
    // Generated using JFormDesigner Evaluation license - Gabirella Cambridge
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JLabel label1;
    private JPanel panel4;
    private JButton button1;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables



}