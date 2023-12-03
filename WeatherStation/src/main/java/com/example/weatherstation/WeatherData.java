package com.example.weatherstation;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private List<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        // 옵저버 추가하기
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        // 옵저버 제거하기
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
//            o.update(temp,humidity,pressure);
            o.update();
        }
    }

    // 새로운 정보 들어오면 옵저버에 update 쳐주기
    public void measurementChanged() {
        notifyObservers();
    }

    public void setMeasurement(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged(); // 정보가 변경됨을 알려주기
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
