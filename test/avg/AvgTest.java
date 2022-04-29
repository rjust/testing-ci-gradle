package avg;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for the Avg implementation.
 */
public class AvgTest {
  // The delta up to which two doubles are considered equal
  private static double EPS = 1e-9;

  @Test
  public void test1() {
    double actual = new Avg().avgAbs(new double[]{1, 2, 3});
    double expected = 2.0;
    assertEquals(expected, actual, EPS);
  }

  @Test
  public void test2() {
    double actual = new Avg().avgAbs(new double[]{-1, -2, -3});
    double expected = 2.0;
    assertEquals(expected, actual, EPS);
  }
}
