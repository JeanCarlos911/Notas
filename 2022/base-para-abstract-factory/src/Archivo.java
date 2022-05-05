import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class Archivo implements Entrada {

    private final String fileName;

    public Archivo(String fileName) {
        this.fileName = fileName;
    }

    public void write(String string) {
        File file = new File(fileName);

        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileWriter writer;
        try {
            writer = new FileWriter(fileName);
            writer.write(string);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String read() {
        File file = new File(fileName);
        if(!file.exists()) {
            return "";
        }

        try {
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                return data;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return "";
    }

}

class Test {
    public static void main(String[] args) {
        Entrada console = new Console();

        //test
        Entrada archivo = new Archivo("data.txt");
        archivo.write("Hi, how are you?");

        archivo.write(console.read());
        String answer = archivo.read();

        archivo.write("I am " + answer + " too.");
        console.write(archivo.read());
    }
}