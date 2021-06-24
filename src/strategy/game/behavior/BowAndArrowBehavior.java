package strategy.game.behavior;

public class BowAndArrowBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("활을 써서 화살 발싸~!");
    }

    @Override
    public String getWeaponName() {
        return "활과 화살";
    }
}
