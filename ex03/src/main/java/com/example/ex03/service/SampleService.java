package com.example.ex03.service;

import com.example.ex03.aspect.Plus10;
import org.springframework.stereotype.Service;

import static java.lang.Integer.*;

@Service
public class SampleService {

    @Plus10
    public Integer doAdd(String str1, String str2) throws Exception{
        return parseInt(str1) + parseInt(str2);
    }
}
