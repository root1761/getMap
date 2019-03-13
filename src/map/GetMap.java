package map;

public interface GetMap<K,V>  {
public V get(K k);
public V put(K k,V v);
interface Entry<K,V>{
public V getValue();
public K getKey();
public boolean equals(Object o);

};

}
