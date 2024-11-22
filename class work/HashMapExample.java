import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        // Using raw HashMap to allow mixed key and value types
        HashMap<Object, Object> map = new HashMap<>();
        map.put(1, "3");
        map.put("1", "32");
        map.put(45, 78.5);
        map.put(true, "d");
        map.put(56.7, "43");
        map.put(null, null);

        System.out.println("Map with mixed types: " + map);

        // Using HashMap with specified types (String, Integer)
        HashMap<String, Integer> kvmap = new HashMap<>();
        kvmap.put("A", 45);
        kvmap.put("A", 452);
        kvmap.put("B", 425);

        System.out.println("Key-Value Map: " + kvmap);
        System.out.println("Contains key 'A': " + kvmap.containsKey("A"));
        System.out.println("Map size: " + kvmap.size());
        System.out.println("Contains value 45: " + kvmap.containsValue(45));

        // Getting entry set for the first map
        Set<Map.Entry<Object, Object>> set = map.entrySet();
        System.out.println("Entry Set: " + set);

        Iterator<Map.Entry<Object, Object>> lit = set.iterator();
        while (lit.hasNext()) {
            Map.Entry<Object, Object> me = lit.next();
            System.out.println(me.getKey() + ": " + me.getValue());
        }

        // Displaying keys and values for kvmap
        Set<String> skey = kvmap.keySet();
        System.out.println("Key Set for kvmap: " + skey);

        Collection<Integer> vkey = kvmap.values();
        System.out.println("Values for kvmap: " + vkey);

        // Using Hashtable
        Hashtable<String, Integer> htable = new Hashtable<>();
        htable.put("d", 45);
        htable.put("d1", 45);
        htable.put("d3", 45);
        System.out.println("Hashtable: " + htable);
    }
}
