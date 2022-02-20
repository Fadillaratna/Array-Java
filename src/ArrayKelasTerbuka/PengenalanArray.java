
package ArrayKelasTerbuka;
import java.util.Arrays; // itu adalah library java khusus array untuk string
public class PengenalanArray {

    public static void main(String[] args) {
    // 1. Assignment   
    // tipedata [ ] nama = {komponen komponen}
    
    int [] arrayInteger = {1,2,3,4,5};    
        //System.out.println(arrayInteger);Jika itu diprint maka outputnya "[I@15db9742" yaitu address array itu
        //Index dimulai dari 0
        
        //Merubah nilai arrayInteger
    arrayInteger[3]= 25;
    System.out.println(" ==== Assignment Array ==== ");    
    System.out.println(arrayInteger[0]);
    System.out.println(arrayInteger[1]);
    System.out.println(arrayInteger[2]);
    System.out.println(arrayInteger[3]);
    System.out.println(arrayInteger[4]);
        
    // 2. Deklarasi
    // tipedata [] nama = new int[jumlahArray]
    System.out.println(" ==== Deklarasi Array ==== "); 
    
    float [] arrayFloat= new float[6];
    //Jika hanya seperti diatas tanpa mengganti nilai maka jika di sout akan keluar output o.
    
    //Mengubah nilai
    arrayFloat[2]=5;//Jika di sout maka output 5
    
    System.out.println(arrayFloat[0]);
    System.out.println(arrayFloat[1]);
    System.out.println(arrayFloat[2]);
    System.out.println(arrayFloat[3]);
    System.out.println(arrayFloat[4]);
    System.out.println(arrayFloat[5]);
    
    //Menampilkan array dengan Arrays
    System.out.println(Arrays.toString(arrayInteger));//jika di keluarkan maka outputnya akan mengeluarkan nilai yang ada pada arrayInteger
    System.out.println(Arrays.toString(arrayFloat));    
    }
    
}
