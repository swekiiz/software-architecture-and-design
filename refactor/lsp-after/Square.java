package com.solid.lsp;

public class Square implements ISquare {
    private int side;

    Square() {
    }

    Square(int side) {
        this.setSide(side);
    }

    public int getSide() {
        return width;
    }

    public void setSide(int side) {
        this.width = width;
    }

}
