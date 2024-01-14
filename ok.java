import java.awt.event.*;
import javax.swing.*;

public class ok
{
    public static void main(String args[])
    {
        JFrame f=new JFrame();
        final JLabel l=new JLabel();
        l.setBounds(20,150,200,50);
        final JPasswordField pass=new JPasswordField();
        pass.setBounds(100,75,100,30);
        JLabel l1=new JLabel("Username");
        l1.setBounds(20,20,80,30);
        JLabel l2=new JLabel("Password");
        l2.setBounds(20,75,80,30);
        JButton b=new JButton("Login");
        b.setBounds(20,75,80,30);
        final JTextField t=new JTextField();
        t.setBounds(100,20ss,100,30);
        f.add(l);
        f.add(pass);
        f.add(l1);
        f.add(l2);
        f.add(b);
        f.add(t);
        f.setSize(300,300ss);
        f.setVisible(true);
        f.setLayout(null);
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String data="Password:"+new String(pass.getPassword());
                l.setText(data);
            }
        });
    }
}