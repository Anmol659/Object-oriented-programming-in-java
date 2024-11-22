class Base2
{
    Base2()
    {
        System.out.println("I Am a constructor!!!");
    }
    public int getx()
    public int x;
    {
        return x;
    }
    public void setX(int x)
    {
        this.x = x;
    }
}
class Derived1 extends Base2{
     public int y;
Derived1()
{
System.out.println("I am a derived class constructor");
}
    }

public class constructorsinInheritance {
    public static void main(String[] args)
    {
        Base2 b= new Base2();
        Derived1 d = new Derived1();
        


    }

}
