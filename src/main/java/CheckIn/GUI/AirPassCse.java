/*
 * Created by JFormDesigner on Mon May 02 21:39:50 CST 2022
 */

package CheckIn.GUI;

import javax.swing.table.*;
import Beans.Passenger.SubClasses.BoardingPass;
import CheckIn.Monitor.cMonitors;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Jiayi Wang
 */
public class AirPassCse extends JFrame {
    public AirPassCse() {
        initComponents();
    }

    public void airlineAdd(){
        if(!(EnterBN_3.getPsnTemp()==null)){
            try{
                BoardingPass boardingPass = EnterBN_3.getPsnTemp().getBoardingPass();
                table1.setValueAt(boardingPass.getFlightNo(),2,3);
                table1.setValueAt(boardingPass.getDeparture(),2,6);
                table1.setValueAt(boardingPass.getDestination(),2,9);
                table1.setValueAt(boardingPass.getETA(),2,12);
                airLine.addItem(boardingPass.getFlightNo());
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        else if(!(EnterOther_3.getPsnTemp1()==null)) {
            try {
                BoardingPass boardingPass = EnterOther_3.getPsnTemp1().getBoardingPass();
                table1.setValueAt(boardingPass.getFlightNo(),2,3);
                table1.setValueAt(boardingPass.getDeparture(),2,6);
                table1.setValueAt(boardingPass.getDestination(),2,9);
                table1.setValueAt(boardingPass.getETA(),2,12);
                airLine.addItem(boardingPass.getFlightNo());

            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }else{
            try{
                BoardingPass boardingPass = EnterOther_3.getPsnTemp2().getBoardingPass();
                table1.setValueAt(boardingPass.getFlightNo(),2,3);
                table1.setValueAt(boardingPass.getDeparture(),2,6);
                table1.setValueAt(boardingPass.getDestination(),2,9);
                table1.setValueAt(boardingPass.getETA(),2,12);
                airLine.addItem(boardingPass.getFlightNo());
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }


    public void init() {
        ImageIcon background = new ImageIcon("src/main/resources/img.png");
        JLabel label3 = new JLabel(background);
        label3.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());
        JPanel myPanel = (JPanel)this.getContentPane();
        myPanel.setOpaque(false);
        this.getLayeredPane().add(label3, new Integer(Integer.MIN_VALUE));
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
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Gabirella
        ResourceBundle bundle = ResourceBundle.getBundle("Check");
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        airLine = new JComboBox<>();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();
        label2 = new JLabel();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setOpaque(false);
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border
            . EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border. TitledBorder. CENTER, javax
            . swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,
            12 ), java. awt. Color. red) ,dialogPane. getBorder( )) ); dialogPane. addPropertyChangeListener (new java. beans
            . PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .equals (e .
            getPropertyName () )) throw new RuntimeException( ); }} );
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setOpaque(false);
                contentPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
                contentPanel.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 28));
                contentPanel.setLayout(new GridBagLayout());
                ((GridBagLayout)contentPanel.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0};
                ((GridBagLayout)contentPanel.getLayout()).rowHeights = new int[] {0, 0};
                ((GridBagLayout)contentPanel.getLayout()).columnWeights = new double[] {1.0, 0.0, 1.0, 1.0, 1.0E-4};
                ((GridBagLayout)contentPanel.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

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
                    scrollPane1.setViewportView(table1);
                }
                contentPanel.add(scrollPane1, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
                contentPanel.add(airLine, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

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
            dialogPane.add(buttonBar, BorderLayout.SOUTH);

            //---- label2 ----
            label2.setText(bundle.getString("label2.text_11"));
            label2.setHorizontalAlignment(SwingConstants.CENTER);
            label2.setFont(new Font("Lucida Grande", Font.BOLD, 40));
            label2.setForeground(Color.black);
            label2.setBackground(new Color(0, 127, 255, 191));
            dialogPane.add(label2, BorderLayout.NORTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(900, 550);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        //TODO add passenger's airline information
        
        airlineAdd();
        init();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Gabirella
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JComboBox<String> airLine;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
