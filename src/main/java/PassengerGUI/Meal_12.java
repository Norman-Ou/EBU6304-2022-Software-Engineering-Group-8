package PassengerGUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ResourceBundle;
/*
 * Created by JFormDesigner on Tue Mar 29 18:56:09 CST 2022
 */



/**
 * @author Jiayi Wang
 */
public class Meal_12 extends JFrame {
    public Meal_12() {
        initComponents();
    }

    private void Normal(ActionEvent e) {
        dispose();
        new MealNorm_13().setVisible(true);
    }

    private void VIPMeal(ActionEvent e) {
        dispose();
        new MealAdd_14().setVisible(true);
    }

    private void cancelMeal(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Confirm cancel your meal?","Cancel meal check", JOptionPane.WARNING_MESSAGE);
        dispose();
        new exit_16().setVisible(true);
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
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        panel2 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        panel1 = new JPanel();
        label1 = new JLabel();
        panel3 = new JPanel();

        //======== this ========
        setBackground(new Color(51, 153, 255));
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setOpaque(false);
            dialogPane.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing
            . border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e" , javax. swing .border . TitledBorder
            . CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069al\u006fg", java .
            awt . Font. BOLD ,12 ) ,java . awt. Color .red ) ,dialogPane. getBorder () ) )
            ; dialogPane. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e
            ) { if( "\u0062or\u0064er" .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } )
            ;
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setOpaque(false);
                contentPanel.setLayout(new GridLayout(0, 1));

                //======== panel2 ========
                {
                    panel2.setOpaque(false);
                    panel2.setLayout(new GridLayout());

                    //---- button1 ----
                    button1.setText(bundle.getString("button1.text_3"));
                    button1.addActionListener(e -> Normal(e));
                    panel2.add(button1);

                    //---- button2 ----
                    button2.setText(bundle.getString("button2.text_3"));
                    button2.addActionListener(e -> VIPMeal(e));
                    panel2.add(button2);

                    //---- button3 ----
                    button3.setText(bundle.getString("button3.text_2"));
                    button3.addActionListener(e -> cancelMeal(e));
                    panel2.add(button3);
                }
                contentPanel.add(panel2);
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== panel1 ========
            {
                panel1.setOpaque(false);
                panel1.setLayout(new BorderLayout());

                //---- label1 ----
                label1.setText(bundle.getString("label1.text_11"));
                label1.setHorizontalAlignment(SwingConstants.CENTER);
                label1.setFont(new Font("Lucida Grande", Font.BOLD, 22));
                label1.setForeground(UIManager.getColor("Button.select"));
                panel1.add(label1, BorderLayout.CENTER);

                //======== panel3 ========
                {
                    panel3.setOpaque(false);
                    panel3.setLayout(new BorderLayout());
                }
                panel1.add(panel3, BorderLayout.SOUTH);
            }
            dialogPane.add(panel1, BorderLayout.NORTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(900, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        init();}

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JPanel panel2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JPanel panel1;
    private JLabel label1;
    private JPanel panel3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
