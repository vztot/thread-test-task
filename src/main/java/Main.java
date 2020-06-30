import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static final int COUNT_OF_LOOPS = 100;

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream fileOut = new PrintStream("./log.txt");
        System.setOut(fileOut);

        new Thread(() -> {
            int i = 0;
            while (i != COUNT_OF_LOOPS) {
                System.out.println(Thread.currentThread().getName() + " value = " + ++i);
            }
        }).start();

        new ThreadClass().start();
    }
}
