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
public class exp2 {
   


// Function to rotate array
static void Rotate(int arr[], int d, int n)
{
	
	int temp[] = new int[n];
	int k = 0;

	for (int i = d; i < n; i++) {
		temp[k] = arr[i];
		k++;
	}
	for (int i = 0; i < d; i++) {
		temp[k] = arr[i];
		k++;
	}
        System.out.println("The rotated array is: ");
	for (int i = 0; i < n; i++) {
		System.out.print(temp[i]+" ");
	}
}

	public static void main (String[] args) {
        Scanner myObj = new Scanner(System.in);  
        int n,d;
      
        System.out.println("Enter the size of your array");
        n = myObj.nextInt();
        int[] arr  = new int[n];
        System.out.println("Enter the elements of your array");
        for(int i=0;i<n;i++){
            arr[i] = myObj.nextInt();
        }
        System.out.println("Enter the amount of locations to be rotated");
		d = myObj.nextInt();

		// Function calling
		Rotate(arr, d,n);
		
	}
}


