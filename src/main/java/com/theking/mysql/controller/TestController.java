package com.theking.mysql.controller;

import com.theking.mysql.entity.TestDTO;
import com.theking.mysql.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author TheKing
 * @version 1.0
 * @className TestController
 * @description
 * @date 2022/9/6 9:47
 */
@RestController
public class TestController {

    private final TestService testService;

    @Autowired
    public TestController(TestService testService){
        this.testService = testService;
    }

    /**
     * get user_power table data
     * @author TheKing
     * @date 2022/9/6 9:55
     * @return java.util.List<com.theking.mysql.entity.TestDTO>
     */
    @GetMapping("/get")
    public List<TestDTO> getTest(){
        return testService.getTest();
    }
}
