package io.crocker.gdj.tictactoe;

import io.crocker.gdj.tictactoe.game.TicTacToe;
import io.crocker.gdj.tictactoe.game.players.HumanPlayer;

public class Runner
{
    public static void main(String[] args)
    {
        TicTacToe game = new TicTacToe(new HumanPlayer(), new HumanPlayer());

        while (true)
        {
            game.drawGrid();
            game.queryMove();
        }

    }
}
