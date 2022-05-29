/*
 * Created by JFormDesigner on Mon May 02 21:39:50 CST 2022
 */

package CheckIn.GUI;

import Beans.Flight.Flight;
import DataBase.fDB;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;

/**
 * The type Air pass cse.
 *
 * @author Jiayi Wang
 */
public class AirPassCse extends JFrame {
    /**
     * The constant flightChoose.
     */
    public static Flight flightChoose;
    /**
     * The constant state.
     * True for chosen airline.
     */
    public static boolean state;
    /**
     * The constant flightNo.
     */
    public static String flightNo = "";
    /**
     * The constant Departure.
     */
    public static String Dep= "";
    /**
     * The constant Destination.
     */
    public static String Des= "";
    /**
     * The constant ETA.
     */
    public static String ETA= "";
    /**
     * The constant time.
     */
    public static Calendar time = Calendar.getInstance();
    /**
     * The constant format.
     */
    public static SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    /**
     * The constant nowTime.
     */
    public static String nowTime = format.format(time.getTime());

    /**
     * Instantiates a new Air pass cse.
     */
    public AirPassCse() {
        initComponents();
    }

    private void cancel(ActionEvent e) {new EnterOther_3().setVisible(true);dispose();}

    private void ok(ActionEvent e) {new ConfirmPage_3().setVisible(true);dispose();}

    private void help(ActionEvent e) {dispose();new ErrorWindow().setVisible(true);}

    /**
     * ErrorWindow handle.
     */
    public static void errorHandel(){
        JOptionPane.showMessageDialog(null, "Sorry for the rejection of your checking in for there's less than 30 minutes for your flight.","Sorry", JOptionPane.WARNING_MESSAGE);
        new ErrorWindow().setVisible(true);
    }

    /**
     * Airline add.
     * If the remaining time is less than 30min, then the passenger would be rejected from checkin.
     *
     * @throws IllegalAccessException the illegal access exception
     * @throws ParseException         the parse exception
     */
    public void airlineAdd() throws IllegalAccessException, ParseException {
        ArrayList<Flight> list = EnterOther_3.getFlight();
        for(Flight flt : list) {
            flightNo=flt.getFlightNo();
            Dep=flt.getDeparture();
            Des=flt.getDestination();
            ETA=flt.getETA();
            String eta=flt.getETA();
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            Date date1 = format.parse(nowTime);
            Date date2 = format.parse(eta);

            long nowMillisecond = date1.getTime();
            long etaMillisecond = date2.getTime();
            if(etaMillisecond - nowMillisecond >  1800000) {
                setContent();
            }else{
                throw new IllegalAccessException();
            }
        }
    }

    /**
     * Set content in the airline combox.
     */
    public void setContent(){airLine.addItem(flightNo);}

    /**
     * Test do. Detect exceptions from overtime.
     *
     * @param e the top button action event.
     */
    public void testDO(ActionEvent e) {
        try{
            airlineAdd();
        } catch (IllegalAccessException | ParseException e1) {
            errorHandel();
            e1.printStackTrace();
        }
    }

    /**
     * Air line item state changed.
     * Fill in the information in the shown table.
     *
     * @param e to fill in top combox, for choosing airline.
     * @throws IllegalAccessException the illegal access exception
     * @throws ParseException         the parse exception
     */
    public void airLineItemStateChanged(ItemEvent e) throws IllegalAccessException, ParseException {
        ArrayList<Flight> list = EnterOther_3.getFlight();
        for(Flight flt : list) {
            flightNo=flt.getFlightNo();
            if(e.getStateChange()==ItemEvent.SELECTED){
                String str=e.getItemSelectable().toString();
                state=true;
                flightChoose=fDB.loadFlightByFlightNo(airLine.getSelectedItem().toString());
                if (flightChoose.equals(flightNo)) {
                    airlineAdd();
                }
                if (state) {
                    flightNo=flightChoose.getFlightNo();
                    table1.setValueAt(flightNo, 2, 1);
                    table1.setValueAt(Dep, 5, 1);
                    table1.setValueAt(Des, 8, 1);
                    table1.setValueAt(ETA, 11, 1);
                }
            }
        }
    }

    /**
     * Sets background.
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
                    airLine.addItemListener(e -> {
                        try {
                            airLineItemStateChanged(e);
                        } catch (IllegalAccessException ex) {
                            ex.printStackTrace();
                        } catch (ParseException ex) {
                            ex.printStackTrace();
                        }
                    });
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
                    panel4.add(testDO, BorderLayout.CENTER);

                    //---- button1 ----
                    button1.setText(bundle.getString("button1.text_27"));
                    button1.addActionListener(e -> help(e));
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
        setBackground();
        try{
            airlineAdd();
        } catch (IllegalAccessException | ParseException e1) {
            errorHandel();
            e1.printStackTrace();
        }
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
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
