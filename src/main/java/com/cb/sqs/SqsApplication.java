package com.cb.sqs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.messaging.config.annotation.EnableSqs;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cb.sqs")
@EnableSqs
public class SqsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqsApplication.class, args);
	}

}
