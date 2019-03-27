package jum;

public class task2 {
    public static void main(String[] args) {
        double[] X = {0.00, 0.5, 0.5, 0.5, 1.00};
        double[] Y = {0.00, 0.5, 0.5, 0.5, 1.00};

        double fx_0, fx_1, x_0, x_1, length, tri_height = 0;
        double square, triangle, trapezoid, result = 0;
        for (int i = 0; i < X.length - 1; i++) {
            x_0 = X[i];
            x_1 = X[i + 1];
            fx_0 = Y[i];
            fx_1 = Y[i + 1];
            if (fx_0 > fx_1) {
                tri_height = fx_0 - fx_1;
            } else
                tri_height = fx_1 - fx_0;
            length = x_1 - x_0;

            square = length * fx_0;
            triangle = length * tri_height * 0.5;
            trapezoid = square + triangle;
            result += trapezoid;
        }
        System.out.println(result);
    }
}
