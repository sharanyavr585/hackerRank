# Anagram Solution
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int t =0;
        while(t<T){
            String s=in.next();
            int l = s.length();
            if(l%2==0){
             Map<Character,Integer> map1 =new HashMap<Character,Integer>();
             Map<Character,Integer> map2 =new HashMap<Character,Integer>();
            for(int i=0; i<l;i++){
                if(i<l/2){
                
                     if(!map1.containsKey(s.charAt(i))){
                         map1.put(s.charAt(i),1);
                     }
                    else{
                        map1.put(s.charAt(i),map1.get(s.charAt(i))+1);
                    }
                }
                else{
                     if(!map2.containsKey(s.charAt(i))){
                         map2.put(s.charAt(i),1);
                     }
                    else{
                        map2.put(s.charAt(i),map2.get(s.charAt(i))+1);
                    }
                }
                
            }
                int count=0;
                for(char key : map2.keySet()){
                   if(map1.containsKey(key)){
                       if(map2.get(key)!=map1.get(key)){
                           int diff = map2.get(key)-map1.get(key);
                           if (diff > 0)
                               count=count+ diff;
                       }
                   } 
                    else
                        count=count+map2.get(key);
                }
                System.out.println(count);
        }
            else
                 System.out.println(-1);
            
            t++;
               
    }
}
}
