import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Idman Programina hosgeldiniz");
        String idmanlar = "Gecerli hareketler: \n" + "burpee\n"+"pushup\n"+"situp\n"+"squat\n";
        System.out.println(idmanlar);
        System.out.println("bir idman olusturalim");
        System.out.println("burpee sayisi: ");
        int burpee = scanner.nextInt();
        System.out.println("pushup sayisi: ");
        int pushup = scanner.nextInt();
        System.out.println("situp sayisi: ");
        int situp = scanner.nextInt();
        System.out.println("squat sayisi: ");
        int squat = scanner.nextInt();
        scanner.nextLine();


        Idman idman = new Idman(burpee,pushup,situp,squat);

        System.out.println("Idmaniniz basliyor...");
        while(idman.idmanBittiMi()==false){
            System.out.println("hareket turu(burpee,pushup,situp,squat):");
            String tur=scanner.nextLine();
            System.out.println("Bu hareketten kac tane yapacaksiniz ? :");
            int sayi =scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(tur,sayi);
        }
    }
}