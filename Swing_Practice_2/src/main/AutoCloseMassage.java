
package main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class AutoCloseMassage {
private static final int TIME_VISIBLE = 2000;

    public static void main(String[] args) {

        final JFrame frame1 = new JFrame("My App");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(200, 200);
        frame1.setLocation(100, 100);

        JButton button = new JButton("My Button");
        frame1.getContentPane().add(button);

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane pane = new JOptionPane("Saved Successfully", JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = pane.createDialog(null, "Title");
                dialog.setModal(false);
                dialog.setVisible(true);

                new Timer(TIME_VISIBLE, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dialog.setVisible(false);
                    }
                }).start();
            }
        });

        frame1.setVisible(true);

    }
}
