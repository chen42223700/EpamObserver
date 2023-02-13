package com.cxc.epam.obs.impl;

import com.cxc.epam.entity.WeatherEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class StationImplTest {

    @MockBean
    private StationImpl station;

    @Test
    public void testUpdate(){
        WeatherEntity weather = new WeatherEntity(0, 0, 0.0f);
        station.update(weather);
    }

    @Test
    public void testDisplay(){
        WeatherEntity weather = new WeatherEntity(0, 0, 0.0f);
        station.update(weather);
        station.display();
    }
}
