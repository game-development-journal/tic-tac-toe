package io.crocker.gdj.tictactoe;

import io.crocker.gdj.tictactoe.game.TicTacToe;
import io.crocker.gdj.tictactoe.game.players.HumanPlayer;
import io.crocker.gdj.tictactoe.game.players.RandomPlayer;

import java.util.Random;

public class Runner
{
    public static void main(String[] args)
    {
        TicTacToe game = new TicTacToe(new RandomPlayer(), new RandomPlayer());

        while (!game.isComplete())
        {
            game.drawGrid();
            game.queryMove();
        }

        game.drawGrid();

    }
}
