abstract class CakeDecorator implements Cake {

  protected Cake specialCake;

  public CakeDecorator(Cake specialCake) {
    this.specialCake = specialCake;
  }

  public String bakeCake() {
    return specialCake.makeCake();
  }
}