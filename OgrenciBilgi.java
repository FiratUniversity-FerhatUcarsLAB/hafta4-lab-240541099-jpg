/*
 * Ad Soyad: [ADINIZI BURAYA YAZIN]
 * Ogrenci No: [OGRENCI NUMARANIZI BURAYA YAZIN]
 * Tarih: [TARIHI BURAYA YAZIN]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("===OGRENCI BIlGI SISTEMI===");


        //Her bilgi için önce kullanıcıya ne girmesi gerektiğini söyleyen bir System.out.print(...) komutu yazın.
        //
        //Ardından input nesnesini kullanarak (örneğin input.next(), input.nextInt()) veriyi okuyun ve bir değişkene atayın.

        //Öğrenci adının tanımlanıp atanması
        System.out.println("Adinizi girin: ");
        String ad = input.nextLine();


        //Öğrenci soyadının tanımlanıp atanması
        System.out.println("Soyadinizi girin: ");
        String soyad = input.nextLine();


        //Öğrenci numarası
        System.out.println("Ogrenci numaraniz: ");
        int ogrenciNo = input.nextInt();

        //Öğrenci yaşı
        System.out.println("Yasiniz: ");
        int yas = input.nextInt();

        //Öğrencinin not ortalaması
        System.out.println("GPA (0.00-4.00): ");
        double gpa= input.nextDouble();

        //Öğrencinin durumu
        String durum = "Geçersiz GPA";


            if (gpa >= 2.00 && gpa <= 4.00) {
                durum = "Başarili Ogrenci";
            } else if (gpa < 2.00 && gpa >= 0.00) {
                durum = "Başarisiz Ogrenci";
            }

        
        
       System.out.println("=== OGRENCI BILGI SISTEMI ===");

        System.out.println("Ad Soyad: " + ad + " " + soyad);
        System.out.println("Ogrenci No: " + ogrenciNo);
        System.out.println("Yas: " + yas);

// GPA'yı %.2f formatıyla 2 ondalık basamaklı yazdır

        System.out.printf("GPA: %.2f\n", gpa);

        System.out.println("Durum: " + durum);




        input.close();

        
    }
}
