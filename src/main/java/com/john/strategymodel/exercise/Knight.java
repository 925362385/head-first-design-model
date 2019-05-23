package com.john.strategymodel.exercise;

/**
 * @author: john.huang
 * @description:
 * @data: 2019/5/23 14:21
 */
public class Knight extends Chacter {

    @Override
    public void fight() {
            weaponBehavior.useWeapon();
    }


}
