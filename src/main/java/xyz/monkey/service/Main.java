package xyz.monkey.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mx on 16/1/24.
 */
@SpringBootApplication
@RestController
@ImportResource("classpath:spring.xml")
public class Main {

	@RequestMapping("/")
	public String index() {
		return "Hello Quartz.";
	}

	public static void main(String args[]) {
		SpringApplication.run(Main.class, args);
	}
}
