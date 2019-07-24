import java.util.Scanner;

/**
 *created by aplana on 23.07
 *@author aplana
 */

public class Ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ведите 1 если нужен калькулятор или 2 если нужно найти самое длинное слово");
        int z = sc.nextInt();
        if (z == 2) {
            System.out.println("Выберите операцию:  *  /  -  +");
            char x = sc.next().charAt(0);
            System.out.println("Введите 1 число");
            double a = sc.nextDouble();
            System.out.println("Введите 2 число");
            double b = sc.nextDouble();
            sc.close();
            if (x == '*') {
                System.out.printf("mult = %.4f", (a * b));
            }
            if (x == '/') {
                System.out.printf("division = %.4f", (a / b));
            }
            if (x == '+') {
                System.out.printf("add = %.4f", (a + b));
            }
            if (x == '-') {
                System.out.printf("subtr = %.4f", (a - b));
            }
        }
        if (z == 1)  {
            System.out.println("Укажите количество слов");
            int amount = sc.nextInt();
            String[] s = new String[amount];
            for (int y = 0; y < s.length; y++) {
                s[y] = sc.nextLine();
            }


        }
    }
}

