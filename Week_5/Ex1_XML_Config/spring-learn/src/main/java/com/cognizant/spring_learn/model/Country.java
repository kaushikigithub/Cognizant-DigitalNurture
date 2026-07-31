package com.cognizant.spring_learn.model;

import java.util.List;
import java.util.logging.Logger;

public class Country {
    private String code;
    private String name;
    List<String> states;

    Country() {
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStates(List<String> states) {
        this.states = states;
    }

    public List<String> getStates() {
        return states;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", states=" + states +
                '}';
    }
}
