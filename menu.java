import java.awt.*;

public class menu
{
    public static void main(String args[])
    {
        Frame f1=new Frame();
        f1.setLayout(new FlowLayout());
        f1.setVisible(true);
        f1.setSize(400,400);

        MenuBar m= new MenuBar();
        Menu m1=new Menu("File");
        Menu m2=new Menu("Edit");
        Menu m3=new Menu("View");

        MenuItem m11=new MenuItem("New");
        MenuItem m12=new MenuItem("Open");

        m.add(m1);
        m.add(m2);
        m.add(m3);
        m2.add(m11);
        m2.add(m12);

        f1.setMenuBar(m);

    }
}