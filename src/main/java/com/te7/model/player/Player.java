package com.te7.model.player;

import com.te7.model.items.Gold;
import com.te7.model.items.Item;

import java.util.List;

public class Player implements Collector {
  private List<Item> items;
  private Gold goldAmount;

  @Override
  public void collect(Item item) {
  }
}
