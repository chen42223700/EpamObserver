package com.cxc.epam.obs;

import com.cxc.epam.entity.WeatherEntity;

/**
 * 观察者
 */
public interface Observer {

    /**
     * 接受通知的方法
     * @param weather
     */
    void update(WeatherEntity weather);

    /**
     * 展示
     */
    void display();
}
