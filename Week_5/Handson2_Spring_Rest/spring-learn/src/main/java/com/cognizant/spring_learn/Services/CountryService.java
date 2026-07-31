package com.cognizant.spring_learn.Services;

import com.cognizant.spring_learn.exception.CountryNotFoundException;
import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.model.CountryList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
    ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

    public Country getCountry(String code) {
        CountryList list = context.getBean("countryList", CountryList.class);
        for(Country country : list.getCountryList()) {
            if(country.getCode().equals(code)) {
                return country;
            }
        }

        throw new CountryNotFoundException();
    }
}
