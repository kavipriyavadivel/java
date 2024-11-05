import java.util.*;
public class fibo_even {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int a=0,b=1,next=a+b;
        System.out.print(a+" ");
        for(int i=2;i<n;i++){
            next=a+b;
            if(next%2==0)
                System.out.print(next+" ");
            a=b;
            b=next;
        }
    }
}
