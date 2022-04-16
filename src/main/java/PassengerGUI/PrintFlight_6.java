package PassengerGUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.CaretEvent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ResourceBundle;
/*
 * Created by JFormDesigner on Tue Mar 29 20:34:40 CST 2022
 */



/**
 * @author Jiayi Wang
 */
public class PrintFlight_6 extends JFrame {
    public PrintFlight_6() {
        initComponents();
    }

    private void printThenBag(ActionEvent e) {
        // TODO add your code here
        dispose();
        new Baggage_7().setVisible(true);
    }

    private void Back2Confirm(ActionEvent e) {
        dispose();
        new ConfirmPage_4().setVisible(true);
    }


    private void Flight(CaretEvent e) {
        // TODO add flight Object
    }

    private void ok(ActionEvent e) {
        // TODO add your code here
    }

    private void error(ActionEvent e) {
        dispose();
        new Error().setVisible(true);
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
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        panel2 = new JPanel();
        textArea1 = new JTextArea();
        panel3 = new JPanel();
        button1 = new JButton();
        PrintButton = new JButton();
        cancelButton = new JButton();
        buttonBar = new JPanel();
        label1 = new JLabel();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setOpaque(false);
            dialogPane.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .
            EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e" , javax. swing .border . TitledBorder. CENTER ,javax . swing
            . border .TitledBorder . BOTTOM, new java. awt .Font ( "Dialo\u0067", java .awt . Font. BOLD ,12 ) ,
            java . awt. Color .red ) ,dialogPane. getBorder () ) ); dialogPane. addPropertyChangeListener( new java. beans .PropertyChangeListener ( )
            { @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "borde\u0072" .equals ( e. getPropertyName () ) )
            throw new RuntimeException( ) ;} } );
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setOpaque(false);
                contentPanel.setLayout(new GridLayout());

                //======== panel1 ========
                {
                    panel1.setOpaque(false);
                    panel1.setLayout(new GridLayout());

                    //======== scrollPane1 ========
                    {
                        scrollPane1.setOpaque(false);

                        //======== panel2 ========
                        {
                            panel2.setOpaque(false);
                            panel2.setLayout(new BorderLayout());

                            //---- textArea1 ----
                            textArea1.setEditable(false);
                            textArea1.addCaretListener(e -> Flight(e));
                            panel2.add(textArea1, BorderLayout.CENTER);

                            //======== panel3 ========
                            {
                                panel3.setOpaque(false);
                                panel3.setLayout(new BorderLayout());

                                //---- button1 ----
                                button1.setText(bundle.getString("button1.text_4"));
                                button1.addActionListener(e -> error(e));
                                panel3.add(button1, BorderLayout.CENTER);

                                //---- PrintButton ----
                                PrintButton.setText(bundle.getString("PrintButton.text_2"));
                                PrintButton.addActionListener(e -> {
			printThenBag(e);
			ok(e);
		});
                                panel3.add(PrintButton, BorderLayout.NORTH);

                                //---- cancelButton ----
                                cancelButton.setText(bundle.getString("cancelButton.text_12"));
                                cancelButton.addActionListener(e -> Back2Confirm(e));
                                panel3.add(cancelButton, BorderLayout.SOUTH);
                            }
                            panel2.add(panel3, BorderLayout.SOUTH);
                        }
                        scrollPane1.setViewportView(panel2);
                    }
                    panel1.add(scrollPane1);
                }
                contentPanel.add(panel1);
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setOpaque(false);
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 85, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0};
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);

            //---- label1 ----
            label1.setText(bundle.getString("label1.text_19"));
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setFont(new Font("Lucida Grande", Font.BOLD, 16));
            dialogPane.add(label1, BorderLayout.NORTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(900, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        init(); }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JPanel panel2;
    private JTextArea textArea1;
    private JPanel panel3;
    private JButton button1;
    private JButton PrintButton;
    private JButton cancelButton;
    private JPanel buttonBar;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}