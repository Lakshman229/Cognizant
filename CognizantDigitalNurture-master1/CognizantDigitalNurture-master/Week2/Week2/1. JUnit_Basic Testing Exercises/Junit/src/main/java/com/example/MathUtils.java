<<<<<<< HEAD
package com.example;

public class MathUtils {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        if (b == 0)
            throw new IllegalArgumentException("Cannot divide by zero");
        return a / b;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}
=======
package com.example;

public class MathUtils {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        if (b == 0)
            throw new IllegalArgumentException("Cannot divide by zero");
        return a / b;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}
>>>>>>> fafb6b58dcac195564aab91622ba0d61ad852a4a
