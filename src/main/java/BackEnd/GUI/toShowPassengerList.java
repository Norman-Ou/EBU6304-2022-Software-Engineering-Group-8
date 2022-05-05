/*
 * Created by JFormDesigner on Wed May 04 12:13:42 CST 2022
 */

package BackEnd.GUI;

import javax.swing.*;
import java.awt.*;

/**
 * @author unknown
 */
public class toShowPassengerList extends JFrame{
    public toShowPassengerList(String trans) {
        initComponents(trans);
    }

    private void initComponents(String trans) {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();

        //======== this ========
        setLocationByPlatform(true);
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //---- label1 ----
        label1.setText("Passenger not boarding");
        contentPane.add(label1, BorderLayout.NORTH);

        //======== panel1 ========
        {
            panel1.setMinimumSize(new Dimension(700, 1000));
            panel1.setPreferredSize(new Dimension(500, 800));
            panel1.setLayout(new GridLayout());

            //======== scrollPane1 ========
            {
                scrollPane1.setPreferredSize(null);

                //---- textArea1 ----
                textArea1.setRows(10);
                textArea1.setTabSize(20);
                textArea1.setColumns(10);
                textArea1.setPreferredSize(new Dimension(700, 1000));
                textArea1.setBorder(null);
                scrollPane1.setViewportView(textArea1);

//                FlightPage buffer = new FlightPage();
//                String storage = buffer.getPassengerList();
//                if(fp.getPassengerList().equals(""))
                textArea1.setText(trans);

            }
            panel1.add(scrollPane1);
        }
        contentPane.add(panel1, BorderLayout.CENTER);
        setSize(325, 440);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
