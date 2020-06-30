public class Incrementer {
    private int i = 0;

    public synchronized Incrementer increment() {
        i++;
        return this;
    }

    public synchronized int getValue() {
        return i;
    }

    @Override
    public synchronized String toString() {
        return Thread.currentThread().getName() + " value = " + i;
    }
}
