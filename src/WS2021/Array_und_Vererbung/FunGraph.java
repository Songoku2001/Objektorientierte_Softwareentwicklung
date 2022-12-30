package WS2021.Array_und_Vererbung;

public final class FunGraph {
  private FunGraph() {
  }

  static String mkStringGraph(int xMin, int xMax, int yMin, int yMax) {
    String result = "";

    for (int y = yMax; y >= yMin; y--) {
      for (int x = xMin; x <= xMax; x++) {
        if ((int)Math.sqrt(y)==(Math.abs(x))) { //int gecastet weil squrt zu double zählt
          result += "*";
        } else if (y == 0) {
          result += "-";
        } else if (x == 0) {
          result += "|";
        } else {
          result += " ";
        }
      }
      result += "\n";
    }
    return result;
  }
  public static void main(String[] args) {
    System.out.println(mkStringGraph(-2, 2, 0, 4));
    System.out.println(mkStringGraph(-4, 4, 0, 16));
    System.out.println(mkStringGraph(-5, 5, 0, 25));
  }

}
