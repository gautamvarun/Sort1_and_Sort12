import java.io.*;
import java.util.*;

public class Sort01 {

  public static void sort01(int[] arr)
  {
    //initially i and j are at 0th index
    //region1 unknown area i to end (while loop i<=arr.length) jab tak sare element array ke known nahi ho jate tab tak loop chalega
    //region2 arr[i]==0 (smaller area) 0 to j-1 (swap i and j ) i++ j++
    //region3  arr[i]==1 (greater area) j to i-1 ( i++ )
    int i=0;
    int j=0;
    while(i <= arr.length)
    {
     if(arr[i]==0)
     {
     swap(arr,i,j);
      i++;
      j++;
     }
      else
      {
      i++;
      }
    }
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping index " + i + " and index " + j);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    sort01(arr);
    print(arr);
  }

}
