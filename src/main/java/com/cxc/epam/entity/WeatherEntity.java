package com.cxc.epam.entity;

import java.io.Serializable;

public class WeatherEntity implements Serializable {

    private static final long serialVersionUID = 2912262552904364327L;

    /**
     * 温度
     */
    private int temperature;

    /**
     * 湿度
     */
    private int humidity;

    /**
     * 压强
     */
    private float pressure;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public WeatherEntity() {
    }

    public WeatherEntity(int temperature, int humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return  "temperature='" + temperature + '\'' +
                ", humidity='" + humidity + '\'' +
                ", pressure='" + pressure;
    }
}
