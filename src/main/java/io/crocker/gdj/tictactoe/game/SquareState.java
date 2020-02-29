package io.crocker.gdj.tictactoe.game;

public enum SquareState
{
    EMPTY(" "),
    X("X"),
    O("O");

    private String text;

    SquareState(String text)
    {
        this.text = text;
    }

    @Override
    public String toString()
    {
        return this.text;
    }
}
