package com.example.character;

import com.example.character.weapon.AxeBehavior;
import com.example.character.weapon.KnifeBehavior;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CharacterApplication {

	public static void main(String[] args) {
		Character queen = new Queen();
		queen.setWeaponBehavior(new AxeBehavior());
		queen.performWeapon();
		queen.fight();

		Character knight = new Knight();
		knight.setWeaponBehavior(new KnifeBehavior());
		knight.performWeapon();
		knight.fight();

		Character king = new King();
		king.fight();
	}

}
