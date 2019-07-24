import java.util.Scanner;

/**
 *created by aplana on 23.07
 *@author aplana
 */

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите операцию:  *  /  -  +");
        char x = sc.next().charAt(0);
        System.out.println("Введите 1 число");
        double a = sc.nextDouble();
        System.out.println("Введите 2 число");
        double b = sc.nextDouble();
        sc.close();
        if (x == '*'){
        System.out.printf("mult = %.4f",(a*b));}
        if (x == '/'){
            System.out.printf("division = %.4f",(a/b));}
        if (x == '+'){
            System.out.printf("add = %.4f",(a+b));}
        if (x == '-'){
            System.out.printf("subtr = %.4f",(a-b));}
    }
}
