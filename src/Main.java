import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Main {
    public static void main(String[] args) {


        class Result {

            public  int findMissingInt(int[] arr) {
                // Complete the method as described.
                int Num1 = arr[0];

                for(int i = 0; i < arr.length; i++) {
                    if (arr[i] == Num1) {
                        Num1++;
                    }
                }
                return Num1;
            }
            public  int[] consecutiveInsert(int[] arr, int missingNum) {
                // Complete the method as described.
                //{0,0,0,0,0}
                //{1,2,4,5}
                int[] newArr = new int[arr.length + 1];

                int currentN = arr[0]; //1 => 2 => 3
                newArr[newArr.length - 1] = arr[arr.length -1];
                for(int i = 0; i < arr.length; i++){
                    if (arr[i] == currentN) {
                        currentN++;
                        newArr[i] = arr[i];
                    }else if (arr[i] != currentN){
                        newArr[i] = currentN;
                        currentN++;
                    }
                }
                return newArr;
            }
            // Checks whether the array is sorted in ascending or descending order.
            private  boolean isAscending(int[] arr) {
                return arr[0] < arr[1];
            }

        }


    }
}