import java.util.Scanner;

public class Number{
	
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a numnber: ");
	int number = input.nextInt();
	
	for(int index = 0; index <= number; index++){
	 int count = index;
	 
	 System.out.print(count);
	}
	
	
  }
  
}
