package BackendGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/*
 * Created by JFormDesigner on Sun Apr 10 14:14:03 CST 2022
 */



/**
 * @author Lingxiao
 */
public class backend extends JFrame {
    public backend() {
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {
        if(e.getSource()==button1){
            Flight F = new Flight();
            F.setVisible(true);
            this.dispose();
            F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

    }

    private void button2MouseClicked(MouseEvent e) {
        if(e.getSource()==button2){
            Passenger P = new Passenger();
            P.setVisible(true);
            this.dispose();
            P.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        label1 = new JLabel();
        panel2 = new JPanel();
        panel5 = new JPanel();
        panel7 = new JPanel();
        button1 = new JButton();
        panel8 = new JPanel();
        panel9 = new JPanel();
        button2 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(3, 0));

        //======== panel1 ========
        {
            panel1.setLayout(new GridLayout(3, 0));

            //======== panel3 ========
            {
                panel3.setLayout(new FlowLayout());
            }
            panel1.add(panel3);

            //======== panel4 ========
            {
                panel4.setLayout(new FlowLayout());

                //---- label1 ----
                label1.setText("Please choose one method to enquiry");
                panel4.add(label1);
            }
            panel1.add(panel4);
        }
        contentPane.add(panel1);

        //======== panel2 ========
        {
            panel2.setLayout(new GridLayout(2, 3, 20, 0));

            //======== panel5 ========
            {
                panel5.setLayout(new GridLayout(1, 3));

                //======== panel7 ========
                {
                    panel7.setLayout(new FlowLayout());

                    //---- button1 ----
                    button1.setText("Search in Flights");
                    button1.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            button1MouseClicked(e);
                        }
                    });
                    panel7.add(button1);
                }
                panel5.add(panel7);
            }
            panel2.add(panel5);

            //======== panel8 ========
            {
                panel8.setLayout(new GridLayout(1, 3));

                //======== panel9 ========
                {
                    panel9.setLayout(new FlowLayout());

                    //---- button2 ----
                    button2.setText("Search in Passengers");
                    button2.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            button2MouseClicked(e);
                        }
                    });
                    panel9.add(button2);
                }
                panel8.add(panel9);
            }
            panel2.add(panel8);
        }
        contentPane.add(panel2);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JPanel panel3;
    private JPanel panel4;
    private JLabel label1;
    private JPanel panel2;
    private JPanel panel5;
    private JPanel panel7;
    private JButton button1;
    private JPanel panel8;
    private JPanel panel9;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
