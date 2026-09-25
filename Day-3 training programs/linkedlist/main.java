import java.util.LinkedList;
public class main{
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();
        students.add("Chandra");
        students.add("Kavya");
        students.add("Samuel");
        students.add("Sasi");
        System.out.println(students);
        System.out.println("First: "+students.getFirst());
          System.out.println("Last: "+students.getLast());

          students.removeFirst();
          students.removeLast();
           System.out.println(students);
    }
}