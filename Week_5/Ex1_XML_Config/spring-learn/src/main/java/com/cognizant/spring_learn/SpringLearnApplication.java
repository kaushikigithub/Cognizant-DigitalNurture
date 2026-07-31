package com.cognizant.spring_learn;

import com.cognizant.spring_learn.model.Country;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringLearnApplication implements CommandLineRunner {

	private static final Logger LOGGER =
			LoggerFactory.getLogger(SpringLearnApplication.class);

	public void run(String... args) throws Exception {
		//displayDate(); //exercise1
		displayCountry(); // exrecise2
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
	}

	public void displayDate() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("dateFormat",SimpleDateFormat.class);

		Date date = format.parse("31/12/2026");
		System.out.println(date);
		LOGGER.info("Formatted Date : {}", date);
	}

	public void displayCountry() throws Exception{
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

		Country country1 = context.getBean("country", Country.class);
		Country country2 = context.getBean("country",Country.class);

		System.out.println(country1);
		System.out.println(country2);
		System.out.println(country1 == country2);
		//without configuring prototype in country.xml it will give yes because default score of bean is singleton so it will return one object everytime.
		//after adding scope = prototype in country.xml it will give false bacause prototype scope of beam will create a new object everytime then return it.
	}

}
