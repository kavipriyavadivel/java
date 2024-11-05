import java.util.Arrays;
import java.util.Scanner;

public class merge_and_sortAarray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=scan.nextInt();
        }
        int n2 = scan.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=scan.nextInt();
        }
        int[] arr = new int[n1+n2];
        int k=0;
        for(int i=0;i<n1;i++){
            arr[k++]=arr1[i];
        }
        for(int i=0;i<n2;i++){
            arr[k++]=arr2[i];
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
