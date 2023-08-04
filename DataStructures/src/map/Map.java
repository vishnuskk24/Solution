package map;

public interface Map<K,V> {

	public void put(K key, V value);
	public void replace(K key, V value);
	public V get(K key);
	public void remove(K key);
	
}
