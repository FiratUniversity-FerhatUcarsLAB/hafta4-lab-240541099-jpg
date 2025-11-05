/*
 * Ad Soyad: Zübeyir Aslan
 * Ogrenci No: 240541099
 * Tarih: 5/11/2025
 * Aciklama: Gorev 2 - Geometrik Hesap
 * 
 *  Kullanıcıdan alınan yarıçap ile bu yarıçapa sahip dairenin ve kürenin durumunu verir.
 *  
 *  
 */
  import java.util.Scanner;

class GeometrikHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);




        System.out.println("Dairenin yarıçapını giriniz: ");
        double yar =   input.nextDouble();
        //Sabit
        double pi = 3.14159;


        //Dairenin alanı
        System.out.printf("Dairenin alanı: %.2f\n",3.14159 *yar*yar );//ondalıklı sayıyı virgülden sonra 2 rakamla sınırlandırdı.
        //Dairenin çevresi
        System.out.printf("Dairenin çevresi: %.2f\n", 2*pi*yar);
        //Dairenin çapı
        System.out.printf("Dairenin çapı: %.2f \n",2*yar);
        //Bu özelliklere sahip olan kürenin hacmi
        System.out.printf("%.3f yarıçaplı kürenin hacmi: %.2f\n", yar,4/3*pi*yar*yar*yar);
        //Aynı kürenin yüzey alanı
        System.out.printf("%.3f yarıçaplı kürenin yüzey alanı: %.2f",yar,4*pi*yar*yar);
        input.close();

    }
}
