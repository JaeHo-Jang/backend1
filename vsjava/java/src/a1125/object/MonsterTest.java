package a1125.object;

public class MonsterTest {
    public static void main(String[] args) {
        Monster orc = new Monster("오크");
        Monster skeleton = new Monster("해골");
        Monster.battle(orc, skeleton);

    }
}

class Monster {
    private String name;
    private int hp;
    private static int maxHp = 30; // 모든 몬스터의 최대 체력

    public Monster(String name) {

        this.name = name;
        // this.hp = 30;
        this.hp = maxHp;
    }

    public static void battle(Monster orc, Monster skeleton) {
        while (orc.hp > 0 && skeleton.hp > 0) {
            Monster attacker = (Math.random() < 0.5) ? orc : skeleton;
            Monster defender = (attacker == orc) ? skeleton : orc;
            attacker.attack(defender);
        }
    }

    private void attack(Monster enemy) {
        System.out.printf("[%s] 의 공격 / " , name);
        enemy.hp = enemy.hp - 10;
        System.out.printf("%s 체력 :%d/(%d)\n ", enemy.name, enemy.hp, Monster.maxHp);
    }

}