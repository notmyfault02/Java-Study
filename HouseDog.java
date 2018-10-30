package com.notmyfault02;

public class HouseDog extends Dog {
    //생성자 규칙
    //1. 클래스명과 메소드명이 동일하다
    //2. 리턴타입을 정의하지 않는다
    public HouseDog(String name) {
        this.setName(name);
    }
    //생성자도 오버로딩 가능
    public HouseDog(int type) {
        if (type == 1) {
            this.setName("yourkshire");
        } else if (type == 2) {
            this.setName("bulldog");
        }
    }

    //Method Overriding(메소드 덮어쓰기)
    //부모클래스의 메소드를 자식클래스가 동일한 형태로 또다시 구현하는 행위
    public void sleep() {
        System.out.println(this.name+" zzz in house");
    }
    //입력항목이 다른 경우 동일한 이름의 메소드를 만들 수 있다
    //method overloading(메소드 오버로딩)
    public void sleep(int hour) {
        System.out.println(this.name+" zzz in house for " + hour + " hours");
    }

    public static void main(String[] args) {
        HouseDog happy = new HouseDog("happy");
        HouseDog yorkshire = new HouseDog(1);
        System.out.println(happy.name);
        System.out.println(yorkshire.name);
    }
}