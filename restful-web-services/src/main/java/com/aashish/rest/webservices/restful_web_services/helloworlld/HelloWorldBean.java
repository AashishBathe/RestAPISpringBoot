package com.aashish.rest.webservices.restful_web_services.helloworlld;

public class HelloWorldBean {

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    public String getMessage() {
        return message;
    }

    public HelloWorldBean(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
