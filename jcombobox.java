import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class jcombobox
 {
    public static void main(String args[])
    {
       JFrame f=new JFrame();
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setSize(400,400);

        

         String[] values={"English","Maths","science"
         };

JTextArea tx=new JTextArea(10,15);
        
         JComboBox c1=new JComboBox(values);
      JScrollPane sp=new JScrollPane(tx,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        f.add(sp);
        f.add(c1);
    }
    
}