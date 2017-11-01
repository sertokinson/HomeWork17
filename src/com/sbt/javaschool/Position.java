package com.sbt.javaschool;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    Position changeX(int x) {
        if(this.x==0&&x<0) throw new TractorInDitchException();
        if(this.x<5) return new Position(this.x + x, this.y);
        else throw new TractorInDitchException();
    }

    Position changeY(int y) {
        if(this.y==0&&y<0) throw new TractorInDitchException();
            if (this.y < 5) return new Position(this.x, this.y + y);
        throw new TractorInDitchException();
    }
}
