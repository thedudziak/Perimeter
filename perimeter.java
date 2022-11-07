package perimeter;

import java.util.Scanner;

public class perimeter {


	static int sideone ;
	static int sidetwo ;
	static int perimeter;
	static Scanner sc= new Scanner(System.in);

public static void main(String[] args) {
	System.out.println("Enter first side");
	int sideone= sc.nextInt();  
	System.out.println("Enter second side");
	int sidetwo= sc.nextInt();
	perimeter = 2*sideone+2*sidetwo;
	System.out.println("The squares perimeter is : " +perimeter);
}
}