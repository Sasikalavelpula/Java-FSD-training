import java.util.HashMap;
import java.util.Map;

public class Linkedhashmap{
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(101,"sasi");
        map.put(102,"roja");
        map.put(103,"hema");
        map.put(104,"sana");
        System.out.println("HashMap: " + map);
        System.out.println("Student 102:" + map.get(102));
        System.out.println("Map size: " + map.size());
        System.out.println("Contains key 103: " + map.containsKey(103));
        System.out.println("Contains value 'Siva': " + map.containsValue("Siva"));
        map.put(102,"roja");
        System.out.println("HashMap after update: " + map);
        map.remove(105);
        System.out.println("HashMap after removing 105: " + map);
        System.out.println("\nUsing keyset():");
        for(Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        System.out.println("\nUsing entrySet():");
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}