package question;

import java.util.Arrays;

public class Q706_Design_HashMap {
    /** Initialize your data structure here. */
    int[][] data;
    int buckets = 1000;
    int size = 1001;
    public Q706_Design_HashMap() {
        data= new int[buckets][];
    }

    private int hash(int val) {
        return val % buckets;
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        int hashKey = hash(key);
        if (data[hashKey] == null) {
            data[hashKey] = new int[size];
            Arrays.fill(data[hashKey],-1);
        }
        data[hashKey][key/size] = value;
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int hashKey = hash(key);
        if (data[hashKey] == null) {
            return -1;
        }
        return data[hashKey][key / buckets];
    }
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int hashKey = hash(key);
        if (data[hashKey] != null) {
            data[hashKey][key/buckets] = -1;
        }
    }

    public static void main(String[] args) {
        Q706_Design_HashMap demo = new Q706_Design_HashMap();
        demo.put(3,11);
        demo.put(4,13);
        demo.put(15,6);
        demo.put(6,15);
        demo.put(8,8);
        demo.put(11,0);
        int i = demo.get(11);
        System.out.println(i);


    }
}
