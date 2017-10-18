package com.sbt.javaschool;

public class Tractor {

    int[] position = new int[]{0, 0};
    int[] field = new int[]{5, 5};
    Orientation orientation = Orientation.NORTH;

    public void move(String command) {
        if (command == "F") {
            moveForwards();
        } else if (command == "T") {
            turnClockwise();
        }
    }

    private void moveForwards() {
        switch (orientation) {
            case NORTH:
                position[1]+=1;
                break;
            case EAST:
                position[0]+=1;
                break;
            case WEST:
                position[0]-=1;
                break;
            case SOUTH:
                position[1]-=1;
        }
        if (position[0] > field[0] || position[1] > field[1]) {
            throw new TractorInDitchException();
        }
    }

    private void turnClockwise() {
        switch (orientation) {
            case NORTH:
                orientation = Orientation.EAST;
                break;
            case EAST:
                orientation = Orientation.SOUTH;
                break;
            case WEST:
                orientation = Orientation.NORTH;
                break;
            case SOUTH:
                orientation = Orientation.WEST;
        }
    }

    public int getPositionX() {
        return position[0];
    }

    public int getPositionY() {
        return position[1];
    }

    public Orientation getOrientation() {
        return orientation;
    }

}