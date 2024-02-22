/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAA;
import java.util.*;
/**
 *
 * @author Kashish
 */
public class exp1 {
     static void reverse(int a[], int n){
        int[] b = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
    }
    System.out.println("The reversed array is: ");
    for(int i=0;i<n;i++){
        System.out.print(b[i]+" ");
    }
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  
        int n;
      
        System.out.println("Enter the size of your array");
        n = myObj.nextInt();
        int[] arr  = new int[n];
        System.out.println("Enter the elements of your array");
        for(int i=0;i<n;i++){
            arr[i] = myObj.nextInt();
        }
        reverse(arr,n);

    }
}
