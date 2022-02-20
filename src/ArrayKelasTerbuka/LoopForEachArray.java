
package ArrayKelasTerbuka;
import java.util.Arrays;

public class LoopForEachArray {

    public static void main(String[] args) {
    int arrayAngka[]={11,12,13,14,15,16,17,18,19,20};
    System.out.println(Arrays.toString(arrayAngka));
    
    //Looping Standart
        System.out.println("\n ====== Looping Standart ====== \n");
    for(int i=0; i<10;i++){
        System.out.println("Indeks ke - " + i + " adalah = " + arrayAngka[i] );
    }
    
    //Looping dengan Properti Array
        System.out.println("Array "+arrayAngka.length);//arrayAngka.length merupakan jumlah index arrayAngka
        
        System.out.println("\n ====== Looping Dengan Property Array ====== \n");
    for(int i=0; i<arrayAngka.length; i++){
         System.out.println("Indeks ke - " + i + " adalah = " + arrayAngka[i] );
    }
    
    //Looping Khususon Untuk Collection ==> Array
        System.out.println("\n ====== Looping For Each ====== \n");
    for(int number : arrayAngka){
        System.out.println("Angka pada looping ini = " + number );
    }
    }
    
}
