abstract class animal{
    abstract void sound();  
}
class dog extends animal{
    void sound(){
        System.out.println("dog barks");
    }
}

public class abstraction { 
    public static void main(String[] args) {
        dog d = new dog();
        d.sound();
    }
    
}
