package com.te7.model.items;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@AllArgsConstructor
public class Gold extends Item {
    @Setter
    @Getter
    @NonNull
    private double amount;
}
