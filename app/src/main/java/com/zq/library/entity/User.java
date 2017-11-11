package com.zq.library.entity;

/**
 * Created by steven on 2017/11/11 0011.
 */

public class User {

    private String name ;
    private String age ;
    private boolean isMale ;

    public User(String name, String age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }
}
