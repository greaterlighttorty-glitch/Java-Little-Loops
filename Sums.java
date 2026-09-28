import java.util.Scanner;

public class Sums{
	
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a numnber: ");
	int number = input.nextInt();
	
		int sum = 0;
	for(int index = 0; index <= number; index++){
	 sum += index;

	}
		 
	 System.out.println(sum);
	
  }
  
}
