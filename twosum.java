import java.util.Arrays;
public class twosum {
    public static int[] twosum(int [] num1 ,int target){
        for (int i=0;i<num1.length;i++){
            for(int j=1;j<num1.length;j++){
                if(num1[i]+num1[j]==target){
                    return new int []{i,j};
                }
            }
        }return new int []{};
    }
    public static void main(String[] args) {
        int [] num1 ={1,2,3,4};
        int target =6;
        int [] result = twosum(num1,target);
        System.out.println(Arrays.toString(result));
    }
}
