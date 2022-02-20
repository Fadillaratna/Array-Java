
package LatihanUlangan;
import java.util.*;//Scanner
public class LatihanUlangan2 {
    
    public static void main(String[] args) {
     Scanner userInput = new Scanner(System.in);//Deklarasi scanner
     String siswa []= {"Fadilla", "Intan", "Ana", "Dwi", "Diva", "Lina", "Tania", "Pandu", "Lana", "Linda"};//input data array nama
     
     System.out.print("Masukkan nama siswa: " );//Mengambil input user
     String cariSiswa = userInput.next ();
     
     for (int i = 0; i < siswa.length; i++){//Perulangan data array
       if(siswa[i].equalsIgnoreCase(cariSiswa)){//Untuk membandingkan jika data yang dicari == siswa
           System.out.println("Data siswa ditemukan" );//Output data ditemukan
           System.out.println("Siswa ada di indeks ke " + i);//Output sesuai dengan data itu ada di indeks ke berapa  
           break;
       }else{//Jika data yang diinputkan tidak sesuai
           System.out.println("Data tidak ditemukan");//Output data tidak ditemukan
     }
    }
}
}

    
    

