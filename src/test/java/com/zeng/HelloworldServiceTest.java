package com.zeng;

import com.zeng.service.HelloworldService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class HelloworldServiceTest {

    @Autowired
    private HelloworldService helloworldService;

    @Test
    public void insertPermission() {
        log.info( helloworldService.sayHello() );

    }
}
