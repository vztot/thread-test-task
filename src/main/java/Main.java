import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static final int COUNT_OF_LOOPS = 100;

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream fileOut = new PrintStream("./log.txt");
        System.setOut(fileOut);

        Incrementer incrementer = new Incrementer();
        new ExtendsThread(incrementer).start();
        new Thread(new ImplementsRunnable(incrementer)).start();
    }
}
