import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String dosyaAdi = "C:\\Development\\KelimeSayaci\\text.txt";

        // Dosyayı açın ve okuyucuyu oluşturun
        File dosya = new File(dosyaAdi);
        Scanner okuyucu;
        try {
            okuyucu = new Scanner(dosya);
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı: " + dosyaAdi);
            return;
        }

        // Kelime sayacını başlatın
        int kelimeSayisi = 0;

        // Dosyanın sonuna kadar okuyun
        while (okuyucu.hasNext()) {
            // Bir sonraki kelimeyi okuyun ve sayacı artırın
            okuyucu.next();
            kelimeSayisi++;
        }

        // Okuyucuyu kapatın
        okuyucu.close();

        // Sonucu yazdırın
        System.out.println("Dosyadaki kelime sayısı: " + kelimeSayisi);

    }
}