/*
 * Created by JFormDesigner on Mon May 02 21:39:50 CST 2022
 */

package CheckIn.GUI;

import javax.swing.event.ChangeEvent;
import javax.swing.table.*;

import Beans.Flight.Flight;
import Beans.Flight.SubClasses.Seat;
import Beans.Passenger.Passenger;
import Beans.Passenger.SubClasses.BoardingPass;
import CheckIn.Monitor.cMonitors;
import DataBase.fDB;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Jiayi Wang
 */
public class AirPassCse extends JFrame {
    public static Flight flightChoose;
    public AirPassCse() {
        initComponents();
    }

    public void airlineAdd(){
        String flightNo = "";
        String Dep= "";
        String Des= "";
        String ETA= "";
        try{
            ArrayList<Flight> list=EnterOther_3.getFlight();
            for(Flight flt : list){          //同for(int i = 0;i<list.size();i++)
                flightNo=flt.getFlightNo();
                Dep=flt.getDeparture();
                Des=flt.getDestination();
                ETA=flt.getETA();
                table1.setValueAt(flightNo,2,1);
                table1.setValueAt(Dep,5,1);
                table1.setValueAt(Des,8,1);
                table1.setValueAt(ETA,11,1);
                airLine.addItem(flightNo);
                System.out.println(flightNo);
            }

        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }


    public void init() {
        ImageIcon background = new ImageIcon("src/main/resources/img.png");
        JLabel label3 = new JLabel(background);
        label3.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());
        JPanel myPanel = (JPanel)this.getContentPane();
        myPanel.setOpaque(false);
        this.getLayeredPane().add(label3, Integer.valueOf(Integer.MIN_VALUE));
        this.setTitle("Passenger check-in system");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void cancel(ActionEvent e) {
        new EnterOther_3().setVisible(true);
        dispose();
    }

    private void ok(ActionEvent e) {
        new ConfirmPage_3().setVisible(true);
        dispose();
    }

    private void testDO(ActionEvent e) {
        airlineAdd();
    }

    private void airLineItemStateChanged(ItemEvent e) {
//        e.getItem();
//        airLine.getSelectedItem();
        flightChoose=fDB.loadFlightByFlightNo(airLine.getSelectedItem().toString());
//        if(e.getItem().equals(airLine.getSelectedItem())){
//            airlineAdd();
//        }
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Gabirella Cambridge
        ResourceBundle bundle = ResourceBundle.getBundle("Check");
        dialogPane = new JPanel();
        panel1 = new JPanel();
        contentPanel = new JPanel();
        menuBar1 = new JMenuBar();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        panel2 = new JPanel();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();
        panel3 = new JPanel();
        toolBar1 = new JToolBar();
        airLine = new JComboBox<>();
        panel4 = new JPanel();
        testDO = new JButton();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setOpaque(false);
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder(
            0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder
            . BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt. Color.
            red) ,dialogPane. getBorder( )) ); dialogPane. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .
            beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
            dialogPane.setLayout(new BorderLayout());

            //======== panel1 ========
            {
                panel1.setLayout(new BorderLayout());
            }
            dialogPane.add(panel1, BorderLayout.EAST);

            //======== contentPanel ========
            {
                contentPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
                contentPanel.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 28));
                contentPanel.setLayout(new GridLayout());

                //======== menuBar1 ========
                {

                    //======== scrollPane1 ========
                    {

                        //---- table1 ----
                        table1.setModel(new DefaultTableModel(
                            new Object[][] {
                                {null, null},
                                {null, null},
                                {"Flight number", null},
                                {null, null},
                                {null, null},
                                {"Departure", null},
                                {null, null},
                                {null, null},
                                {"Destination", null},
                                {null, null},
                                {null, null},
                                {"ETA", null},
                                {"", null},
                            },
                            new String[] {
                                "Title", "Information"
                            }
                        ));
                        {
                            TableColumnModel cm = table1.getColumnModel();
                            cm.getColumn(0).setMinWidth(45);
                            cm.getColumn(0).setPreferredWidth(45);
                            cm.getColumn(1).setMinWidth(40);
                        }
                        table1.setPreferredScrollableViewportSize(new Dimension(450, 40));
                        table1.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 14));
                        table1.setFocusTraversalPolicyProvider(true);
                        table1.setFillsViewportHeight(true);
                        scrollPane1.setViewportView(table1);
                    }
                    menuBar1.add(scrollPane1);
                }
                contentPanel.add(menuBar1);
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== panel2 ========
            {
                panel2.setLayout(new GridLayout());

                //======== buttonBar ========
                {
                    buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                    buttonBar.setOpaque(false);
                    buttonBar.setMinimumSize(new Dimension(168, 60));
                    buttonBar.setPreferredSize(new Dimension(168, 90));
                    buttonBar.setLayout(new GridLayout());

                    //---- okButton ----
                    okButton.setText(bundle.getString("okButton.text_13"));
                    okButton.addActionListener(e -> ok(e));
                    buttonBar.add(okButton);

                    //---- cancelButton ----
                    cancelButton.setText(bundle.getString("cancelButton.text_18"));
                    cancelButton.addActionListener(e -> cancel(e));
                    buttonBar.add(cancelButton);
                }
                panel2.add(buttonBar);
            }
            dialogPane.add(panel2, BorderLayout.SOUTH);

            //======== panel3 ========
            {
                panel3.setLayout(new BorderLayout());

                //======== toolBar1 ========
                {

                    //---- airLine ----
                    airLine.setModel(new DefaultComboBoxModel<>(new String[] {
                        "Airline"
                    }));
                    airLine.addItemListener(e -> airLineItemStateChanged(e));
                    toolBar1.add(airLine);
                }
                panel3.add(toolBar1, BorderLayout.SOUTH);

                //======== panel4 ========
                {
                    panel4.setOpaque(false);
                    panel4.setLayout(new BorderLayout());

                    //---- testDO ----
                    testDO.setText(bundle.getString("testDO.text_26"));
                    testDO.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 30));
                    testDO.addActionListener(e -> testDO(e));
                    panel4.add(testDO, BorderLayout.CENTER);

                    //---- button1 ----
                    button1.setText(bundle.getString("button1.text_27"));
                    panel4.add(button1, BorderLayout.EAST);
                }
                panel3.add(panel4, BorderLayout.NORTH);
            }
            dialogPane.add(panel3, BorderLayout.NORTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(900, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        //TODO add passenger's airline information
        init();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Gabirella Cambridge
    private JPanel dialogPane;
    private JPanel panel1;
    private JPanel contentPanel;
    private JMenuBar menuBar1;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JPanel panel2;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    private JPanel panel3;
    private JToolBar toolBar1;
    private JComboBox<String> airLine;
    private JPanel panel4;
    private JButton testDO;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
