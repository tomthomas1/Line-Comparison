package com.lineEquality;

import java.util.Scanner;

public class LineEquality {
	public static void main(String arg[]) {
		int x1, x2, y1, y2;
		int x3, x4, y3, y4;
		double length1;
		double length2;

		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter the cordinates of first line: ");
		System.out.println("enter x1 point");
		x1 = sc.nextInt();

		System.out.println("enter y1 point");
		y1 = sc.nextInt();

		System.out.println("enter x2point");
		x2 = sc.nextInt();

		System.out.println("enter y2 point");
		y2 = sc.nextInt();

		System.out.println(" Enter the cordinates of second3 line: ");
		System.out.println("enter x3 point");
		x3 = sc.nextInt();

		System.out.println("enter y3 point");
		y3 = sc.nextInt();

		System.out.println("enter x4point");
		x4 = sc.nextInt();

		System.out.println("enter y4 point");
		y4 = sc.nextInt();

		length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		length2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));

		System.out.println(
				"Distance between first line" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ") is : " + length1);
		System.out.println("Distance between second line" + "(" + x3 + "," + y3 + ")," + "(" + x4 + "," + y4 + ") is : "
				+ length2);

		if (length1 == length2) {
			System.out.println(" The given two lines are equal ");
		} else {
			System.out.println(" The given two lines are not equal");
		}
	}

}
