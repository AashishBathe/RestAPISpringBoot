package com.aashish.rest.webservices.restful_web_services.versioning;

public class PersonV1 {
    public String getName() {
        return name;
    }

    private String name;
    public PersonV1(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonV1{" +
                "name='" + name + '\'' +
                '}';
    }
}
