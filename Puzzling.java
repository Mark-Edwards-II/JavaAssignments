import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Puzzling {

    public ArrayList<Integer> taskOne(int[] arr) {
        int i = 0;
        int sum = 0;
        ArrayList<Integer> greaterThan10 = new ArrayList<Integer>();
        while(i < arr.length) {
            if(arr[i] > 10) {
                sum += arr[i];
                greaterThan10.add(arr[i]);
            }
            i++;
        }
        System.out.println(sum);
        System.out.println(greaterThan10);
        return greaterThan10;
    }
    
}