package fileManufulation;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManu01 {
    public static void main(String[] args) {
        File Obj = new File("TEST01.txt");
        if (Obj.delete()) {
            System.out.println("The deleted file is : "
                    + Obj.getName());
        }
        else {
            System.out.println(
                    "Failed in deleting the file.");
        }


        /*
        try {
            File Obj = new File("TEST01.txt");
            Scanner Reader = new Scanner(Obj);
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
*/


        /*
        try {
            FileWriter Writer = new FileWriter("TEST01.txt");
            Writer.write(
                    "Files in Java are seriously good!!");
            Writer.close();
            System.out.println("Successfully written.");
        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
*/

/*        try {
            File Obj = new File("TEST01.txt");
            if (Obj.createNewFile()) {
                System.out.println("File created: "
                        + Obj.getName());
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }*/


    }
}


