import java.util.ArrayList;
import java.util.Scanner;

public class Gift {

        public static void main(String[] args) {

            Sweet candy = new Sweet("Конфеты", 2, 300, "шоколадные");

            String nameCandy = candy.getName();
            int weightCandy = candy.getWeight();
            int priceCandy = candy.getPrice();
            String optionCandy = candy.getOption();

            Sweet lollipop = new Sweet("Леденцы", 1, 500, "лимонные");
            String nameLol = lollipop.getName();
            int weightLol = lollipop.getWeight();
            int priceLol = lollipop.getPrice();
            String optionLol = lollipop.getOption();

            Sweet gum = new Sweet("Жевательная резинка", 1, 150, "мятная");
            String nameGum = gum.getName();
            int weightGum = gum.getWeight();
            int priceGum = gum.getPrice();
            String optionGum = gum.getOption();

            Scanner sc = new Scanner(System.in);
            System.out.println("Добавьте сладости в подаркок: 1 - конфеты; 2 - леденцы; 3 - жевательная резинка; 4 - достаточно");

            int tprice = 0;
            int tweight = 0;
            int choice = 0;
            String kg = "кг";
            String rub = "руб";

            ArrayList sweets = new ArrayList();

            while (choice != 4) {

                choice = sc.nextInt();

                switch (choice) {
                    case 1:

                        sweets.add(candy.getName()+" "+candy.getWeight()+kg+" "+candy.getPrice()+rub+" "+candy.getOption());
                        tprice += priceCandy;
                        tweight += weightCandy;
                        System.out.println("Конфеты добавлены в подарок");
                        break;
                    case 2:

                        sweets.add(lollipop.getName()+" "+lollipop.getWeight()+kg+" "+lollipop.getPrice()+rub+" "+lollipop.getOption());
                        tprice += priceLol;
                        tweight += weightLol;
                        System.out.println("Леденцы добавлены в подарок");
                        break;
                    case 3:

                        sweets.add(gum.getName()+" "+gum.getWeight()+kg+" "+gum.getPrice()+rub+" "+gum.getOption());
                        tprice += priceGum;
                        tweight += weightGum;
                        System.out.println("Жевательная резинка добавлена в подарок");
                        break;

                    case 4:
                        break;
                }

            }
            System.out.println("В вашем подарке: ");
            int i = 0;
            while(i < sweets.size()){
                System.out.println(sweets.get(i));
                i++;
            }
            System.out.println("Общий вес: "+tweight+kg);
            System.out.println("Общая цена: "+tprice+rub);

        }
    }









