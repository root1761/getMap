package map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashGetMap<K,V>  implements GetMap<K,V> {
    private final int DEFAULT_CAPATIRY=1<<2;
    private final int DEFAULT_MAX_CAPATITY=1<<30;
    private final float DEFAULT_LOAD_FACTORY=0.75f;
    private Node[] table;
    private int loadFactory;

    @Override

    public V get(K k) {
        return null;
    }
private static class Node<K,V> implements GetMap.Entry<K,V>{
private K key;
private V value;
private int hash;
private Node<K,V> node;

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public K getKey() {

        System.out.println(111121);
        return key;
    }

    @Override
    public boolean equals(Object o) {
        if(o==this){
            return true;
        }
        if(o instanceof Map.Entry<?,?>) {
            Map.Entry<?, ?> e = (Map.Entry<?, ?>)o;
if(e.getKey().equals(key)&&e.getValue().equals(value)){
    return true;
}

        }
        return false;

    }



}
    final int hash(Object key) {
        int i;
        return key==null?0:( i=key.hashCode())^(i>>>16);
    }
    @Override
    public V put(K key, V v) {
        return putVal(hash(key),key,v);
    }
public V putVal(int index,K key,V v){
  Node[] tabs;
  new ConcurrentHashMap();
if((tabs=table)==null||tabs.length==0){

}
return null;
}

}
