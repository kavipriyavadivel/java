import java.util.*;
public class palindrome_pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;
            }
            int p=a-2;
            for(int k=1;k<i;k++){
                System.out.print(p+" ");
                p--;
            }
            System.out.println();
        }
    }
}
