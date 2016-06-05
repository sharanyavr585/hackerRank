import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
       
        
        long l=inputString.length();
        long letters[]=new long[26];
        for(int i=0;i<l;i++){
            letters[inputString.charAt(i)-'a']++;
        }
        if(l%2==0){
            boolean f = true;
            for(int j=0;j<letters.length;j++){
                if(letters[j]%2!=0){
                    System.out.println("NO");
                    f = false;
                    break;
                }
            }
            if(f)
                System.out.println("YES");
            
        }
        else{
            int evenCount=0;
            int oddCount=0;
            
            for(int k=0;k<letters.length;k++){
                if(letters[k]%2==0){
                  evenCount=evenCount+1;
                } 
                if(letters[k]%2!=0){
                    oddCount=oddCount+1;
                }
                
             }
            if(evenCount>=1 && oddCount<=1){
                 System.out.println("YES");
            }
            else if(oddCount>1 || evenCount<1){
                System.out.println("NO");
            }
            
        }
        
        myScan.close();
    }
}
