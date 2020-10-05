package modul01cyclse;
import java.util.Scanner;

public class Cyclse5 {
    public static void main(String[] args) {

        int n =2;
        double An1 = 0;
        double An = 0;

        System.out.println("Введите число e");
        Scanner sc = new Scanner(System.in);
            int e = sc.nextInt();
            int a = 2;
            int b =3;
            An1 +=1/Math.pow(a,n)+1/Math.pow(b,n);

            do {
            An+=An1;
            a++;
            b++;

        }

        while ( Math.abs(An) <= e  );
        System.out.println(An);

    }
}
