import java.util.Random;

public class App {
    public static Character summonCharacter() {
        Random rand = new Random();
        if (Math.abs(rand.nextInt()) % 2 == 0)
            return new Enemy();
        else
            return new Hero();
    }

    public static void main(String[] args) {
        Enemy darthVader = new Enemy();
        Hero obiWanKenobi = new Hero();

        darthVader.attack();
        obiWanKenobi.attack();

        darthVader.heal();
        obiWanKenobi.heal();

        System.out.println("Enemy weapon: " + darthVader.weapon);
        System.out.println("Hero weapon: " + obiWanKenobi.weapon);

        Character spy = summonCharacter();
        spy.attack();
        spy.heal();
    }
}
