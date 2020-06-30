public class ExtendsThread extends Thread {
    private Incrementer incrementer;

    public ExtendsThread(Incrementer incrementer) {
        this.incrementer = incrementer;
    }

    public void run() {
        while (incrementer.getValue() != Main.COUNT_OF_LOOPS) {
            System.out.println(incrementer.increment());
        }
    }
}
