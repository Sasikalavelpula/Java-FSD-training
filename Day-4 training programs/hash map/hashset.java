import java.util.HashSet;
public class hashset{
    public static void main(String[] args){
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println("HashSet: "+set);
        System.out.println("Size of HashSet: "+set.size());
        set.remove(3);
        System.out.println("HashSet after removing 3: "+set);
        set.add(2);
        System.out.println("HashSet after adding 2 again: "+set);
        System.out.println("\nIteration:");
        for(Integer i:set){
            System.out.println(i);
        }
        System.out.println("\n Is Empty:"+set.isEmpty());
        set.clear();
    }
}