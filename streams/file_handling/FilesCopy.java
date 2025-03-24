package file_handling;
import java.io.*;

public class FilesCopy {
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\Aditi\\Desktop\\bridgelabz-workspace\\collections_java\\streams\\file_handling\\source.txt";
        String destinationFile = "destination.txt";

        File file = new File(sourceFile);
        System.out.println("Looking for: " + file.getAbsolutePath());

        if (!file.exists()) {
            System.out.println("Error: Source file does not exist!");
            return;
        }

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading or writing the file.");
            e.printStackTrace();
        }
    }
}
