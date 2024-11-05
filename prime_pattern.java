import java.util.*;
public class prime_pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=2;i<=n;i++){
            int flag=1;
            for(int k=2;k<=i/2;k++){
                if(i%k==0){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
