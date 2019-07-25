import java.util.Random;

public class Exfour {
    public static void main(String[] args) {

        Integer [] arr = new Integer[20];
        Random r = new Random();
        for (int i = 0; i<arr.length; i++) {
            arr[i] = r.nextInt(21) - 10;
        }


        int x= -10;
        int y = 0;
        int a = 10;
        int b = 0;

        for(int j=0; j<arr.length; j++) {
            System.out.print(arr[j]+", ");

            if (arr[j]>x & arr[j]<0){
                x=arr[j];
                y=j;
            }
            else if (arr[j] < a & arr[j]>0){
                a = arr[j];
                b=j;
            }
        }

        arr[y]=x;
        arr[y]=arr[b];
        arr[b]=x;
        System.out.println();

        for(int j=0; j<arr.length; j++) {
            System.out.print(arr[j]+", ");
        }
    }
}
