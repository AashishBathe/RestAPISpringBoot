package com.aashish.rest.webservices.restful_web_services.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

    @GetMapping("/v1/person")
    public PersonV1 getFirstVersion() {
        return new PersonV1("Aashish B");
    }

    @GetMapping("/v2/person")
    public PersonV2 getSecondVersion() {
        return new PersonV2(new Name("Aashish", "B"));
    }

    @GetMapping(path="/person", params="version=1")
    public PersonV1 getFirstVersionRequestParameter() {
        return new PersonV1("Aashish B");
    }

    @GetMapping(path="/person", params="version=2")
    public PersonV2 getSecondVersionRequestParameter() {
        return new PersonV2(new Name("Aashish", "B"));
    }

    @GetMapping(path="/person/header", headers = "X-API-VERSION=1")
    public PersonV1 getFirstVersionHeaders() {
        return new PersonV1("Aashish B");
    }

    @GetMapping(path="/person/header", headers = "X-API-VERSION=2")
    public PersonV2 getSecondVersionHeaders() {
        return new PersonV2(new Name("Aashish", "B"));
    }
}
