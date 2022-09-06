package com.theking.mysql.service.impl;

import com.theking.mysql.entity.TestDTO;
import com.theking.mysql.mapper.TestMapper;
import com.theking.mysql.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author TheKing
 * @version 1.0
 * @className TestServicerImpl
 * @description
 * @date 2022/9/6 9:46
 */
@Service
public class TestServiceImpl implements TestService {

    private final TestMapper testMapper;

    @Autowired
    public TestServiceImpl(TestMapper testMapper){
        this.testMapper = testMapper;
    }

    public List<TestDTO> getTest(){
        return testMapper.getTest();
    };
}
