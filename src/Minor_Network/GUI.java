package Minor_Network;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GUI extends JFrame
{
    GUI()
    {
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //by default, it is HIDE_ON_CLOSE
        //to prevent from doing anything - DO_NOTHING_ON_CLOSE
//        this.setResizable(false); //to resize the window.
        this.setTitle("Main Window");
//        this.getContentPane().setBackground(new Color(0, 0, 0));
        this.setLayout(null);
        this.setVisible(true);
//        this.pack();
    }


    //    public static void main_frame()
//    {
//
//    }
    public void title_image()
    {
        ImageIcon image = new ImageIcon("Logo (Custom).png");
        GUI.this.setIconImage(image.getImage());
    }

    JButton button;
    public void buttons()
    {
        button = new JButton();
        button.addActionListener(e -> Option_Screen.buttons());
        button.setText("START");
        button.setFocusable(false);
        button.setBounds(160, 383, 100, 50);
//        GUI.this.add(button);
    }

    public void label()
    {
        ImageIcon image_label = new ImageIcon("Logo (Custom).png");
        Border border = BorderFactory.createLineBorder(Color.BLUE,3);
        JLabel label = new JLabel();// create a label
        buttons();
        label.setText("PORT SCANNER"); //will set text of label
        label.setIcon(image_label);
        label.setHorizontalTextPosition(label.CENTER);
        label.setVerticalTextPosition(label.BOTTOM);
        label.setIconTextGap(0);
        label.setForeground(Color.BLACK);
        label.setFont(new Font("Times New Roman", Font.BOLD, 50));
        label.setBorder(border);
        label.setVerticalAlignment(label.CENTER);
        label.setHorizontalAlignment(label.CENTER);
        label.setBounds(0, 0, 450, 450);
        label.add(button);
        GUI.this.add(label);
    }

    public static void main(String[] args)
    {
        GUI frame = new GUI();
        frame.label();
        frame.title_image();
//        frame.pack();
    }
}