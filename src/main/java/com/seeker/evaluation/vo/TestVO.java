package com.seeker.evaluation.vo;

import javax.validation.constraints.NotNull;

public class TestVO {

    @NotNull
    private String keyOne;

    @NotNull
    private String keyTwo;

    public TestVO() {
    }

    public TestVO(String keyOne, String keyTwo) {
        this.keyOne = keyOne;
        this.keyTwo = keyTwo;
    }

    public String getKeyOne() {
        return keyOne;
    }

    public void setKeyOne(String keyOne) {
        this.keyOne = keyOne;
    }

    public String getKeyTwo() {
        return keyTwo;
    }

    public void setKeyTwo(String keyTwo) {
        this.keyTwo = keyTwo;
    }
}
