class ExceptionDemoSolution
{
public static void main(String[] args)
{
try
{
String s = args[0];
int i = Integer.parseInt(s); //String into Int conversio
int j = i/(i-9);
// System.exit(1);
System.out.println("Value of j"  +i);
}
catch(ArrayIndexOutOfBoundsException ex)
{
System.out.println("command line argumentis not passed");
}
catch(NumberFormatException ex)
{
System.out.println("string to int conversion");
}
catch(ArithmeticException ex)
{
System.out.println("Divide by zero");
}
finally{
    System.out.println("GSV Rocks");
}
System.out.println("Main end");
}
}
