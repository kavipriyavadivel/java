import java.util.*;
public class Amstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int temp=n,sum=0,digit=(int)Math.log10(n)+1;
        while(n!=0){
            sum+=(int)Math.pow(n%10,digit);
            n=n/10;
        }
        if(sum==temp)
            System.out.println("Amstrong number");
        else
            System.out.println("Not a Amstrong number");
    }
}
