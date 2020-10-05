package modul01cyclse;
import java.util.Scanner;

public class Cycles8 {
    public static void main(String[] args) {

        int a = 0;
        int b = 10000000;

        System.out.println("Введите число x ");
        Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
        System.out.println("Введите число y ");
            int y = sc.nextInt();

        int randomNumber1 = a + (int) (Math.random()*b) ;
        int randomNumber2 = a + (int) (Math.random()*b) ;

        while (x != randomNumber1 ) {
            randomNumber1 = a + (int) (Math.random()*b) ;
        }
        System.out.println(randomNumber1);

        while (y != randomNumber2 ) {
            randomNumber2 = a + (int) (Math.random()*b) ;
        }
        System.out.println(randomNumber2);
    }
}
