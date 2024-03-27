package io_stream.serial;

import java.io.Serializable;

public class Person implements Serializable {

    // serialVersionUID: 직렬화하여 주고 받을 해당 클래스의 버전
    // 객체를 보낼쪽과 받을 쪽의 명시된 클래스의 내용이 다를 경우를 대비
    // 직접 지정하지 않으면 자동으로 생성

    private static final long serialVersionUID = 1;
    private String name;
    private int age;
    private double height;

    private boolean married;

    // 직렬화에세 제외하고 싶은 민감 정보
    // transient 키워드를 통해서 제외됨
    transient private double weight;


    // 직렬화에 내부 객체 타입이 있으면 해당 객체도 Serializable 를 구현해야 한다.
    private  Career career;

    public Person(String name, int age, double height, boolean married, double weight, Career career) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;
        this.weight = weight;
        this.career = career;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", married=" + married +
                ", weight=" + weight +
                ", career=" + career +
                '}';
    }
}
