package geometry;

// Declaration Part
		static int x1, x2, y1, y2;
		double Length;

import java.util.Scanner;


public class GetLength {

	
	
// Declaration Part
		static int x1, x2, y1, y2;
		double Length;
	
	//method for calculate length
public void calculateLength(){ 
 // calculate the Length of the Line
		Length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println("Length between " + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ") =" + Length);
}

	public static void main(String arg[]) {

		

		// Get the input x1,y1,x2,y2 from the user
		Scanner sc = new Scanner(System.in);

		System.out.println("enter x1 point");
		x1 = sc.nextInt();

		System.out.println("enter y1 point");
		y1 = sc.nextInt();

		System.out.println("enter x2point");
		x2 = sc.nextInt();

		System.out.println("enter y2 point");
		y2 = sc.nextInt();
		
       		GetLength obj = new GetLength();
	         obj.calculateLength();	
                     
	}

}
