import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String abcedario = "abcdefghijklmnopqrstuvwxyz";
        int j=0;
        Boolean respuesta=false;
        
       for (int i=0; i<abcedario.length(); i++) {
            if(A.charAt(j) == B.charAt(j) && (A.length()<=j && B.length()<=j)){
                j++;
                respuesta = false;
            }
            if(abcedario.charAt(i) == A.charAt(j) && abcedario.charAt(i) != B.charAt(j)){
                respuesta =false ;
                break;
            }
            if(abcedario.charAt(i) != A.charAt(j) && abcedario.charAt(i) == B.charAt(j)){
                respuesta=true;
                break;
            }
        }
        
     
        
        
        System.out.println((A.length()+B.length())+"");
        if(respuesta){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        char cA=A.charAt(0);
        char cB=B.charAt(0);
        String sA=(cA+"").toUpperCase();
        String sB=(cB+"").toUpperCase();
        String newStringA = A.replace(A.charAt(0), sA.charAt(0));
        String newStringB = B.replace(B.charAt(0), sB.charAt(0));
        
        System.out.println(newStringA+" "+newStringB);
    }
}
