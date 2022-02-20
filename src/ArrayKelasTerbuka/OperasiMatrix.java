
package ArrayKelasTerbuka;
import java.util.Arrays;

public class OperasiMatrix {

   
    public static void main(String[] args) {
    System.out.println("\n ===== Operasi Matrix 2D ===== \n");
    int matrix1 [] [] = {{11,12,13}, {14,15,16}, {17,18,19}};  //{{1,2,3}, {4,5,6}, {7,8,9}};
    printArray(matrix1);
        
    int matrix2 [] [] = {{1,2,3}, {4,5,6}, {7,8,9}};//{{11,12,13}, {14,15,16}, {17,18,19}};  
    printArray(matrix2);
    
  
    
    //Pertambahan Matrix
       System.out.println("\n Hasil Tambah \n");
    int [] [] hasilTambah = tambah(matrix1, matrix2);
    printArray(hasilTambah);
    
    
    //Perkalian Matrix
    //Syarat perkalian matriks adalah jika jumlah baris matrix pertama sama dengan jumlah kolom matrix kedua
     int matrix3 [] [] = {{1,2}, {3,4}};   //{{1,2,3}, {4,5,6}, {7,8,9}}; {{1,2}, {3,4}}; 
    
        
    int matrix4 [] [] = {{11,12}, {13,14}};                  //{{11,12,13}, {14,15,16}, {17,18,19}};  
  
    int hasilKali [] [] = kali(matrix3,matrix4);
        printArray(hasilKali);
    
    
    }
    // Fungsi Kali Matrix
    private static int [] [] kali (int [][] matrixA, int [] [] matrixB){
    int baris3 = matrixA.length;
    int kolom3 = matrixA.length;
    
    int baris4 = matrixB.length;
    int kolom4 = matrixB.length;
    
    int hasilKali [] [] = new int [baris3][kolom4];
     // Jika a.b maka, jumlah baris akan mengikuti matrix a dan jumlah kolom akan mengikuti matrix b
    int buffer; 
    if(baris3 == kolom4 && kolom3 == baris4){
     for(int i = 0; i < baris3; i++){
        for(int j = 0; j < kolom3; j++){
        buffer = 0;   
        for(int k = 0; k < kolom3; k++){
          buffer += matrixA [i] [k] * matrixB [k] [j];    
           
        }
         hasilKali [i] [j] = buffer;
        }
    }   
    }else{
        System.out.println("Jumlah baris matrix pertama tidak sama dengan kolom matrix kedua");
    }
    
    return hasilKali;
    }
    
    
    
    //Fungsi Tambah Array
    private static int [] [] tambah (int [] [] matrix_a, int [] [] matrix_b){
        
    int baris1 = matrix_a.length;
    int kolom1 = matrix_a.length;
    
    int baris2 = matrix_b.length;
    int kolom2 = matrix_b.length;
    
    int [] [] hasilTambah = new int [baris1][kolom1];
   
    if(baris1 == baris2 && kolom1 == kolom2){
      for(int i = 0; i < baris1; i++){
        for(int j = 0; j < kolom1; j++){
        hasilTambah[i][j] = matrix_a[i][j] + matrix_b[i][j];
        }
    }  
    }else{
        System.out.println("Jumlah baris dan kolom matrix tidak sama");
    }
    
    return hasilTambah;
    }
    
    
    
      //Fungsi Print array
    private static void printArray(int [] [] dataArray){
        int baris = dataArray.length;//Mengambil Baris data array
        int kolom = dataArray[0].length;
        for(int i = 0; i < baris; i++){
        System.out.print("[");
         for(int j = 0; j < kolom; j++){
         System.out.print(dataArray [i] [j]);
        if(j < kolom - 1){
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
