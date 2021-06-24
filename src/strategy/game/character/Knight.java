package strategy.game.character;

import strategy.game.behavior.WeaponBehavior;

public class Knight extends Character {

    public Knight(WeaponBehavior weaponBehavior) {
        super(weaponBehavior);
    }

    @Override
    public void fight() {
        System.out.println("기사가 싸운다!");
    }
}
