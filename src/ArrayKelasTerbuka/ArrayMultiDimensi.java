
package ArrayKelasTerbuka;

import java.util.Arrays;


public class ArrayMultiDimensi {

   
    public static void main(String[] args) {
    System.out.println("\n ===== Array Multi Dimensi ===== \n ---------------------------------\n");
    
    //Cara membuat array 2 dimensi dengan assignment
    int [][] a = {{1,2,3,4,5,6} , {0,9,7,5,3,2}}; 
    printArray2D(a);
    
    //Cara membuat array 2 dimensi dengan deklarasi
    // int [baris] [kolom]
    int [][] b = new int [4] [5];
    printArray2D(b);
    
    //Looping Manual
    for(int i = 0; i < b.length; i++ ){
        System.out.print("[");
     for(int j = 0; j < b[i].length; j++){
         System.out.print(b[i][j] + "," );     
     }
        System.out.println("]\n");
    }
    
    
    //Array Secara Manual Untuk Pembuktian
    int [] [] c = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};
        printArray2D(c);
        
    int [] [] d = { {1,2,3}, {4,5}, {6} };
        printArray2D(d);//Dalam java itu jika jumlah kolomnya beda tetap bisa dijalankan ===> class selanjutnya
     
    //Looping For Each
//    for(int [] baris: b){
//      System.out.print("[");
//      for(int angka: baris){
//      System.out.print(angka + "," );          
//     }
//      System.out.println("]\n");
//    }
   
    }
    private static void printArray2D(int [][] dataArray){
        //Looping For Each
    for(int [] baris: dataArray){
      System.out.print("[");
      for(int angka: baris){
      System.out.print(angka + "," );          
     }
      System.out.println("]\n");
    }
//     for(int i = 0; i < dataArray.length; i++ ){
//        System.out.println( message  + Arrays.toString(dataArray[i]));
    } 
    }

