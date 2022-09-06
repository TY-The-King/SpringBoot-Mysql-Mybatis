package com.theking.mysql.mapper;

import com.theking.mysql.entity.TestDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author TheKing
 */
@Mapper
public interface TestMapper {
    /**
     * get user_power table data
     * @author TheKing
     * @date 2022/9/6 9:51
     * @return java.util.List<com.theking.mysql.entity.TestDTO>
     */
    List<TestDTO> getTest();
}
