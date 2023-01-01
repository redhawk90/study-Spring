package com.example.ex00.dependencyTest;

import com.example.ex00.qualifier.Computer;
import com.example.ex00.qualifier.Resturant;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class QualifierTest {
//    @Autowired @Qualifier("desktop")
//    private Computer desktop;
//    @Autowired @Qualifier("laptop")
//    private Computer laptop;
//    @Autowired
//    private Computer computer;

    @Autowired @Qualifier("outback")
    private Resturant outback;
    @Autowired @Qualifier("vips")
    private Resturant vips;
    @Autowired
    private Resturant resturant;

    @Test
    public void qualifierTest(){
//        log.info(desktop + "");
//        log.info(laptop + "");
//        log.info(computer + "");
        log.info(outback + "");
        log.info(vips + "");
        log.info(resturant + "");
    }
}
