package com.in28minutes.springboot.leamspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyConfigurationController {

    @Autowired CurrencyServiceConfiguration currencyServiceConfiguration;

    @RequestMapping("/currency-configuration")
    public CurrencyServiceConfiguration retrieveAllCourse() {
        return currencyServiceConfiguration;
    }
}
