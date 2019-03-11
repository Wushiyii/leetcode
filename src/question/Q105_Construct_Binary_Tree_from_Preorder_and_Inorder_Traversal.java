package question;

import java.util.Arrays;

public class Q105_Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0 || inorder == null || inorder.length == 0)
            return null;
        int rootValue = preorder[0];
        int rootIndex = -1;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == rootValue) {
                rootIndex = i;
                break;
            }
        }
        TreeNode rootNode = new TreeNode(rootValue);
        rootNode.left = buildTree(
                Arrays.copyOfRange(preorder,1,rootIndex+1),
                Arrays.copyOfRange(inorder,0,rootIndex));
        rootNode.right = buildTree(
                Arrays.copyOfRange(preorder,1 + rootIndex,preorder.length),
                Arrays.copyOfRange(inorder, 1 + rootIndex,inorder.length));

        return rootNode;

    }

    public static void main(String[] args) {
        int[] pre = {3,9,20,15,7};
        int[] in = {9,3,15,20,7};
        Q105_Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal demo = new Q105_Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal();
        TreeNode treeNode = demo.buildTree(pre, in);
        System.out.println(treeNode);
    }
}
