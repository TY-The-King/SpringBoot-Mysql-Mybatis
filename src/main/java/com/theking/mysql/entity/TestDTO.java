package com.theking.mysql.entity;

/**
 * @author TheKing
 * @version 1.0
 * @className TestDTO
 * @description
 * @date 2022/9/6 9:47
 */
public class TestDTO {

    private Integer id;

    private String power;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String toString(){
        return "id = "+id+" power = "+power;
    }
}
