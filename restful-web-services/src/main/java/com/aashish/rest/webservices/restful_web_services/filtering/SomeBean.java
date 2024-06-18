package com.aashish.rest.webservices.restful_web_services.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties("val1")
@JsonFilter("SomeBeanFilter")
public class SomeBean {
    private String val1;
    private String val2;
//    @JsonIgnore
    private String pass;

    public String getVal1() {
        return val1;
    }

    public void setVal1(String val1) {
        this.val1 = val1;
    }

    public String getVal2() {
        return val2;
    }

    public void setVal2(String val2) {
        this.val2 = val2;
    }

    public String getpass() {
        return pass;
    }

    public void setpass(String pass) {
        this.pass = pass;
    }



    public SomeBean(String val1, String val2, String pass) {
        this.val1 = val1;
        this.val2 = val2;
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "SomeBean{" +
                "val1='" + val1 + '\'' +
                ", val2='" + val2 + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
