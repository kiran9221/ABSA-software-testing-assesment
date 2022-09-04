import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	Arrays.sort(arr);
    	long min = 0, max = 0;
    	for(int i = 0, j = arr.length - 1; i < arr.length - 1; i++, j--)
    	{
    	    max = max + arr[j];
    	    min = min + arr[i];
    	  }
    	  System.out.println(min + " " + max);

    }
   

    //private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    	
    	int[] numarr = new int[5];
    	
    	for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(args[i]);
            numarr[i] = arrItem;
        }


        miniMaxSum(numarr);
  
    }
}