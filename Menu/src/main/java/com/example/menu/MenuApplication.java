package com.example.menu;

import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
9장 반복자 패턴과 컴포지트 패턴
1. 반복자 패턴은 iterator 에 의존하게 된다
 */
@SpringBootApplication
public class MenuApplication {

	public static void main(String[] args) {

		DinnerMenu dinerMenu = new DinnerMenu();
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();

		Waitress waitress = new Waitress(pancakeHouseMenu,dinerMenu);
		waitress.printMenu();


	}

}
