package map;

import java.util.Set;

public interface Map<K,V> {

	public void put(K key, V value);
	public void replace(K key, V value);
	public V get(K key);
	public Set<K> getKeySet();
	public void remove(K key);
	public Integer countPairs() ;
	
}
