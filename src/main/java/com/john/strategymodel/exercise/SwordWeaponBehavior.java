package com.john.strategymodel.exercise;

/**
 * @author: john.huang
 * @description:
 * @data: 2019/5/23 14:22
 */
public class SwordWeaponBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("===== 使用宝剑砍人 =====");
    }
}
