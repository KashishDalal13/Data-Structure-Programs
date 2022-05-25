package Main;

public class BinaryTreePostOrderTraversal {
    static class Node
    {
        int data;
        BinaryTreeInorderTraversal.Node left;
        BinaryTreeInorderTraversal.Node right;

        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree
    {
        static int index=-1;
        public static BinaryTreeInorderTraversal.Node buildtree(int nodes[])
        {
            index++;
            if(nodes[index]==-1)
            {
                return null;
            }
            BinaryTreeInorderTraversal.Node newNode = new BinaryTreeInorderTraversal.Node(nodes[index]);
            newNode.left=buildtree(nodes);
            newNode.right=buildtree(nodes);

            return newNode;
        }
    }
    public static void postorder(BinaryTreeInorderTraversal.Node root)
    {
        if (root == null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTreeInorderTraversal.BinaryTree tree=new BinaryTreeInorderTraversal.BinaryTree();
        BinaryTreeInorderTraversal.Node root=tree.buildtree(nodes);
        postorder(root);
    }
}
