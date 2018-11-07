public class Singleton {
    private static Singleton singleton = new Singleton();	//필드값 변경 막기 위해 접근제한자 붙여줌

    private Singleton() {}	//외부에서 생성자 호출 막기 위해 private 접근 제한자 붙여줌

    static Singleton getInstance() {
        return singleton;	//자신의 객체 리턴해준다
    }
}
