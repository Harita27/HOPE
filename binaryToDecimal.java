import java.util.*;
public class binaryToDecimal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int decimalValue = 0;
        int base = 1; 
        int lastDigit;
        while(n>0){
            lastDigit = n % 10; // Get the last digit
            n = n / 10; // Remove the last digit
            decimalValue += lastDigit * base; // Add to decimal value
            base = base * 2; // Increase the base (2^0, 2^1, 2^2, ...)
        }
        System.out.println("Decimal Value: " + decimalValue);
    }
}
