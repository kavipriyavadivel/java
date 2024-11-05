import java.util.*;

public class reverse_sentence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] arr = s.split(" ");
        for(int i=arr.length-1;i>0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.print(arr[0]);
    }
}
