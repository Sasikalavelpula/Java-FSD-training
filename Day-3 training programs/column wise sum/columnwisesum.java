public class columnwisesum{
    public static void main(String[] args){
        int[][] array={{1,2,3},{4,5,6}};
        int sum=0;
        for(int j=0;j<array[0].length;j++){
            sum=0;
            for(int i=0;i<array.length;i++){
                sum+=array[i][j];
            }
            System.out.println("Sum of column "+(j+1)+" is: "+sum);
        }
    }
}