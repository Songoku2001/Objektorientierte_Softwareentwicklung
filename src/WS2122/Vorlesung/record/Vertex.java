record Vertex(double x, double y){


  public static void main(String[] args) {
    Vertex v1 = new Vertex(1, 1);
    Vertex v2 = new Vertex(2, 2);

    boolean gleich = v1.equals(v2);
    System.out.println(gleich);
  }
}
