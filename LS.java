import java.awt.*;
import java.awt.event.*;

public class LS
{
    public static void main(String args[])
    {
        Frame f= new Frame();
        f.setSize(400,400);
        f.setLayout(new FlowLayout());
        f.setVisible(true);

        Label l= new Label("Select No..");

        List l1=new List();
        l1.add("1");
        l1.add("2");
        l1.add("3");

        Label l2=new Label("Select Subject..");

        Choice c1= new Choice();
        c1.add("AJP");
        c1.add("CSS");
        c1.add("STE");

        f.add(l);
        f.add(l1);
        f.add(l2);
        f.add(c1);

    }
}