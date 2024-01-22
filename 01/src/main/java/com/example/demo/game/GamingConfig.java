package com.example.demo.game;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfig {

    @Bean
    public GameConsole game() {
        var game = new PacMan();
        return game;
    }

    @Bean
    public GameRunner gameRunner (GameConsole game /*this would be passed as a parameter*/) {
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
//    var game = new PacMan();
//    var runner = new GameRunner(game);
//    runner.run();
}
