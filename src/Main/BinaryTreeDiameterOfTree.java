package Main;

import com.sun.source.tree.Tree;

public class BinaryTreeDiameterOfTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int index = -1;

        public static Node buildtree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);

            return newNode;
        }
    }
    public static int height(Node root)
    {
        if (root == null)
        {
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        int myHeight = Math.max(leftheight, rightheight) + 1;

        return myHeight;
    }
    public static int diameter(Node root)
    {
        if (root == null)
        {
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left) + height(root.right)+1;

        return Math.max(diam3,Math.max(diam1,diam2));
    }

    static class TreeInfo{
        int ht;
        int diam;

        TreeInfo(int ht,int diam)
        {
            this.ht=ht;
            this.diam=diam;
        }
    }
    public static  TreeInfo diameter2(Node root)
    {
        if (root == null)
        {
            return new TreeInfo(0,0) ;
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myheight = Math.max(left.ht,right.ht)+1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int mydiam = Math.max(Math.max(diam1,diam2),diam3);

        TreeInfo myInfo = new TreeInfo(myheight,mydiam);
        return myInfo;

    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildtree(nodes);
        System.out.println(diameter2(root).diam);
    }
}
