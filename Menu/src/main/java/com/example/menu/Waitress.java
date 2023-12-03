package com.example.menu;

public class Waitress {
    DinnerMenu dinerMenu; //기본 생성자
    PancakeHouseMenu pancakeHouseMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu,DinnerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    // 메뉴를 출력
    public void printMenu() {
        Iterator dinerIterator = dinerMenu.createIterator(); // 이터레이터 생성
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();

        System.out.println("/n Breakfast Menu");
        printMenu(pancakeIterator);
        System.out.println("/n Lunch Menu");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getPrice());

        }
    }
}
