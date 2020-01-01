package com.te7.model.items;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Key extends Item implements TradeAble {
  @Getter
  private String name;
  @Getter
  private double Price;
}
