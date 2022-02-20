
package ModuldanSKArray;
import java.util.*;

public class SK2 {

    public static void main(String[] args) {
      Scanner a = new Scanner(System.in);
      
      int bilangan [];
      int kuadrat;
      
    System.out.print("Masukkan nilai awal: ");
    int nilaiAwal = a.nextInt();
    System.out.print("Masukkan nilai akhir: ");
    int nilaiAkhir = a.nextInt();
    
    bilangan = new int [nilaiAwal + nilaiAkhir + 1];
    
    for(int i = nilaiAwal; i <= nilaiAkhir; i++){
        bilangan[i] = i;
        
    }
     for(int i = nilaiAwal; i >= nilaiAkhir; i--){
        bilangan[i] = i;
    }
     
      if (nilaiAwal == nilaiAkhir && (nilaiAwal % 2 == 0 || nilaiAkhir % 2 == 0)) { //Jika nilaiAwal == nilaiAhir, dimana bukan ganjil
            System.out.println("Tidak ditemukan angka ganjil");
      }
      
      else if(nilaiAwal < nilaiAkhir){
          for (int i = 0; i < bilangan.length; i++) {//perulangan bilangan ganjil dengan nilaiAwal < nilaiAkhir
                kuadrat = bilangan[i] * bilangan[i];// operasi perkalian(kuadrat)
                if (bilangan[i] % 2 != 0) { //Jika bilangan itu ganjil
                    System.out.println(bilangan[i] + " kuadrat = " + kuadrat);
                }
           }
      }
      
      else{//Jika nilai awal > nilai akhir
          for (int i = bilangan.length - 1; i > 0; i--) {//perulangan bilangan ganjil dengan nilai awal > nilai akhir
          kuadrat = bilangan[i] * bilangan[i];
            if (bilangan[i] % 2 != 0) {//mendefinisikan ganjil
            System.out.println(bilangan[i] + " kuadrat = " + kuadrat);
            }
         }
      }
    }
}
   
    

