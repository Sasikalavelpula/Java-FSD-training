import java.util.Scanner;
public class scanner{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a marks:"); 
        int marks=sc.nextInt();
        if(marks>90){
            System.out.println("5star");
        } 
        else if(marks>80)
        {
            System.out.println("4star");
        }
        else if(marks>70){
            System.out.println("3star");
        }
        else{
            System.out.println("avg student");
        }

          }
}