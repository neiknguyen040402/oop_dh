package com.hus.homework4.themycomplex;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        return real + " + " + imag + "i";
    }

    public boolean isReal() {
        return (imag == 0);
    }

    public boolean isImaginary() {
        return (real == 0);
    }

    public boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag);
    }

    public boolean equals(MyComplex another) {
        return (this.real == another.real && this.imag == another.imag);
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public double argument() {
        return Math.atan2(imag, real);
    }

    public MyComplex add(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(right.real, right.imag);
    }

    public MyComplex subtract(MyComplex right) {
        return new MyComplex(this.real - right.real, this.imag - right.imag);
    }

//    public MyComplex subtractNew(MyComplex right) {
//
//    }

    public MyComplex multiply(MyComplex right) {
        return new MyComplex(this.real * right.real - this.imag * right.imag,
                this.real * right.imag + this.imag * right.real);
    }

    public MyComplex divide(MyComplex right) {
        double scale = right.magnitude()*right.magnitude();
        return new MyComplex((double) (this.real * right.real + this.imag * right.imag) / scale,
                (double) (this.imag * right.real - this.real * right.imag) / scale);
    }

    public MyComplex conjugate() {
        return new MyComplex(real, -imag);
    }
}
