package com.example.duck.quack;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("조용 조용");
    }
}
