
import java.util.Scanner;

public class arrayException {
    public static void main(String[] args)
    {
      int [] marks = new int[3];
      marks [0] = 50;
      marks [1] = 25;
      marks [2] = 60;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the array index :-");
      int ind = sc.nextInt();

      System.out.println("Enter the vaue you want to devide with");
      int number = sc.nextInt();
      try
      {
        System.out.println("The value at array index entered is :"+ marks[ind]);
        System.out.println("The value of array - value/number is : "+marks[ind]/number);
      }
      catch(Exception e)
      {
        System.out.println("Some Exceptions accured!");
        System.out.println(e);
      }

    }
}
