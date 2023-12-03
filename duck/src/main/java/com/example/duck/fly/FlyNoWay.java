package com.example.duck.fly;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("못날지롱 ㅜㅜ");
    }
}
