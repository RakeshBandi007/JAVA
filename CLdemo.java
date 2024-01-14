import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class CLdemo extends JFrame implements ActionListener
{
    CardLayout card;
    JButton b1,b2,b3;
    Container c;

    CLdemo()
    {
        c=getContentPane();
        card=new CardLayout(30,40);
        c.setLayout(card);

        b1=new JButton("COBRA");
        b2=new JButton("KAI");

        b1.addActionListener(this);
        b2.addActionListener(this);

        c.add("a",b1);
        c.add("b",b2);
    }

        public void actionPerformed(ActionEvent e)
        {
            card.next(c);
        }
        
        public static void main(String args[])
        {
            CLdemo cl=new CLdemo();

            cl.setSize(400,400);
           
            cl.setVisible(true);
            cl.setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
    

}