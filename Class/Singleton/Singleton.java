public class Singleton {
    private static Singleton singleton = new Singleton();	//�ʵ尪 ���� ���� ���� ���������� �ٿ���

    private Singleton() {}	//�ܺο��� ������ ȣ�� ���� ���� private ���� ������ �ٿ���

    static Singleton getInstance() {
        return singleton;	//�ڽ��� ��ü �������ش�
    }
}
