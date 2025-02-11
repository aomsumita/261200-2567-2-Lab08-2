public class Main {
    public static void main(String[] args) {
        TurtleThread cakeThread = new TurtleThread(0);
        TurtleThread candleThread = new TurtleThread(1);
        TurtleThread balloonThread = new TurtleThread(2);

        cakeThread.start();
        candleThread.start();
        balloonThread.start();
    }
}
