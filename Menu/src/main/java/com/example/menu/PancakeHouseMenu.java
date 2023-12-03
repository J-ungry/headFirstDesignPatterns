package com.example.menu;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu {
    ArrayList<MenuItem> menuItems;

    public Iterator createIterator() {
        return new PancakeHouseIterator(menuItems);
    }
    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();

        addItem("계란","맛있당",true,2.99);
        addItem("귤","더 맛있당",true,1.99);
        addItem("식빵","먹고싶당",true,2.99);

    }
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return (ArrayList<MenuItem>) menuItems;
    }
}
