
package ModuldanSKArray;
import java.util.*;

public class StudiK4 {

    public static void main(String[] args) {  
        Scanner uI = new Scanner(System.in);
     int i, j, m, n;
    int matriks1[][] = new int[2][3];
    int matriks2[][] = new int[2][3];
    int hasil[][] = new int[2][3];
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan jumlah baris matriks: ");
    m = scan.nextInt();
    System.out.print("Masukkan jumlah kolom matriks: ");
    n = scan.nextInt();
    System.out.println("Masukkan elemen matriks pertama: ");
    
    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
        matriks1[i][j] = scan.nextInt();
      }
    }
   
    
    System.out.println("Masukkan elemen matriks kedua: ");
    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
        matriks2[i][j] = scan.nextInt(); 
      }
    }
    
    System.out.println("Hasil pengurangan matriks: ");
    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
        hasil[i][j] = matriks1[i][j] - matriks2[i][j];
        System.out.print(hasil[i][j] + "\t");// /t untuk memberi jarak
      }
      System.out.println();
    }
  }

        }
    
        

