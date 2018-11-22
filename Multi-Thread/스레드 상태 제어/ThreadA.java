package 스레드상태제어;

//스레드 실행 양보 예제

public class ThreadA extends Thread{
    public boolean stop = false;
    public boolean work = true;

    public void run() {
        while(!stop) {
            if(work) {
                System.out.println("ThreadA 작업 내용");
            } else {
                Thread.yield();
            }
        }
        System.out.println("ThreadA 종료");
    }
}
