import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in= new Scanner(System.in);
        String s1=in.nextLine();
        String s2=in.nextLine();
        
        int letters[]=new int[26];
     
        for(int i=0;i<s1.length();i++){
            letters[s1.charAt(i)-'a']++;
        }
        for(int j=0;j<s2.length();j++){
                letters[s2.charAt(j)-'a']--;
        }
        int sum=0;
        for(int k=0;k<letters.length;k++){
            sum=sum+Math.abs(letters[k]);
        }
        System.out.println(sum);
    }
}
