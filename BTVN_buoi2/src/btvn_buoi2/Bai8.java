package btvn_buoi2;
import java.util.Scanner;
public class Bai8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n;
        do{
            System.out.print("Nhap n = ");
            n =s.nextInt();
            if(n<=0){
                System.out.println("n phai la so duong. Moi nhap lai!");
            }
        }while (n<=0);

        int gt=1;
        for (int i = 1; i <= n ; i++) {
            gt=gt*i;
        }

        System.out.println("Giai thua " +n+ " la " +gt);
    }
}
