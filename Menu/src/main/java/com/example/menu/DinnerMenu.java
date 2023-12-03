package com.example.menu;

public class DinnerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public Iterator createIterator() {
        return new DinnerMenuIterator(menuItems);
    }

    public DinnerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("BLT","샌드위치",true,2.99);
        addItem("떡볶이","매워용",false,3.99);
        addItem("스테이크","비싸용",false,13.99);

    }
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("sry, menu is full");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }
}
