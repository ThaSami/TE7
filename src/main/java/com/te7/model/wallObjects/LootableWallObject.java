package com.te7.model.wallObjects;

import com.te7.model.items.Item;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public abstract class LootableWallObject extends WallObject implements Lootable {
  @Getter
  private List<Item> loot;

  public void addLoot(Item loot) {
    this.loot.add(loot);
  }
}
