import java.util.*;
public class harmonic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a=scan.nextFloat();
        float d=scan.nextFloat();
        float n=scan.nextFloat();
        float res=0;
        for(int i=1;i<=n;i++){
            res+=1/a;
            a+=d;
        }
        System.out.println(res);
    }
}
