import java.util.ArrayList;
import java.util.Arrays;
public class Basic13 {

    public void oneTo255() {
        int i = 1;
        while(i <= 255) {
            System.out.println(i);
            i++;
        }
    }

    public void oddNumbersOneTo255() {
        int i = 1;
        while(i <= 255) {
            if( i % 2 != 0 ) {
                System.out.println(i);
            }
            i++;
        }
    }

    public void printSum() {
        int sum = 0;
        int i = 0;
        while(i <= 255) {
            System.out.println("New number: " + i + " Sum: " + sum);
            sum += i;
            i++;
        }
    }

    public void iteretingThroughAnArray(int[] arr) {
        int stop = arr.length;
        int i = 0;
        while(i < stop) {
            System.out.println(arr[i]);
            i++;
        }
    }

    public int findMax(int[] thisArray) {
        // iterate through an array of integers and find the maximum value
        int max =  thisArray[0];
        int stop = thisArray.length;
        int i = 1;
        while(i < stop) {
            if(thisArray[i] > max) {
                max = thisArray[i];
            }
            i++;
        }
        return max;
    }

    public double findAverage(int[] thisArray) {
        double sum = 0;
        int i = 0;
        while(i < thisArray.length) {
            sum += thisArray[i];
            i++;
        }
        return sum/thisArray.length;
    }

    public ArrayList<Integer> oddNumbersArray() {
        ArrayList<Integer> allOdd = new ArrayList<Integer>();
        int i = 1;
        while(i <= 255) {
            if( i % 2 != 0 ) {
                allOdd.add(i);
            }
            i++;
        }
        return allOdd;
    }

    public void greaterThanY(int y, int[] arr) {
        int i = 0;
        int count = 0;
        while(i < arr.length) {
            if(y < arr[i]) {
                count++;
            }
            i++;
        }
        System.out.println(count);
    }

    public void squareTheValues(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            arr[i] = arr[i] * arr[i];
            System.out.println(arr[i]);
            i++;
        }
    }

    public void eliminateNegatives(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            if(arr[i]<0) {
                arr[i] = 0;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public int findMin(int[] thisArray) {
        int min =  thisArray[0];
        int stop = thisArray.length;
        int i = 1;
        while(i < stop) {
            if(thisArray[i] < min) {
                min = thisArray[i];
            }
            i++;
        }
        System.out.println(min);
        return min;
    }

    public double[] MMA(int[] arr) {
        double[] MMA = {0.00, 0.00, 0.00};
        MMA[0] = findMax(arr);
        MMA[1] = findMin(arr);
        MMA[2] = findAverage(arr);
        return MMA;
    }

    public int[] shifty(int[] arr) {
        for(int i = 0; i < arr.length-1;i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}