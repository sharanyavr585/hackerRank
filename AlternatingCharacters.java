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
           String str=in.nextLine();
           
           int count=0;
           
           for(int i =0; i<str.length()-1;i++){
               if(str.charAt(i)=='A' && str.charAt(i+1)!='B'){
                   count=count+1;
               }
               else if(str.charAt(i)=='B' && str.charAt(i+1)!='A'){
                   count=count+1;
               }
           }
           System.out.println(count); 
       }
    }
}
