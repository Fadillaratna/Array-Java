
package ArrayKelasTerbuka;
import java.util.Arrays;

public class LatihanArray {

   public static void main(String[] args) {
    //int a [] = { 4,5,3,8,7,6,2,1 };
      //  printArray(a, " a ===> ");
   int a [] = {4,6,9,0,1,3,8,5,7,2};
   int b [] = {0,4,5,8,9,2,3,6,1,7};
   
    //Penjumlahan antara 2 buah array
   System.out.println("\n ===== Penjumlahan antara 2 buah array ===== \n");
   int hasilTambah[]= tambahArray(a, b);
   printArray(a," a ===> "); 
   printArray(b," b ===> ");
   printArray(hasilTambah," hasil tambah ===> ");   
   
   //Menggabungkan 2 buah array
   System.out.println("\n ===== Penggabungan antara 2 buah array ===== \n");   
   int [] hasilGabung = new int [a.length + b.length];
   for(int i = 0; i < a.length; i++){
       hasilGabung[i]= a[i];
   }
   for(int i = 0; i< b.length; i++){
       hasilGabung[i + a.length] = b[i];
   }
   
   printArray(a," a"); 
   printArray(b," b");
   printArray(hasilGabung," hasil gabung ===> ");  
   
    // Sorting Reverse / Mengurutkan Namun Terbalik
    System.out.println("\n ===== Sorting Reverse / Mengurutkan Namun Terbalik ===== \n");   
    //Mereverse dan Sort Array a
    printArray(a,"a Sorted ===> ");
    printArray(a, "a ===> ");
    reverse1(a);
    printArray(a, "a Reserved ===> ");
     
    //Mereverse  dan Sort Array b
    printArray( b,"b Sorted ===> ");
    reverse2(b);
    printArray(b, "b Reserved ===> ");
    
    
    
    }
    // Fungsi Reverse 2
   private static void reverse2(int [] dataArray){
       Arrays.sort(dataArray);
       int buffer;
       for(int i = 0; i < dataArray.length/2; i++){
           buffer = dataArray[i];
           dataArray[i]= dataArray[(dataArray.length - 1)- i];
           dataArray[(dataArray.length - 1)- i]= buffer;
       }
   }
   
    //Fungsi Reverse 1
   private static void reverse1(int [] dataArray){
        Arrays.sort(dataArray);
         int [] aBuffer = Arrays.copyOf(dataArray, dataArray.length);
    for(int i = 0; i < dataArray.length; i++){
        dataArray[i]= aBuffer[(dataArray.length - 1)- i];
   }
   }
  
    //Fungsi Tambah Array
    private static int[] tambahArray (int a [], int b []){
     int hasil[] = new int [a.length];
    for (int i = 0; i < a.length; i++){
       hasil[i]= a[i] + b[i];
    }
    return hasil;
    }
 
    //Fungsi Print Array
    private static void printArray(int dataArray [], String message){
        System.out.println("Array " +  message + Arrays.toString(dataArray));
    }
}
