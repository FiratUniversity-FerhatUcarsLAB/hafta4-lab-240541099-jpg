/*
 * Ad Soyad: Zübeyir Aslan
 * Ogrenci No: 240541099
 * Tarih: 5/11/2025
 * Aciklama: Gorev 3 - MaasHesap
 * 
 *  Kullanıcıdan alınan yarıçap ile bu yarıçapa sahip dairenin ve kürenin durumunu verir.
 *  
 *  
 */
 import java.util.Scanner;
public class MaasHesap {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        //AD VE SOYAD GİRDİSİ
        System.out.println("Adınızı giriniz: ");
        String ad = giris.nextLine();
        System.out.println("Soyadınızı giriniz: ");
        String soyad = giris.nextLine();

        //Mesajlar ve girişler(aylık maaş ve mesai saati ve haftalık normal çalışma saati)
        System.out.println("Aylık brüt maaşınızı giriniz: :");
        double brutMaas = giris.nextDouble();
        System.out.println("Haftalık çalışma saatinizi giriniz: ");
        int haftaSaat = giris.nextInt();

        System.out.println("Aylık mesai saatinizi giriniz: ");
        int mesaiSaat = giris.nextInt(); //normal çalışma saatine ne kadar eklediğini tanımlar.


        //Kullanıcı Bilgileri
        System.out.println("KULLANICI BİLGİLERİ");
        System.out.println(" ");

        System.out.println("Ad:"+ad);
        System.out.println("Soyad:"+soyad);
        System.out.println("Brut maas:"+brutMaas);
        System.out.println("Haftal maas:"+haftaSaat);
        System.out.println("Mesai saatinizi:"+mesaiSaat);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("________-----________");
        System.out.println("     MAAS   BORDROSU    ");
        System.out.println("______________________");





        // TOPLAM GELİR
        double mesaiUcret= brutMaas/160*mesaiSaat*1.5; // kullanıcını fazladan çalışıp kazandığı ücret
        double aylikMaas = brutMaas+mesaiUcret;
        System.out.println(ad);
        System.out.println(soyad);
        System.out.printf("Brut Maasiniz: %.2f",brutMaas);
        System.out.printf("Mesai ucretiniz: %.2f",mesaiUcret);

        System.out.printf("Aylık  maaşınız: %.3f",aylikMaas);
        System.out.println("Bu maaş bilgisi kesintiler dahil edilmemiştir!!");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");


        //Kesintiler
        System.out.println("!!!!!!KESİNTİLER!!!!!!");
        System.out.println(" ");
        System.out.printf("SGK Kesintisi: %.2f",aylikMaas*14/100);
        System.out.println(" ");
        System.out.printf("Gelir Kesintisi: %.2f",aylikMaas*15/100);
        System.out.println(" ");
        System.out.printf("Damga Vergisi: %.2f",aylikMaas*0.759/100);
        System.out.println(" ");
        double kesintilerToplami = aylikMaas*14/100 +aylikMaas*15/100+aylikMaas*0.759/100;
        System.out.println(" ");
        System.out.printf("Aylık toplam kesintiniz: %.2f",kesintilerToplami);
        System.out.println(" ");

        //Net maaş
        System.out.println("===NET MAAŞ===");
        System.out.println(" ");
        System.out.printf("Aylık net maaşınız: %.2f",aylikMaas-kesintilerToplami);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");


        //İSTATİSTİKLER
        System.out.println("İSTATİSTİKLER:");

        //Kesinti oranı
        double kesintiOrani = kesintilerToplami/aylikMaas;
        System.out.printf("Kesinti Orani: %.1f",kesintiOrani);
        System.out.println(" ");
        //Saatlik net kazanç
        double saatlikNetkazanc= aylikMaas-kesintilerToplami/160+mesaiSaat;
        System.out.printf("Saatlik Net Kazanc: %.2f",saatlikNetkazanc);
        System.out.println(" ");
        //Günlük net kazanç
        double gunlukNetkazanc= aylikMaas-kesintilerToplami/22;
        System.out.printf("Gunluk Net Kazanc: %.2f",gunlukNetkazanc);

        giris.close();















    }
}
