package com.gsv.lab;
import java.util.Scanner;

class Point3D {
	private int x, y, z;
	
	public Point3D() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	public Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public void inputCoordinates() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter x coordinate: ");
		this.x = scanner.nextInt();
		System.out.print("Enter y coordinate: ");
		this.y = scanner.nextInt();
		System.out.print("Enter z coordinate: ");
		this.z = scanner.nextInt();
	}
	
	public void outputCoordinates() {
		System.out.println("Point Coordinates: (" + x + ", " + y + ", " + z + ")");
	}
	
	public double computeDistance(Point3D other) {
		int dx = this.x - other.x;
		int dy = this.y - other.y;
		int dz = this.z - other.z;
		return Math.sqrt(dx * dx + dy * dy + dz * dz);
	}
	
public class E06_06 {
	
	    public static void main(String[] args) {
	        
	        Point3D point1 = new Point3D(); // Origin point
	        Point3D point2 = new Point3D(3, 4, 5); 

	        
	        System.out.println("Input coordinates for Point 1:");
	        point1.inputCoordinates();
	        point1.outputCoordinates();

	        System.out.println("Coordinates for Point 2:");
	        point2.outputCoordinates();

	        double distance = point1.computeDistance(point2);
	        System.out.printf("Distance between Point 1 and Point 2: %.2f%n", distance);
	    }
	}

}
