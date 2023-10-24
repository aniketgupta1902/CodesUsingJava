import java.util.*;
class d
{
    Node root;
    class Node {
        int data;
        ArrayList<Node> children;
        Node left;
        Node right;

        Node(int d) {
            data = d;
            left=null;
            right=null;
            children = new ArrayList<>();
        }
    }
    static Scanner obj=new Scanner(System.in);
    void buildTree()
    {
        root=buildTree(null,0);
    }
    Node buildTree(Node parent,int ithchild)
    {
        int data=obj.nextInt();
        Node n=new Node(data);
        int children=obj.nextInt();
        for(int i=0;i<children;i++) {
            Node child = buildTree(n, i);
            n.children.add(child);
        }
        return n;
    }
  

    int sum(int k)
    {
        return sum(root,k);
    }
    int sum(Node root,int k)
    {
        int s=0;
        if(root==null)
            return  0;
        if(k<=0)
            return  root.data;
        for(int i=0;i<root.children.size();i++)
        {
            s=s+sum(root.children.get(i),k-1);
        }
        return s;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        d l=new d();
        l.buildTree();
        int k=s.nextInt();
        System.out.println(l.sum(k));
    }
}