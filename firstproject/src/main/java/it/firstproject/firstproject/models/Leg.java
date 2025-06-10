package it.firstproject.firstproject.models;

import it.firstproject.firstproject.Side;

public class Leg {
    private Side side;

    public Leg(Side side) {
        this.side = side;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }
}
