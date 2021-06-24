package strategy.game;

import strategy.game.behavior.*;
import strategy.game.character.*;
import strategy.game.character.Character;

public class GameTests {

    private static WeaponBehavior swordBehavior;
    private static WeaponBehavior bowAndArrowBehavior;
    private static WeaponBehavior knifeBehavior;
    private static WeaponBehavior axeBehavior;

    public static void main(String[] args) {
        initWeaponBehavior();

        Character king = new King(swordBehavior);
        Character queen = new Queen(bowAndArrowBehavior);
        Character knight = new Knight(knifeBehavior);
        Character troll = new Troll(axeBehavior);


        king.fight();
        king.useWeapon();
        System.out.println("\n==========\n");

        queen.fight();
        queen.useWeapon();
        System.out.println("\n==========\n");

        knight.fight();
        knight.useWeapon();
        System.out.println("\n==========\n");

        troll.fight();
        troll.useWeapon();
        System.out.println("\n==========\n");

        king.setWeapon(bowAndArrowBehavior);
        king.fight();
        king.useWeapon();
        System.out.println("\n==========\n");
    }

    private static void initWeaponBehavior() {
        swordBehavior = new SwordBehavior();
        bowAndArrowBehavior = new BowAndArrowBehavior();
        knifeBehavior = new KnifeBehavior();
        axeBehavior = new AxeBehavior();
    }

}
