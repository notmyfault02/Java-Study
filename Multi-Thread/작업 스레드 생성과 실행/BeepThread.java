import javax.tools.Tool;
import java.awt.*;

//비프음 들려주는 스레드
public class BeepThread extends Thread{
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i=0;i<5;i++) {
            toolkit.beep();
            try { Thread.sleep(500); } catch(Exception e) {}
        }
    }
}
