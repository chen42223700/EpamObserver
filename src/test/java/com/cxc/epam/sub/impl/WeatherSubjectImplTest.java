package com.cxc.epam.sub.impl;

import com.cxc.epam.obs.impl.StationImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class WeatherSubjectImplTest {

    @MockBean
    private WeatherSubjectImpl weatherSubject;

    @Test
    public void testRegistObserver(){
        StationImpl station1 = new StationImpl();
        StationImpl station2 = new StationImpl();
        weatherSubject.registObserver(station1);
        weatherSubject.registObserver(station2);
    }

    @Test
    public void testRemoveObserver(){
        StationImpl station = new StationImpl();
        weatherSubject.registObserver(station);
        weatherSubject.removeObserver(station);
    }

    @Test
    public void testNotifyObserver(){
        StationImpl station = new StationImpl();
        weatherSubject.registObserver(station);
        weatherSubject.notifyObserver();
    }
}
