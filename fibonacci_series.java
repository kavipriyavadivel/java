import java.util.*;
public class fibonacci_series{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int a=0,b=1,next=a+b;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=2;i<n;i++){
            next=a+b;
            System.out.print(next+" ");
            a=b;
            b=next;
        }
    }
}
