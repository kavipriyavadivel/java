import java.util.*;
public class integer_to_roman {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int i=0;i<values.length;i++){
            while(n>=values[i]){
                System.out.print(roman[i]);
                n=n-values[i];
            }
        }
    }
}
