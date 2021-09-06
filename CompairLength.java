package Geometry;
	

import java.util.Scanner;

	public class CompairLength {
	

	    public static void main(String[] args) {

	        // Declaration Part
	        int x1, x2, y1, y2, a1, a2, b1, b2;
	        double Length1, Length2;

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

	        Length2 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));

	        System.out.println("Length between " + "(" + a1 + "," + b1 + ")," + "(" + a2 + "," + b2 + ")===>" + Length2);

	        Length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

	        System.out.println("Length between " + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")===>" + Length1);

	        String value1 = Double.toString(Length1);
	        String value2 = Double.toString(Length2);

	        checkEqualMethod(value1,value2);
	        checkComputeToMethod(value1,value2);

	    }

	    private static void checkComputeToMethod(String value1, String value2) {

	        System.out.println("\nCheck with ComputeTo Method\n");
	        int b = value1.compareTo(value2);

	        if (b > 0) {
	            System.out.println("Line2 Greater than Line1\n");
	        }
	        else if(b < 0) {
	            System.out.println("Line1 Greater than Line2\n");
	        }
	        else
	            System.out.println("Two Lines are Equals\n");
	    }
	    private static void checkEqualMethod(String value1, String value2) {

	        System.out.println("\nCheck with Equal Method\n");
	        if (value1.equals(value2)) {   // Check the Lines are equal or not
	            System.out.println("Two Lines are Equals\n");
	        }
	        else
	            System.out.println("Two Lines are Not Equals\n");
	    }

	}
