public class DenoExceptionReturn {
    public static void main(String[] args)
{

    int j = test(9);
    System.out.println("Value ofj "+j);

}   
    public static int test(int i)
{
    int j = 0;
    try{
        j = i/(i-9);
}
catch(ArithmeticException ex)
{
    System.out.println("Divide by zero");
    return 0;
} 
}


