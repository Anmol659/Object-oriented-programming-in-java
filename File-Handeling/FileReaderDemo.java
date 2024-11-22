// import java.io.File;
// import javax.sound.midi.SysexMessage;
// public class FileReaderDemo
// {
//     public static void main(String[] args) {
//         File f1 = null;
//         FileReader fr = null;
//         try{
//             f1 = new File("C:\Users\hp\Documets\output.txt");
//             fr = new FileReader(f1);

//             long len = f1.length();
//             char ch[] = new char[(int)len];
//             fr.read(ch);
//             for(char c: ch)
//             {
//                 System.out.println(c);
//                 fr.read(ch);
//                 for(char c: ch)
//                 {
//                     System.out.println(c);

//                 }
//             }
//             catch(IOException ex)
//             {
//                 ex.printStackTrace();
//             }
//         }
//     }
// }


import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        File f1 = null;
        FileReader fr = null;

        try {
            f1 = new File("C:\\Users\\hp\\Documents\\output.txt");
            fr = new FileReader(f1);

            long len = f1.length();
            char[] ch = new char[(int)len];
            fr.read(ch);

            for (char c : ch) {
                System.out.print(c); // Use print instead of println to avoid extra line breaks
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
