import java.util.Arrays;
import java.util.Scanner;

public class lexicographical_order {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int[] freq = new int[52];
        Arrays.fill(freq,0);
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            } else if (ch >= 'A' && ch <= 'Z') {
                freq[ch - 'A' + 26]++; 
            }
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                char ch = (char) ('a' + i);
                System.out.println(ch + " : " + freq[i]);
            }
        }
        
        for (int i = 26; i < 52; i++) {
            if (freq[i] != 0) {
                char ch = (char) ('A' + (i - 26));
                System.out.println(ch + " : " + freq[i]);
            }
        }
    }
}
