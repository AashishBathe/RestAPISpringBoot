package com.aashish.rest.webservices.restful_web_services.filtering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {

    @GetMapping("/filtering")
    public MappingJacksonValue filtering() {
        SomeBean someBean = new SomeBean("val1", "val2", "Pass");
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(someBean);
        commonFiltering("pass", mappingJacksonValue);
        return mappingJacksonValue;
    }

    @GetMapping("/filtering-list")
    public MappingJacksonValue filteringList() {
        List<SomeBean> list = Arrays.asList(new SomeBean("val1", "val2", "Pass")
                , new SomeBean("val4", "val5", "Pass2"));
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(list);
        commonFiltering("val2", mappingJacksonValue);
        return mappingJacksonValue;
    }

    private static void commonFiltering(String val2, MappingJacksonValue mappingJacksonValue) {
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter
                .filterOutAllExcept("val1", val2);
        FilterProvider filters = new SimpleFilterProvider()
                .addFilter("SomeBeanFilter", filter);
        mappingJacksonValue.setFilters(filters);
    }
}
