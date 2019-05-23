package com.john.strategymodel.exercise;

/**
 * @author: john.huang
 * @description:
 * @data: 2019/5/23 14:19
 */
public class King extends Chacter {




    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }


}
