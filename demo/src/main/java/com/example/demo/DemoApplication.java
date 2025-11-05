package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hola eveee");

	}

	@RequestMapping("/")
	public String home(){
		System.out.println("gusbai eve");
		return "Bienvenidoo";
	}

	@RequestMapping("/hola")
	public String hola(){
		System.out.println("ola");
		return "ola";
	}

	@RequestMapping("/adios")
	public String adios(){
		System.out.println("adios");
		return "chao chao";
	}

	@RequestMapping("/html")
	public String html(){
		String html = "<html><body><h1>Hola eve</h1><h2>Te quiero muchote</h2></body></html>";
		return html;
	}

}
	
