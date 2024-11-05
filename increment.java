import java.util.*;
public class increment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int place=1,rem=0,rev=0;
        while(n!=0){
            rem=n%10+1;
            rev+=(rem*place);
            place*=10;
            n/=10;
        }
        System.out.println(rev);
    }
}
