package com.example.duck.fly;

public class FlyRocketPowered implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("로켓의 추진력으로 날아가지롱 !");
    }
}
