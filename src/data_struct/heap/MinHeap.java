package data_struct.heap;

public class MinHeap {
    private int[] data;

    public MinHeap(int[] data) {
        this.data = data;
    }

    //将数组转换为最小堆
    public void buildHeap() {
        // 完全二叉树只有数组下标小于或等于(data.length/2 - 1)的元素有孩子节点，遍历节点
        // 例如：数组有10个元素， (data.length) / 2 - 1的值为4，a[4]有孩子结点，但a[5]没有
        for (int i = (data.length / 2) - 1; i >= 0; i--) {
            heapify(i);
        }
    }

    private void heapify(int i) {
        int l = left(i);
        int r = right(i);

        //标识最小节点
        int smallest = i;

        //存在左节点，并且左节点小于根节点
        if (l < data.length && data[l] < data[i]) {
            smallest = l;
        }
        //存在右节点，并且右节点小于最小值
        if (r < data.length && data[r] <data[smallest]) {
            smallest = r;
        }
        //左右节点都大于根节点
        if (i == smallest) {
            return;
        }
        swap(i,smallest);
        heapify(smallest);
    }

    // 获取左节点的数组下标
    private int left(int i) {
        return (i + 1) << 1;
    }

    // 获取右节点的数组下标
    private int right(int i) {
        return ((i + 1) << 1) - 1;
    }

    private void swap(int i, int j)
    {
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    public int getRoot() {
        return data[0];
    }

    public void setRoot(int val) {
        data[0] = val;
        heapify(0);
    }
}