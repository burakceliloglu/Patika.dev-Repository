import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("patika.txt"); // or src/partika.txt
        try {
            if(file.createNewFile()){
                System.out.println(file.getName() + " file created.");
            } else{
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Delete
        System.out.println(file.delete());

        // Folder
        File folder = new File("test");
        // patika/test yaparak eğer üst klasör yoksa oluşturuyoruz.
        folder.mkdir();

        // File list
        String[] list = folder.list();

        for(String str: list){
            System.out.println(str);
        }

        // File Input Stream / Byte Reader
        try {
            FileInputStream input = new FileInputStream("input.txt");
            System.out.println("Byte number: " + input.available());
            int i = input.read();
            while(i != -1){
                System.out.print((char) i);
                i = input.read();
            }
            input.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // File Output Stream
        try {
            String text = "Output streammmmmm.";
            FileOutputStream output =
                    new FileOutputStream("input.txt",true);
            byte[] textByte = text.getBytes();
            output.write(textByte);
            output.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Byte Array Input Stream
        byte[] array1 = {1,2,3,4,5};
        ByteArrayInputStream byteArray = new ByteArrayInputStream(array1);
        int k  = byteArray.read();
        while(k != -1){
            System.out.println(k);
            k = byteArray.read();
        }

        // Byte Array Output Stream
        String text = "Java 102";
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] data = text.getBytes();
        try {
            byteArrayOutputStream.write(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
