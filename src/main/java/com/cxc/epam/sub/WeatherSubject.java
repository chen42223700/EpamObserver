package com.cxc.epam.sub;

import com.cxc.epam.entity.WeatherEntity;
import com.cxc.epam.obs.Observer;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public interface WeatherSubject {

    /**
     * 修改天气数据
     * @param weather
     */
    void setWeatherData(WeatherEntity weather);
}
