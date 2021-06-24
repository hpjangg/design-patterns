package strategy.game.character;

import strategy.game.behavior.WeaponBehavior;

public class Troll extends Character {

    public Troll(WeaponBehavior weaponBehavior) {
        super(weaponBehavior);
    }

    @Override
    public void fight() {
        System.out.println("트롤이 싸운다!");
    }
}
