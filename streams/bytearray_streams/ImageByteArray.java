package bytearray_streams;

import java.io.*;

public class ImageByteArray {
    public static void main(String[] args) {
        String sourceImage = "C:\\Users\\Aditi\\Desktop\\bridgelabz-workspace\\collections_java\\streams\\bytearray_streams\\shinchan.jpg";
        String destinationImage = "copy.jpg";

        byte[] imageData = convertImageToByteArray(sourceImage);
        if (imageData != null) {
            writeByteArrayToImage(imageData, destinationImage);
            System.out.println("Image copied successfully.");
        } else {
            System.out.println("Failed to copy image.");
        }
    }

    // Convert image to byte array
    private static byte[] convertImageToByteArray(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray();
        } catch (IOException e) {
            System.out.println("Error reading image: " + e.getMessage());
            return null;
        }
    }

    // Write byte array back to image file
    private static void writeByteArrayToImage(byte[] imageData, String filePath) {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageData);
             FileOutputStream fos = new FileOutputStream(filePath)) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Error writing image: " + e.getMessage());
        }
    }
}

