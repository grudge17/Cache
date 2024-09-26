import java.util.HashMap;

public class SimpleCache<K, V> {
    private HashMap<K, V> cacheMap;

    // Constructor
    public SimpleCache() {
        cacheMap = new HashMap<>();
    }

    // Method to add data to the cache
    public void put(K key, V value) {
        cacheMap.put(key, value);
    }

    // Method to retrieve data from the cache
    public V get(K key) {
        return cacheMap.get(key);
    }

    // Method to check if the cache contains a key
    public boolean containsKey(K key) {
        return cacheMap.containsKey(key);
    }

    // Method to remove data from the cache
    public void remove(K key) {
        cacheMap.remove(key);
    }

    // Method to clear the cache
    public void clear() {
        cacheMap.clear();
    }

    // Method to get the size of the cache
    public int size() {
        return cacheMap.size();
    }
}
