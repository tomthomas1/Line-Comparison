package bridgelabz;

public class LineComparision {
	int x1, y1, x2, y2;
	Double length;
	
	
	public LineComparision(int x1, int y1, int x2, int y2){                 //Parameterized constructor
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		
	}
	
	public void calculateLength() {                                         //to calculate the length
		length = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("x1 : "+x1);
		System.out.println("y1 : "+y1);
		System.out.println("x2 : "+x2);
		System.out.println("y2 : "+y2);
		System.out.println("Length Of The Line is : "+length);
		
	}
	
	public void isEqual(LineComparision line2) {                             //to check if line 1 is equal to line 2
		boolean isEqual = (this.length).equals(line2.length);                //it gives o/p true or false based on length
		if(isEqual)
			System.out.println("The Lines are equal");
		else
			System.out.println("The Lines are not equal");
	}
	
	public void compareTheLines(LineComparision line2) {
		int compareValue = (this.length).compareTo(line2.length);             // to compare 2 lines
		if(compareValue < 0)                                                  // it returns value -ve, +ve, or 0
			System.out.println("Line 1 is smaller than Line 2");
		else if(compareValue == 0)
			System.out.println("Line 1 is equal to Line 2");
		else
			System.out.println("Line 1 is greater than Line 2");
	}
	
	public static void main(String[] args) {
			// creating the objects
		LineComparision line1 = new LineComparision(2, 3, 2, 8);
		LineComparision line2 = new LineComparision(2, 3, 4, 8);
		
		line1.calculateLength();
		line2.calculateLength();
		line1.isEqual(line2);
		line1.compareTheLines(line2);
	}
}
