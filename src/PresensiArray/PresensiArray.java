
package PresensiArray;
import java.util.*;
public class PresensiArray {

  
    public static void main(String[] args) {
     String data [] = { " , ", "Pakai masker", "Cuci tangan", "Cek suhu tubuh", "Siap handsanitizer", "Jaga jarak", "Jaga imun"};
     
     System.out.println("\n ===== Protokoler Kesehatan Di Sekolah ===== \n");
     
     //Menampilkan Perulangan Data
        menampilkanPerulangan(data);
     
     //Memanggil fungsi input nama siswa
     namaSiswa();
        
     Scanner input = new Scanner(System.in);
        System.out.println("Apakah siswa memakai masker?");
        System.out.println("1. Ya ");
        System.out.println("2. Tidak");
        System.out.print("Memakai masker? : ");
        int pilihan = input.nextInt();
        cekMasker(pilihan);//memanggil fungsi cek masker
        
        System.out.println("Apakah siswa sudah mencuci tangan ?");
        System.out.println("1. Sudah ");
        System.out.println("2. Belum");
        System.out.print("Sudah Cuci Tangan? : ");
        int choose = input.nextInt();
        cuciTangan(choose);//memanggil fungsi cuciTangan
        
        System.out.print("Masukkan Suhu Tubuh Siswa : ");
        int suhu = input.nextInt();
        cekSuhu(suhu);//memanggil fungsi cekSuhu
        
        System.out.println("Apakah siswa sudah membawa handsanitizer?");
        System.out.println("1. Ya ");
        System.out.println("2. Tidak");
        System.out.print("Membawa handsanitizer? : ");
        int pilih = input.nextInt();
        cekHandsanitizer(pilih);//Memanggil fungsi
        
        System.out.println("===== Jangan lupa selalu jaga jarak dan jaga imun ya!!! ===== ");
    }
    private static void namaSiswa(){
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan nama: ");
    String nama = input.next();
    System.out.print("Masukkan kelas: ");
    String kelas = input.next();
    System.out.print("Masukkan nomor absen: ");
    int absen = input.nextInt();
   }
    
    
    private static void menampilkanPerulangan (String [] data){
        for(int i = 1; i < data.length; i++){
         System.out.println(i  + ". "+ data [i]);
     }
      
    }
    private static void cekMasker (int pilihan){
        if(pilihan == 1){
            System.out.println("Siswa menuju tempat cuci tangan");
        }else{
            System.out.println("Siswa tidak boleh memasuki sekolah jika tidak pakai masker");
        }
    }
    private static void cuciTangan (int choose){
        if (choose == 1){
            System.out.println("Siswa menuju pengencekan suhu tubuh");
        }else{
            System.out.println("Siswa harus cuci tangan terlebih dahulu");
        }
    }
    private static void cekSuhu (int suhu){
        if(suhu < 37){
            System.out.println("Siswa boleh masuk, Siswa sehat");
        }else{
            System.out.println("Siswa kurang sehat. Harus periksa ke dokter, Stay safe, dan Stay at home");
        }  
    }
    private static void cekHandsanitizer (int pilih){
        if(pilih == 1){
            System.out.println("Siswa boleh menuju kelas");
        }else{
            System.out.println("Silahkan mengambil handsanitizer yang tersedia");
        }
    }
    
    }
    

