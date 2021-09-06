ackage geometry;

import java.util.Scanner;

public class CheckEquality {

	public static void main(String arg[]) {

		// Declaration Part
		int x1, x2, y1, y2, a1, a2, b1, b2;
		double length1, length2;

		// Get the input x1,y1,x2,y2,a1,a2,b1,b2 from the user
		Scanner sc = new Scanner(System.in);

		System.out.println("enter x1 point");
		x1 = sc.nextInt();

		System.out.println("enter y1 point");
		y1 = sc.nextInt();

		System.out.println("enter x2point");
		x2 = sc.nextInt();

		System.out.println("enter y2 point");
		y2 = sc.nextInt();

		System.out.println("enter a1 point");
		a1 = sc.nextInt();

		System.out.println("enter b1 point");
		b1 = sc.nextInt();

		System.out.println("enter a2point");
		a2 = sc.nextInt();

		System.out.println("enter b2 point");
		b2 = sc.nextInt();

		length2 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));

		System.out.println("Length between " + "(" + a1 + "," + b1 + ")," + "(" + a2 + "," + b2 + ") = " + length2);

		length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println("Length between " + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ") =" + length1);

		String Value1 = Double.toString(length1);
		String Value2 = Double.toString(length2);

		if (Value1.equals(Value2)) { // Check the Lines are equal or not
			System.out.println("Two Lines are Equals");
		} else
			System.out.println("Two Lines are Not Equals");

	}

}
