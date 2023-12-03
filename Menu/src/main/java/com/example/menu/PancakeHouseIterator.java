package com.example.menu;

import java.util.ArrayList;
import java.util.Objects;

public class PancakeHouseIterator implements Iterator{

    ArrayList<MenuItem> items;
    int position = 0;

    public PancakeHouseIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }
    @Override
    public boolean hasNext() {
        if (position >= items.size() || Objects.isNull(items.get(position))){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position += 1;
        return menuItem;
    }
}
