package question;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class Q144_Binary_Tree_Preorder_Traversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        return preorderTraversal(root,result);
    }
    public List<Integer> preorderTraversal(TreeNode node,List<Integer> list) {
        if (node != null) {
            list.add(node.val);
            preorderTraversal(node.left,list);
            preorderTraversal(node.right,list);
        }
        return list;
    }
}
