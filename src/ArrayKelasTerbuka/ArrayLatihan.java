
package ArrayKelasTerbuka;

import java.util.Arrays;


public class ArrayLatihan {

    
    public static void main(String[] args) {
       //int a [] = { 4,5,3,8,7,6,2,1 };
      //  printArray(a, " a ===> ");
    
    //Penjumlaha antara 2 buah array
    int a [] = { 4,5,3,8,7,6,2,1 };
    int b [] = { 0,8,7,3,6,5,1,0 };    
    int hasil [] = new int [7];
    
    for(int i = 0 ; i < a.length ; i++){
        hasil[i] = a[i] + b[i];
    }
        System.out.println("a"); 
    }
    //Fungsi Print Array
    private static void printArray(int dataArray [], String message){
        System.out.println("Array " +  message + Arrays.toString(dataArray));
    }
}
    
    

