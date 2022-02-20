
package ArrayKelasTerbuka;
import java.util.Arrays;
public class MengenalArrayLebihDalam {

    public static void main(String[] args) {
    int angka1 []= {1,2,3,4,5};
    int angka2 []= new int[5];
    
        System.out.println(angka1);
        System.out.println(angka2);
        //Addres Memori berbeda karena memori heap
    
    angka2 = angka1;//Mengisi nilai array angka2 yang kosong dengan array angka1
    
        System.out.println(angka1);
        System.out.println(angka2);//print memori
        //Memori sama karena memori heap
        
        System.out.println("Ini adalah array angka1 " + Arrays.toString(angka1));
        System.out.println("Ini adalah array angka2 " + Arrays.toString(angka2));//hasilnya nanti akan sama dengan angka1
     
    angka1 [0] = 150;//Mengganti array angka1 index ke 0 menjadi 150
    angka2 [3] = 98; //Mengganti array angka2 index 3 menjadi 98, maka output angka1 akan berubah juga
        System.out.println("Ini adalah array angka1 " + Arrays.toString(angka1));
        System.out.println("Ini adalah array angka2 " + Arrays.toString(angka2));//hasilnya nanti array angka1 dan angka2 indeks ke 0 akan berubah menjadi 150
    
    ubahArray(angka1);
        System.out.println("Ini adalah array angka1 " + Arrays.toString(angka1));
        System.out.println("Ini adalah array angka2 " + Arrays.toString(angka2));
        
     //Menjumlahkan array  
        int total = 0;
        for(int i = 0 ; i < angka1.length; i++){
          total += angka1[i];
        }
        System.out.println("Jumlah total adalah "+ total);
    }
    //Methode yang argumennya adalah reference, pass by reference bukan by value
    private static void ubahArray(int [] dataArray){
        dataArray[0]=125;
      // for(int data : dataArray){
            //System.out.println(data);//output tetap nilai data tidak 125
        }
        
         //for(int data : dataArray){
            //System.out.println(data);//berubah
         //}
    }

