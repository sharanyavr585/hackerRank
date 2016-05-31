import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        
        for(int n=0;n<t;n++){
            
           String s = in.nextLine();
           int l = s.length();
            
            int count=0;
            
            for(int i=0; i<l/2; i++){
                count= count + (int)Math.abs(s.charAt(i)-(s.charAt(l-(i+1))));
            }
            
            System.out.println(count);
        }
        
    }
}
