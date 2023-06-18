// Note that:

// Kelvin = Celsius + 273.15
// Fahrenheit = Celsius * 1.80 + 32.00
 

// Example 1:

// Input: celsius = 36.50
// Output: [309.65000,97.70000]
// Explanation: Temperature at 36.50 Celsius converted in Kelvin is 309.65 and converted in Fahrenheit is 97.70.

class Solution {
    public double[] convertTemperature(double c) {
        double[] arr = new double[2];
        arr[0] = c + 273.15;
        arr[1] = c *  1.80 + 32.00;
        return arr;
    }
}
