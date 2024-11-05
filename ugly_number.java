import java.util.*;
public class ugly_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while(n%2==0)
            n/=2;
        while(n%3==0)
            n/=3;
        while(n%5==0)
            n/=5;
        if(n==1)
            System.out.println("Ugly number");
        else
            System.out.println("Not Ugly number");
    }
}
