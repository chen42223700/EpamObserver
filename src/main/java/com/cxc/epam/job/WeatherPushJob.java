package com.cxc.epam.job;

import com.cxc.epam.sub.impl.WeatherSubjectImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class WeatherPushJob {

    @Autowired
    private WeatherSubjectImpl weatherSubjectImpl;

    /**
     * 每分钟推送一次数据给观察者
     */
    @Scheduled(fixedRate = 1000 * 60)
    public void push(){
        weatherSubjectImpl.notifyObserver();
    }
}
