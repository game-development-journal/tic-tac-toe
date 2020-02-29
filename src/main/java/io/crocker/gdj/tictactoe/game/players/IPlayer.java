package io.crocker.gdj.tictactoe.game.players;

import io.crocker.gdj.tictactoe.game.SquareState;

public interface IPlayer
{
    public SquareState[] move(SquareState[] state, SquareState piece);
}
