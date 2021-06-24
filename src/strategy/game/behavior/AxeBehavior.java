package strategy.game.behavior;

public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("도끼로 찍어!");
    }

    @Override
    public String getWeaponName() {
        return "도끼";
    }
}
