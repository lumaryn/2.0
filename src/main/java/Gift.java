import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Gift {
    public static void main(String[] args)  {
        gift();
    }

    public static void gift() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Нажмите соответствующую цифру, чтобы добавить сладость в подарок:");
        System.out.println("'1' - конфеты \"Красная шапочка\"");
        System.out.println("'2' - конфеты \"Ананас\"");
        System.out.println("'3' - леденец \"Чупа-чупс\"");
        System.out.println("'4' - закончить выбор");
    }
}
