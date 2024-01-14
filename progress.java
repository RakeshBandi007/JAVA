import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class progress
{
    public static void main(String args[])
    {
        JFrame f=new JFrame();
        f.setSize(400,400);
        f.setVisible(true);
        JProgressBar p=new JProgressBar(0,100);
        f.add(p);
        p.setStringPainted(true);

        int i=0;
        while(i<=100)
        {
            p.setValue(i);

            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {}i=i+10;
        }
    }
}