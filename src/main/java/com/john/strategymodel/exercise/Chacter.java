package com.john.strategymodel.exercise;

/**
 * @author: john.huang
 * @description:
 * @data: 2019/5/23 14:16
 */
public abstract class Chacter {



    WeaponBehavior weaponBehavior;

    public abstract void fight();



    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
