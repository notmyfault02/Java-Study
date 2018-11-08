# Getter와 Setter 메소드

## 사용하는 이유
* 객체의 데이터를 외부에서 마음대로 읽고 변경할 경우 객체의 무결성이 깨어질 수 있기 때문이다
> 객체의 무결성: 결점이 없는 성질 
* 외부에서 자동차의 속도를 음수로 변경하면 자동차의 속도가 음수가 되는 대참사가 일어난다. 즉 객체의 무결성이 깨진다
~~~java
myCar.speed = -100;
~~~
* 이러한 문제점을 해결하기 위해 객체 지향 프로그래밍에서는 메소드를 통해서 데이터를 변경하는데 메소드는 매개값을 검증해서 유효한 값만 데이터로 저장할 수 있다.

## Getter Setter 예제
* Setter 메소드는 매개값을 검증해서 유효한 값만 데이터로 저장하는 역할을 한다.
* 자동차의 속도를 setSpeed() 메소드로 변경할 경우 아래와 같은 코드를 작성할 수 있다.
~~~java
void setSpeed(double speed) {
    if(speed<0) {
        this.speed = 0;
        return 0;
    } else {
        this.speed = speed;
    }
}
~~~

* Getter 메소드는 객체 외부에서 객체의 필드값을 사용하기 부적절할 때, 메소드로 필드값을 가공한 후 외부로 전달한다.
* 자동차의 속도를 마일에서 KM단위로 환산해서 외부로 리턴해주는 getSpeed() 메소드를 아래와 같이 작성할 수 있다.
~~~java
double getSpeed() {
    double km = speed*1.6;
    return km;
}
~~~

* 클래스를 선언할 때 가능하다면 필드는 private로 선언해서 외부로부터 보호하고, 필드에 대한 Setter와 Getter 메소드를 작성해서 필드값을 안전하게 변경/사용하는 것이 좋다. 이렇게 말이다
~~~java
private 타입 fieldName; //필드 접근 제한자 private

//Getter
//리턴 타입: 필드타입
//메소드 이름: get+필드이름(첫문자는 대문자로)
//리턴값: 필드값
public 리턴 타입 getFieldName() { 
    return fieldName;
}

//Setter
//리턴 타입: void
//메소드 이름: set+필드이름(첫문자 대문자)
//매개 변수 타입: 필드타입
public void setFieldName(타입 fieldName) {
    this.fieldName = fieldName;
}
~~~
* 필드 타입이 boolean일 경우에는 Getter는 is 로 시작한다


