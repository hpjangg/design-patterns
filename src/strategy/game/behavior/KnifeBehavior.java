package strategy.game.behavior;

public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("칼로 베어버린닷!");
    }

    @Override
    public String getWeaponName() {
        return "칼";
    }
}
