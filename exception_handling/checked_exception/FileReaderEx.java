import java.io.*;
public class FileReaderEx{
    public static void main(String[] args) {
        {
            try{
            // Attempt to read the file

                BufferedReader reader= new BufferedReader(new FileReader("C:\\Users\\Aditi\\Desktop\\bridgelabz-workspace\\collections_java\\exception_handling\\checked_exception\\data.txt"));
                String line;
                while((line=reader.readLine()) !=null){
                    System.out.println(line);

                }
            }catch(IOException e){  // Handles file not found or reading error
                System.out.println("File not Found");

            }
        }
    }
}