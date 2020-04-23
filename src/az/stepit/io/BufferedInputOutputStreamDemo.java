package az.stepit.io;

import java.io.*;

public class BufferedInputOutputStreamDemo {
    public static void main(String[] args) {

        BufferedInputStream inputStream = null;
        BufferedOutputStream outputStream = null;

        try{
            inputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\User\\Desktop\\buffered.txt"));
            outputStream = new BufferedOutputStream(new FileOutputStream("C:\\Users\\User\\Desktop\\buffered1.txt"));

            for (int i = inputStream.read(); i != -1; i=inputStream.read()) {
                outputStream.write(i);
            }

            outputStream.flush();
        }catch (IOException ex){
            System.err.println(ex.getMessage());
        }finally {
            try {
                if (inputStream != null) inputStream.close();
                if(outputStream != null) outputStream.close();
            }catch (IOException ex){
                System.err.println(ex.getMessage());
            }
        }


    }
}
