package com.john.strategymodel.exercise;

/**
 * @author: john.huang
 * @description:
 * @data: 2019/5/23 14:22
 */
public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("====== 使用匕首杀人 ======");
    }
}
