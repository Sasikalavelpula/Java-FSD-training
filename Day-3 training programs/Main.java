public class Main{
    public static void main(String[]args){
        int[] array={1,2,3,4};
        array[1]=3;
        array[2]=0;
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}