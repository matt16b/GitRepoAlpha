import java.util.Scanner;

public class c4p1{
	public static void main(String [] args){

	//variables
	int input1;
	int input2;
	int quotient;
	int remain;
	Scanner reader = new Scanner(System.in);

	//input
	System.out.print("What is your first number?  ");
	input1 = reader.nextInt();
	System.out.print("What is your second number?  ");
	input2 = reader.nextInt();

	if(input1 > input2)
	{
	quotient = input1/input2;
	remain =  input1%input2; 
	}
	else
	{
	quotient = input2/input1;
	remain = input2%input1; 
	}

	//output
	System.out.println("The quotient is: " + quotient + " The remainder is: " 		+ remain);
	
	}
}
