package question;

import java.util.Arrays;

public class Q705_Design_HashSet {
    /** Initialize your data structure here. */
    private boolean[][]data;

    public Q705_Design_HashSet() {
        data = new boolean[1000][];
    }
    private int hash(int val) {
        return val % 1000;
    }

    public void add(int key) {
        int val = hash(key);
        if (data[val] == null) {
            data[val] = new boolean[1001];
        }
        data[val][key/1000] = true;
    }

    public void remove(int key) {
        int val = hash(key);
        if (data[val] != null) {
            data[val][key/1000] = false;
        }
    }
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int val = hash(key);
        if (data[val] == null) {
            return false;
        } else {
            return data[val][key/1000];
        }
    }


    public static void main(String[] args) {
        boolean[] a = new boolean[2];
        System.out.println(a[0]);
    }
}