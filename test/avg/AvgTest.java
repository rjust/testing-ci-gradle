package avg;

import org.junit.Ignore;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Test class for the Avg implementation.
 */
@RunWith(Parameterized.class)
public class AvgTest {
  // The delta up to which two doubles are considered equal
  private static double EPS = 1e-9;

  @Parameters
  public static List<Object[]> data() {
    return Arrays.asList(new Object[][] {
        { new double[]{ 1,  2,  3}, 2},
        { new double[]{-1, -2, -3}, 2},
    });
  }

  @Parameter(0)
  public double[] numbers;
  @Parameter(1)
  public double expectedOutput;

  @Test
  public void testAvgAbs() {
    assertEquals(new Avg().avgAbs(numbers), expectedOutput, EPS);
  }
}
