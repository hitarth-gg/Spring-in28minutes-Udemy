package com.example.demo.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("pacman2Qualifier")
public class PacMan2 implements GameConsole {
    public void up() {
        System.out.println("PacMan2 up 2");
    }
    public void down() {
        System.out.println("PacMan2 down 2");
    }
    public void left() {
        System.out.println("PacMan2 left 2");
    }
    public void right() {
        System.out.println("PacMan2 right 2");
    }
}
