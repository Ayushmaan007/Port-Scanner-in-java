package Minor_Network;

import javax.swing.*;

public class Option_Screen extends JFrame
{
    static JButton button1;
    static JButton button2;

    public static void buttons()
    {
        ImageIcon imageIcon = new ImageIcon("illuminati_icon_177465.png");
        Option_Screen op = new Option_Screen();

        button1 = new JButton();
        button1.setBounds(100, 100, 120, 50);
        button1.addActionListener(e -> Main.any_ip());
        button1.setText("OPEN PORTS");
        button1.setFocusable(false);
        button1.setHorizontalAlignment(button1.CENTER);

        button2 = new JButton();
        button2.setBounds(100, 160, 120, 50);
        button2.addActionListener(e -> IPFinder.dns());
        button2.setText("HOST IP");
        button2.setFocusable(false);
        button2.setHorizontalAlignment(button2.CENTER);
        op.setDefaultCloseOperation(op.EXIT_ON_CLOSE);
        op.setLayout(null);
        op.setTitle("OPTION WINDOW");
//        this.setResizable(false);
        op.setSize(325, 350);
        op.setVisible(true);
        op.add(button1);
        op.add(button2);


    }
//
//    public static void main(String[] args)
//    {
//        Option_Screen t = new Option_Screen();
//    }

//    @Override
//    public void actionPerformed(ActionEvent e)
//    {
//        if(e.getSource() == button)
//        {
//            System.out.println("This is something");
//        }
//    }
}