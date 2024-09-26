public class CacheTest {
    public static void main(String[] args) {
        // Create an instance of SimpleCache
        SimpleCache<String, String> cache = new SimpleCache<>();

        // Add data to the cache
        cache.put("1", "Data for key 1");
        cache.put("2", "Data for key 2");
        cache.put("3", "Data for key 3");

        // Retrieve data from the cache
        System.out.println("Value for key 2: " + cache.get("2"));

        // Check if a key exists
        if (cache.containsKey("3")) {
            System.out.println("Cache contains key 3");
        }

        // Remove an entry
        cache.remove("1");

        // Check the size of the cache
        System.out.println("Cache size: " + cache.size());

        // Clear the cache
        cache.clear();
        System.out.println("Cache cleared. Current size: " + cache.size());
    }
}

