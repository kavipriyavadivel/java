import java.util.*;
public class power_of_next {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];
        int [] arr1 = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            arr1[i]=(int)Math.pow(arr[i],arr[(i+1)%n]);
        }
        System.out.println(Arrays.toString(arr1));
    }
}
