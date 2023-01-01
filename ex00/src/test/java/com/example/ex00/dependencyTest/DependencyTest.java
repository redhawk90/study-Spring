package com.example.ex00.dependencyTest;

import com.example.ex00.dependency.Chef;
import com.example.ex00.dependency.Coding;
import com.example.ex00.dependency.Restaurant;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class DependencyTest {
    @Autowired
    private Coding coding;
    @Autowired
    private Restaurant restaurant;

    @Test
    public void dependencyTest(){
        log.info(coding + "");
        log.info(restaurant + "");

    }
}
