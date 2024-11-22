class Base1
{
    int x;
    public int getx()
    {
        return x;
    }
    public void setx(int x)
    {
        this.x = x;
    }
public void printme(){
    System.out.println("I am a constructor");
     
}
}
public class Inheritance {
    public static void main(String[] args)
    {
        Base1 b = new Base1();
        b.setx(4);
        System.out.println(b.getx());
    }
}
