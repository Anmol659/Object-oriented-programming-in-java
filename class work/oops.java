/*class Employee
{
    int age;
    float weight;
    String Name;
}*/
class Employee
{
    int id;
    String name;
    public void printdetails()
    {
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }
}
public class oops {
    public static void main(String[] args)
    {       //setting attributes
        /*Employee data = new Employee();
        data.Name = "Harsh Vardhan";
        data.age = 20;
        data.weight = 54f;

        System.out.println(data.Name);*/

Employee data = new Employee();
data.name = "Harsh vardhan";
data.id = 25;
data.printdetails();
    }
}
