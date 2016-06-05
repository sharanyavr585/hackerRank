import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        in.nextLine();
        for(int n=0; n<t; n++){
            String s = in.nextLine();
            String r = new StringBuffer(s).reverse().toString();

            boolean f = true;
            for(int i=1; i<s.length(); i++){
                if(Math.abs(s.charAt(i)-s.charAt(i-1))!=Math.abs(r.charAt(i)-r.charAt(i-1))){
                 f = false;
                 break;
                }
            }
            
            if(f)
                System.out.println("Funny");
            else
                System.out.println("Not Funny");
        }
    }
}
