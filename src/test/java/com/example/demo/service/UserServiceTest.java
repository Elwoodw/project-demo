package com.example.demo.service;

import com.example.demo.DemoApplication;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Demo 用于参考
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DemoApplication.class})
class UserServiceTest {
    @Autowired
    private UserService userService;


}