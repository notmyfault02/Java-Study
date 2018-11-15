import java.awt.*;

//비프음을 들려주는 작업 정의
public class BeepTask implements Runnable {
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit(); //BeepPrintExample1의 비프음 들려주는 코드
        for (int i=0;i<5;i++) {
            toolkit.beep();
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}
