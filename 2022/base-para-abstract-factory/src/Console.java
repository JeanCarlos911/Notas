import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console implements Entrada {
    public void write(String string) {
        System.out.println(string);
    }

    public String read() {
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Reading data using readLine
        String string = null;
        try {
            string = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return string;
    }
}

class ConsoleTest {
    public static void main(String[] args) {
        Entrada console = new Console();
        console.write("Hi, how are you?");
        String answer = console.read();
        console.write("I am " + answer + " too.");
    }
}