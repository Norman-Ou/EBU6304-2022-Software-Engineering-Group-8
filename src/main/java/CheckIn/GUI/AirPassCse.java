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
        testDO = new JButton();
        panel3 = new JPanel();
        label2 = new JLabel();
        toolBar1 = new JToolBar();
        airLine = new JComboBox<>();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setOpaque(false);
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder
            ( 0, 0, 0, 0) , "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", javax. swing. border. TitledBorder. CENTER, javax. swing. border
            . TitledBorder. BOTTOM, new java .awt .Font ("D\u0069al\u006fg" ,java .awt .Font .BOLD ,12 ), java. awt
            . Color. red) ,dialogPane. getBorder( )) ); dialogPane. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void
            propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062or\u0064er" .equals (e .getPropertyName () )) throw new RuntimeException( )
            ; }} );
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
                panel2.setLayout(new BorderLayout());

                //======== buttonBar ========
                {
                    buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                    buttonBar.setOpaque(false);
                    buttonBar.setLayout(new FlowLayout());

                    //---- okButton ----
                    okButton.setText(bundle.getString("okButton.text_13"));
                    okButton.addActionListener(e -> ok(e));
                    buttonBar.add(okButton);

                    //---- cancelButton ----
                    cancelButton.setText(bundle.getString("cancelButton.text_18"));
                    cancelButton.addActionListener(e -> cancel(e));
                    buttonBar.add(cancelButton);
                }
                panel2.add(buttonBar, BorderLayout.CENTER);
            }
            dialogPane.add(panel2, BorderLayout.SOUTH);

            //---- testDO ----
            testDO.setText(bundle.getString("testDO.text_26"));
            testDO.addActionListener(e -> testDO(e));
            dialogPane.add(testDO, BorderLayout.WEST);

            //======== panel3 ========
            {
                panel3.setLayout(new BorderLayout());

                //---- label2 ----
                label2.setText(bundle.getString("label2.text_11"));
                label2.setHorizontalAlignment(SwingConstants.CENTER);
                label2.setFont(new Font("Lucida Grande", Font.BOLD, 40));
                label2.setForeground(Color.black);
                label2.setBackground(new Color(0, 127, 255, 191));
                panel3.add(label2, BorderLayout.CENTER);

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
    private JButton testDO;
    private JPanel panel3;
    private JLabel label2;
    private JToolBar toolBar1;
    private JComboBox<String> airLine;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
