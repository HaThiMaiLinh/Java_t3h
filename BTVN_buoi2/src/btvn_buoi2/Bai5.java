package btvn_buoi2;
import java.util.Scanner;
public class Bai5 {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b ;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a,b;
        do{
            System.out.print("Nhap a = ");
            a =s.nextInt();
            System.out.print("Nhap b = ");
            b =s.nextInt();

            if(a<=0 || b<=0){
                System.out.println("a va b phai la so duong. Moi nhap lai!");
            }
        }while (a<=0 || b<=0);

       int ucln = gcd(a,b);
        System.out.println("UCLN cua " +a+ " va " +b+ " la " +ucln );
    }
}
