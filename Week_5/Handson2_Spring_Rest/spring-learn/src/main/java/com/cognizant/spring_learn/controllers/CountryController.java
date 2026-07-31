package com.cognizant.spring_learn.controllers;

import com.cognizant.spring_learn.Services.CountryService;
import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.model.CountryList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    CountryService countryService;
    ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

    @GetMapping(path = "/country")
    public Country getCountryIndia() {
        return context.getBean("india", Country.class);
    }

    @GetMapping("/countries")

    public List<Country> getAllCountries() {
        CountryList list = context.getBean("countryList", CountryList.class);
        return list.getCountryList();
    }

    @GetMapping(path = "/country/{code}")
    public Country getCountry(@PathVariable String code) {
        return countryService.getCountry(code);
    }
}
