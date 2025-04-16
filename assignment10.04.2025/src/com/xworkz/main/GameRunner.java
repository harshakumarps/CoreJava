package com.xworkz.main;

import com.xworkz.internal.Game;
import com.xworkz.internal.VideoGame;

public class GameRunner {
    public static void main(String[] args) {
        Game genericGame = new Game("Generic", "Unknown");
        genericGame.play();
        System.out.println(genericGame);

        VideoGame rpg = new VideoGame("Fantasy Quest", "RPG", "PC");
        rpg.play();
        rpg.loadSave();
        System.out.println(rpg);

        Game upcastedVideoGame = new VideoGame("Space Adventure", "Simulation", "Console");
        upcastedVideoGame.play();
        System.out.println(upcastedVideoGame);
    }
}