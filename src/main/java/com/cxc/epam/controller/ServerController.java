package com.cxc.epam.controller;

import com.cxc.epam.entity.WeatherEntity;
import com.cxc.epam.sub.impl.WeatherSubjectImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server")
public class ServerController {

    @Autowired
    private WeatherSubjectImpl weatherSubjectImpl;

    /**
     * 修改天气数据
     * @param weather
     */
    @PostMapping("/change")
    public void setWeather(@RequestBody WeatherEntity weather){
        weatherSubjectImpl.setWeatherData(weather);
    }
}
