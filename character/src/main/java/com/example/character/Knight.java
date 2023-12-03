package com.example.character;

public class Knight extends Character{
    // 생성자 안만들면 컴파일러가 알아서 기본 생성자 만들어줌 개꿀 ~
    @Override
    public void fight() {
        System.out.println("기사가 싸우지롱 !");
    }
}
