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
        sc.close();
    }
}
