package WS2021.Vererbung_equals;

import static org.junit.Assert.*;

import org.junit.Test;

public class VertexTest {

  @Test
  public void test1() {
    assertEquals("", new Vertex(1.0,1.0),new Vertex(1.0,0.1));
  }
  @Test
  public void test2() {
    assertNotEquals("", new Vertex(1.0,1.0),"new Vertex(1.0,1.0)");
  }
  @Test
  public void test3() {
    assertEquals("", new Vertex(42.0,1.0),new Vertex(43.0,0.1));
  }
  @Test
  public void test4() {
    assertNotEquals("", new Vertex(1.0,1.0),new Vertex(2.1,0.1));
  }
}