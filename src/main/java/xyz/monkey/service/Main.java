package xyz.monkey.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mx on 16/1/24.
 */
@SpringBootApplication
public class Main {

	@RequestMapping("/")
	public String index() {
		return "Hello Quartz.";
	}

	public static void main(String args[]) {
		SpringApplication.run(Main.class, args);
	}
}
