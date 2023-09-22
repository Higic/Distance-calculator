import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DistanceCalculatorTest {

    // deviation accuracy
    double DELTA = 0.001;

    @Test
    public void testCalculateDistance() {
        // Test Case 1
        DistanceCalculator calculator1 = new DistanceCalculator(1.0, 2.0, 4.0, 6.0);
        double result1 = calculator1.calculate();
        assertEquals(5.0, result1, DELTA);

        // Test Case 2 Distance == 0
        DistanceCalculator calculator2 = new DistanceCalculator(3.0, 5.0, 3.0, 5.0);
        double result2 = calculator2.calculate();
        assertEquals(0.0, result2, DELTA);

        // Test Case 3 with negative coordinates
        DistanceCalculator calculator3 = new DistanceCalculator(-1.0, -2.0, 1.0, 2.0);
        double result3 = calculator3.calculate();
        assertEquals(4.472, result3, DELTA);
    }
}