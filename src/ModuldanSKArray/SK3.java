
package ModuldanSKArray;


public class SK3 {

    
  
    public static void main(String[] args) {
      String [] laptop ={"Asus", "Acer", "Dell", "HP", "Lenovo", "MAC", "Toshiba" , "Samsung", "Xiaomi"};
      double [] harga = { 7000000, 6500000, 8500000, 9900000, 9500000, 9999999, 8300000, 5990000, 7400000};

        for( int i = 0; i < laptop.length; i++){
            System.out.println(laptop[i] + " ===> Rp " + harga[i] );
        }
        for(String i : laptop){
            System.out.println(i);
        }
    }

}
