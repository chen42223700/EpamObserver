package com.cxc.epam.controller;

import com.cxc.epam.obs.impl.StationImpl;
import com.cxc.epam.sub.impl.WeatherSubjectImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private WeatherSubjectImpl weatherSubjectImpl;

    /**
     * 注册观察者
     * @param station
     */
    @PostMapping("/regist")
    public void regist(@RequestBody StationImpl station){
        weatherSubjectImpl.registObserver(station);
    }
}
