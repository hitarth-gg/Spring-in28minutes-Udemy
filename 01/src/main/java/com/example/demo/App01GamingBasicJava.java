package com.example.demo;

import com.example.demo.game.GameRunner;
import com.example.demo.game.PacMan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App01GamingBasicJava {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
		var game = new PacMan();
		var runner = new GameRunner(game);
		runner.run();
	}

}
