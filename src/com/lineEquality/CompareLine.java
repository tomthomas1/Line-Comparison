package com.lineEquality;

import java.util.Scanner;

public class CompareLine {
	
public void compareTo (double length1, double length2) {
		
		if (length1 == length2) {
			System.out.println(" The two lines are equal in length");
		}
		
		else if (length1 > length2) {
			System.out.println(" The first line is greater than the second line. ");
		}
		
		else {
			System.out.println(" The second line is greater than the first line. ");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompareLine obj = new CompareLine();
		Scanner read = new Scanner(System.in);
		
		System.out.print(" Enter x1: ");
		double x1 = read.nextDouble();
		
		System.out.print(" Enter y1: ");
		double y1 = read.nextDouble();
		
		System.out.print(" Enter x2: ");
		double x2 = read.nextDouble();
		
		System.out.print(" Enter y2: ");
		double y2 = read.nextDouble();
		
		System.out.print(" Enter x3: ");
		double x3 = read.nextDouble();
		
		System.out.print(" Enter y3: ");
		double y3 = read.nextDouble();
		
		System.out.print(" Enter x4: ");
		double x4 = read.nextDouble();
		
		System.out.print(" Enter y4: ");
		double y4 = read.nextDouble();
		
		double length1 = Math.sqrt( Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		double length2 = Math.sqrt( Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));
		
		System.out.println(" The first point is : (" + x1 + ", " + y1 + ")");
		System.out.println(" The second point is : (" + x2 + ", " + y2 + ")");		
		
		System.out.println(" The third point is : (" + x3 + ", " + y3 + ")");
		System.out.println(" The fourth point is : (" + x4 + ", " + y4 + ")");
		
		System.out.println(" The length of first line is : " + length1);
		System.out.println(" The length of second line is : " + length2);
				
		obj.compareTo(length1, length2);	
		
	
	}

}


