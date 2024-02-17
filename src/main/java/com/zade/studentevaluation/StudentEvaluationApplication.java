package com.zade.studentevaluation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;import org.springframework.context.annotation.Bean;

@SpringBootApplication()
public class StudentEvaluationApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentEvaluationApplication.class, args);
	}

}


//exclude = {SecurityAutoConfiguration.class }