//ch11, Ex14
interface Monster {
  void menace();
}
interface DangerousMonster extends Monster {
  void destroy();
}
interface Lethal {
  void kill();
}
class DragonZilla implements DangerousMonster {
  public void menace() {}
  public void destroy() {}
}
interface Vampire extends DangerousMonster, Lethal {
  void drinkBlood();
}
class VeryBadVampire implements Vampire {
  public void menace() {}
  public void destroy() {}
  public void kill() {}
  public void drinkBlood() {}
}
public class Ex14 {
  static void u(Monster b) { b.menace(); }
  static void v(DangerousMonster d) {
    d.menace();
    d.destroy();
  }
  static void w(Lethal l) { l.kill(); }

  static public DangerousMonster DangerousMonsterMaker(){
      return new DangerousMonster(){
          public void menace(){System.out.println("DangerousMonster menace()");}
          public void destroy(){System.out.println("DangerousMonster destroy()");}
      };
  }
  static public Vampire VampireMaker(){
    return new Vampire(){
        public void menace(){System.out.println("Vampire menace()");}
        public void destroy(){System.out.println("Vampire destroy()");}
        public void kill(){System.out.println("Vampire kill()");}
        public void drinkBlood(){System.out.println("Vampire drinkBlood()");}
    };
  }
  public static void main(String[] args) {
      Ex14.u(Ex14.DangerousMonsterMaker());
      Ex14.v(Ex14.DangerousMonsterMaker());
      Ex14.u(Ex14.VampireMaker());
      Ex14.v(Ex14.VampireMaker());
      Ex14.w(Ex14.VampireMaker());
  }
}

