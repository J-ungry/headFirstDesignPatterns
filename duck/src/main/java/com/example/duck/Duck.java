package com.example.duck;

import com.example.duck.fly.FlyBehavior;
import com.example.duck.quack.QuackBehavior;

public abstract class Duck {

    // 나는 행동
    FlyBehavior flyBehavior;

    // 꽥꽥 행동
    QuackBehavior quackBehavior;

    public Duck() {}

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("모든 오리는 물에 뜹니다 , 가짜 오리도 뜨죠");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
