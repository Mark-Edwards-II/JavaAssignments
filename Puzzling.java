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
    public ArrayList<String> ShuffleArrReturn5(ArrayList<String> arr) {
        ArrayList<String> arr2 = new ArrayList<String>();
        Collections.shuffle(arr);
        for(int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
            if(arr.get(i).length() > 5) arr2.add(arr.get(i));
        }
        return arr2;
    }
}