import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri oluştur
        int mat,fizik,kimya,turkce,tarih,muzik;

        //Scanner Sınıfını tanımla
        Scanner inp=new Scanner(System.in);

        System.out.print("Matematik Notunuz:");
        mat=inp.nextInt();

        System.out.print("Fizik Notunuz:");
        fizik=inp.nextInt();

        System.out.print("Kimya Notunuz:");
        kimya=inp.nextInt();

        System.out.print("Türkçe Notunuz:");
        turkce= inp.nextInt();

        System.out.print("Tarih Notunuz:");
        tarih= inp.nextInt();

        System.out.print("Müzik Notunuz:");
        muzik=inp.nextInt();
        int toplam=(mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc=toplam/6;

        System.out.println("Not ortalamanız:"+sonuc);
        String sonuc2=(sonuc > 60)? "gecti" :"kaldı";
        System.out.println(sonuc2);









    }
}
