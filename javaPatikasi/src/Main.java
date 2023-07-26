import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar, kdv;

        Scanner input = new Scanner(System.in);

        System.out.print("Fiyatı giriniz: ");
        tutar= input.nextDouble();

        kdv=(tutar<=1000 && tutar>=0)? tutar*0.18: tutar*0.08;

        tutar+=kdv;
        System.out.println("KDV'li Fiyat: " +tutar);
        System.out.println("KDV tutarı: "+ kdv);





        }
    }
