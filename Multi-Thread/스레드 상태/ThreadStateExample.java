package state;
//실행 클래스

public class ThreadStateExample {
    public static void main(String[] args) {
        StatePrintThread statePrintThread =
                new StatePrintThread(new TargetThread());
        statePrintThread.start();
    }
}
