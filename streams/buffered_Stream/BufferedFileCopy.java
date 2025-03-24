package buffered_Stream;

import java.io.*;

public class BufferedFileCopy {
    public static void main(String[] args) {
        // Define source and destination file names
        String sourceFile = "C:\\Users\\Aditi\\Desktop\\bridgelabz-workspace\\collections_java\\streams\\buffered_Stream\\largefile.dat";
        String destinationFileBuffered = "copy_buffered.dat";
        String destinationFileUnbuffered = "copy_unbuffered.dat";

        // Copy using buffered streams and measure time
        long bufferedTime = copyUsingBufferedStreams(sourceFile, destinationFileBuffered);
        System.out.println("Buffered Copy Time: " + bufferedTime + " ns");

        // Copy using unbuffered streams and measure time
        long unbufferedTime = copyUsingUnbufferedStreams(sourceFile, destinationFileUnbuffered);
        System.out.println("Unbuffered Copy Time: " + unbufferedTime + " ns");
    }

    // Copies file using BufferedInputStream and BufferedOutputStream
    private static long copyUsingBufferedStreams(String source, String destination) {
        long startTime = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {
            byte[] buffer = new byte[4096]; // 4 KB buffer
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Buffered Copy Error: " + e.getMessage());
        }
        return System.nanoTime() - startTime; // Return execution time
    }

    // Copies file using FileInputStream and FileOutputStream (without buffering)
    private static long copyUsingUnbufferedStreams(String source, String destination) {
        long startTime = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
        } catch (IOException e) {
            System.out.println("Unbuffered Copy Error: " + e.getMessage());
        }
        return System.nanoTime() - startTime; // Return execution time
    }
}