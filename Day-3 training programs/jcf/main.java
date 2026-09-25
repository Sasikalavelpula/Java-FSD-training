import java.util.ArrayList;

public class main{
    public static void main(String[] args){
        ArrayList<String> students=new ArrayList<>();
        students.add("John");
        students.add("Alice");
        students.add("Bob");
        students.remove(2);
        System.out.println(students);
        //acess element
        System.out.println("First student:"+students.get(0));
        //change element
        students.set(1,"Eve");
        System.out.println(students);
        //Remove element
        students.remove(0);
        System.out.println(students);
        //search
        if(students.contains("Eve")){
            System.out.println("Eve is present in the list");
    }
    //size
    System.out.println("Size of the list:"+students.size());
    }
}