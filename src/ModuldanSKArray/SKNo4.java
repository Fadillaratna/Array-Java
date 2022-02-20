
package ModuldanSKArray;
import java.util.Arrays;

public class SKNo4 {

    public static void main(String[] args) {
              int matrix1 [] [] = {{11,12,13}, {14,15,16}, {17,18,19}};  //{{1,2,3}, {4,5,6}, {7,8,9}};
    printArray(matrix1);
        
    int matrix2 [] [] = {{1,2,3}, {4,5,6}, {7,8,9}};//{{11,12,13}, {14,15,16}, {17,18,19}};  
    printArray(matrix2);
    
     int [] [] hasilKurang = kurang(matrix1, matrix2);
    printArray(hasilKurang);
    
    
    }
    
    //Fungsi Tambah Array
      private static int [] [] kurang (int [] [] matrix1, int [] [] matrix2){
        
    int baris1 = matrix1.length;
    int kolom1 = matrix1.length;
    
    int baris2 = matrix2.length;
    int kolom2 = matrix2.length;
    
    int [] [] hasilKurang= new int [baris1][kolom1];
   
    if(baris1 == baris2 && kolom1 == kolom2){
      for(int i = 0; i < baris1; i++){
        for(int j = 0; j < kolom1; j++){
        hasilKurang[i][j] = matrix1[i][j] - matrix2[i][j];
        }
    }  
    }else{
        System.out.println("Jumlah baris dan kolom matrix tidak sama");
    }
    
    return hasilKurang;
    }
    
    //Fungsi Print Array
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
