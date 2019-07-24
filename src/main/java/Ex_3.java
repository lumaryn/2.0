import java.util.Scanner;

/**
 *created by aplana on 23.07
 *@author aplana
 */

public class Ex_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int z = 0;
        System.out.println("Ведите 1 если нужен калькулятор, или 2 если нужно найти самое длинное слово");

        while ((z != 1) & (z != 2)) {
            z = sc.nextInt();

            if((z != 1) & (z != 2)){
                System.out.println("Введите либо 1, либо 2");
            }
        }

        if (z == 1) {
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

        } else if (z == 2) {
            int g = 0;
            int n = 0;
            System.out.println("Укажите количество слов");
            int amount = sc.nextInt();
            String[] s = new String[amount + 1]; /**так и не понял, почему при заполнении строкового массива у меня всегда пропускается
             элемент с индексом 0. Поэтому добавил одно слово. Если массив int, тогда все нормально. */
            for (int y = 0; y < s.length; y++) {
                System.out.println("Введите слово");
                s[y] = sc.nextLine();
                int t = s[y].length();
                if (t >= g) {
                    g = t;
                    n = y;
                }
            }
            System.out.println("Самое длинное слово:  " + s[n]);
        }
    }
}