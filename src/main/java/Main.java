public class Main {
    public static final int COUNT_OF_LOOPS = 100;

    public static void main(String[] args) {
        new Thread(() -> {
            int i = 0;
            while (i != COUNT_OF_LOOPS) {
                i++;
            }
            System.out.println("implements Thread won!");
            System.exit(0);
        }).start();

        new ThreadClass().start();
    }
}
