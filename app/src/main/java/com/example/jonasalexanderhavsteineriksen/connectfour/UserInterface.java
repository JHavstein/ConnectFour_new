package com.example.jonasalexanderhavsteineriksen.connectfour;

public interface UserInterface {

    /** start the game */
    void startGame(Game game);

    /** show a final result and exit */
    void showResult(String message);

}
