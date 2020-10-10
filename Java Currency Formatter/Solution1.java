import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.text.NumberFormat;
public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();//value
        scanner.close();
        /*
        create custom locale for india
        */
        Locale indiaLocale=new Locale("en","IN");
        //create number formats using locale
        NumberFormat f1=NumberFormat.getCurrencyInstance(Locale.US);
        String us=f1.format(payment);
        NumberFormat f2=NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china=f2.format(payment);
        NumberFormat f3=NumberFormat.getCurrencyInstance(indiaLocale);
        String india=f3.format(payment);
        NumberFormat f4=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france=f4.format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

