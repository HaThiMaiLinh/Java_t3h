package btvn_buoi2;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap canh a = ");
        float a =s.nextFloat();
        System.out.print("Nhap canh b = ");
        float b =s.nextFloat();
        System.out.print("Nhap canh c = ");
        float c =s.nextFloat();

        if(a+b>c && a+c>b && b+c>a){
            System.out.println("a b c la 3 canh cua tam giac");
        }else{
            System.out.println("a b c khong phai la 3 canh cua tam giac");
        }

    }
}
