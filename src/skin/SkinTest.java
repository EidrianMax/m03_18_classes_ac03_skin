package skin;

public class SkinTest {
  public static void main(String[] args) {
    // Test 1
    System.out.println("----------Test 1----------");

    Skin skin1 = new Skin("Rubius", Sex.MEN, 2);
    System.out.println(skin1.toString());
    System.out.println("Rest one life: " + skin1.loseLife());
    System.out.println("Number of lifes: " + skin1.getNumberOfLives());
    System.out.println("Rest one life: " + skin1.loseLife());
    System.out.println("Number of lifes: " + skin1.getNumberOfLives());
    System.out.println("Rest one life: " + skin1.loseLife());
    System.out.println("Number of lifes: " + skin1.getNumberOfLives());
    System.out.println("Rest one life: " + skin1.loseLife());
    System.out.println("Skin1 is available: " + skin1.isAvailable());
    System.out.println("Increase one life: " + skin1.increaseLife());
    System.out.println("Increase points: " + skin1.increasePoints(100));

    // Test 2
    System.out.println("----------Test 2----------");

    Skin skin2 = new Skin("TheGref", Sex.MEN, 1);
    System.out.println(skin2.toString());
    System.out.println("Increase one life: " + skin2.increaseLife());
    System.out.println("Number of lifes: " + skin2.getNumberOfLives());
    System.out.println("Increase one life: " + skin2.increaseLife());
    System.out.println("Number of lifes: " + skin2.getNumberOfLives());
    skin2.increasePoints(100);
    System.out.println(skin2.toString());
    skin2.decreasePoints(50);
    System.out.println(skin2.toString());
    skin2.decreasePoints(150);
    System.out.println(skin2.toString());
    System.out.println(skin2.battling());
    System.out.println(skin2.resting());
    System.out.println(skin2.eating());
    System.out.println(skin2.getSword());
    System.out.println(skin2.getGun());
    System.out.println(skin2.getRope());
    System.out.println(skin2.battling());

    // Part 2
    System.out.println("----------Part 2----------");

    Skin[] skins = {
      new Skin("Orelia", Sex.WOMAN, 100),
      new Skin("Midas Rex", Sex.MEN, 100),
      new Skin("Lachlan", Sex.MEN, 100),
      new Skin("The Grefg", Sex.MEN, 100),
      new Skin("Blastoff", Sex.MEN, 100),
      new Skin("Hipersonic", Sex.MEN, 100),
      new Skin("Wanderlust", Sex.MEN, 100),
      new Skin("Hunter", Sex.MEN, 100),
      new Skin("The Mighty Volt", Sex.MEN, 100),
      new Skin("Backlash", Sex.NOTDEFINED, 100)
    };

    Zombi[] zombis = new Zombi[20];

    for (int i = 0; i < zombis.length; i++) {
      Zombi zombi = new Zombi(i);
      zombis[i] = zombi;
    }

    Mode mode = new Mode(Modes.BATTLE_ROYALE, skins, zombis);

    for (Skin skin : mode.getSkins()) {
      System.out.println("Skin: " + skin.getName());
    }
    
    Zombi[] modeZombis = mode.getZombis();

    for (Zombi zombi : modeZombis) {
      System.out.println("Zombi #" + zombi.getCode());
    }
  }
}
