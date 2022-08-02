import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void islemleri_bastır(){
        System.out.println("0-İslemleri goruntule..");
        System.out.println("1-Bir sonraki sehire git ..");
        System.out.println("2-Bir onceki sehire git..");
        System.out.println("3-Uygulamadan cık ..");
    }
    public static void sehirleri_turla(LinkedList<String>sehirler){

        ListIterator<String> iterator= sehirler.listIterator();
        int islem;
        islemleri_bastır();

        Scanner scanner=new Scanner(System.in);

        if(!iterator.hasNext()){
            System.out.println("herhangi bir sehir bulunmuyor");
        }
        boolean cikis = false;
        boolean ileri=true;

        while(!cikis){
            System.out.println("bir islem seciniz");
            islem = scanner.nextInt();

            switch (islem){
                case 0:
                    islemleri_bastır();
                    break;
                case 1:
                    if(!ileri){
                        if (iterator.hasNext()){
                            iterator.next();
                        }
                        ileri=true;
                    }
                    if (iterator.hasNext()) {
                        System.out.println( "sehre gidiliyor: "+ iterator.next());

                    }else{
                        System.out.println("gidilecek yer kalmadi");
                        ileri=true;
                    }
                    break;

                case 2:
                    if (ileri){
                        if (iterator.hasPrevious()){
                            iterator.previous();
                        }
                        ileri=false;
                    }
                     if(iterator.hasPrevious()){
                         System.out.println("sehre gidiliyor:"+ iterator.previous());
                     }else{
                         System.out.println("sehir turu basladi");
                     }
                     break;
                case 3:
                    cikis = true;
                    System.out.println("uygulamadan cikiliyor");
                    break;
            }
        }
    }
    public static void main(String[] args) {


        LinkedList<String> sehirler = new LinkedList<>();
        sehirler.add("ankara");
        sehirler.add("eskisehir");
        sehirler.add("afyon");

        sehirleri_turla(sehirler);
    }
}