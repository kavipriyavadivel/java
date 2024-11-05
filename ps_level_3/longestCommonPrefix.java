import java.util.Scanner;

public class longestCommonPrefix{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.next();
        }
        String s=arr[0];
        int j=0,min_end=s.length();
        for(int i=1;i<n;i++){
            j=0;
            String s1=arr[i];
            while(j<s.length() && j<s1.length() && s.charAt(j) == s1.charAt(j)){
                j++;
            }
            min_end=Math.min(min_end,j);
        }
        System.out.println(s.substring(0,min_end));
    }
}