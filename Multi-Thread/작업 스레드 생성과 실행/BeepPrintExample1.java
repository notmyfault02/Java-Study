import java.awt.*;

//메인 스레드만 이용한 경우
//메인 스레드는 비프음 모두 발생 후 프린팅 시작
public class BeepPrintExample1 {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit(); //Toolkit 객체 얻기
        for (int i=0;i<5;i++) {
            toolkit.beep(); //비프음 발생
            try { Thread.sleep(500); } catch (Exception e) {} //0.5초에 한번씩
        }
        for(int i=0;i<5;i++) {
            System.out.println("띵");
            try {Thread.sleep(500); } catch(Exception e) {} //0.5초에 한번씩
        }
    }
}