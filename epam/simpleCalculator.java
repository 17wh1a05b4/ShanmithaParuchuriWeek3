package epam;
import java.io.*;
import java.util.Scanner;

public class simpleCalculator {
		public static void main(String[] args) throws IOException {
			   char ch;
		       Operation x;
		       try {
		    	   Scanner sc = new Scanner(System.in);
		    	   boolean flag=true;
		    	   int answer = 0;
		    	   while(flag) {
		    		   System.out.print("Enter first number : ");
		    		   int m =sc.nextInt();
		    		   System.out.print("Enter second number : ");
		    		   int n =sc.nextInt();
		    		   System.out.println("Select the operation to be performed:\n1.ADD(+)\n2.SUBTRACT(-)\n3.MULTIPLY(*)\n4.DIVIDE(/)");
		    		   int c = sc.nextInt();
		    		   switch(c) {
		        			case 1:
		        				System.out.print("Sum : ");
		        				x = new Addition();
		        				answer = x.op(m, n);
		        				System.out.print(answer);
		        				System.out.println("\nDo you want to perform more operations?(y/n)");
		        				ch=sc.next().charAt(0);
		        				if(ch == 'y'||ch=='Y')
		        					flag = true;
		        				else {
		        					flag = false;
		        					System.out.println("Thank you for using this Calculator!");
		        				}
		        				break;
		        			case 2:
		        				System.out.print("Difference : ");
		        				x = new Subtraction();
		        				answer = x.op(m, n);
		        				System.out.print(answer);
		        				System.out.println("\nDo you want to perform more operations?(y/n)");
		        				ch=sc.next().charAt(0);
		        				if(ch == 'y'||ch=='Y')
		        					flag = true;
		        				else {
		        					flag = false;
		        					System.out.println("Thank you for using this Calculator!");
		        				}break;
		        			case 3:
		        				System.out.print("Product : ");
		        				x = new Multiplication();
		        				answer = x.op(m, n);
		        				System.out.print(answer);
		        				System.out.println("\nDo you want to perform more operations?(y/n)");
		        				ch=sc.next().charAt(0);
		        				if(ch == 'y'||ch=='Y')
		        					flag = true;
		        				else {
		        					flag = false;
		        					System.out.println("Thank you for using this Calculator!");
		        				}break;
		        			case 4:
		        				System.out.print("Quotient : ");
		        				x = new Division();
		        				answer = x.op(m, n);
		        				System.out.print(answer);
		        				System.out.println("\nDo you want to perform more operations?(y/n)");
		        				ch=sc.next().charAt(0);
		        				if(ch == 'y'||ch=='Y')
		        					flag = true;
		        				else {
		        					flag = false;
		        					System.out.println("Thank you for using this Calculator!");
		        				}break;
		        			default:
		        				System.out.print("Please enter a valid input");
		    		   	}
		    	   	}
		       	}catch(Exception e) {
		       		System.out.println("Exception occurred!!!");
			}
		}
}