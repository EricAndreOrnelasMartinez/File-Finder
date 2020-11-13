package Paquete1;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

@SuppressWarnings("serial")
public class V extends JFrame {
    JButton update, find, show;
    JTextField file;
    JPanel panel;
    Process process;
    public V() {
        this.setSize(400, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("File Finder");
        this.setLocationRelativeTo(null);
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
        update = new JButton("Update");
        update.setBounds(0, 125, 100, 40);
        panel.add(update);
        show = new JButton("Show");
        show.setBounds(150, 125, 100, 40);
        panel.add(show);
        find = new JButton("Find");
        find.setBounds(300, 125, 100, 40);
        panel.add(find);
        file = new JTextField();
        file.setBounds(70, 40, 250, 40);
        panel.add(file);
        MouseListener mouseListener = new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent arg0) {
                try{
                process = Runtime.getRuntime().exec("sudo /home/user-ubuntu/Documents/javaP/Ciclos/javash.sh");
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Something went wrong", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseExited(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mousePressed(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseReleased(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }

        };
        update.addMouseListener(mouseListener);
    }
}
