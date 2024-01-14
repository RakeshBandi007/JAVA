import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class jtree
{
    public static void main(String args[])
    {
        JFrame f=new JFrame();
        f.setSize(400,400);
        f.setVisible(true);
        f.setTitle("Ex");

        DefaultMutableTreeNode root =new DefaultMutableTreeNode("Maharashtra");
        DefaultMutableTreeNode child =new DefaultMutableTreeNode("Karnataka");
        DefaultMutableTreeNode child2 =new DefaultMutableTreeNode("Pune");
        DefaultMutableTreeNode child3 =new DefaultMutableTreeNode("Mumbai");

        root.add(child);
        child.add(child2);
        child2.add(child3);

        JTree t=new JTree(root);
        f.add(t);


        

    }
}