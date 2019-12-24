package com.te7.model.room;

import java.util.Objects;

public class Direction {
  public static int NORTH = 0;
  public static int EAST = 1;
  public static int WEST = 2;
  public static int SOUTH = 3;

  private int currentDirection;


  public Direction() {
    currentDirection = NORTH;
  }

  public Direction(int currentDirection) {
    this.currentDirection = currentDirection;
  }

  public void goLeft() {
    this.currentDirection = (this.currentDirection + 3) % 4;
  }


  public void goRight() {
      this.currentDirection = (this.currentDirection + 1) % 4;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Direction direction = (Direction) o;
    return currentDirection == direction.currentDirection;
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentDirection);
  }
}
