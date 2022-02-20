
package ArrayKelasTerbuka;
import java.util.Arrays;

public class longestName {

   
    public static void main(String[] args) {
        String [] nama = {"Ani",  "Budi", "VIla", "Tiara"};
        int size = nama.length;
        String longestName = nama[0];
        namaTerpanjang(nama, size, longestName);
        
        String [] name = {"Fadilla", "Lila" , "Adi"};
        size = name.length;
        longestName = name [0];
        namaTerpanjang(nama, size, longestName);
       
        
    }
    private static void namaTerpanjang(String nama [] , int size, String longestName){
        
        for(int i = 1; i < size; i++){
           if(nama[i].length()> longestName.length()){
               longestName  = nama[i];               
           }
        }
        System.out.println("Nama terpanjang ===> " + longestName);
    }
}
