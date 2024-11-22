class Ekclasss
{
    int a;
    public int getA()
    {
        return a;
    }
Ekclasss(int v)
{
    a=v;
}
    public int returnOne()
    {
        return 1;
    }
} 
public class ThisSuper {
    public static void main(String[] args)
    {
        Ekclasss e = new Ekclasss(5);
        System.out.println(e.getA());
    }
}
