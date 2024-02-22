/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAA;

/**
 *
 * @author Kashish
 */

import java.util.Scanner;

// JAVA Code for Find maximum sum possible 
// equal sum of three stacks
public class exp3{
	
	// Returns maximum possible equal sum of three 
	// stacks with removal of top elements allowed
	public static int maxSum(int stack1[], int stack2[], int stack3[], int n1, int n2, int n3)
	{
	int sum1 = 0, sum2 = 0, sum3 = 0;
	
	// Finding the initial sum of stack1.
	for (int i=0; i < n1; i++)
		sum1 += stack1[i];
	
	// Finding the initial sum of stack2.
	for (int i=0; i < n2; i++)
		sum2 += stack2[i];
	
	// Finding the initial sum of stack3.
	for (int i=0; i < n3; i++)
		sum3 += stack3[i];
	
	// As given in question, first element is top
	// of stack..
	int top1 =0, top2 = 0, top3 = 0;
	int ans = 0;
	while (true)
	{
		// If any stack is empty
		if (top1 == n1 || top2 == n2 || top3 == n3)
			return 0;
	
		// If sum of all three stack are equal.
		if (sum1 == sum2 && sum2 == sum3)
			return sum1;
		
		// Finding the stack with maximum sum and 
		// removing its top element.
		if (sum1 >= sum2 && sum1 >= sum3)
			sum1 -= stack1[top1++];
		else if (sum2 >= sum1 && sum2 >= sum3)
			sum2 -= stack2[top2++];
		else if (sum3 >= sum2 && sum3 >= sum1)
			sum3 -= stack3[top3++];
	}
	}
	
	/* Driver program to test above function */
	public static void main(String[] args) 
	{
		
		Scanner myObj = new Scanner(System.in);  
                int n1,n2,n3;
      
                System.out.println("Enter the number of stacks in each cylinder");
                n1 = myObj.nextInt();
                n2 = myObj.nextInt();
                n3 = myObj.nextInt();
                int[] stack1  = new int[n1];
                System.out.println("Enter the height of each stack in cylinder 1");
                for(int i=0;i<n1;i++){
                    stack1[i] = myObj.nextInt();
                }
                int[] stack2  = new int[n2];
                System.out.println("Enter the height of each stack in cylinder 2");
                for(int i=0;i<n2;i++){
                    stack2[i] = myObj.nextInt();
                }
                int[] stack3  = new int[n3];
                System.out.println("Enter the height of each stack in cylinder 3");
                for(int i=0;i<n3;i++){
                    stack3[i] = myObj.nextInt();
                }
		System.out.println("Maximum possible height: "+maxSum(stack1, stack2, stack3, n1, n2, n3));
	}
}
// This code is contributed by Arnav Kr. Mandal.
