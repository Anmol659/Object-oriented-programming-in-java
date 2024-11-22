public public class Person {
    String name;
    int age;

    // Default Constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("Default Constructor called");
    }

    // Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor called");
    }

    // Display method to show information
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating objects using both constructors
        Person person1 = new Person(); // Calls the default constructor
        person1.display();

        Person person2 = new Person("Alice", 30); // Calls the parameterized constructor
        person2.display();
    }
}
 {
    
}
