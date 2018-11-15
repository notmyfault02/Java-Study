public class ThreadB extends Thread{ //이름 설정을 안해줬으므로 스레드 이름은 자동적으로 "Thread-n"이 된다
    public void run() {
        for(int i=0;i<2;i++) {
            System.out.println(getName() + "가 출력한 내용");
        }
    }
}
