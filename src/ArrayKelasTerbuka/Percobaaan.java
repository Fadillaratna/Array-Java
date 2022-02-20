
package ArrayKelasTerbuka;
import java.util.Arrays;

public class Percobaaan {

    
    public static void main(String[] args) {
        int nilai [] = { 75,73,72,80};
        System.out.println("Nilai = " + Arrays.toString(nilai));
        
        int size =  nilai.length;
        int nilaiTotal = 0;
        for(int i = 0 ; i < nilai.length; i++){
            System.out.println(nilaiTotal + nilai[i] );
            
        int rataRata = nilaiTotal / nilai.length;
            System.out.println("Nilai Rata - Rata = " + rataRata);
        }
    }
    
}
