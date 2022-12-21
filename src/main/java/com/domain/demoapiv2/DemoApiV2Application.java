package com.domain.demoapiv2;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApiV2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoApiV2Application.class, args);
	}

	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
