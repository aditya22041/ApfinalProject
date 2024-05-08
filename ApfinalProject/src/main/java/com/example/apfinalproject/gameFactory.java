package com.example.apfinalproject;

public class gameFactory {
    public gameAnimation createGame(int themeChoice, int reload) {
        return gameAnimation.getInstance(themeChoice, reload);
    }
}
