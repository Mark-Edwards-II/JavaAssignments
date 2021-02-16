import java.util.ArrayList;
import java.util.Arrays;

public class JATest {
    public static void main(String[] args) {
        // Basic13
        // Print 1-255
        // int[] thisArray;
        // int[] thisArray = {-1,-2,-5}; //or this way
        // int[] otherArr = {1,2,5};
        // int y = 3;
        // int[] thisArray = {1,2,3,4,5,6}; 
        // int[] otherArr = {-1,2,-5};
        // Basic13 basics = new Basic13();
        // basics.oneTo255();
        // basics.oddNumbersOneTo255();
        // basics.printSum();
        // basics.iteretingThroughAnArray(thisArray);
        // System.out.println(basics.findMax(thisArray));
        // System.out.println(basics.findAverage(thisArray));
        // System.out.println(basics.oddNumbersArray());
        // basics.greaterThanY(y, otherArr);
        // basics.squareTheValues(otherArr);
        // basics.eliminateNegatives(otherArr);
        // basics.findMin(otherArr);
        // double[] MMA = basics.MMA(otherArr);
        // System.out.println(Arrays.toString(MMA));
        // basics.shifty(thisArray);
        // 
        // ============================================================
        // Puzzles
        // int[] arr1 = {3,5,1,2,7,9,8,13,25,32};
        ArrayList<String> arr2 = new ArrayList<String>();
        arr2.add("Nancy");
        arr2.add("Jinichi");
        arr2.add("Fujibayashi");
        arr2.add("Momochi");
        arr2.add("Ishikawa");
        Puzzling puzzles = new Puzzling();
        // puzzles.taskOne(arr1);
        puzzles.ShuffleArrReturn5(arr2);
    }
}