//공유 객체
//synchronized를 추가하며 임계 영역 만들기
public class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    public synchronized void setMemory(int memory) { //계산기 메모리에 값을 저장하는 메소드
        this.memory = memory;   //매개값을 memory 필드에 저장

        try {
            Thread.sleep(2000); //스레드를 2초간 일시 정지시킴
        } catch(InterruptedException e) {}
        System.out.println(Thread.currentThread().getName() + ": " + this.memory);
    }
}
