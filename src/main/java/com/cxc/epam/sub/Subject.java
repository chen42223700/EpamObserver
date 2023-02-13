package com.cxc.epam.sub;

import com.cxc.epam.obs.Observer;

public interface Subject {

    /**
     * 注册观察者
     * @param observer
     */
    void registObserver(Observer observer);

    /**
     * 注销观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObserver();
}
