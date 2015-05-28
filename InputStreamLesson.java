package Quadratic;
import java.io.*;

public class InputStreamLesson {//sldkfsldk

    public static void main(String[] args) {
        File fileFrom = new File("foto1.jpg");
        File fileTo = new File("destination.jpg");
        long fileLength = fileFrom.length();
        System.out.println("number of bytes in image --> " + fileLength);

        try (FileInputStream readBytes = new FileInputStream(fileFrom);
             FileOutputStream outputStream = new FileOutputStream(fileTo)) {
            byte[] byteArray = new byte[(int) fileLength];
            int numOfBytes = readBytes.read(byteArray);
            System.out.println("numOfBytes -->" + numOfBytes);
            System.out.println(fileTo.createNewFile());
            for (int i = 0; i < fileLength - 50000; i++) {
                //if(i>1000){break;}
                byte b = byteArray[i];
                outputStream.write(b);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
