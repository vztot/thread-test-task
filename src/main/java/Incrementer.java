public class Incrementer {
    private int value = 0;

    public synchronized Incrementer increment() {
        value++;
        return this;
    }

    public synchronized int getValue() {
        return value;
    }

    @Override
    public synchronized String toString() {
        return Thread.currentThread().getName() + " value = " + value;
    }
}
