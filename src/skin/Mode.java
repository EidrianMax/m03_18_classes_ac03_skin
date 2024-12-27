package skin;

public class Mode {
  private Modes modeName;
  private Skin[] skins;
  private Zombi[] zombis = new Zombi[1];

  public Mode(Modes modeName, Skin[] skins, Zombi[] zombis) {
    this.modeName = modeName;
    this.skins = skins;
    this.zombis = zombis;
  }

  public Modes getModeName() {
    return modeName;
  }

  public void setModeName(Modes modeName) {
    this.modeName = modeName;
  }

  public Skin[] getSkins() {
    return skins;
  }

  public void setSkins(Skin[] skins) {
    this.skins = skins;
  }

  public Zombi[] getZombis() {
    return zombis;
  }

  public void setZombis(Zombi[] zombis) {
    this.zombis = zombis;
  }

}
