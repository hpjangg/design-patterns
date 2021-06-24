package strategy.game.character;

import strategy.game.behavior.WeaponBehavior;

public abstract class Character {

    private WeaponBehavior weaponBehavior;

    public Character(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public abstract void fight();

    public void setWeapon(WeaponBehavior weaponBehavior) {
        System.out.println("무기를 교체한다! [" + weaponBehavior.getWeaponName() + "]");
        this.weaponBehavior = weaponBehavior;
    }

    public void useWeapon() {
        this.weaponBehavior.useWeapon();
    }
}
