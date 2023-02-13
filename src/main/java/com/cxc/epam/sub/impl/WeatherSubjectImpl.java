package com.cxc.epam.sub.impl;

import com.cxc.epam.entity.WeatherEntity;
import com.cxc.epam.obs.Observer;
import com.cxc.epam.sub.Subject;
import com.cxc.epam.sub.WeatherSubject;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class WeatherSubjectImpl implements Subject, WeatherSubject {

    /**
     * 观察者容器
     */
    private Set<Observer> observers = new HashSet<>();

    /**
     * 天气
     */
    private WeatherEntity weatherEntity = new WeatherEntity(0, 0, 0);

    @Override
    public void registObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
            observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.stream().forEach(observer -> observer.update(weatherEntity));
    }


    @Override
    public void setWeatherData(WeatherEntity weather) {
        this.weatherEntity.setTemperature(weather.getTemperature());
        this.weatherEntity.setHumidity(weather.getHumidity());
        this.weatherEntity.setPressure(weather.getPressure());
    }
}
