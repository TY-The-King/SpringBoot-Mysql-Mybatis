package com.theking.mysql.service;

import com.theking.mysql.entity.TestDTO;

import java.util.List;

/**
 * @author TheKing
 * @version 1.0
 * @className TestService
 * @description
 * @date 2022/9/6 9:46
 */
public interface TestService {
    /**
     * get user_power table data
     * @author TheKing
     * @date 2022/9/6 9:56
     * @return java.util.List<com.theking.mysql.entity.TestDTO>
     */
    List<TestDTO> getTest();
}
