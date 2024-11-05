
import java.util.Scanner;
public class only_digits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num = scan.next();
        int flag=1;
        for(int i=0;i<num.length();i++){
            if(!Character.isDigit(num.charAt(i))){
                flag=0;
                System.out.println("Contains other than digits");
                break;
            }
        }
        if(flag==1)
            System.out.println("Contains only digits");
    }
}
