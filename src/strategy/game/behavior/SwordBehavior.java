package strategy.game.behavior;

public class SwordBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("건곤대나잇!");
    }

    @Override
    public String getWeaponName() {
        return "검";
    }
}
