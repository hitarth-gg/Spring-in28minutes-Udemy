package com.example.demo.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo.game")
//@SpringBootApplication
public class App03GamingSpringBeans {

//	@Bean
//	public GameConsole game() {
//		var game = new PacMan();
//		return game;
//	}

//	@Bean
//	public GameRunner gameRunner(GameConsole game /*this would be passed as a parameter*/) {
//		var gameRunner = new GameRunner(game);
//		return gameRunner;
//	}

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class);
		context.getBean(GameConsole.class).up();
		var runner = context.getBean(GameRunner.class);
		runner.run();

	}

}
