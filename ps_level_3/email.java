import java.util.Scanner;

public class email {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        char[] arr = s.toCharArray();
        int i=1;
        while(i + 1 < arr.length && arr[i+1]!='@' && arr[i]!='@' ){
            arr[i]='*';
            i++;
        }
        System.out.println(arr);
    }

}
