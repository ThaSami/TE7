package com.te7.model.wallObjects.chests;

public class UnlockedChest extends Chest {

  @Override
  public boolean isLocked() {
    return false;
  }
}
