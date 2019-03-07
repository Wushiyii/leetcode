package data_struct.tree;

public class BSTree<T extends Comparable<T>> {
    private class BSNode<T extends Comparable<T>> {
        T key;
        BSNode<T> parent;
        BSNode<T> left;
        BSNode<T> right;

        public BSNode(T key, BSNode<T> parent, BSNode<T> left, BSNode<T> right) {
            this.key = key;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }
    }
    private BSNode<T> root;

    private void preOrder(BSNode<T> tree) {
        if (tree != null) {
            System.out.println(tree.key + " ");
            preOrder(tree.left);
            preOrder(tree.right);
        }
    }
    public void preOrder(){
        preOrder(root);
    }

    private void inOrder(BSNode<T> tree) {
        if (tree != null) {
            inOrder(tree.left);
            System.out.println(tree.key + " ");
            inOrder(tree.left);
        }
    }

    public void inOrder() {
        inOrder(root);
    }

    private void postOrder(BSNode<T> tree) {
        if (tree != null) {
            preOrder(tree.left);
            preOrder(tree.right);
            System.out.println(tree.key + " ");
        }
    }

    private void postOrder() {
        preOrder(root);
    }

    /**
     * 递归查找key为T的节点
     * @param node BST树
     * @param key
     * @return
     */
    private BSNode<T> search(BSNode<T> node,T key) {
        if (key == null) return null;
        int result = node.key.compareTo(key);
        if (result < 0) {
            return search(node.left,key);
        } else if (result > 0) {
            return search(node.right,key);
        } else {
          return node;
        }
    }

    public BSNode<T> search(T key) {
        return search(root,key);
    }

    private BSNode<T> iterativeSearch(BSNode<T> node,T key) {
        while (node != null) {
            int result = node.key.compareTo(key);
            if (result < 0) {
                node = node.left;
            } else if (result > 0) {
                node = node.right;
            } else {
                return node;
            }
        }
        return null;
    }

    public BSNode<T> iterativeSearch(T key) {
        return iterativeSearch(root,key);
    }

}
