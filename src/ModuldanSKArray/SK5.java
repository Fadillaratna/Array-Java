
package ModuldanSKArray;
import java.util.*;
public class SK5 {

    public static void main(String[] args) {  
    Scanner uI = new Scanner(System.in);
    //Mengambil nilai input array dari user
    System.out.print("Masukkan Nilai : ");   
    int inputNilai = uI.nextInt();
    
    int baris = 5;
    int kolom = 5;
    
    //Del;arasi nilaiArray
    int nilai [] [] = new int [baris] [kolom];
    
    //Perulangan Membuat Nilai Array == User Input
    for(int a = 0; a<baris; a++){
        
       for(int b = 0; b<kolom; b++){
    
          nilai [a][b]= inputNilai++;
         
       }
       
    }
    
    //Perulangan menampilkan Array 5 x 5
     for(int a = 0; a < baris; a++){ 
        System.out.print("[");
         for(int b = 0; b < kolom; b++){
         System.out.print(nilai [a] [b]);
        if(b < kolom - 1){
        System.out.print(",");
        }else{
         System.out.print("]");   
        }
        
            }
        System.out.print("\n");
        }
        System.out.print("\n");

        }
    }
        
    



