package com.hsw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RisApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(RisApplication.class, args);
	}
}
