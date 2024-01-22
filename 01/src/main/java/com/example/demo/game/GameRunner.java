package com.example.demo.game;

public class GameRunner {
    public GameConsole game;

    public GameRunner(GameConsole game) {
        this.game = game;
    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
