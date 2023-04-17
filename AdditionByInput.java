import java.util.Scanner;

public class AdditionByInput{

public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter first number : ");
	int a= sc.nextInt();
	
	System.out.println("Enter Second number : ");
	int b= sc.nextInt();
	
	int c= a+b;
	
	System.out.println("The sum of two number is : " + c);
	}
}
	