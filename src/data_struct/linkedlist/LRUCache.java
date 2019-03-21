package data_struct.linkedlist;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {

    private int maxEle;

    public LRUCache(int capacity){
        super(capacity,0.75F,true);
        maxEle = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > maxEle;
    }


    public static void main(String[] args) {
        LRUCache<String,String> lruCache = new LRUCache<>(5);
        lruCache.put("a","a");
        lruCache.put("b","b");
        lruCache.put("c","c");
        lruCache.put("d","d");
        lruCache.put("e","e");
        loopLinkedHashMap(lruCache);
        lruCache.get("e");
        lruCache.get("d");
        lruCache.get("c");
        lruCache.get("b");
        lruCache.get("a");
        loopLinkedHashMap(lruCache);


    }

    public static void loopLinkedHashMap(LinkedHashMap<String, String> linkedHashMap)
    {
        Set<Map.Entry<String, String>> set = linkedHashMap.entrySet();
        Iterator<Map.Entry<String, String>> iterator = set.iterator();

        while (iterator.hasNext())
        {
            System.out.print(iterator.next() + "\t");
        }
        System.out.println();
    }



}
