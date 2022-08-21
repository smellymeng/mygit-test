package com.smellymeng.api.domain;

import java.io.Serializable;

public class Bird implements Serializable {
    private static final long serialVersionUID = -8136018703332610342L;

    private String gender;
    private String name;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bird(String gender, String name) {
        this.gender = gender;
        this.name = name;
    }

    public Bird() {
    }

    @Override
    public String toString() {
        return "Bird{" +
                "gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
