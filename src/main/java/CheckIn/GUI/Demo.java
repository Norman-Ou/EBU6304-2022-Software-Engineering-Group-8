package CheckIn.GUI;/**
 * @program: EBU6304-2022-Software-Engineering-Group-8
 * @description:
 * @author: Mr.Wang
 * @create: 2022-05-07 20:53
 **/

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Demo extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 4665344921910340705L;

    protected InfiniteProgressPanel glassPane;

    public Demo() {
        super("Printing page");

        build();

        pack();
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    protected void build() {
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(BorderLayout.CENTER, buildInfinitePanel());
    }

    protected Container buildInfinitePanel() {

        JPanel pane = new JPanel(new BorderLayout());
        JLabel label = new JLabel();
        label.setText("Click the button for printing your TAG.");
        label.setFont(new Font(".AppleSystemUIFont", Font.BOLD | Font.ITALIC, 25));

        glassPane = new InfiniteProgressPanel("Printing......");
        setGlassPane(glassPane);

        JTable table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        pane.add(BorderLayout.CENTER, scrollPane);
        pane.add(BorderLayout.NORTH,label);

        JPanel buttons = new JPanel();
        buttons.setPreferredSize(new Dimension(234, 90));
        buttons.setLayout(new GridLayout());
        JButton button = new JButton("Confirm to print");
        buttons.add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                glassPane.start();
                Thread performer = new Thread(new Runnable() {
                    public void run() {
                        try {
                            Thread.sleep(3000);
                            dispose();
                            JOptionPane.showMessageDialog(null, "Ready for next step?","Next step", JOptionPane.QUESTION_MESSAGE);
                            if(PrintFlight_6.stage.equals("BoardingPass")){
                                new Baggage_7().setVisible(true);
                                PrintFlight_6.stage="false";
                            }else if(PrintBag_11.stage0.equals("BagTag")){
                                new Meal_12().setVisible(true);
                            }
                        } catch (InterruptedException ie) {
                        }
                        glassPane.stop();
                    }
                }, "Performer");
                performer.start();
            }
        });
        pane.add(BorderLayout.SOUTH, buttons);

        return pane;
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.setVisible(true);
    }
}
