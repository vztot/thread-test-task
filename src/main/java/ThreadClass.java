public class ThreadClass extends Thread {
    public void run() {
        int i = 0;
        while (i != Main.COUNT_OF_LOOPS) {
            System.out.println(Thread.currentThread().getName() + " value = " + ++i);
        }
    }
}
