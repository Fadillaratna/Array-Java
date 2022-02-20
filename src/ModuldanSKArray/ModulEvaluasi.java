
package ModuldanSKArray;
import java.util.*;
public class ModulEvaluasi {

    public static void main(String[] args) {
       Scanner uI = new Scanner(System.in);
       String [] name = {"Arif", "Sindu", "Monica", "Wulan", "Sari"};
      
       System.out.print("Masukkan Nama Siswa: ");
       String search = uI.next();
       
      
        
         if(name[0].equals(search)){
           System.out.println(search + " hadir");
         }else if(name[1].equals(search)){
           System.out.println(search + " hadir"); 
         }else if(name[2].equals(search)){
           System.out.println(search + " hadir"); 
         }else if(name[3].equals(search)){
           System.out.println(search + " hadir"); 
         }else if(name[4].equals(search)){
           System.out.println(search + " hadir"); 
         }else{
           System.out.println(search + " tidak hadir"); 
         }
       
         
       


       
       
    }
    
}
