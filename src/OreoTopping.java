public class OreoTopping extends CakeDecorator {

  public OreoTopping(Cake specialCake) {
    super(specialCake);
  }

  public String makeCake() {
    return specialCake.makeCake() + addOreo();
  }

  private String addOreo() {
    return " + Oreo";
  }
}