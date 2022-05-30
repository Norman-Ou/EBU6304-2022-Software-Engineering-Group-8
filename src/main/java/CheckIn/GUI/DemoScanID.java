package CheckIn.GUI;/**
 * @program: EBU6304-2022-Software-Engineering-Group-8
 * @description:
 * @author: Mr.Wang
 * @create: 2022-05-07 20:53
 **/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class DemoScanID extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 4665344921910340705L;

    protected InfiniteProgressPanel glassPane;

    public DemoScanID() {
        super("Scanning ID card...");

        build();

        pack();
        setResizable(false);
        setSize(900, 550);
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
        label.setText("Scan ID card.");
        label.setFont(new Font(".AppleSystemUIFont", Font.BOLD | Font.ITALIC, 25));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        glassPane = new InfiniteProgressPanel("Scanning ID card......");
        setGlassPane(glassPane);

        JTable table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        pane.add(BorderLayout.CENTER, scrollPane);
        pane.add(BorderLayout.NORTH,label);

        JPanel buttons = new JPanel();
        buttons.setPreferredSize(new Dimension(234, 90));
        buttons.setLayout(new GridLayout());
        JButton button = new JButton("Confirm to scan");
        buttons.add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                glassPane.start();
                Thread performer = new Thread(new Runnable() {
                    public void run() {
                        try {
                            Thread.sleep(3000);
                            PrintFlight_6.scanState=true;
                            dispose();
                            new PrintFlight_6().setVisible(true);
//                            EnterOther_3.scanState=true;

                            return;
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
        DemoScanID d = new DemoScanID();
        d.setVisible(true);
    }
}
