package com.te7.model.room.wall;

import com.te7.model.item.Item;
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
