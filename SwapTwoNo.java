import java.util.* ;
import java.io.*; 
import javafx.util.Pair;

public class SwapTwoNo {
    public static Pair < Integer, Integer > swap(Pair < Integer, Integer > swapValues) {
        // Write your code here.
        int x= swapValues.getKey();
        int y= swapValues.getValue();

        int temp=x;
        x=y;
        y=temp;

        Pair ans= new Pair(x,y);
        return ans;
    }
}