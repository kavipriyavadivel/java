import java.util.*;
public class mirror_pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=5;i>=1;i--){
            for(int j=1;j<=2*(i-1);j++){
                System.out.print(" ");
            }
            for(int k=5;k>=i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
