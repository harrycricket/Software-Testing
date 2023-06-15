package org.harry.mathutil.core;

// class này sẽ mô phỏng, clone lại các class java.util.Math
// mà bên trong có các hàm static nổi tiếng
// Math.sqrt() Math.sin() Math.random()
public class MathUtility {

    public static final double PI = 3.1415;

    // k có giai thừa của số âm -> exception
    // dùng kiểu long nên max n chỉ = 20, nếu n > 20 -> ném ra exception
    public static long getFactorial(int n) {
        long result = 1;
        if (n < 0 || n >20) throw new IllegalArgumentException("The number is invalid!");
        if (n < 2) return 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }
    
    public static long getFactorial2(int n) {
        if(n < 0 || n > 20) throw new IllegalArgumentException("The number is invalid!");
        if (n < 2) return 1;
        return getFactorial(n - 1) * n;
    }
}
