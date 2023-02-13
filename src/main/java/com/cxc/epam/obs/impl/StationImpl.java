package com.cxc.epam.obs.impl;

import com.cxc.epam.entity.WeatherEntity;
import com.cxc.epam.obs.Observer;

import java.util.Objects;

public class StationImpl implements Observer {

    private long id;

    /**
     * 天气实例
     */
    private WeatherEntity weatherEntity;

    @Override
    public void update(WeatherEntity weather) {
        this.weatherEntity = weather;
        display();
    }

    @Override
    public void display() {
        System.out.println("id: " + id + ", " + weatherEntity.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StationImpl that = (StationImpl) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
