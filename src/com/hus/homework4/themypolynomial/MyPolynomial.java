package com.hus.homework4.themypolynomial;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public void setCoeffs(double[] coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        String result = "";      //3.3x^2+2.2x+1.1
        if (coeffs[coeffs.length - 1] != 0.0) {
            result += coeffs[coeffs.length - 1] + "x^" + (coeffs.length - 1);
        }
        for (int i = coeffs.length - 2; i > 0; --i) {
            if (coeffs[i] == 0) {
                continue;
            }
            if (coeffs[i] > 0 && coeffs[coeffs.length - 1] != 0.0) {
                result += "+";
            }
            result += coeffs[i] + "x";
            if (i != 1) {
                result += "^" + i;
            }
        }
        if (coeffs[0] != 0) {
            if (coeffs[0] > 0)
                result += "+";
            result += coeffs[0];
        }
        return result;
    }

    public double evaluate(double x) {
        // 3x^3 + 2x^2 + 1x + 0 = 0 + x * (1 + x * (2 + 3x))
        int degree = this.getDegree();
        double resuilt = coeffs[degree];
        for (int i = degree; i > 0; i--) {
            resuilt = coeffs[i - 1] + resuilt * x;
        }
        return resuilt;
    }

    public MyPolynomial add(MyPolynomial right) {
        if (right == null) {
            throw new IllegalArgumentException("parameter cannot be null.");
        }
        double[] newCoeffs = new double[Math.max(coeffs.length, right.coeffs.length)];
        for (int i = 0; i < coeffs.length; ++i) {
            newCoeffs[i] += coeffs[i];
        }
        for (int i = 0; i < right.coeffs.length; ++i) {
            newCoeffs[i] += right.coeffs[i];
        }
        return new MyPolynomial(newCoeffs);
    }

    public MyPolynomial multiply(MyPolynomial right) {
        if (right == null) {
            throw new IllegalArgumentException("parameter cannot be null.");
        }
        int size = getDegree() + right.getDegree() + 1;
        double[] ans = new double[size];

        for (int deg1 = 0; deg1 < coeffs.length; deg1++) {
            for (int deg2 = 0; deg2 < right.coeffs.length; deg2++) {
                double num = coeffs[deg1] * right.coeffs[deg2];
                ans[deg1 + deg2] += num;
            }
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = (double) Math.round(ans[i] * 100) / 100;
        }
        return new MyPolynomial(ans);
    }

}