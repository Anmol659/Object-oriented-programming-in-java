import java.util.Scanner;
abstract class Figure {
    double pi = 3.1420;

    public abstract void calcArea();
    public abstract void calcVol();
    public abstract void dispArea();
    public abstract void dispVol();
}
class Cone extends Figure {
    double r, s;
    double area, volume;

    Cone(double r, double s) {
        this.r = r;
        this.s = s;
    }

    @Override
    public void calcArea() {
        area = pi * r * s + pi * r * r;
    }

    @Override
    public void calcVol() {
        volume = (pi * r * r * s) / 3;
    }

    @Override
    public void dispArea() {
        System.out.println("The area of the cone is: " + area);
    }

    @Override
    public void dispVol() {
        System.out.println("The volume of the cone is: " + volume);
    }
}
class Sphere extends Figure {
    double r;
    double area, volume;

    Sphere(double r) {
        this.r = r;
    }

    @Override
    public void calcArea() {
        area = 4 * pi * r * r;
    }

    @Override
    public void calcVol() {
        volume = (4 * pi * r * r * r) / 3;
    }

    @Override
    public void dispArea() {
        System.out.println("The area of the sphere is: " + area);
    }

    @Override
    public void dispVol() {
        System.out.println("The volume of the sphere is: " + volume);
    }
}
class Cylinder extends Figure {
    double r, h;
    double area, volume;

    
    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

   
    @Override
    public void calcArea() {
        area = 2 * pi * r * h + 2 * pi * r * r;
    }

   
    @Override
    public void calcVol() {
        volume = pi * r * r * h;
    }

    
    @Override
    public void dispArea() {
        System.out.println("The area of the cylinder is: " + area);
    }

    
    @Override
    public void dispVol() {
        System.out.println("The volume of the cylinder is: " + volume);
    }
}


public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the radius (r) of the cone: ");
        double rCone = sc.nextDouble();
        System.out.print("Enter the slant height (s) of the cone: ");
        double sCone = sc.nextDouble();
        Cone cone = new Cone(rCone, sCone);
        cone.calcArea();
        cone.calcVol();
        cone.dispArea();
        cone.dispVol();

        
        System.out.print("Enter the radius (r) of the sphere: ");
        double rSphere = sc.nextDouble();
        Sphere sphere = new Sphere(rSphere);
        sphere.calcArea();
        sphere.calcVol();
        sphere.dispArea();
        sphere.dispVol();

        
        System.out.print("Enter the radius (r) of the cylinder: ");
        double rCylinder = sc.nextDouble();
        System.out.print("Enter the height (h) of the cylinder: ");
        double hCylinder = sc.nextDouble();
        Cylinder cylinder = new Cylinder(rCylinder, hCylinder);
        cylinder.calcArea();
        cylinder.calcVol();
        cylinder.dispArea();
        cylinder.dispVol();

        sc.close(); 
    }
}