package com.example.duck;

import com.example.duck.fly.FlyNoWay;
import com.example.duck.quack.Quack;

public class ModelDuck extends Duck{

    public ModelDuck() {}
    @Override
    public void display() {
        System.out.println("나는야 모형 오리 !!!!");
    }
}
