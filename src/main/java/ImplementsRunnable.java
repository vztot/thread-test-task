public class ImplementsRunnable implements Runnable {

    private Incrementer incrementer;

    public ImplementsRunnable(Incrementer incrementer) {
        this.incrementer = incrementer;
    }

    @Override
    public void run() {
        while (incrementer.getValue() != Main.COUNT_OF_LOOPS) {
            System.out.println(incrementer.increment());
        }
    }
}
