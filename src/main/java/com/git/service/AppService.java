package com.git.service;

import com.git.contoller.AppRepository;
import org.springframework.stereotype.Service;

@Service
public class AppService {
    //добавить изменение
    private AppRepository appRepository;

    public String hello() {
        return "hello";
    }
    //from 4 commit

    //изменение не добавлять
    public AppRepository getAppRepository() {
        return appRepository;
    }
//fix-> master


    //fix1
    //fix1 -2
}