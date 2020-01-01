package com.te7.model.wallObjects.chests;

import com.te7.model.items.Key;
import com.te7.model.wallObjects.Locked;
import lombok.Getter;
import lombok.Setter;

public class LockedChest extends Chest implements Locked {
  @Setter
  @Getter
  private boolean locked;
  @Setter
  @Getter
  private Key key;

  public LockedChest() {
    this.locked = true;
  }

  @Override
  public boolean isLocked() {
    return locked;
  }

  @Override
  public String getKeyName() {
    return key.getName();
  }
}
