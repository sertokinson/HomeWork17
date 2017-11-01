package com.sbt.javaschool;

public class Tractor {
    private Position position = new Position(0, 0);
     Orientation orientation = Orientation.NORTH;

    public void move(String command) {
        if (command.equals("F"))
            moveForwards();
        if (command.equals("I"))
            turnClockwise();
        }

    private void moveForwards() {
        position = orientation.move(position);
    }

    private void turnClockwise() {
        orientation = orientation.turn();
    }

    public int getPositionX() {
        return position.getX();
    }

    public int getPositionY() {
        return position.getY();
    }

    public Orientation getOrientation() {
        return orientation;
    }

}