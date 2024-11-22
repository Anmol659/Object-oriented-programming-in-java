class ExceptionDemoSolution1 {
    public static void main(String[] args) {
        try {
            String s = args[0];
            int i = Integer.parseInt(s); // String to int conversion
            int j = i / (i - 9);
            System.out.println("Value of j: " + j);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Command line argument is not passed");
        } catch (NumberFormatException ex) {
            System.out.println("Invalid input: Cannot convert string to int");
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic error: Divide by zero");
        }
        System.out.println("Main end");
    }
}
class ExceptionDemoSolution
{
public static void main(String[] args)
{
try
{
String s = args[0];
int i = Integer.parseInt(s); //String into Int conversio
int j = i/(i-9);
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
