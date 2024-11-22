// import java.io.File;
// public class FilewriterDemo {
    
//     {
//         public static void main(String[] args)
//         {
//             File f1 = null;
//             FileWriter fw = null ;
//             long length = 0;
//             try{
//                 f1 = new File("C:\Users\hp\Documents");
//                 fw = new FileWriter(f1);
//                 fw.write = ("GSV AI JAVA Class");
//                 length = f1.length();
//                 System.out.println("Befor close Lenght :"+ length);
//             }
//             catch(IOException ex)
//             {
//                 ex.printStackTrace();
//             }
//             finally{
//                 try{
//                     if(fw!= null)
//                     {
//                         fw.flush();
//                         fw.close();
//                         fw = null;
//                     }
//                 }
//                 catch(IOException ex)
//                 {
//                     ex.printlStackTrace();
//                 }
//             }
//         }
//     }
// }


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilewriterDemo {

    public static void main(String[] args) {
        File f1 = null;
        FileWriter fw = null;
        long length = 0;
        
        try {
            f1 = new File("C:\\Users\\hp\\Documents\\AiTExt.txt");
            fw = new FileWriter(f1);
            fw.write("GSV AI JAVA Class");
            length = f1.length();
            System.out.println("Before close Length: " + length);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.flush();
                    fw.close();
                    fw = null;
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
