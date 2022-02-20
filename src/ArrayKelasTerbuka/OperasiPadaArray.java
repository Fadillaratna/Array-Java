
package ArrayKelasTerbuka;
import java.util.Arrays;
public class OperasiPadaArray {

   
    public static void main(String[] args) {
    int angka1 [] = {1,2,3,4,5};
       
//Merubah Array Menjadi String
    System.out.println("\n ===== Merubah Array Menjadi String ===== \n");
    printArray(angka1);
    //System.out.println(Arrays.toString(angka1));
    
//Mengcopy Array 
    System.out.println("\n ===== Mengcopy Array  ===== \n");   
    int angka2 []= new int [5];
    printArray(angka1);
    printArray(angka2);
    
    
    System.out.println("\nMengcopy dengan loop\n");
    for(int i = 0; i < angka1.length; i++){
       angka2[i] = angka1[i];
    }
    printArray(angka1);
        System.out.println(angka1);
    printArray(angka2);
        System.out.println(angka2);
      
        
    System.out.println("\nMengcopy dengan copyOf\n");   
    int [] angka3 = Arrays.copyOf(angka1, 5);//5 jumlah indeks
    printArray(angka3);
    System.out.println(angka3);
    printArray(angka1);
    System.out.println(angka1);
    
    
    System.out.println("\nMengcopy dengan copyOfRange\n");
    int [] angka4 = Arrays.copyOfRange(angka1, 2, 3);
    printArray(angka4);
    printArray(angka1);
    
    
    //Fill Array
    System.out.println("\n ===== Fill Array  ===== \n");
    int angka5 []= new int [10];
    printArray(angka5);
    Arrays.fill(angka5, 2);
    printArray(angka5);
    
    
    //Komparasi Array
    System.out.println("\n ===== Komparasi Array  ===== \n");
    int angka6 [] = {1,2,3,4,5};
    int angka7 [] = {1,2,3,4,5};
    
    System.out.println("\nMemandingkan antara 2 Array\n");
        System.out.println(Arrays.equals(angka6, angka7));
    if(Arrays.equals(angka6, angka7)){
        System.out.println("Array ini sama");
    }else {
        System.out.println("Array ini beda");
    }
    
   //System.out.println("\nMengecek mana array yang lebih besar\n");
    //System.out.println(Arrays.co(angka6, angka7)); ====> Neatbens tidak mensuport
    
    
    //System.out.println("\nMengecek mana indeks yang berbeda\n");
    //System.out.println(Arrays.mismatch(angka6, angka7)); ====> Neatbens tidak mensuport
    
    //Sort Array
    System.out.println("\n ===== Sort Array  ===== \n");
     int [] angka8 = {6,5,4,3,2,1};
     printArray(angka8);
     Arrays.sort(angka8);
     printArray(angka8);
     
     //Search Array
     System.out.println("\n ===== Search Array  ===== \n");
     int a = 4;
     int posisi=Arrays.binarySearch(angka8, a);
        //System.out.println("angka " + a + " ada di posisi " +Arrays.binarySearch(angka8, a));// tidak perlu sort
        System.out.println("angka " + a + " ada di posisi " + posisi );
    }
    
    
    private static void printArray(int [] dataArray){
      System.out.println( "Array = " + Arrays.toString(dataArray));  
    }
}
