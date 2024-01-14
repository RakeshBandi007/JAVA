import java.awt.*;

public class label1
{
    public static void main(String args[])
    {
        Frame f=new Frame();
        f.setTitle("sa");
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(new FlowLayout());

        Label l= new Label("rakesh");

        TextField t=new TextField("Rakesh");

        TextArea a= new TextArea("",3,40);

        Label l1= new Label("subject..");

        Checkbox c1=new Checkbox("AJP");
        Checkbox c2=new Checkbox("DCC");
        Checkbox c3=new Checkbox("CSS");

        Label l2= new Label("Gender..");

        CheckboxGroup c11=new CheckboxGroup();

        Checkbox c12=new Checkbox("Male",c11,true);
        Checkbox c13=new Checkbox("Female",c11,true);

        f.add(l);
        f.add(t);
        f.add(a);
        f.add(l1);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(l2);
        f.add(c12);
        f.add(c13);
        

    }
}