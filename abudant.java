import java.util.*;
public class abudant {
    public static void main(String[] agrs){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0)
                sum+=i;
        }
        if(sum>n)
            System.out.println("Abudant number");
        else
            System.out.println("Not a Abudant number");
    }
}