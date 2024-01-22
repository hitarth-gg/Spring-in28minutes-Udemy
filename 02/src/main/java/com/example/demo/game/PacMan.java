package com.example.demo.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacMan implements GameConsole {
    public void up() {
        System.out.println("PacMan up");
    }
    public void down() {
        System.out.println("PacMan down");
    }
    public void left() {
        System.out.println("PacMan left");
    }
    public void right() {
        System.out.println("PacMan right");
    }
}
