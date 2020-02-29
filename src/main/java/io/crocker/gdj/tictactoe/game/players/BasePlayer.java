package io.crocker.gdj.tictactoe.game.players;

import io.crocker.gdj.tictactoe.game.SquareState;

public abstract class BasePlayer implements IPlayer
{
    protected int validateInput(String input, final SquareState[] state)
    {
        int index = -1;
        try
        {
            index = Integer.parseInt(input);
        }
        catch(NumberFormatException e) {
            return -1;
        }

        return this.validateInput(index, state);
    }

    protected int validateInput(int input, final SquareState[] state)
    {
        if (input > 9 || input < 1)
        {
            return -1;
        }

        if (!state[input - 1].equals(SquareState.EMPTY))
        {
            return -1;
        }

        return input;
    }
}
