package com.example.demo;

import com.example.demo.game.GameConsole;
import com.example.demo.game.GameRunner;
import com.example.demo.game.GamingConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class App03GamingSpringBeans {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(GamingConfig.class);
		context.getBean(GameConsole.class).up();
		var runner = context.getBean(GameRunner.class);
		runner.run();

	}

}
