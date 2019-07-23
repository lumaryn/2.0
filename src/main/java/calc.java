import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите операцию:  *  /  -  +");
        char x = sc.next().charAt(0);
        System.out.println("Введите 1 число");
        double a = sc.nextDouble();
        System.out.println("Введите 2 число");
        double b = sc.nextDouble();
        if (x == '*'){
        System.out.printf("mult= "+(a*b));}
        if (x == '/'){
            System.out.printf("division= "+(a/b));}
        if (x == '+'){
            System.out.printf("add= "+ (a+b));}
        if (x == '-'){
            System.out.printf("subtr= "+ (a-b));}
    }
}
