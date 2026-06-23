import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Rushi ka Calculator ===");
        System.out.print("Pehla number daal: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Dusra number daal: ");
        double num2 = sc.nextDouble();
        
        System.out.println("Jod: " + (num1 + num2));
        // Ghatav - Day 3
double minus = num1 - num2;
System.out.println("Ghatav: " + minus);
 double multiply = num1 * num2;
System.out.println("Guna: " + multiply);
      double divide = num1 / num2;
System.out.println("Bhag: " + divide); 
        sc.close();
    }
}
