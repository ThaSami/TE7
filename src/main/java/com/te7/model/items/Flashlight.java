package com.te7.model.items;

public class Flashlight extends Item implements TradeAble {

  boolean isOn;

  public Flashlight() {
  }

  @Override
  public double getPrice() {
    return Prices.FLASH_LIGHT;
  }

  public boolean isOn() {
    return this.isOn;
  }

  public void setOn(boolean isOn) {
    this.isOn = isOn;
  }
}
