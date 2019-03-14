package question;

import java.util.Arrays;

public class Q106_Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || inorder.length == 0 || inorder == null || inorder.length == 0)
            return null;
        int rootValue = postorder[postorder.length-1];
        int rootIndex = -1;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == rootValue) {
                rootIndex = i;
                break;
            }
        }
        TreeNode rootNode = new TreeNode(rootValue);
        rootNode.left = buildTree(
                Arrays.copyOfRange(inorder,1,rootIndex+1),
                Arrays.copyOfRange(postorder,0,rootIndex));
        rootNode.right = buildTree(
                Arrays.copyOfRange(inorder,1 + rootIndex,inorder.length),
                Arrays.copyOfRange(postorder, 1 + rootIndex,postorder.length));

        return rootNode;
    }
}
