package Generic;

//제네릭 타입

public class Box<T> {
    private T t;
    public T get() {return t;}
    public void set(Object object) {this.t = t;}
}
