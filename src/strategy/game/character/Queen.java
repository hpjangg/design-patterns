package strategy.game.character;

import strategy.game.behavior.WeaponBehavior;

public class Queen extends Character {

    public Queen(WeaponBehavior weaponBehavior) {
        super(weaponBehavior);
    }

    @Override
    public void fight() {
        System.out.println("퀸이 싸운다!");
    }
}
