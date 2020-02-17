package ch03_ex2_AreaAndPerimeter;

// TEACHER NOTES: make sure you name the class what the assignment states.  See step 1.
public class AreaAndPerimeter {
	// author: jack laine
	public static void main(String[] args) {

		AreaPerimeter AP = new AreaPerimeter(System.in);
		System.out.println("welcome to the area and perimeter calculator");
		
		//TEACHER NOTES: you are supposed to ask the user to enter length and width. see step 3
		System.out.println("enter perimeter 1/area 1:");
		String areaperimeter1 = AP.nextLine();
		System.out.println("enter area2 / perimeter 2:");
		String areaperimeter2 = AP.nextLine();

		double dperimeter = Double.parseDouble(perimeter.trim());
		double darea = Double.parseDouble(area.trim());
		dperimeter = areaperimeter1 + areaperimeter2 * 2;
		darea = areaperimeter1 * areaperimeter2;
		System.out.println("perimeter =" + dperimeter);
		System.out.println("area =" + darea);

		System.out.println("bye");

	}
}
