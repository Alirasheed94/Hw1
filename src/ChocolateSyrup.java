public class ChocolateSyrup extends CakeDecorator {

  public ChocolateSyrup(Cake specialCake) {
    super(specialCake);
  }

  public String makeCake() {
    return specialCake.makeCake() + addChocolate();
  }

  private String addChocolate() {
    return " + Chocolate";
  }
}