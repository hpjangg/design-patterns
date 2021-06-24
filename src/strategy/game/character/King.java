package strategy.game.character;

import strategy.game.behavior.WeaponBehavior;

public class King extends Character {

    public King(WeaponBehavior weaponBehavior) {
        super(weaponBehavior);
    }

    @Override
    public void fight() {
        System.out.println("킹이 싸운다!");
    }
}
