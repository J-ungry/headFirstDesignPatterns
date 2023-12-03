package com.example.character;

import com.example.character.weapon.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public void setWeaponBehavior(WeaponBehavior wb) {
        this.weaponBehavior = wb;
    }

    public void performWeapon() {
        weaponBehavior.useWeapon();
    }

    public void fight() {
        System.out.println("캐릭터가 싸우지롱 !");
    }
}
