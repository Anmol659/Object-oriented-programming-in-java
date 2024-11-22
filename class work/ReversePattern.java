public class ReversePattern {
 static void printPattern(int n)
 {
    for(int i = n; i>=0; i--)
    {
        for(int j = 0; j<i; j++)
        {
            
            System.out.print("*   ");
        }
        System.out.println(" \t");
    }
 }   
 public static void main(String[] args)
 {
  int n = 5;
  printPattern(n);  
 }
}
