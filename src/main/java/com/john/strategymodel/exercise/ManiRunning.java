package com.john.strategymodel.exercise;

/**
 * @author: john.huang
 * @description:
 * @data: 2019/5/23 14:23
 */
public class ManiRunning {

    public static void main(String[] args) {
        Chacter chacter         = new King();
        Chacter chacterAnother  = new Knight();
        chacter.setWeaponBehavior(new KnifeBehavior());
        chacterAnother.setWeaponBehavior(new SwordWeaponBehavior());
        chacter.fight();
        chacterAnother.fight();
    }
}
