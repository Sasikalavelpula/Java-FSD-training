class person{
    String name;
    int age;
    //parent constructor
    person(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("person constructor called");
    }
}
class student extends person{
    int marks;
    //constructoor
    student(){
        this("hemanth",21,85);
        System.out.println("student default constructor called");
    }
    //constructor 2
    student(String name,int age,int marks){
        super(name,age);
        this.marks=marks;
        System.out.println("student parameterized constructor called");
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Marks:"+marks);
    }
}
public class main{
    public static void main(String[] args){
        student s=new student();
        s.display();
    }
}