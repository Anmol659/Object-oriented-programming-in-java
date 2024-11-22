public class DeserializableDemo {
    public static void main(String[] args)
    {
        File f1 = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            f1 = new File("C:\Users\hp\Documents\AiTExt");
            fis = new FileInputStream(f1);
            ois = new ObjectInputStream(fis);
            Person p1 = (Person)ois.readObject();
            System.out.println("Name" + p1.name);
            System.out.println("Age" +p1.age);
            System.out.println("Weight " + p1.weight);
            System.out.println("PID" +p1.pid);
            System.out.println("AADHar " +p1.adha);
            System.out.println("Height"+ p1.height);

        }
        catch(IOException ex)
        {
            ex.getMessage();
        }
        catch(ClassNotFoundException ex)
        {
            ex.getMessage();
        }
    }
}