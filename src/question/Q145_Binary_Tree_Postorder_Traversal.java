package question;

import java.util.ArrayList;
import java.util.List;

public class Q145_Binary_Tree_Postorder_Traversal {
    List<Integer> result = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            result.add(root.val);
        }
        return result;
    }
}
