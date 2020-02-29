package io.crocker.gdj.tictactoe.game;

import io.crocker.gdj.tictactoe.game.players.IPlayer;

public class TicTacToe
{
    public static final int GRID_SIZE = 9;

    public static final SquareState[] ASSIGNED_PIECES = {
            SquareState.X,
            SquareState.O
    };

    public SquareState[] state = new SquareState[GRID_SIZE];

    public IPlayer[] players = new IPlayer[2];

    public int currentPlayer = 0;

    public TicTacToe(IPlayer player1, IPlayer player2)
    {
        for (int i = 0; i < GRID_SIZE; i++)
        {
            this.state[i] = SquareState.EMPTY;
        }

        this.players[0] = player1;
        this.players[1] = player2;
    }

    public void queryMove()
    {
        SquareState[] move = this.players[this.currentPlayer].move(this.state,
                ASSIGNED_PIECES[this.currentPlayer]);

        // TODO validate move

        this.state = move;

        // TODO validate win

        this.currentPlayer = (this.currentPlayer + 1) % 2;
    }

    public void drawGrid()
    {
        final String DIVIDER = "+---+---+---+";

        System.out.println(DIVIDER);

        for (int i = 0; i < GRID_SIZE; i += 3)
        {
            System.out.print("| ");
            System.out.print(this.state[i]);
            System.out.print(" | ");
            System.out.print(this.state[i + 1]);
            System.out.print(" | ");
            System.out.print(this.state[i + 2]);
            System.out.println(" |");

            System.out.println(DIVIDER);
        }
    }
}
