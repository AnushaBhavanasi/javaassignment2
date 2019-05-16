import java.util.Scanner;
import java.io.*;
public class FileConversion {
        public static void main(String[] input)
        {
            String fname;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter File Name to Open (with extension like file.txt) : ");
            fname = s.nextLine();
            String line = null;
            try
            {
                FileReader fileReader = new FileReader(fname);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while((line = bufferedReader.readLine()) != null)
                {
                    String upper = line.toUpperCase();
                    System.out.println(upper);
                }
                bufferedReader.close();
            }
            catch(IOException ex)
            {
                System.out.println("Error reading file named '" + fname + "'");
            }
        }
    }
