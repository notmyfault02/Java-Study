import java.awt.*;

// 메인 스레드와 작업 스레드가 동시에 실행
// BeepTask가 작업 스레드
public class BeepPrintExample2 {
    public static void main(String[] args) {
        Runnable beepTask = new BeepTask();
        Thread thread = new Thread(beepTask);
        thread.start();

        for(int i=0;i<5;i++) {
            System.out.println("띵");
            try {Thread.sleep(500); } catch(Exception e) {}
        }
    }
}
