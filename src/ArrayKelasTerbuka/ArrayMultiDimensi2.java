
package ArrayKelasTerbuka;
import java.util.Arrays;

public class ArrayMultiDimensi2 {

    public static void main(String[] args) {
    int [][] a ={ {1,2,3} , {4,5,6} };
    System.out.println(a);
    System.out.println(Arrays.toString(a));
    System.out.println(a [0]);
    System.out.println(a [1]);
    
    System.out.println("\n");
    
    char char1 [] = {'a', 'b', 'c'};
    char char2 [] = {'d', 'e'};
    char [] [] char2D  = { char1, char2 };
    System.out.println(char2D);
    System.out.println(Integer.toHexString(System.identityHashCode(char1)));
    System.out.println(Integer.toHexString(System.identityHashCode(char2)));
    System.out.println(Arrays.toString(char2D));
        }
    
}
