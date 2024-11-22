import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap {
    public static void main(String[] args)
    {
        HashMap map = new HashMap();
        map.put(1, "3");
        map.put("1", "32");
        map.put(45,78.5);
        map.put(true, "d");
        map.put(56.7, "43");
        map.put(null, null);
        // map.put(1,"3555");
        System.out.println(map);

        HashMap<String, Integer>kvmap = new HashMap<String, Integer>();
        kvmap.put("A", 45);
        kvmap.put("A", 452);
        kvmap.put("A", 452);
        kvmap.put("A", 45);
        kvmap.put("A", 425);

        System.out.println(kvmap);
        System.out.println(kvmap.containKey("A"));
        System.out.println(kvmap.size());
        System.out.println(kvmap.containsValue(45));
        
        Set<E> set = map.entrySet();
        System.out.println(set);
        
        Iterator lit = set.iterator();
        while(lit.hasNext())
        {
            Map.Entry me = (Map.Entry)lit.next();
            System.out.println(me.getKey()+ ": "+me.getValue())
        }
        set<String> skey = kvmap.keyset();
        System.out.println(skey);
        Collection<Integer> vkey = kvmap.values();
        System.out.println;("vkey");

        Hashtable htable = new Hashtable();
        htable.put("d", 45);
        htable.put("d1", 45);
        htable.put("d3", 45);


    }
}
