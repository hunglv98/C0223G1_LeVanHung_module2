package ss17_serialization.ex.copy_file;

import java.io.*;

public class CopyFile {
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        String sourcePath = "src/ss17_serialization/ex/copy_file/source_file.txt";
        String destPath = "src/ss17_serialization/ex/copy_file/destination_file.txt";
        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);
        try {
            copyFileUsingStream(sourceFile, destFile);
            System.out.printf("Copy completed");
        } catch (IOException ioe) {
            System.out.printf("Can't copy that file");
            System.out.printf(ioe.getMessage());
        }
        System.out.println();
        File file = new File(destPath);
        System.out.println("Số byte là " + file.length());
    }
}
