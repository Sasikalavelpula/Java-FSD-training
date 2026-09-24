public class evenorodd{
    public static void main(String[] args){
        int array[]={1,2,3,4};
        for(int i=0;i<array.length;i++){
            checkEvenOdd(array[i]);
        }
    }

    public static void checkEvenOdd(int number) {
        if(number%2==0){
            System.out.println(number+" is even");
        }
        else{
            System.out.println(number+" is odd");
        }
    }
}