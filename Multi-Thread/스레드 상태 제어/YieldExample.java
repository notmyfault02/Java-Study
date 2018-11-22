package 스레드상태제어;

//실행 중에 우선순위가 동일한 다른 스레드에게 실행을 양보하고 실행 대기 상대가 된다.
//스레드 실행 양보 예제

public class YieldExample {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();

        threadA.start();
        threadB.start();

        try {Thread.sleep(3000);} catch (InterruptedException e) {}
        threadA.work = false;

        try {Thread.sleep(3000);} catch (InterruptedException e) {}
        threadA.work = true;

        try {Thread.sleep(3000);} catch (InterruptedException e) {}
        threadA.stop = true;
        threadB.stop = true;
    }
}
