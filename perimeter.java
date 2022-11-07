package perimeter;

import java.util.Scanner;

public class perimeter {


	static float sideone ;
	static float sidetwo ;
	static float perimeter;
	static Scanner sc= new Scanner(System.in);

public static void main(String[] args) {
	System.out.println("Enter first side");
	float sideone= sc.nextFloat();  
	System.out.println("Enter second side");
	float sidetwo= sc.nextFloat();
	perimeter = 2*sideone+2*sidetwo;
	System.out.println("The squares perimeter is : " +perimeter);
}
}
