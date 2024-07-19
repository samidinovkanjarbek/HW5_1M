public class Main {
    public static void main(String[] args) {
        boss boss = new boss();
        boss.setBossDefence("fizical");
        boss.setDamage(300);
        boss.setHealth(800);
        System.out.println("Boss health " + boss.getHealth() + "\nboss damage " + boss.getDamage() + "\nboss defence " + boss.getBossDefence());
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getHealth() + "," + createHeroes()[i].getDamage());
        }
    }

    private static Hero[] createHeroes() {
        Hero magic = new Hero(34, 60);
        Hero berserk = new Hero(34, 60, "супер скорость");
        Hero kanjar = new Hero(34, 60);
        Hero[] superHero = {magic, berserk, kanjar};
        return superHero;
    }
}