public class StopWatch {

    private long startTime;
    private long endTime;

    // Konstruktør uten parametere: start med en gang
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    // Start på nytt
    public void start() {
        startTime = System.currentTimeMillis();
    }

    // Stopper tiden
    public void stop() {
        endTime = System.currentTimeMillis();
    }

    // Returnerer tiden i millisekunder
    public long getElapsedTime() {
        return endTime - startTime;
    }

    // Gettere
    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
}
