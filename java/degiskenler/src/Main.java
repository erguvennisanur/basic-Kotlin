import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println( "Bir sayi giriniz: ");

        /*break-continue 
          /*
            break anahtar kelimesi

            Döngü herhangi bir yerde ve herhangi bir zamanda break ifadesiyle karşılaştığı zaman çalışmasını durdurur.
            Böylelikle döngü hiçbir koşula bağlı kalmadan sonlanmış olur.

            break ifadesi sadece ve sadece içinde bulunduğu döngüyü sonlandırır. Eğer iç içe döngüler varsa
            ve içteki döngüde break kullanılmışsa sadece içteki döngü sona erer.

            continue anahtar kelimesi

            Döngü herhangi bir yerde ve herhangi bir zamanda continue ifadesiyle karşılaştığı zaman geri kalan
            işlemlerini yapmadan direk döngü bloğunun başına döner.



        */
        /*Scanner scanner = new Scanner(System.in);

        while(true) {

            int islem = scanner.nextInt();

            if (islem == -1){
                System.out.println("Döngüden çıkılıyor....");
                break;
            }
            System.out.println("İşlem :" + islem);

        }
        int i = 0;

        while (i < 10) {

            if (i == 3 || i == 5) {
                i++;
                continue;
            }
            System.out.println("i = " + i );
            i++;

        }
         */

        /* do-while dongu
        Scanner sc = new Scanner(System.in);
        System.out.println( "Bir sayi giriniz: ");
        int sayi = sc.nextInt();
        int toplam = 0;

        do{
            toplam += sayi %10 ;
            sayi /= 10;
            System.out.println("sayı: "+sayi);
        }while (sayi>0);

        System.out.println("rakamların toplamı: "+toplam);
        */

       /* while dongu
        Scanner sc = new Scanner(System.in);
        System.out.println( "Bir sayi giriniz: ");
        int sayi = sc.nextInt();
        int faktoriyel = 1;

        while(sayi>0){
            faktoriyel*=sayi;
            sayi--;

        }
        System.out.println("faktoriyel = "+faktoriyel);
*/

        /*for dongusu
        System.out.println( "Bir sayi giriniz: ");
        int faktoriyel = 1;
        int sayi = sc.nextInt();

        for(int i= 1; i<=sayi; i++){
            faktoriyel*=i;
            System.out.println( "faktoriyel = "+faktoriyel + " i ="+i);
        }
        System.out.println( "faktoriyel = "+faktoriyel);
         */

        /* Hesap makinesi
        System.out.println("birinci sayiyi giriniz");
        int a = sc.nextInt();
        System.out.println("ikinci sayiyi giriniz");
        int b = sc.nextInt();

        System.out.println("****İSLEMİNİZİ SEÇİNİZ***");
        System.out.println("1. TOPLAMA");
        System.out.println("2. ÇIKARMA");
        System.out.println("3. ÇARPMA");
        System.out.println("4. BÖLME");

        System.out.println("Seciminizi giriniz: ");
        int islem =  sc.nextInt();

        if(islem == 1 ){
            System.out.println("İslem sonucu= "+(a+b) );
        }
        else if(islem == 2 ){
            System.out.println("İslem sonucu= "+(a-b) );
        }
        else if(islem == 3 ){
            System.out.println("İslem sonucu= "+(a*b) );
        }
        else if(islem == 4 ){
            System.out.println("İslem sonucu= "+(float)(a/b) );
        }
        else{
            System.out.println("Yanlıs islem sectiniz.");
        }

         */


        /*
        System.out.println("birinci sayiyi giriniz");
        int a = sc.nextInt();
        System.out.println("ikinci sayiyi giriniz");
        int b = sc.nextInt();
        System.out.println("ucuncu sayiyi giriniz");
        int c = sc.nextInt();

        int maks = -1;

        if(a>=b && a>=c){
            maks=a;
        }
        if(b>=a && b>=c){
            maks=b;
        }
        else{
            maks=c;
        }
        System.out.println("maksimum sayi: "+maks);
        */


       /* int islem = sc.nextInt();

        switch(islem){
            case 1:
                System.out.println("1. islem");
                break;
            case 2:
                System.out.println("2.islem");
                break;
            case 3:
                System.out.println("3.islem");
                break;

            default:
                System.out.println("geçersiz işlem... ");
                break;

        }

        */
       // Scanner scanner = new Scanner(System.in);
        // System.out.println("lutfen yasinizi girin: ");
        // int yas = scanner.nextInt();
        // double sayi = scanner.nextDouble();
        // System.out.println("yasiniz: "+sayi);

        /*
        if (scanner.hasNextInt()) {
            int sayi = scanner.nextInt();
            System.out.println("sayi:" + sayi);
        } else {
            System.out.println("lutfen sayi giriniz!");
        }
       */


        /* Scanner scanner = new Scanner(System.in);

        int yas1 = scanner.nextInt();
        int yas2 = scanner.nextInt();
        int yas3 = scanner.nextInt();

        System.out.println("yas1 : " + yas1 + " yas2: " + yas2 + " yas3: " + yas3 );

        /*int yas = scanner.nextInt();
        scanner.nextLine(); // Dummy

        String isim = scanner.nextLine();

        System.out.println("Yaş: " + yas);
        System.out.println("İsim: " + isim);*/



    }


}