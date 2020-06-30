public class ThreadClass extends Thread {
    public void run() {
        int i = 0;
        while (i != Main.COUNT_OF_LOOPS) {
            i++;
        }
        System.out.println("extends Thread won!");
        System.exit(0);
    }
}
