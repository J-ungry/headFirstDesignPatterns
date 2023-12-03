package com.example.duck;

import com.example.duck.fly.FlyWithWings;
import com.example.duck.quack.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("물오리물오리 \n display 는 모든 오리에게 존재해야함 !!!!");
    }
}
