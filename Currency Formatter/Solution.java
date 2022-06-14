import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
       Locale localeIndiana = new Locale("en", "IN");
        if(payment>= 0 && payment<= Math.pow(10,9)){
            NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
            NumberFormat india = NumberFormat.getCurrencyInstance(localeIndiana);
            NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
            NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            
            System.out.println("US: " + us.format(payment));
            System.out.println("India: " +india.format(payment));
            System.out.println("China: " + china.format(payment));
            System.out.println("France: " + france.format(payment));
        }
    }
}
