package basicConcepts;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) throws IOException {

        try {

//            Write Data on file
            FileOutputStream fos=new FileOutputStream("Pavan.txt");
            String p="My Name Is Pavan ";
            fos.write(p.getBytes());
            fos.close();
            fos.write(p.getBytes());
            fos.close();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
//        System.out.println();


//        Read Data From File
//        try {
//            FileInputStream fis=new FileInputStream("Pavan.txt");
//int i;
//            while ((i=fis.read())!=-1)
//            {
//                System.out.print(" "+(char)i);
//            }
//fis.close();
//              } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


//      FileWriter

//        try {
//            FileWriter flwr=new FileWriter("goodLuck.txt");
//            flwr.write("This is me v/s me only...");
//            flwr.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


//        Read with the help of fileReader
//        FileReader fr=new FileReader("goodLuck.txt");
//        char []c=new char[100];
//        fr.read(c);
//        System.out.println(c);
//        fr.close();

    }
}

/*
java stream :

|
|
|-----java Stream |
|                 |
|                 |
|                 |-------Byte Stream
|                 |
|                 |
|                 |------Character Stream
|

1


 */