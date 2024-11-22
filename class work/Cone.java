import java.util.Scanner;
class Figure{
    double r,a,v;

Cone(double r, double a, double v)
{
    this.r=r;
    this.a = a;
    this.v = v;
}
public void displayArea()
{
    System.out.println("The area of Cone is"+a);
}

public void displayvolume()
{
    System.out.println("The Volume of Cone is"+v);
}
}

class Cone extends Figure
{
    double h,s;
}

cone(double r, double a, double v, double h, doubl s)
{
super(r,a,v);
this.h= h;
this.s = s;


public void calcArea(){
    doulbe area = Math.PI*r*s + Math.PI*r*r;

    System.out.println("The area of the cone is :-"+area);
}
}
