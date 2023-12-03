package com.example.weatherstation.display;

import com.example.weatherstation.DisplayElement;
import com.example.weatherstation.Observer;
import com.example.weatherstation.WeatherData;

// 옵저버에 등록 + 디스플레이로 사용하기
public class CurrentConditionDisplay implements Observer, DisplayElement {
    // temp, humidity 를 출력하는 display, 근데 만약 새로운 요소가 추가되면 전체 소스를 다 바꿔줘야 하는거 아닌가
    private float temp;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this); // 옵저버로 등록하기
    }
    @Override
    public void display() {
        System.out.println("현재 온도 : "+temp + "\n현재 습도 : "+humidity);
    }

//    @Override
//    public void update(float temp, float humidity, float pressure) {
//        this.temp = temp;
//        this.humidity = humidity;
//        display();
//    }
    @Override
    public void update() {
        this.temp = weatherData.getTemp();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
