package com.example.hackncrawl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hackncrawl.MainMenu.MainMenu;

@SpringBootApplication
@RestController
public class HacknCrawlApplication {

	public static void main(String[] args) {
		SpringApplication.run(HacknCrawlApplication.class, args);
	}
	@GetMapping("/Test")
	public String Test(){
		Styles style = new Styles();

		MainMenu menu = new MainMenu();
		return style.getStyles() + menu.createMenu();
	}

}
