package com.example;

import java.lang.reflect.Method;

//클래스 로더 사용하기
public class ClassLoaderMain {
    public static void main(String[] args) throws Exception {
//        Bus b1 = new Bus();
//        b1.a();

        // a() 메소드를 가지고있는 클래스가 있다,
        //이 클래스 이름이 무엇인지 모르겠다.
        // 나중에 이 클래스 이름을 알려주겠다.
        // a() 메소드를 실행할 수 있도록 코드를 작성해라

        // ClassName에 해당하는 클래스 정보를 CLASSPATH에서 읽어들이고,
        // 그 정보를 clazz가 참조하도록 한다.
        String className ="com.example.Bus";
        Class clazz = Class.forName(className);

        //clazz.getDeclaredMethods() = clazz가 가지고있는 클래스에 대한 메소드들의 여러개의 정보가 리턴됨
        Method[] declaredMethods = clazz.getDeclaredMethods();
        //for each문
        for (Method m : declaredMethods){
            System.out.println(m.getName());
        }

        //Object o = new Bus();
//        String className ="com.example.Bus";
//        Class clazz = Class.forName(className);
        //clazz 정보를 가지고 인스턴스를 만들어라
        Object o = clazz.newInstance();
        Bus b = (Bus) o;
        b.a();

        //SuperCar는 Car를 상속받음
        String className1 ="com.example.SuperCar";
        Class clazz1 = Class.forName(className1);
        //clazz 정보를 가지고 인스턴스를 만들어라
        Object o1 = clazz1.newInstance();
        Car c = (Car) o1;
        c.a();

        //MyHome은 Car를 상속받지 않음
        String className2 ="com.example.MyHome";
        Class clazz2 = Class.forName(className2);
        Object o2 = clazz2.newInstance();

        Method m = clazz2.getDeclaredMethod("a",null); //a()메소드 정보를 가지고 있는 Method를 반환하라
        m.invoke(o2, null); //Object o 가 참조하는 객체의 m메소드를 실행해라.


    }


}


