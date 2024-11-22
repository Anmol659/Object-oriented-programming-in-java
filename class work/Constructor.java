public public class Person {
    String name;
    int age;

    
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("Default Constructor called");
    }

   
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor called");
    }

    
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        
        Person person1 = new Person(); 
        person1.display();

        Person person2 = new Person("Alice", 30); 
        person2.display();
    }
}
 {
    
}
